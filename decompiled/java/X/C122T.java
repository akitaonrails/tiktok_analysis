package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import kotlin.jvm.internal.AFwS218S0000000_29;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.122T, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C122T {
    public static final C122T LIZ = new C122T();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(229));
    public static final InterfaceC1635410sex LIZJ = C1633850scR.LIZ(C0CHQ.LIZ, null);
    public static boolean LIZLLL;

    public static final void LIZ() {
        LIZ.getClass();
        LIZIZ.getValue();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.124H] */
    public static final void LIZIZ() {
        if (LIZLLL) {
            return;
        }
        LIZ.getClass();
        Object value = LIZIZ.getValue();
        ?? r8 = new Object() { // from class: X.124H
        };
        InterfaceC1635410sex interfaceC1635410sex = LIZJ;
        C1637870siv c1637870siv = new InterfaceC19569411hM() { // from class: X.0siv
            @Override // X.InterfaceC19569411hM
            public final void LIZIZ() {
                C0CHQ.LIZ().LIZJ().LJIIJJI(0, "effect_text_res_download_suc_rate", new C543670LTx().LJ());
            }

            @Override // X.InterfaceC19569411hM
            public final void LIZJ() {
                C0CHQ.LIZ().LIZJ().LJIIJJI(0, "effect_text_font_download_suc_rate", new C543670LTx().LJ());
            }

            @Override // X.InterfaceC19569411hM
            public final void LIZ(String str, Throwable th) {
                String strLIZ;
                int errorCode;
                if (th != null) {
                    strLIZ = C08KI.LIZ(th);
                } else {
                    strLIZ = "";
                }
                if (th instanceof BaseException) {
                    errorCode = ((BaseException) th).getErrorCode();
                } else {
                    errorCode = -1;
                }
                InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("effectId", str);
                c543670LTx.LIZ.put("exception", strLIZ);
                c543670LTx.LIZ.put("errorCode", Integer.valueOf(errorCode));
                interfaceC1637880siwLIZJ.LJIIJJI(1, "effect_text_res_download_suc_rate", c543670LTx.LJ());
            }

            @Override // X.InterfaceC19569411hM
            public final void LIZLLL(String str, Throwable th) {
                String strLIZ;
                int errorCode;
                if (th != null) {
                    strLIZ = C08KI.LIZ(th);
                } else {
                    strLIZ = "";
                }
                if (th instanceof BaseException) {
                    errorCode = ((BaseException) th).getErrorCode();
                } else {
                    errorCode = -1;
                }
                InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
                C543670LTx c543670LTx = new C543670LTx();
                c543670LTx.LIZ.put("effectId", str);
                c543670LTx.LIZ.put("exception", strLIZ);
                c543670LTx.LIZ.put("errorCode", Integer.valueOf(errorCode));
                interfaceC1637880siwLIZJ.LJIIJJI(1, "effect_text_font_download_suc_rate", c543670LTx.LJ());
            }
        };
        C0CHQ.LIZ().getUiService().getClass();
        value.getClass();
        C196919122r c196919122rLIZIZ = C196909122h.LIZIZ();
        InterfaceC1635390sev interfaceC1635390sevLIZ = C196909122h.LIZ();
        InterfaceC1674890tgd interfaceC1674890tgd = C196909122h.LIZJ;
        C0FIE c0fie = C196909122h.LIZLLL;
        if (!C196916122o.LIZLLL) {
            if (!C196909122h.LJ) {
                C196909122h.LIZ = c196919122rLIZIZ;
                C196909122h.LIZIZ = interfaceC1635390sevLIZ;
                C196909122h.LIZJ = interfaceC1674890tgd;
                C196909122h.LIZLLL = c0fie;
                C196909122h.LJ = true;
            }
            C196916122o.LIZ = r8;
            C196916122o.LIZIZ = interfaceC1635410sex;
            C196916122o.LIZJ = c1637870siv;
            C196916122o.LIZLLL = true;
        }
        LIZLLL = true;
    }

    public static void LIZLLL() {
        boolean zLIZ = C0CHT.LIZ();
        boolean zLIZ2 = C311110CHl.LIZ();
        LIZ.getClass();
        LIZJ(zLIZ, zLIZ2, (!C311110CHl.LIZ() || C0C64.LJIILLIIL().LJIJ(31744, 0, "text_reader_allowing_choose_sound_effects", true) == 2 || C11YF.LIZJ()) ? false : true);
    }

    public static final void LJ(AnonymousClass1244 anonymousClass1244) {
        LIZ.getClass();
        LIZIZ.getValue().getClass();
        C196909122h.LIZIZ().LIZJ = anonymousClass1244;
    }

    public static final void LIZJ(boolean z, boolean z2, boolean z3) {
        LIZ.getClass();
        Object value = LIZIZ.getValue();
        boolean zLIZIZ = C11YF.LIZIZ();
        boolean zLIZLLL = C11YF.LIZLLL();
        boolean z4 = false;
        try {
            JSONObject jSONObjectLIZ = C11YF.LIZ();
            if (jSONObjectLIZ != null) {
                if (jSONObjectLIZ.optInt("v3") == 1) {
                    z4 = true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        value.getClass();
        C196909122h.LIZIZ().LIZIZ.LIZIZ = z;
        C196909122h.LIZIZ().LIZIZ.LIZJ = z2;
        C196909122h.LIZIZ().LIZIZ.LIZLLL = z3;
        C196909122h.LIZIZ().LIZIZ.LJ = zLIZIZ;
        C196909122h.LIZIZ().LIZIZ.LJFF = zLIZLLL;
        C196909122h.LIZIZ().LIZIZ.LJI = z4;
    }
}
