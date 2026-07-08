package X;

import com.bytedance.ies.abmock.SaveConfigType$ConfigType;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: X.0C4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307730C4l implements C0C5C {
    public static final C307730C4l LIZLLL = new C307730C4l();
    public static boolean LJ = true;
    public final C01GW LIZ = C452501pT.LIZIZ(new C307740C4m());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C307750C4n());
    public final C307720C4k LIZJ = new C307720C4k();

    public final InterfaceC307670C4f LJIIIZ() {
        return (InterfaceC307670C4f) this.LIZ.getValue();
    }

    @Override // X.C0C5C
    public final String[] LJFF(String str) {
        return LJIIIZ().LJI(str, null);
    }

    public final void LJIIIIZZ(String str) {
        try {
            InterfaceC292790Bdl interfaceC292790Bdl = C0C5A.LIZJ().LJ;
            if (LJ && C307720C4k.LIZ(str)) {
                this.LIZJ.LIZ.LJIIIIZZ(str);
            }
            if (interfaceC292790Bdl == null || !interfaceC292790Bdl.LIZLLL() || LJIIIZ().contains(str)) {
                LJIIIZ().LIZ(str);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append("erase");
            C0C46.LIZIZ("LibraConfigCenterRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
        }
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
            objFromJson = GsonProtectorUtils.fromJson((Gson) this.LIZIZ.getValue(), LJIIIZ().getString(str, null), (Type) cls);
            return objFromJson;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cause: ");
            sbLIZ.append(th);
            sbLIZ.append("--message: ");
            sbLIZ.append(str);
            C0C46.LIZIZ("LibraConfigCenterRepo", new Throwable(C2188811AlT.LIZIZ(sbLIZ), th));
            return objFromJson;
        }
    }

    public final void LJIIJ(String str, boolean z) {
        LJIIIZ().LIZLLL(str, z);
        if (LJ && C307720C4k.LIZ(str)) {
            C307720C4k c307720C4k = this.LIZJ;
            c307720C4k.LIZ.LJIIIZ().LIZLLL(str, ((Boolean) C0C5A.LIZJ().LJ(null, str, Boolean.valueOf(z))).booleanValue());
        }
    }

    public final void LJIIJJI(String str, double d) {
        LJIIIZ().LJFF(str, d);
        if (LJ && C307720C4k.LIZ(str)) {
            C307720C4k c307720C4k = this.LIZJ;
            c307720C4k.LIZ.LJIIIZ().LJFF(str, ((Double) C0C5A.LIZJ().LJ(null, str, Double.valueOf(d))).doubleValue());
        }
    }

    public final void LJIIL(String str, float f) {
        LJIIIZ().LJIIJ(str, f);
        if (LJ && C307720C4k.LIZ(str)) {
            C307720C4k c307720C4k = this.LIZJ;
            c307720C4k.LIZ.LJIIIZ().LJIIJ(str, ((Float) C0C5A.LIZJ().LJ(null, str, Float.valueOf(f))).floatValue());
        }
    }

    public final void LJIILIIL(String str, int i) {
        LJIIIZ().LIZJ(str, i);
        if (LJ && C307720C4k.LIZ(str)) {
            C307720C4k c307720C4k = this.LIZJ;
            c307720C4k.LIZ.LJIIIZ().LIZJ(str, ((Integer) C0C5A.LIZJ().LJ(null, str, Integer.valueOf(i))).intValue());
        }
    }

    public final void LJIILJJIL(String str, SaveConfigType$ConfigType saveConfigType$ConfigType) {
        Object objLJ;
        if (LJ && C307720C4k.LIZ(str)) {
            if (saveConfigType$ConfigType == SaveConfigType$ConfigType.STRING_ARRAY) {
                objLJ = C0C5A.LIZJ().LJ(String[].class, str, null);
            } else {
                objLJ = C0C5A.LIZJ().LJ(null, str, null);
            }
            if (objLJ == null) {
            }
            switch (C0C4M.LIZ[saveConfigType$ConfigType.ordinal()]) {
                case 1:
                    C307720C4k c307720C4k = this.LIZJ;
                    c307720C4k.LIZ.LJIIIZ().LIZLLL(str, ((Boolean) objLJ).booleanValue());
                    break;
                case 2:
                    C307720C4k c307720C4k2 = this.LIZJ;
                    c307720C4k2.LIZ.LJIIIZ().LIZJ(str, ((Integer) objLJ).intValue());
                    break;
                case 3:
                    C307720C4k c307720C4k3 = this.LIZJ;
                    c307720C4k3.LIZ.LJIIIZ().LJIIIIZZ(str, ((Long) objLJ).longValue());
                    break;
                case 4:
                    C307720C4k c307720C4k4 = this.LIZJ;
                    c307720C4k4.LIZ.LJIIIZ().LJFF(str, ((Double) objLJ).doubleValue());
                    break;
                case 5:
                    C307720C4k c307720C4k5 = this.LIZJ;
                    c307720C4k5.LIZ.LJIIIZ().LJIIJ(str, ((Float) objLJ).floatValue());
                    break;
                case 6:
                    this.LIZJ.LIZ.LJIIJ(str, (String) objLJ);
                    break;
                case 7:
                    this.LIZJ.LIZ.LJIIIZ().LJII(str, (String[]) objLJ);
                    break;
                case 8:
                    C307720C4k c307720C4k6 = this.LIZJ;
                    c307720C4k6.LIZ.LJIIJ(str, GsonProtectorUtils.toJson((Gson) this.LIZIZ.getValue(), objLJ));
                    break;
            }
        }
    }

    public final void LJIILL(String str, long j) {
        LJIIIZ().LJIIIIZZ(str, j);
        if (LJ && C307720C4k.LIZ(str)) {
            C307720C4k c307720C4k = this.LIZJ;
            c307720C4k.LIZ.LJIIIZ().LJIIIIZZ(str, ((Long) C0C5A.LIZJ().LJ(null, str, Long.valueOf(j))).longValue());
        }
    }

    public final void LJIILLIIL(String str, String[] strArr) {
        LJIIIZ().LJII(str, strArr);
        if (LJ && C307720C4k.LIZ(str)) {
            C307720C4k c307720C4k = this.LIZJ;
            c307720C4k.LIZ.LJIIIZ().LJII(str, (String[]) C0C5A.LIZJ().LJ(String[].class, str, strArr));
        }
    }

    public final void LJIIZILJ(String str, String str2) {
        LJIIIZ().LIZIZ(str, str2);
        if (LJ && C307720C4k.LIZ(str)) {
            Object objLJ = C0C5A.LIZJ().LJ(null, str, str2);
            if (objLJ != null && !(objLJ instanceof String)) {
                str2 = GsonProtectorUtils.toJson((Gson) this.LIZIZ.getValue(), objLJ);
            }
            this.LIZJ.LIZ.LJIIJ(str, str2);
        }
    }
}
