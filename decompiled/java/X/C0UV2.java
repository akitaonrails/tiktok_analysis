package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestSyncEffectRealtimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNaviAvatarSwitcherSetting;

/* JADX INFO: renamed from: X.0UV2, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV2 {
    public static final /* synthetic */ int LIZ = 0;

    public static final InterfaceC769000UEo LIZ() {
        MultiGuestDataHolder multiGuestDataHolder;
        InterfaceC923870a9J interfaceC923870a9J;
        if (MultiGuestNaviAvatarSwitcherSetting.INSTANCE.isEnable() || LiveSdkMultiGuestSyncEffectRealtimeSetting.isEnable()) {
            C948450amx c948450amx = C948450amx.LIZIZ;
            if (c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER") != null && (multiGuestDataHolder = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER")) != null && multiGuestDataHolder.LJJJJZ != null) {
                MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c948450amx.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
                InterfaceC923890a9L interfaceC923890a9L = multiGuestDataHolder2 != null ? multiGuestDataHolder2.LJJJJZ : null;
                Object attachedComposerManager = (!(interfaceC923890a9L instanceof InterfaceC923870a9J) || (interfaceC923870a9J = (InterfaceC923870a9J) interfaceC923890a9L) == null) ? null : interfaceC923870a9J.getAttachedComposerManager();
                if (attachedComposerManager instanceof InterfaceC769000UEo) {
                    return (InterfaceC769000UEo) attachedComposerManager;
                }
                return null;
            }
        }
        return ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).createComposerManagerB();
    }
}
