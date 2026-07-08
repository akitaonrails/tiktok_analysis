package X;

import Y.AfS139S0000000_17;
import android.text.TextUtils;
import com.bytedance.android.livesdk.gift.model.GiftEffectAckEffectExtra;
import com.bytedance.android.livesdk.gift.model.GiftEffectAckParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftEffectToServerApiSetting;
import com.bytedance.android.livesdk.sticker.StickerGiftApi;
import com.bytedance.android.livesdk.sticker.StickerGiftEffectMsgBodyInteractResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: renamed from: X.0fol, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141770fol {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C1136560fgM c1136560fgM) {
        if (c1136560fgM == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportStickerFirstFrame");
            sbLIZ.append(" error, return by currentMessage is null");
            C20441214yg.LJ("GiftEffectAckHelper", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        GiftEffectAckParams giftEffectAckParams = new GiftEffectAckParams();
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            giftEffectAckParams.roomId = room.getId();
        }
        giftEffectAckParams.giftId = c1136560fgM.LJIIL;
        giftEffectAckParams.effectId = c1136560fgM.LJFF;
        giftEffectAckParams.ackType = 1;
        GiftEffectAckEffectExtra giftEffectAckEffectExtra = new GiftEffectAckEffectExtra();
        giftEffectAckEffectExtra.messageId = c1136560fgM.LJ;
        giftEffectAckEffectExtra.effectPlayTime = C158B.LIZJ();
        giftEffectAckParams.effectExtra = giftEffectAckEffectExtra;
        C480460Ism.LIZ().getClass();
        ((StickerGiftApi) C480460Ism.LIZLLL(StickerGiftApi.class)).sendGiftEffectAck("/gift/effect_ack/", giftEffectAckParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0fog
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GiftEffectAckHelper@c5b6.reportStickerFirstFrame$2");
                C1C7U.LIZIZ("GiftEffectAckHelper@c5b6.reportStickerFirstFrame$2");
            }
        }, new AfS139S0000000_17(3));
    }

    public static void LIZIZ(C1136560fgM c1136560fgM, String str, String str2) {
        GiftEffectAckParams giftEffectAckParams = new GiftEffectAckParams();
        giftEffectAckParams.ackType = 2;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            giftEffectAckParams.roomId = room.getId();
        }
        if (!TextUtils.isEmpty(str2)) {
            StickerGiftEffectMsgBodyInteractResult stickerGiftEffectMsgBodyInteractResult = (StickerGiftEffectMsgBodyInteractResult) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, str2, StickerGiftEffectMsgBodyInteractResult.class);
            giftEffectAckParams.giftId = stickerGiftEffectMsgBodyInteractResult.giftId;
            giftEffectAckParams.effectId = stickerGiftEffectMsgBodyInteractResult.effectId;
            giftEffectAckParams.effectPayload = stickerGiftEffectMsgBodyInteractResult.payload;
        }
        if (c1136560fgM == null || giftEffectAckParams.giftId != c1136560fgM.LJIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportStickerInteractResult");
            sbLIZ.append(", giftIdFromEffect not match currentMessage, giftIdFromEffect = ");
            sbLIZ.append(giftEffectAckParams.giftId);
            C20441214yg.LJ("GiftEffectAckHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
        String url = LiveGiftEffectToServerApiSetting.INSTANCE.getUrl(str);
        if (TextUtils.isEmpty(str)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportStickerInteractResult");
            sbLIZ2.append(" error, requestUrl is null");
            C20441214yg.LJ("GiftEffectAckHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C480460Ism.LIZ().getClass();
        ((StickerGiftApi) C480460Ism.LIZLLL(StickerGiftApi.class)).sendGiftEffectAck(url, giftEffectAckParams).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.0foh
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GiftEffectAckHelper@c5b6.reportStickerInteractResult$1");
                C1C7U.LIZIZ("GiftEffectAckHelper@c5b6.reportStickerInteractResult$1");
            }
        }, new AfS139S0000000_17(4));
    }
}
