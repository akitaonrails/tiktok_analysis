package X;

import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.liveevent.LiveEventCountDownStickerModel;

/* JADX INFO: renamed from: X.0tD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656520tD0 extends AbstractC19622511pv<LiveEventCountDownStickerModel> {
    public final /* synthetic */ C1656510tCz LLILLJJLI;

    @Override // X.AbstractC19622511pv
    public final EnumC1466150oFx LJJIJLIJ() {
        return EnumC1466150oFx.LIVE_EVENT_COUNTDOWN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1656520tD0(C1656510tCz c1656510tCz, Class<LiveEventCountDownStickerModel> cls) {
        super(cls);
        this.LLILLJJLI = c1656510tCz;
    }

    @Override // X.AbstractC19622511pv
    public final void LJJJJJL(StickerModel stickerModel, String str) {
        this.LLILLJJLI.H2((LiveEventCountDownStickerModel) stickerModel);
    }
}
