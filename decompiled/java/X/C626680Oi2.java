package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Oi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626680Oi2 extends C09AY implements Function1<C626430Ohd, C626430Ohd> {
    public final /* synthetic */ TopicReviewVM LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626680Oi2(TopicReviewVM topicReviewVM, C259800zU<String> c259800zU, int i, String str) {
        super(1);
        this.LL = topicReviewVM;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = i;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C626430Ohd invoke(C626430Ohd c626430Ohd) {
        TopicReviewVM topicReviewVM = this.LL;
        return C626430Ohd.LIZ(c626430Ohd, 0.0f, 0L, 0L, false, true, new C291001Au(new TopicReview(topicReviewVM.LL, topicReviewVM.LLILLJJLI, this.LLILLJJLI.element, this.LLILLL, this.LLILZ, 0, false, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), true)), 15);
    }
}
