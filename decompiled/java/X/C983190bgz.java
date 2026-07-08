package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.competition.launcher.CompetitionModeChooseFragmentV2;

/* JADX INFO: renamed from: X.0bgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C983190bgz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, boolean z) {
        int i = CompetitionModeChooseFragmentV2.LLJJIJI;
        int iLJJI = (int) C497740JfY.LJJI(C465640INu.LIZIZ(context));
        boolean z2 = false;
        if (C915980Zwa.LIZIZ().JV1(false) == EnumC974260bSa.PUNISH || C915980Zwa.LIZIZ().JV1(false) == EnumC974260bSa.DRAW) {
            z2 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://roma_redirect/?spark_page=catch_bean_faq&from_page=");
        sbLIZ.append(str);
        sbLIZ.append("&is_anchor=");
        sbLIZ.append(z ? 1 : 0);
        sbLIZ.append("&isInVictoryLapOrDraw=");
        sbLIZ.append(z2);
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZ.LJJ(i, enumC760350Ts9);
        c760370TsBLIZ.LJIIIZ(iLJJI, enumC760350Ts9);
        c760370TsBLIZ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZ.LJIIIIZZ("bottom");
        String string = c760370TsBLIZ.LIZ().toString();
        IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
        if (iHybridContainerService != null) {
            iHybridContainerService.YC1(context, string, null);
        }
    }
}
