package X;

import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.tools.data.AIChatPageConfig;

/* JADX INFO: renamed from: X.18Xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public interface InterfaceC21300818Xm {
    boolean LIZ(String str);

    void LIZIZ(Context context, String str);

    void LIZJ(Context context, AIChatGenModel aIChatGenModel, AIChatGenNode aIChatGenNode, String str, String str2);

    void LIZLLL(Context context, OnActivityResultCallback onActivityResultCallback, AIChatPageConfig aIChatPageConfig);

    void LJ(Context context, String str, String str2, String str3, String str4, String str5);

    void LJFF(C19EG c19eg, AIChatGenConsumptionModel aIChatGenConsumptionModel, AIChatGenNode aIChatGenNode, String str);

    void LJI(VideoPublishContainerScene videoPublishContainerScene);

    void LJII(Context context);

    boolean LJIIIIZZ(String str);

    void LJIIIZ(Context context, AIChatGenConsumptionModel aIChatGenConsumptionModel);
}
