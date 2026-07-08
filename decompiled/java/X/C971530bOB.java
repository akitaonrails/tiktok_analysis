package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFeSchemaConfigSetting;

/* JADX INFO: renamed from: X.0bOB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971530bOB {
    public static final /* synthetic */ C971530bOB LIZ = new C971530bOB();

    public static void LIZ(C971530bOB c971530bOB, Context context, int i, EnumC952890au7 enumC952890au7, String str, int i2) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            enumC952890au7 = C946850akN.LIZIZ;
        }
        String str2 = "in_spots";
        if ((i2 & 8) != 0) {
            str = "in_spots";
        }
        c971530bOB.getClass();
        String str3 = MultiGuestFeSchemaConfigSetting.INSTANCE.getValue().textHeaderFAQ;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                str2 = "";
            }
        } else {
            str2 = "text_header";
        }
        if (str3 != null && str3.length() != 0) {
            z = false;
        }
        if (!z && context != null) {
            C972080bP4.LIZLLL("openFAQDialog open", null, 3);
            EnumC971610bOJ enumC971610bOJ = EnumC971610bOJ.FAQ;
            MultiCanvasUtils.LIZ.getClass();
            C946850akN.LJFF(MultiCanvasUtils.LJIIJJI(enumC952890au7), enumC971610bOJ, str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str3);
            sbLIZ.append("&target_header=");
            sbLIZ.append(str2);
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("openFAQDialog return as url is null or context is null url:");
        sbLIZ2.append(str3);
        sbLIZ2.append(" context:");
        sbLIZ2.append(context);
        C972080bP4.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2), null, 3);
    }
}
