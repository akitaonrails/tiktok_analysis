package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentV2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.159T, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C159T extends C09AY implements Function0<VideoAdaptionResult> {
    public final /* synthetic */ CellAdaptionComponentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C159T(CellAdaptionComponentV2 cellAdaptionComponentV2) {
        super(0);
        this.LL = cellAdaptionComponentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final VideoAdaptionResult invoke() {
        return this.LL.wB2();
    }
}
