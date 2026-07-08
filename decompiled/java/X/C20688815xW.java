package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15xW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20688815xW extends C09AY implements Function0<SAFFragmentRootScene> {
    public final /* synthetic */ C199Y LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20688815xW(C199Y c199y) {
        super(0);
        this.LL = c199y;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ SAFFragmentRootScene invoke() {
        SAFFragmentRootScene sAFFragmentRootScene = new SAFFragmentRootScene();
        C199Y c199y = this.LL;
        c199y.rootSAFSceneWrapper = sAFFragmentRootScene;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rootScene is : ");
        sbLIZ.append(sAFFragmentRootScene);
        sbLIZ.append(", ");
        Class<? extends InterfaceC214902198i> rootFragmentClz = c199y.getRootFragmentClz();
        sbLIZ.append(rootFragmentClz != null ? rootFragmentClz.getName() : null);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SAFActivity: ");
        sbLIZ2.append(c199y);
        sbLIZ2.append(",  ");
        sbLIZ2.append(strLIZIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        Bundle bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = INVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(this.LL.getIntent());
        if (bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras == null) {
            bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = new Bundle();
        }
        sAFFragmentRootScene.mArguments = bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        sAFFragmentRootScene.LLJJI = this.LL.getRootFragmentFactory();
        Class<? extends InterfaceC214902198i> rootFragmentClz2 = this.LL.getRootFragmentClz();
        C786410Ut5.LJJJI("fragmentClass", rootFragmentClz2 != null ? rootFragmentClz2.getName() : null, bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
        C786410Ut5.LJJIJL(bundleINVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "arg_context_config", this.LL.getRootPageContextConfig());
        return sAFFragmentRootScene;
    }

    public static Bundle INVOKEVIRTUAL_com_bytedance_ies_foundation_saf_SAFTikTokActivity$initSceneEnvironment$rootSceneFactory$1_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
