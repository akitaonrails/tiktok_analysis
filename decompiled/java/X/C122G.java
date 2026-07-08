package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.122G, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C122G extends C09AY implements Function1<FTCEditInfoStickerState, FTCEditInfoStickerState> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C122G(float f, float f2, float f3) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FTCEditInfoStickerState invoke(FTCEditInfoStickerState fTCEditInfoStickerState) {
        FTCEditInfoStickerState fTCEditInfoStickerState2 = fTCEditInfoStickerState;
        return fTCEditInfoStickerState2.copy(fTCEditInfoStickerState2.ui, fTCEditInfoStickerState2.hideHelpBoxEvent, fTCEditInfoStickerState2.resetVideoLengthEvent, fTCEditInfoStickerState2.clickStickerItemEvent, fTCEditInfoStickerState2.editViewAnimEvent, new C122H<>(new C443120HZe(Float.valueOf(this.LL), Float.valueOf(this.LLILLJJLI), Float.valueOf(this.LLILLL))), fTCEditInfoStickerState2.refreshVideoSource);
    }
}
