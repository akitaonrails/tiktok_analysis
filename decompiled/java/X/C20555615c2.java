package X;

import com.ss.android.ugc.feed.platform.cell.component.adaption.FeedVideoAdaptionParamsOperator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20555615c2 extends C09AY implements Function0<List<? extends C20479515Bp>> {
    public final /* synthetic */ FeedVideoAdaptionParamsOperator LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20555615c2(FeedVideoAdaptionParamsOperator feedVideoAdaptionParamsOperator) {
        super(0);
        this.LL = feedVideoAdaptionParamsOperator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends C20479515Bp> invoke() {
        if (this.LL.getEnableSmartCrop() || this.LL.getEnableMultiContainer()) {
            return this.LL.calStickerLocs(C20562515d9.LIZ().enable_cal_sticker_in_main);
        }
        return null;
    }
}
