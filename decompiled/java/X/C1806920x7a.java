package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletFESchema;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.hybrid.spark.page.SparkFragment;

/* JADX INFO: renamed from: X.0x7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1806920x7a {
    public static final void LIZIZ(Context context) {
        SparkActivity sparkActivity;
        SparkFragment sparkFragment;
        InterfaceC1541990qEH kitView;
        if ((context instanceof SparkActivity) && (sparkActivity = (SparkActivity) context) != null && (sparkFragment = sparkActivity.LLJILJIL) != null && (kitView = sparkFragment.getKitView()) != null) {
            kitView.LIZ("onDismissPopup", null);
        }
    }

    public static final void LIZ(int i, boolean z) {
        String str;
        C495520Jby c495520Jby = new C495520Jby(LiveWalletFESchema.INSTANCE.getValue().rechargeRecommendation);
        c495520Jby.LIZ(i, "coins_count");
        c495520Jby.LIZJ("is_first_recharge", "1");
        if (z) {
            str = "cash";
        } else {
            str = "exchange";
        }
        c495520Jby.LIZJ("recharge_type", str);
        c495520Jby.LIZJ("recommendation_page", "1");
        c495520Jby.LIZJ("campaign_type", "2");
        c495520Jby.LIZ(2, "task_scene");
        c495520Jby.LIZ(3, "reward_scene");
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(C176600m4.LIZ(), c495520Jby.LIZLLL());
    }
}
