package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.internal.q;
import java.io.Reader;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09CX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09CX extends C09CU {
    public static final C09CZ LLJJIJIL = new Reader() { // from class: X.09CZ
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };
    public static final Object LLJJJ = new Object();
    public Object[] LLJJIII;
    public int LLJJIJI;
    public final String LLJJIJIIJIL;

    @Override // X.C09CU
    public final String LJIILLIIL() {
        return "TODO";
    }

    @Override // X.C09CU, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLJJIII = new Object[]{LLJJJ};
        this.LLJJIJI = 1;
    }

    @Override // X.C09CU
    public final void LIZ() {
        LJLIIIL(C09D6.BEGIN_ARRAY);
        LJZI(((List) LJLJL()).iterator());
    }

    @Override // X.C09CU
    public final void LIZIZ() {
        LJLIIIL(C09D6.BEGIN_OBJECT);
        LJZI(((Map) LJLJL()).entrySet().iterator());
    }

    @Override // X.C09CU
    public final void LJI() {
        LJLIIIL(C09D6.END_ARRAY);
        LJLZ();
        LJLZ();
    }

    @Override // X.C09CU
    public final void LJII() {
        LJLIIIL(C09D6.END_OBJECT);
        LJLZ();
        LJLZ();
    }

    @Override // X.C09CU
    public final boolean LJJ() {
        LJLIIIL(C09D6.BOOLEAN);
        return ((Boolean) LJLZ()).booleanValue();
    }

    @Override // X.C09CU
    public final String LJJJJ() {
        LJLIIIL(C09D6.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) LJLJL()).next();
        String str = (String) entry.getKey();
        LJZI(entry.getValue());
        return str;
    }

    @Override // X.C09CU
    public final void LJJJJJL() {
        LJLIIIL(C09D6.NULL);
        LJLZ();
    }

    @Override // X.C09CU
    public final C09D6 LJJLIIIJ() {
        if (this.LLJJIJI == 0) {
            return C09D6.END_DOCUMENT;
        }
        Object objLJLJL = LJLJL();
        if (objLJLJL == null) {
            return C09D6.NULL;
        }
        if (objLJLJL instanceof Iterator) {
            boolean z = this.LLJJIII[this.LLJJIJI - 2] instanceof Map;
            Iterator it2 = (Iterator) objLJLJL;
            if (!it2.hasNext()) {
                return z ? C09D6.END_OBJECT : C09D6.END_ARRAY;
            }
            if (z) {
                return C09D6.NAME;
            }
            LJZI(it2.next());
            return LJJLIIIJ();
        }
        if (objLJLJL instanceof Map) {
            return C09D6.BEGIN_OBJECT;
        }
        if (objLJLJL instanceof List) {
            return C09D6.BEGIN_ARRAY;
        }
        if (objLJLJL instanceof String) {
            return C09D6.STRING;
        }
        if (objLJLJL instanceof Boolean) {
            return C09D6.BOOLEAN;
        }
        if (objLJLJL instanceof Number) {
            return C09D6.NUMBER;
        }
        if (objLJLJL == LLJJJ) {
            throw new IllegalStateException("JsonReader is closed");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Unexpected type: ");
        sbLIZ.append(objLJLJL.getClass().getName());
        sbLIZ.append(" schema:");
        sbLIZ.append(this.LLJJIJIIJIL);
        throw new AssertionError(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final Object LJLJL() {
        return this.LLJJIII[this.LLJJIJI - 1];
    }

    public final Object LJLZ() {
        Object[] objArr = this.LLJJIII;
        int i = this.LLJJIJI - 1;
        this.LLJJIJI = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    @Override // X.C09CU
    public final String toString() {
        return C09CX.class.getSimpleName();
    }

    public static String LJLJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" at path ");
        sbLIZ.append("TODO");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C09CU
    public final boolean LJIIZILJ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        return (c09d6LJJLIIIJ == C09D6.END_OBJECT || c09d6LJJLIIIJ == C09D6.END_ARRAY) ? false : true;
    }

    @Override // X.C09CU
    public final double LJJIL() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.NUMBER;
        if (c09d6LJJLIIIJ != c09d6 && c09d6LJJLIIIJ != C09D6.STRING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Expected ");
            sbLIZ.append(c09d6);
            sbLIZ.append(" but was ");
            sbLIZ.append(c09d6LJJLIIIJ);
            sbLIZ.append(LJLJI());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        double d = c09d6LJJLIIIJ == C09D6.STRING ? CastDoubleProtector.parseDouble((String) LJLJL()) : ((Number) LJLJL()).doubleValue();
        if (this.LLILLJJLI || !(Double.isNaN(d) || Double.isInfinite(d))) {
            LJLZ();
            return d;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("JSON forbids NaN and infinities: ");
        sbLIZ2.append(d);
        throw new NumberFormatException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C09CU
    public final int LJJIZ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.NUMBER;
        if (c09d6LJJLIIIJ == c09d6 || c09d6LJJLIIIJ == C09D6.STRING) {
            int i = c09d6LJJLIIIJ == C09D6.STRING ? CastIntegerProtector.parseInt((String) LJLJL()) : ((Number) LJLJL()).intValue();
            LJLZ();
            return i;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(c09d6);
        sbLIZ.append(" but was ");
        sbLIZ.append(c09d6LJJLIIIJ);
        sbLIZ.append(LJLJI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C09CU
    public final long LJJJ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.NUMBER;
        if (c09d6LJJLIIIJ == c09d6 || c09d6LJJLIIIJ == C09D6.STRING) {
            long j = c09d6LJJLIIIJ == C09D6.STRING ? CastLongProtector.parseLong((String) LJLJL()) : ((Number) LJLJL()).longValue();
            LJLZ();
            return j;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(c09d6);
        sbLIZ.append(" but was ");
        sbLIZ.append(c09d6LJJLIIIJ);
        sbLIZ.append(LJLJI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C09CU
    public final String LJJJZ() {
        C09D6 c09d6LJJLIIIJ = LJJLIIIJ();
        C09D6 c09d6 = C09D6.STRING;
        if (c09d6LJJLIIIJ == c09d6 || c09d6LJJLIIIJ == C09D6.NUMBER) {
            if (c09d6LJJLIIIJ == c09d6) {
                return (String) LJLZ();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(LJLZ());
            sbLIZ.append("");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Expected ");
        sbLIZ2.append(c09d6);
        sbLIZ2.append(" but was ");
        sbLIZ2.append(c09d6LJJLIIIJ);
        sbLIZ2.append(LJLJI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    @Override // X.C09CU
    public final void LJJZ() {
        if (LJJLIIIJ() == C09D6.NAME) {
            LJJJJ();
        } else {
            LJLZ();
        }
    }

    public final void LJLIIIL(C09D6 c09d6) {
        if (LJJLIIIJ() == c09d6) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expected ");
        sbLIZ.append(c09d6);
        sbLIZ.append(" but was ");
        sbLIZ.append(LJJLIIIJ());
        sbLIZ.append(LJLJI());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJZI(Object obj) {
        int i = this.LLJJIJI;
        Object[] objArr = this.LLJJIII;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i * 2];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            this.LLJJIII = objArr2;
        }
        Object[] objArr3 = this.LLJJIII;
        int i2 = this.LLJJIJI;
        this.LLJJIJI = i2 + 1;
        objArr3[i2] = obj;
    }

    public C09CX(Map map, String str) {
        super(LLJJIJIL);
        this.LLJJIII = new Object[32];
        this.LLJJIJIIJIL = str;
        LJZI(map);
    }

    public static Object LJLJJLL(String str, Class cls, Map map) {
        C20039713b1.LIZ.getClass();
        if (!C20039713b1.LIZ()) {
            Gson gson = C7740030o.LIZ().getGson();
            return GsonProtectorUtils.fromJson(gson, GsonProtectorUtils.toJsonTree(gson, map), cls);
        }
        final q qVar = q.LIZ;
        try {
            q.LIZ = new q() { // from class: X.09CY
                @Override // com.google.gson.internal.q
                public final void LIZ(C09CU c09cu) {
                    if (c09cu instanceof C09CX) {
                        C09CX c09cx = (C09CX) c09cu;
                        c09cx.getClass();
                        c09cx.LJLIIIL(C09D6.NAME);
                        Map.Entry entry = (Map.Entry) ((Iterator) c09cx.LJLJL()).next();
                        c09cx.LJZI(entry.getValue());
                        c09cx.LJZI(entry.getKey());
                        return;
                    }
                    qVar.LIZ(c09cu);
                }
            };
            Object objLJ = C7740030o.LIZ().getGson().LJ(new C09CX(map, str), cls);
            q.LIZ = qVar;
            return objLJ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            q.LIZ = qVar;
            throw th;
        }
    }
}
