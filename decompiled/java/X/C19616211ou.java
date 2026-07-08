package X;

import com.ss.android.ugc.aweme.sticker.data.CountDownStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveeventstory.LiveEventStoryStickerModel;

/* JADX INFO: renamed from: X.11ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19616211ou extends AbstractC19589811ke<LiveEventStoryStickerModel> {
    @Override // X.AbstractC19589811ke
    public final InterfaceC19592111l1<?> LIZJ() {
        return new C19624911qJ(6, LJ().LIZLLL, LJ());
    }

    @Override // X.AbstractC19589811ke
    public final StickerModel LJII(InteractStickerStruct interactStickerStruct) {
        String title;
        long jLongValue;
        Long expiredTime;
        BaseStickerModel baseStickerModelLIZ = C1466240oG6.LIZ(interactStickerStruct, EnumC1466150oFx.LIVE_EVENT_STORY, 0, 0);
        CountDownStickerStruct countDownStickerStruct = interactStickerStruct.getCountDownStickerStruct();
        Boolean subscribe = null;
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
        CountDownStickerStruct countDownStickerStruct3 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct3 != null) {
            subscribe = countDownStickerStruct3.getSubscribe();
        }
        CountDownStickerStruct countDownStickerStruct4 = interactStickerStruct.getCountDownStickerStruct();
        if (countDownStickerStruct4 != null) {
            eventId = countDownStickerStruct4.getEventId();
        }
        return new LiveEventStoryStickerModel(baseStickerModelLIZ, title, jLongValue, subscribe, eventId, null);
    }
}
