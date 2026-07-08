package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostCrossSessionReentrantIntervalSetting;

/* JADX INFO: renamed from: X.0agG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C944300agG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str) {
        if (!C915980Zwa.LJII().LIZLLL()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkAnchorSessionForCrossArch");
            sbLIZ.append(", return by case 1, isAttached = false");
            C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C20337914i1<Long> c20337914i1 = InterfaceC934710aQn.vb;
        if (C158B.LIZJ() - c20337914i1.LIZIZ().longValue() >= LiveCoHostCrossSessionReentrantIntervalSetting.INSTANCE.getValue()) {
            c20337914i1.LJFF(Long.valueOf(C158B.LIZJ()));
            if (C915980Zwa.LJII().QP(0L)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("checkAnchorSessionForCrossArch");
                sbLIZ2.append(", return by case 3, isCrossSessionValid = true");
                C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            C915980Zwa.LJII().RA1(str);
            C955440ayE c955440ayE = new C955440ayE();
            c955440ayE.LJIIL(str, "source", true);
            c955440ayE.LJIJJLI("cross_create_channel_reentrant");
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("checkAnchorSessionForCrossArch");
        sbLIZ3.append(", return by case 2, check interval limit");
        C20441214yg.LJIIIZ("MultiHostSessionRechargeHelper", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
