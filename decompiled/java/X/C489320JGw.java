package X;

import com.ss.android.ugc.aweme.pcs.course.videoeditpage.vm.PcsVideoEditVM;
import com.ss.android.ugc.aweme.pcs.course.videopublishpage.vm.PcsVideoReEditVm;

/* JADX INFO: renamed from: X.0JGw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489320JGw {
    public static String LIZ(EnumC489460JHk enumC489460JHk) {
        if (enumC489460JHk != null) {
            int i = C489450JHj.LIZ[enumC489460JHk.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "review_pass";
                    }
                    return "";
                }
                return "detach_in_progess";
            }
            return "review_in_progress";
        }
        return "";
    }

    public static void LIZIZ(EnumC489360JHa enumC489360JHa, C0JHC c0jhc, PcsVideoEditVM pcsVideoEditVM, boolean z, String str, PcsVideoReEditVm pcsVideoReEditVm, int i) {
        InterfaceC489200JGk interfaceC489200JGk;
        Integer numValueOf;
        Integer numValueOf2;
        boolean z2;
        C0JHL state;
        C489550JHt state2;
        String str2 = str;
        Long lValueOf = null;
        enumC489460JHk = null;
        EnumC489460JHk enumC489460JHk = null;
        if ((i & 4) != 0) {
            pcsVideoEditVM = null;
        }
        if ((i & 16) != 0) {
            str2 = "";
        }
        if ((i & 32) != 0) {
            pcsVideoReEditVm = null;
        }
        String str3 = "show";
        if (enumC489360JHa == EnumC489360JHa.CHOOSE_FROM_ALBUM) {
            if (pcsVideoEditVM != null && (state2 = pcsVideoEditVM.getState()) != null) {
                enumC489460JHk = state2.LLILZIL;
            }
            String strLIZ = LIZ(enumC489460JHk);
            if (!z) {
                str3 = "click";
            }
            C489110JGb.LJIILIIL(c0jhc, null, false, strLIZ, str2, str3);
            return;
        }
        if (enumC489360JHa != EnumC489360JHa.RE_EDIT_SCENE) {
            return;
        }
        if (pcsVideoReEditVm != null && (state = pcsVideoReEditVm.getState()) != null) {
            interfaceC489200JGk = state.LLILLL;
        } else {
            interfaceC489200JGk = null;
        }
        if (interfaceC489200JGk != null) {
            numValueOf = Integer.valueOf(interfaceC489200JGk.LJIJI());
            numValueOf2 = Integer.valueOf(interfaceC489200JGk.LJIIL());
        } else {
            numValueOf = null;
            numValueOf2 = null;
        }
        String strLIZ2 = C489110JGb.LIZ(numValueOf, numValueOf2);
        if (interfaceC489200JGk != null) {
            lValueOf = Long.valueOf(interfaceC489200JGk.LJ(true));
        }
        String strValueOf = String.valueOf(lValueOf);
        if (interfaceC489200JGk != null && interfaceC489200JGk.LJIIJ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            str3 = "click";
        }
        C489110JGb.LJIILIIL(c0jhc, strValueOf, z2, strLIZ2, str2, str3);
    }
}
