package X;

import Y.AfS137S0000000_15;
import Y.AfS184S0100000_15;
import com.bytedance.android.live.liveinteract.cohost.remote.api.CoHostApi;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CohostServerOptVersionSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0b5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C960020b5c {
    public static void LIZ(InterfaceC957670b1p interfaceC957670b1p) {
        String secUid;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return;
        }
        long id = room.getId();
        if (room.getOwner() != null) {
            secUid = room.getOwner().getSecUid();
        } else {
            secUid = "";
        }
        HashMap map = new HashMap();
        map.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        C480460Ism.LIZ().getClass();
        ((CoHostApi) C480460Ism.LIZLLL(CoHostApi.class)).getAnchorLinkMicUserSetting(id, secUid, map).LJIILIIL(new C0UO0()).LJJLL(new AfS184S0100000_15(interfaceC957670b1p, 13), new AfS137S0000000_15(0));
    }

    public static C11NZ<C470590Icr<Void>> LIZIZ(int i, boolean z) {
        String secUid;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room == null) {
            return null;
        }
        long id = room.getId();
        if (room.getOwner() != null) {
            secUid = room.getOwner().getSecUid();
        } else {
            secUid = "";
        }
        HashMap map = new HashMap();
        map.put("cohost-arch-version", String.valueOf(CohostServerOptVersionSetting.INSTANCE.getValue()));
        switch (i) {
            case 5:
                C480460Ism.LIZ().getClass();
                break;
            case 6:
                C480460Ism.LIZ().getClass();
                break;
            case 7:
                C480460Ism.LIZ().getClass();
                break;
            case 8:
                C480460Ism.LIZ().getClass();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C480460Ism.LIZ().getClass();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C480460Ism.LIZ().getClass();
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C480460Ism.LIZ().getClass();
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C480460Ism.LIZ().getClass();
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                C480460Ism.LIZ().getClass();
                break;
            case 14:
                C480460Ism.LIZ().getClass();
                break;
            case 15:
                C480460Ism.LIZ().getClass();
                break;
            case 16:
                C480460Ism.LIZ().getClass();
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                C480460Ism.LIZ().getClass();
                break;
        }
        return null;
    }
}
