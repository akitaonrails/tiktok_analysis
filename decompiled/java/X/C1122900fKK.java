package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.commentdetector.HighIntentCommentDetectorViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fKK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1122900fKK extends C09AY implements Function1<AbstractC1122920fKM, Unit> {
    public final /* synthetic */ HighIntentCommentDetectorViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1122900fKK(HighIntentCommentDetectorViewModel highIntentCommentDetectorViewModel) {
        super(1);
        this.LL = highIntentCommentDetectorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1122920fKM abstractC1122920fKM) {
        this.LL.LLIZLLLIL = abstractC1122920fKM;
        return Unit.LIZ;
    }
}
