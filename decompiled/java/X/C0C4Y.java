package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0C4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C4Y implements C0C5C {
    public static final C0C4Y LIZJ = new C0C4Y();
    public static boolean LIZLLL = true;
    public final C01GW LIZ = C452501pT.LIZIZ(new C307620C4a());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C307640C4c());

    public final InterfaceC307670C4f LJIIIZ() {
        return (InterfaceC307670C4f) this.LIZ.getValue();
    }

    public final Gson LJIIJ() {
        return (Gson) this.LIZIZ.getValue();
    }

    @Override // X.C0C5C
    public final String[] LJFF(String str) {
        return LJIIIZ().LJI(str, null);
    }

    public final void LJIIIIZZ(String str) {
        InterfaceC292790Bdl interfaceC292790Bdl = C0C5A.LIZJ().LJ;
        if (interfaceC292790Bdl != null && interfaceC292790Bdl.LIZLLL()) {
            if (LJIIIZ().contains(str)) {
                LJIIIZ().LIZ(str);
                return;
            }
            return;
        }
        LJIIIZ().LIZ(str);
    }

    @Override // X.C0C5C
    public final boolean contains(String str) {
        return LJIIIZ().contains(str);
    }

    @Override // X.C0C5C
    public final int LIZ(String str, int i) {
        return LJIIIZ().getInt(str, i);
    }

    @Override // X.C0C5C
    public final String LIZIZ(String str, String str2) {
        return LJIIIZ().getString(str, str2);
    }

    @Override // X.C0C5C
    public final boolean LIZJ(String str, boolean z) {
        return LJIIIZ().getBoolean(str, z);
    }

    @Override // X.C0C5C
    public final float LIZLLL(String str, float f) {
        return LJIIIZ().getFloat(str, f);
    }

    @Override // X.C0C5C
    public final long LJ(String str, long j) {
        return LJIIIZ().getLong(str, j);
    }

    @Override // X.C0C5C
    public final double LJI(String str, double d) {
        return LJIIIZ().getDouble(str, d);
    }

    @Override // X.C0C5C
    public final Object LJII(String str, Class<?> cls) {
        Object objFromJson = null;
        try {
            objFromJson = GsonProtectorUtils.fromJson(LJIIJ(), LJIIIZ().getString(str, null), (Type) cls);
            return objFromJson;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("IConfigRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            return objFromJson;
        }
    }

    public final void LJIIJJI(String str, boolean z) {
        LJIIIZ().LIZLLL(str, z);
    }

    public final void LJIIL(String str, int i) {
        LJIIIZ().LIZJ(str, i);
    }

    public final void LJIILIIL(String str, String[] strArr) {
        LJIIIZ().LJII(str, strArr);
    }

    public final void LJIILJJIL(String str, String str2) {
        LJIIIZ().LIZIZ(str, str2);
    }
}
