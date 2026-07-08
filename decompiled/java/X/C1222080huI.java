package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.biz.wallet.biz.commonpage.WalletCommonStepFragment;

/* JADX INFO: renamed from: X.0huI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222080huI {
    public static void LIZ(Context context, String str, String str2, InterfaceC1221990hu9 interfaceC1221990hu9) {
        WalletCommonStepFragment.LLJ.put(str, interfaceC1221990hu9);
        SmartRouter.buildRoute(context, UriProtector.parse("//pipo/wallet/common_step").buildUpon().appendQueryParameter("step_name", str).appendQueryParameter(Scene.SCENE_SERVICE, str2).build().toString()).open();
    }
}
