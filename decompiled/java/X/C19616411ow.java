package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;

/* JADX INFO: renamed from: X.11ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19616411ow extends AbstractC19589811ke<LiveEventCountDownStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19635511s1(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        String title;
        long jLongValue;
        long subscribeNum;
        Boolean subscribe;
        String textAlreadySubscribed;
        String textAlreadyExpired;
        Long expiredTime;
        BaseStickerModel baseStickerModelLIZ = C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.LIVE_EVENT_COUNTDOWN, 0, 0);
        CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
        String textTobeSubscribed = null;
        if (countDownStickerStruct != null) {
            title = countDownStickerStruct.getTitle();
        } else {
            title = null;
        }
        CountDownStickerStruct countDownStickerStruct2 = interactStickerStruct.getCountDownStickerStruct();
        long eventId = 0;
        if (countDownStickerStruct2 != null && (expiredTime = countDownStickerStruct2.getExpiredTime()) != null) {
            jLongValue = expiredTime.longValue();
        } else {
            jLongValue = 0;
        }
        long j = ((long) LSPassThroughRecordSizeConfig.DEFAULT) * jLongValue;
        CountDownStickerStruct countDownStickerStruct3 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct3 != null) {
            subscribeNum = countDownStickerStruct3.getSubscribeNum();
        } else {
            subscribeNum = 0;
        }
        CountDownStickerStruct countDownStickerStruct4 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct4 != null) {
            subscribe = countDownStickerStruct4.getSubscribe();
        } else {
            subscribe = null;
        }
        CountDownStickerStruct countDownStickerStruct5 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct5 != null) {
            textAlreadySubscribed = countDownStickerStruct5.getTextAlreadySubscribed();
        } else {
            textAlreadySubscribed = null;
        }
        CountDownStickerStruct countDownStickerStruct6 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct6 != null) {
            textAlreadyExpired = countDownStickerStruct6.getTextAlreadyExpired();
        } else {
            textAlreadyExpired = null;
        }
        CountDownStickerStruct countDownStickerStruct7 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct7 != null) {
            textTobeSubscribed = countDownStickerStruct7.getTextTobeSubscribed();
        }
        CountDownStickerStruct countDownStickerStruct8 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct8 != null) {
            eventId = countDownStickerStruct8.getEventId();
        }
        return new LiveEventCountDownStickerModel(baseStickerModelLIZ, title, j, System.currentTimeMillis(), subscribeNum, subscribe, textAlreadyExpired, textTobeSubscribed, textAlreadySubscribed, 1, true, false, true, eventId, false);
    }
}
