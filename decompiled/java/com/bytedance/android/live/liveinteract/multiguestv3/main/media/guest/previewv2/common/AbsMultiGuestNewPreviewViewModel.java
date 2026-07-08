package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.previewv2.common;

import X.C0U78;
import X.C1161920gLG;
import X.C13LP;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.viewmodel.ViewModelExt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSyncEffectRealtimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AbsMultiGuestNewPreviewViewModel extends ViewModelExt {
    public static final /* synthetic */ int LLILLJJLI = 0;

    public static final void vQ2(C0U78 c0u78) {
        int i;
        C0U78 c0u78ComposerManagerB = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).composerManagerB();
        if (c0u78 != null) {
            if (!LiveSdkMultiGuestSyncEffectRealtimeSetting.isEnable()) {
                c0u78ComposerManagerB.lr("liveguestbeauty");
            }
            List<LiveEffect> listQr = c0u78.qr("liveguestbeauty");
            if (listQr != null) {
                for (LiveEffect liveEffect : listQr) {
                    c0u78ComposerManagerB.LJIILIIL(liveEffect);
                    LiveEffect.ComposerConfig composerConfig = (LiveEffect.ComposerConfig) C13LP.LJJJLL(liveEffect.LJJJZ());
                    if (composerConfig != null) {
                        i = composerConfig.LIZ;
                    } else {
                        i = 0;
                    }
                    c0u78ComposerManagerB.LJIIZILJ(i, liveEffect);
                }
            }
            c0u78.LJJIII();
        }
    }
}
