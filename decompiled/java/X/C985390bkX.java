package X;

import Y.AAListenerS267S0200000_15;

/* JADX INFO: renamed from: X.0bkX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985390bkX {
    public static final /* synthetic */ int LIZIZ = 0;
    public C1295960jpS LIZ;

    public static void LIZ(C985390bkX c985390bkX, C1295960jpS c1295960jpS, String str, C985530bkl c985530bkl, InterfaceC985600bks interfaceC985600bks, String str2, int i) {
        String str3 = str2;
        if ((i & 8) != 0) {
            c985530bkl = null;
        }
        if ((i & 16) != 0) {
            interfaceC985600bks = null;
        }
        if ((i & 32) != 0) {
            str3 = "tiktok_live_match_redesign_resource_2";
        }
        if (c1295960jpS != null) {
            C962250b9D.LJIIJ(c985390bkX.LIZ);
            C500260Jjc.LJIILIIL(c985390bkX.LIZ);
            c985390bkX.LIZ = c1295960jpS;
            C962250b9D.LJIIJ(c1295960jpS);
            C500260Jjc.LLFFF(c1295960jpS);
            c1295960jpS.setRepeatCount(0);
            c1295960jpS.addAnimatorListener(new AAListenerS267S0200000_15(c985530bkl, interfaceC985600bks, 9));
            C1143680frq.LJIIL(c1295960jpS, str3, str, "images", true, null, Boolean.FALSE, null);
        }
    }
}
