package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicLayoutEffectResourceSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;

/* JADX INFO: renamed from: X.0aoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949390aoT implements InterfaceC965150bDt, C0U45 {
    public static final C01GW<C949390aoT> LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS203S0000000_15.get$arr$(107));
    public final Map<String, String> LIZ = new LinkedHashMap();
    public final Map<String, LiveEffect> LIZIZ = new LinkedHashMap();

    @Override // X.C0U45
    public final void LIZIZ(LiveEffect liveEffect, int i, long j) {
    }

    @Override // X.InterfaceC965150bDt
    public final LiveEffect LIZLLL() {
        String resourceId = LinkMicLayoutEffectResourceSetting.INSTANCE.getResourceId();
        LiveEffect liveEffect = (LiveEffect) ((LinkedHashMap) this.LIZIZ).get(resourceId);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getLayoutRenderEffect resourceId: ");
        sbLIZ.append(resourceId);
        sbLIZ.append(", hasCachedEffect=");
        sbLIZ.append(liveEffect != null);
        C20441214yg.LIZIZ("MultiGuestRenderResProvider", C2188811AlT.LIZIZ(sbLIZ));
        return liveEffect;
    }

    public final void LJFF() {
        C20441214yg.LIZIZ("MultiGuestRenderResProvider", "preload");
        LinkMicLayoutEffectResourceSetting linkMicLayoutEffectResourceSetting = LinkMicLayoutEffectResourceSetting.INSTANCE;
        String panel = linkMicLayoutEffectResourceSetting.getPanel();
        String resourceId = linkMicLayoutEffectResourceSetting.getResourceId();
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJII(panel, resourceId, this);
    }

    @Override // X.C0U45
    public final void LIZ(LiveEffect liveEffect) {
        String resourceId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download Effect sticker?.id: ");
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        sbLIZ.append(resourceId);
        sbLIZ.append(" onSuccess");
        C20441214yg.LIZIZ("MultiGuestRenderResProvider", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffect != null) {
            this.LIZ.put(liveEffect.getResourceId(), liveEffect.getFilePath());
            this.LIZIZ.put(liveEffect.getResourceId(), liveEffect);
        }
    }

    @Override // X.C0U45
    public final void LIZJ(LiveEffect liveEffect) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download Effect sticker?.id: ");
        if (liveEffect != null) {
            lValueOf = Long.valueOf(liveEffect.getEffectId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" onStart");
        C20441214yg.LIZIZ("MultiGuestRenderResProvider", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C0U45
    public final void LJ(LiveEffect liveEffect, ExceptionResult exceptionResult) {
        Long lValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Download Effect sticker?.id: ");
        if (liveEffect != null) {
            lValueOf = Long.valueOf(liveEffect.getEffectId());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        sbLIZ.append(" onFail, e: ");
        sbLIZ.append(exceptionResult);
        C20441214yg.LIZIZ("MultiGuestRenderResProvider", C2188811AlT.LIZIZ(sbLIZ));
    }
}
