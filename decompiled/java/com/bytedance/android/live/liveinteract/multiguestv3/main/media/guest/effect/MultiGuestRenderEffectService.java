package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.C01GW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C923970a9T;
import X.C949390aoT;
import com.bytedance.android.live.liveinteract.api.IMultiGuestRenderEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes16.dex */
public class MultiGuestRenderEffectService implements IMultiGuestRenderEffectService {
    @Override // com.bytedance.android.live.liveinteract.api.IMultiGuestRenderEffectService
    public final /* bridge */ /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.liveinteract.api.IMultiGuestRenderEffectService
    public final void setLayoutRenderEffect(LiveEffect liveEffect) {
        C01GW<C949390aoT> c01gw = C949390aoT.LIZJ;
        C949390aoT c949390aoTLIZ = C923970a9T.LIZ();
        c949390aoTLIZ.getClass();
        if (liveEffect != null) {
            String resourceId = liveEffect.getResourceId();
            c949390aoTLIZ.LIZ.put(resourceId, liveEffect.getFilePath());
            c949390aoTLIZ.LIZIZ.put(resourceId, liveEffect);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setLayoutRenderEffect resourceId: ");
            sbLIZ.append(resourceId);
            sbLIZ.append(", filePath=");
            sbLIZ.append(liveEffect.getFilePath());
            C20441214yg.LIZIZ("MultiGuestRenderResProvider", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
