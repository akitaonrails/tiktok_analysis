package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274441E0s extends C09AY implements Function1<FTCEditStickerState, FTCEditStickerState> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274441E0s(float f, float f2, float f3) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = f2;
        this.LLILLL = f3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
        FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
        return fTCEditStickerState2.copy(fTCEditStickerState2.ui, fTCEditStickerState2.pollTextAnimEvent, new C122H<>(new C443120HZe(Float.valueOf(this.LL), Float.valueOf(this.LLILLJJLI), Float.valueOf(this.LLILLL))), fTCEditStickerState2.viewRenderStickerVisibleEvent, fTCEditStickerState2.videoLengthUpdateEvent, fTCEditStickerState2.refreshVideoSource, fTCEditStickerState2.updateStickerTime);
    }
}
