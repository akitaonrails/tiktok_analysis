package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0Di8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C346460Di8 implements InterfaceC2385309Wh {
    public final int $t;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            default:
                return null;
        }
    }

    public C346460Di8(int i) {
        this.$t = i;
    }

    public static final Object then$0(C346460Di8 c346460Di8, C15O7 c15o7) {
        C1C7U.LIZ("BoltsUtils@fdc5.callInUiDelayed$2L");
        if (c15o7 != null && !c15o7.LJIILL()) {
            c15o7.LJIILIIL();
        }
        C1C7U.LIZIZ("BoltsUtils@fdc5.callInUiDelayed$2L");
        return null;
    }

    public static final Object then$1(C346460Di8 c346460Di8, C15O7 c15o7) {
        C1C7U.LIZ("VideoFramesUploadService@993f.onHandleWork$4L");
        if (c15o7.LJIILL()) {
            c15o7.LJIIJJI();
            C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$4L");
            return null;
        }
        C1C7U.LIZIZ("VideoFramesUploadService@993f.onHandleWork$4L");
        return null;
    }

    public static final Object then$2(C346460Di8 c346460Di8, C15O7 c15o7) throws Exception {
        C1C7U.LIZ("SearchMixApiPreparation@7c3c.prepare$2L");
        if (!c15o7.LJIILL()) {
            C1C7U.LIZIZ("SearchMixApiPreparation@7c3c.prepare$2L");
            return null;
        }
        throw c15o7.LJIIJJI();
    }

    public static final Object then$3(C346460Di8 c346460Di8, C15O7 c15o7) {
        C1C7U.LIZ("AbTestApi@42cd.querySettings$1L");
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Boolean bool = Boolean.FALSE;
            C1C7U.LIZIZ("AbTestApi@42cd.querySettings$1L");
            return bool;
        } catch (IncompatibleClassChangeError e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        if (c15o7.LJIILIIL()) {
            Boolean bool2 = Boolean.FALSE;
            C1C7U.LIZIZ("AbTestApi@42cd.querySettings$1L");
            return bool2;
        }
        if (c15o7.LJIILL()) {
            Boolean bool3 = Boolean.FALSE;
            C1C7U.LIZIZ("AbTestApi@42cd.querySettings$1L");
            return bool3;
        }
        C0CLR.LIZ((n) c15o7.LJIIL());
        n nVarLJJIJ = ((n) c15o7.LJIIL()).LJIILIIL().LJJIJ("data");
        if (nVarLJJIJ != null) {
            C1150504el.LIZ().LIZLLL("method_save_abtest_keva", false);
            C0C64.LJIILLIIL().getClass();
            C0C5A.LIZJ().LIZ();
            C0C4Z.LJIIJ(nVarLJJIJ);
            C1150504el.LIZ().LJI("method_save_abtest_keva", false);
        }
        Boolean bool4 = Boolean.TRUE;
        C1C7U.LIZIZ("AbTestApi@42cd.querySettings$1L");
        return bool4;
    }

    public static final Object then$4(C346460Di8 c346460Di8, C15O7 c15o7) {
        C1C7U.LIZ("AbTestApi@42cd.querySettings$2L");
        C302240Bt0.LJFF().LIZLLL(((Boolean) c15o7.LJIIL()).booleanValue());
        C1C7U.LIZIZ("AbTestApi@42cd.querySettings$2L");
        return null;
    }
}
