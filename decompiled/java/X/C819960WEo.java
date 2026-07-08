package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0WEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C819960WEo implements C0WF5 {
    public static final Charset LJFF = Charset.forName("UTF-8");
    public static final C0WEV LJI;
    public static final C0WEV LJII;
    public static final C819990WEr LJIIIIZZ;
    public OutputStream LIZ;
    public final Map<Class<?>, C0WF0<?>> LIZIZ;
    public final Map<Class<?>, C0WF4<?>> LIZJ;
    public final C0WF0<Object> LIZLLL;
    public final C820000WEs LJ = new C820000WEs(this);

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0WEr] */
    static {
        C0WEU c0weu = new C0WEU("key");
        C820030WEv c820030WEv = new C820030WEv();
        c820030WEv.LIZ = 1;
        c0weu.LIZIZ(c820030WEv.LIZ());
        LJI = c0weu.LIZ();
        C0WEU c0weu2 = new C0WEU("value");
        C820030WEv c820030WEv2 = new C820030WEv();
        c820030WEv2.LIZ = 2;
        c0weu2.LIZIZ(c820030WEv2.LIZ());
        LJII = c0weu2.LIZ();
        LJIIIIZZ = new C0WF0() { // from class: X.0WEr
            @Override // X.C0WF8
            public final void LIZ(Object obj, C0WF5 c0wf5) {
                Map.Entry entry = (Map.Entry) obj;
                C0WF5 c0wf52 = c0wf5;
                c0wf52.LIZIZ(C819960WEo.LJI, entry.getKey());
                c0wf52.LIZIZ(C819960WEo.LJII, entry.getValue());
            }
        };
    }

    public static int LJII(C0WEV c0wev) {
        C0WF7 c0wf7 = (C0WF7) ((Annotation) c0wev.LIZIZ.get(C0WF7.class));
        if (c0wf7 != null) {
            return ((C819970WEp) c0wf7).LJJI;
        }
        throw new C820040WEw("Field has no @Protobuf config");
    }

    public final void LJIIIIZZ(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.LIZ.write((i & 127) | 128);
            i >>>= 7;
        }
        this.LIZ.write(i & 127);
    }

    public final void LJIIIZ(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.LIZ.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.LIZ.write(((int) j) & 127);
    }

    @Override // X.C0WF5
    public final C0WF5 LIZIZ(C0WEV c0wev, Object obj) {
        LIZ(c0wev, obj, true);
        return this;
    }

    @Override // X.C0WF5
    public final C0WF5 LIZLLL(C0WEV c0wev, int i) {
        LIZJ(c0wev, i, true);
        return this;
    }

    @Override // X.C0WF5
    public final C0WF5 LJ(C0WEV c0wev, long j) throws IOException {
        LJFF(c0wev, j, true);
        return this;
    }

    public final C819960WEo LIZ(C0WEV c0wev, Object obj, boolean z) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            LJIIIIZZ((LJII(c0wev) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(LJFF);
            LJIIIIZZ(bytes.length);
            this.LIZ.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it2 = ((Collection) obj).iterator();
            while (it2.hasNext()) {
                LIZ(c0wev, it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                LJI(LJIIIIZZ, c0wev, it3.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return this;
            }
            LJIIIIZZ((LJII(c0wev) << 3) | 1);
            OutputStream outputStream = this.LIZ;
            ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.putDouble(dDoubleValue);
            outputStream.write(byteBufferOrder.array());
            return this;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return this;
            }
            LJIIIIZZ((LJII(c0wev) << 3) | 5);
            OutputStream outputStream2 = this.LIZ;
            ByteBuffer byteBufferOrder2 = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder2.putFloat(fFloatValue);
            outputStream2.write(byteBufferOrder2.array());
            return this;
        }
        if (obj instanceof Number) {
            LJFF(c0wev, ((Number) obj).longValue(), z);
            return this;
        }
        if (obj instanceof Boolean) {
            LIZJ(c0wev, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            LJIIIIZZ((LJII(c0wev) << 3) | 2);
            LJIIIIZZ(bArr.length);
            this.LIZ.write(bArr);
            return this;
        }
        C0WF0<?> c0wf0 = this.LIZIZ.get(obj.getClass());
        if (c0wf0 != null) {
            LJI(c0wf0, c0wev, obj, z);
            return this;
        }
        C0WF4<?> c0wf4 = this.LIZJ.get(obj.getClass());
        if (c0wf4 != null) {
            C820000WEs c820000WEs = this.LJ;
            c820000WEs.LIZ = false;
            c820000WEs.LIZJ = c0wev;
            c820000WEs.LIZIZ = z;
            c0wf4.LIZ(obj, c820000WEs);
            return this;
        }
        if (obj instanceof C0WDB) {
            LIZJ(c0wev, ((C0WDB) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            LIZJ(c0wev, ((Enum) obj).ordinal(), true);
            return this;
        }
        LJI(this.LIZLLL, c0wev, obj, z);
        return this;
    }

    public final void LIZJ(C0WEV c0wev, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        C0WF7 c0wf7 = (C0WF7) ((Annotation) c0wev.LIZIZ.get(C0WF7.class));
        if (c0wf7 != null) {
            C819970WEp c819970WEp = (C819970WEp) c0wf7;
            int i2 = C820010WEt.LIZ[c819970WEp.LJJIFFI.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        LJIIIIZZ((c819970WEp.LJJI << 3) | 5);
                        OutputStream outputStream = this.LIZ;
                        ByteBuffer byteBufferOrder = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferOrder.putInt(i);
                        outputStream.write(byteBufferOrder.array());
                        return;
                    }
                    return;
                }
                LJIIIIZZ(c819970WEp.LJJI << 3);
                LJIIIIZZ((i << 1) ^ (i >> 31));
                return;
            }
            LJIIIIZZ(c819970WEp.LJJI << 3);
            LJIIIIZZ(i);
            return;
        }
        throw new C820040WEw("Field has no @Protobuf config");
    }

    public final void LJFF(C0WEV c0wev, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        C0WF7 c0wf7 = (C0WF7) ((Annotation) c0wev.LIZIZ.get(C0WF7.class));
        if (c0wf7 != null) {
            C819970WEp c819970WEp = (C819970WEp) c0wf7;
            int i = C820010WEt.LIZ[c819970WEp.LJJIFFI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        LJIIIIZZ((c819970WEp.LJJI << 3) | 1);
                        OutputStream outputStream = this.LIZ;
                        ByteBuffer byteBufferOrder = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferOrder.putLong(j);
                        outputStream.write(byteBufferOrder.array());
                        return;
                    }
                    return;
                }
                LJIIIIZZ(c819970WEp.LJJI << 3);
                LJIIIZ((j >> 63) ^ (j << 1));
                return;
            }
            LJIIIIZZ(c819970WEp.LJJI << 3);
            LJIIIZ(j);
            return;
        }
        throw new C820040WEw("Field has no @Protobuf config");
    }

    public C819960WEo(OutputStream outputStream, Map<Class<?>, C0WF0<?>> map, Map<Class<?>, C0WF4<?>> map2, C0WF0<Object> c0wf0) {
        this.LIZ = outputStream;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = c0wf0;
    }

    public final void LJI(C0WF0 c0wf0, C0WEV c0wev, Object obj, boolean z) throws IOException {
        C820050WEx c820050WEx = new C820050WEx();
        try {
            OutputStream outputStream = this.LIZ;
            this.LIZ = c820050WEx;
            try {
                c0wf0.LIZ(obj, this);
                this.LIZ = outputStream;
                long j = c820050WEx.LL;
                c820050WEx.close();
                if (z && j == 0) {
                    return;
                }
                LJIIIIZZ((LJII(c0wev) << 3) | 2);
                LJIIIZ(j);
                c0wf0.LIZ(obj, this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            try {
                c820050WEx.close();
                throw th2;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }
}
