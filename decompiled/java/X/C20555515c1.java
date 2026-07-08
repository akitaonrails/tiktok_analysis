package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20555515c1 extends C09AY implements Function0<List<? extends Float>> {
    public final /* synthetic */ FeedVideoAdaptionParamsOperator LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20555515c1(FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator) {
        super(0);
        this.LL = feedVideoAdaptionParamsOperator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends Float> invoke() {
        if (!this.LL.getEnableMultiContainer()) {
            return null;
        }
        if (C295540BiC.LIZIZ) {
            return C1866580yfo.LIZ().multi_containers_between_threshold_default;
        }
        List<C20479515Bp> effectiveStickerAreas = this.LL.getEffectiveStickerAreas();
        return (effectiveStickerAreas == null || effectiveStickerAreas.isEmpty()) ? C1866580yfo.LIZ().multi_containers_between_threshold_default : C1866580yfo.LIZ().multi_containers_between_threshold_text;
    }
}
