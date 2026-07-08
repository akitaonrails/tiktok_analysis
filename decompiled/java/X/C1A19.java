package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.earlyfeedback.EarlyFeedbackButtonTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A19, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A19 extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ EarlyFeedbackButtonTrigger LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A19(EarlyFeedbackButtonTrigger earlyFeedbackButtonTrigger) {
        super(1);
        this.LL = earlyFeedbackButtonTrigger;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        if (!this.LL.oh() || this.LL.LLJJLIIIJLLLLLLLZ.LL) {
            ((C11PQ) this.LL.LLJLLIL.getValue()).onNext(Boolean.TRUE);
        }
        return Unit.LIZ;
    }
}
