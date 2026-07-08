package X;

import android.content.Context;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.business.player.audio.EcAudioPlayer;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0XRI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XRI extends C0XRJ {
    public static final /* synthetic */ int LLILLL = 0;

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        Context context;
        C19EG c19egLIZIZ;
        EcAudioPlayer ecAudioPlayer;
        super.release();
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (context = interfaceC634840OvC.getContext()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (ecAudioPlayer = EcAudioPlayer.LLILZIL.get(c19egLIZIZ)) == null) {
            return;
        }
        ecAudioPlayer.LIZIZ();
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        boolean zBooleanValue;
        C0XRK c0xrk = (C0XRK) xBaseParamModel;
        boolean zBooleanValue2 = false;
        if (c0xrk.getAudioUrl().length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid audioUrl: '");
            sbLIZ.append(c0xrk.getAudioUrl());
            sbLIZ.append('\'');
            completionBlock.onFailure(0, C2188811AlT.LIZIZ(sbLIZ), C0XRG.LIZ(-11, c0xrk.getAudioUrl()));
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "spark context is null", null, 4);
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ == null) {
            C2382909Vj.LIZ(completionBlock, 0, "spark context must be lifecycleOwner", null, 4);
            return;
        }
        if (u.LJJIIJZLJL(c0xrk.getAudioUrl(), "http", false)) {
            String audioUrl = c0xrk.getAudioUrl();
            Boolean boolIsLoop = c0xrk.isLoop();
            if (boolIsLoop != null) {
                zBooleanValue2 = boolIsLoop.booleanValue();
            }
            C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c19egLIZIZ.getLifecycle()), C0PEM.LIZJ, null, new C0XRC(audioUrl, completionBlock, c19egLIZIZ, zBooleanValue2, null), 2);
            return;
        }
        String localKey = c0xrk.getLocalKey();
        String channel = c0xrk.getChannel();
        Boolean boolIsLoop2 = c0xrk.isLoop();
        if (boolIsLoop2 != null) {
            zBooleanValue = boolIsLoop2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (localKey == null || localKey.length() == 0 || channel == null || channel.length() == 0) {
            return;
        }
        C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(c19egLIZIZ.getLifecycle()), C0PEM.LIZJ, null, new C0XRF(c0xrk.getAudioUrl(), localKey, completionBlock, channel, c19egLIZIZ, zBooleanValue, null), 2);
    }
}
