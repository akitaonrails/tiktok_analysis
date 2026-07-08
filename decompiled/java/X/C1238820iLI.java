package X;

import com.ss.android.ugc.aweme.services.GSMAService;

/* JADX INFO: renamed from: X.0iLI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238820iLI {
    public static void LIZ(InterfaceC1238810iLH interfaceC1238810iLH) {
        DialogC1389620mGW dialogC1389620mGWJz = interfaceC1238810iLH.Jz();
        if (dialogC1389620mGWJz != null) {
            C0FNV.LIZ(dialogC1389620mGWJz);
        }
    }

    public static void LIZIZ(InterfaceC1238810iLH interfaceC1238810iLH) {
        DialogC1389620mGW dialogC1389620mGWJz;
        C19EG activity;
        if (interfaceC1238810iLH.Jz() == null && (activity = interfaceC1238810iLH.getActivity()) != null) {
            interfaceC1238810iLH.rC(new DialogC1389620mGW(activity));
        }
        DialogC1389620mGW dialogC1389620mGWJz2 = interfaceC1238810iLH.Jz();
        if ((dialogC1389620mGWJz2 == null || !dialogC1389620mGWJz2.isShowing()) && (dialogC1389620mGWJz = interfaceC1238810iLH.Jz()) != null) {
            dialogC1389620mGWJz.LJJLL(true);
            dialogC1389620mGWJz.LJJLIIJ(false);
            dialogC1389620mGWJz.LJJLJ(2131836815);
            dialogC1389620mGWJz.LLILZLL = new InterfaceC1389630mGX() { // from class: X.0iLJ
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    GSMAService.INSTANCE.cancelJob();
                }
            };
            C0FNV.LIZJ(dialogC1389620mGWJz);
        }
    }
}
