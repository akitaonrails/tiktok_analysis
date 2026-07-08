package X;

import com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1E0u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2274461E0u extends C09AY implements Function1<FTCEditStickerState, FTCEditStickerState> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2274461E0u(int i, boolean z) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final FTCEditStickerState invoke(FTCEditStickerState fTCEditStickerState) {
        FTCEditStickerState fTCEditStickerState2 = fTCEditStickerState;
        return fTCEditStickerState2.copy(fTCEditStickerState2.ui, fTCEditStickerState2.pollTextAnimEvent, fTCEditStickerState2.pollTextLayoutEvent, fTCEditStickerState2.viewRenderStickerVisibleEvent, fTCEditStickerState2.videoLengthUpdateEvent, fTCEditStickerState2.refreshVideoSource, new C1644450stX<>(new Pair(Integer.valueOf(this.LL), Boolean.valueOf(this.LLILLJJLI))));
    }
}
