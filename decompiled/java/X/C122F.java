package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.122F, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C122F extends C09AY implements Function1<FTCEditInfoStickerState, FTCEditInfoStickerState> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122F(float f, long j) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
        FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
        return fTCEditInfoStickerState2.copy(fTCEditInfoStickerState2.ui, fTCEditInfoStickerState2.hideHelpBoxEvent, fTCEditInfoStickerState2.resetVideoLengthEvent, fTCEditInfoStickerState2.clickStickerItemEvent, new C1644450stX<>(new Pair(Float.valueOf(this.LL), Long.valueOf(this.LLILLJJLI))), fTCEditInfoStickerState2.editViewLayoutEvent, fTCEditInfoStickerState2.refreshVideoSource);
    }
}
