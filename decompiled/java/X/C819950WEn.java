package X;

import android.util.Base64;
import android.util.JsonWriter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0WEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819950WEn implements C0WF5, C0WF9 {
    public boolean LIZ = true;
    public final JsonWriter LIZIZ;
    public final Map<Class<?>, C0WF0<?>> LIZJ;
    public final Map<Class<?>, C0WF4<?>> LIZLLL;
    public final C0WF0<Object> LJ;
    public final boolean LJFF;

    public final void LJII() {
        if (!this.LIZ) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // X.C0WF9
    public final C0WF9 LIZ(boolean z) throws IOException {
        LJII();
        this.LIZIZ.value(z);
        return this;
    }

    @Override // X.C0WF9
    public final C0WF9 LIZJ(String str) throws IOException {
        LJII();
        this.LIZIZ.value(str);
        return this;
    }

    public final C819950WEn LJFF(Object obj) throws IOException {
        if (obj == null) {
            this.LIZIZ.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.LIZIZ.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                LJII();
                this.LIZIZ.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            this.LIZIZ.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.LIZIZ.value(r9[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    LJII();
                    this.LIZIZ.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.LIZIZ.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.LIZIZ.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    LJFF(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    LJFF(objArr[i]);
                    i++;
                }
            }
            this.LIZIZ.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            this.LIZIZ.beginArray();
            Iterator it2 = ((Collection) obj).iterator();
            while (it2.hasNext()) {
                LJFF(it2.next());
            }
            this.LIZIZ.endArray();
            return this;
        }
        if (obj instanceof Map) {
            this.LIZIZ.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    LJI(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new C820040WEw(C786410Ut5.j4("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e);
                }
            }
            this.LIZIZ.endObject();
            return this;
        }
        C0WF0<?> c0wf0 = this.LIZJ.get(obj.getClass());
        if (c0wf0 != null) {
            this.LIZIZ.beginObject();
            c0wf0.LIZ(obj, this);
            this.LIZIZ.endObject();
            return this;
        }
        C0WF4<?> c0wf4 = this.LIZLLL.get(obj.getClass());
        if (c0wf4 != null) {
            c0wf4.LIZ(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            String strName = ((Enum) obj).name();
            LJII();
            this.LIZIZ.value(strName);
            return this;
        }
        C0WF0<Object> c0wf02 = this.LJ;
        this.LIZIZ.beginObject();
        c0wf02.LIZ(obj, this);
        this.LIZIZ.endObject();
        return this;
    }

    @Override // X.C0WF5
    public final C0WF5 LIZIZ(C0WEV c0wev, Object obj) throws IOException {
        LJI(obj, c0wev.LIZ);
        return this;
    }

    @Override // X.C0WF5
    public final C0WF5 LIZLLL(C0WEV c0wev, int i) throws IOException {
        String str = c0wev.LIZ;
        LJII();
        this.LIZIZ.name(str);
        LJII();
        this.LIZIZ.value(i);
        return this;
    }

    @Override // X.C0WF5
    public final C0WF5 LJ(C0WEV c0wev, long j) throws IOException {
        String str = c0wev.LIZ;
        LJII();
        this.LIZIZ.name(str);
        LJII();
        this.LIZIZ.value(j);
        return this;
    }

    public final C819950WEn LJI(Object obj, String str) throws IOException {
        if (this.LJFF) {
            if (obj != null) {
                LJII();
                this.LIZIZ.name(str);
                LJFF(obj);
            }
            return this;
        }
        LJII();
        this.LIZIZ.name(str);
        if (obj == null) {
            this.LIZIZ.nullValue();
            return this;
        }
        LJFF(obj);
        return this;
    }

    public C819950WEn(Writer writer, Map map, Map map2, C819920WEk c819920WEk, boolean z) {
        this.LIZIZ = new JsonWriter(writer);
        this.LIZJ = map;
        this.LIZLLL = map2;
        this.LJ = c819920WEk;
        this.LJFF = z;
    }
}
