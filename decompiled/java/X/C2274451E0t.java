package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274451E0t extends C09AY implements Function1<FTCEditStickerState, FTCEditStickerState> {
    public final /* synthetic */ float LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274451E0t(float f, long j) {
        super(1);
        this.LL = f;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
        FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
        return fTCEditStickerState2.copy(fTCEditStickerState2.ui, new C1644450stX<>(new Pair(Float.valueOf(this.LL), Long.valueOf(this.LLILLJJLI))), fTCEditStickerState2.pollTextLayoutEvent, fTCEditStickerState2.viewRenderStickerVisibleEvent, fTCEditStickerState2.videoLengthUpdateEvent, fTCEditStickerState2.refreshVideoSource, fTCEditStickerState2.updateStickerTime);
    }
}
