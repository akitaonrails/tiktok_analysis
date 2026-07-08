package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$publish$1$6", f = "TopicReviewVM.kt", l = {}, m = "invokeSuspend")
public final class C626660Oi0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ DialogC1389620mGW LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ TopicReviewVM LLILLL;
    public final /* synthetic */ TopicReview LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626660Oi0(DialogC1389620mGW dialogC1389620mGW, Fragment fragment, TopicReviewVM topicReviewVM, TopicReview topicReview, int i, InterfaceC1364105Vn<? super C626660Oi0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = dialogC1389620mGW;
        this.LLILLJJLI = fragment;
        this.LLILLL = topicReviewVM;
        this.LLILZ = topicReview;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C626660Oi0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numLJ;
        C1C7U.LIZ("TopicReviewVM@21b6.publish$1$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJIIJ(this.LL);
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this.LLILLJJLI, C343970De7.LIZ);
        TopicReviewVM topicReviewVM = this.LLILLL;
        TopicReview topicReview = this.LLILZ;
        if (topicReview != null && topicReview.topicRating == this.LLILZIL) {
            numLJ = null;
        } else {
            numLJ = C2286608xc.LJ(this.LLILZIL);
        }
        topicReviewVM.vQ2(numLJ, "success");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicReviewVM@21b6.publish$1$6");
        return unit;
    }
}
