package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U5I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U5I implements C0U5F {
    public static LiveEffect LIZIZ;
    public static String LIZLLL;
    public static LiveEffect LJ;
    public static final C0U5I LIZ = new C0U5I();
    public static C0U5K LIZJ = C0U5K.DEFAULT;

    public static void LJI() {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.BACKGROUND, EnumC771230UNd.APPLY_FAILED, "");
        }
    }

    public static void LJFF(String str) {
        IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
        if (iBroadcastService != null) {
            iBroadcastService.notifyApplyStatusAndSaveStatus(EnumC773040UUc.BACKGROUND, EnumC771230UNd.APPLYING, str);
        }
    }

    @Override // X.C0U5F
    public final void LIZ(LiveEffect liveEffect) {
        if (Intrinsics.LJFF(liveEffect, LIZIZ)) {
            LIZJ = C0U5K.DOWNLOAD_FAIL;
            LJI();
            C20441214yg.LJ("LiveBgApplyManager", "notifyItemDownloadFail");
        }
    }

    @Override // X.C0U5F
    public final void LIZIZ(LiveEffect liveEffect) {
        if (Intrinsics.LJFF(liveEffect, LIZIZ)) {
            LIZJ = C0U5K.DOWNLOADING;
            C20441214yg.LJ("LiveBgApplyManager", "notifyItemDownloading");
        }
    }

    @Override // X.C0U5F
    public final void LIZLLL(LiveEffect liveEffect) {
        if (Intrinsics.LJFF(liveEffect, LIZIZ)) {
            LIZJ = C0U5K.DOWNLOAD_START;
            C20441214yg.LJ("LiveBgApplyManager", "notifyItemDownloadStart");
        }
    }

    public static void LJII(BgEffectViewModel bgEffectViewModel, LiveEffect liveEffect) {
        if (!liveEffect.LJIJJLI()) {
            if ((bgEffectViewModel != null && bgEffectViewModel.yQ2(liveEffect)) || C0U7C.LJIILIIL(liveEffect)) {
                liveEffect.LJJLIL(true);
                liveEffect.LJLILLLLZI(false);
            }
        }
    }

    @Override // X.C0U5F
    public final void LIZJ(BgEffectViewModel bgEffectViewModel, LiveEffect liveEffect) {
        if (Intrinsics.LJFF(liveEffect, LIZIZ)) {
            LIZJ = C0U5K.DOWNLOAD_SUCCESS;
            if (liveEffect != null) {
                LJII(bgEffectViewModel, liveEffect);
                if (liveEffect.LJIJJLI()) {
                    C0UA1.LIZ().Gr("livebackground", LJ, liveEffect);
                    LJ = liveEffect;
                    LJFF(liveEffect.getResourceId());
                }
            }
            C20441214yg.LJ("LiveBgApplyManager", "notifyItemDownloadSuccess");
        }
    }

    public static void LJ(BgEffectViewModel bgEffectViewModel, C396001gM c396001gM, String str, DataChannel dataChannel) {
        Object next;
        if (c396001gM.LIZIZ.isEmpty()) {
            LJI();
            return;
        }
        Iterator it2 = c396001gM.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((LiveEffect) next).getResourceId(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        LiveEffect liveEffect = (LiveEffect) next;
        if (liveEffect == null) {
            return;
        }
        C0U5I c0u5i = LIZ;
        LJII(bgEffectViewModel, liveEffect);
        if (liveEffect.LJIJJLI()) {
            C0UA1.LIZ().Gr("livebackground", LJ, liveEffect);
            LJ = liveEffect;
            LJFF(str);
            return;
        }
        if (liveEffect.LJIJJLI()) {
            return;
        }
        LIZIZ = liveEffect;
        if (C767250U7v.LIZLLL(liveEffect)) {
            if (!(bgEffectViewModel instanceof StickerEffectViewModel) || bgEffectViewModel == null) {
                return;
            }
            C0U5D.LIZ(liveEffect, null, bgEffectViewModel, dataChannel, c0u5i, bgEffectViewModel);
            return;
        }
        if (liveEffect.LJJI()) {
            C0U5D.LIZIZ(liveEffect, null, dataChannel, c0u5i, bgEffectViewModel);
        } else {
            if (!(bgEffectViewModel instanceof StickerEffectViewModel) || bgEffectViewModel == null) {
                return;
            }
            C0U5D.LIZJ(liveEffect, null, bgEffectViewModel, dataChannel, null, null, c0u5i, bgEffectViewModel, 48);
        }
    }
}
