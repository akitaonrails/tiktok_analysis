package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Oi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM$delete$1", f = "TopicReviewVM.kt", l = {199}, m = "invokeSuspend")
public final class C626690Oi3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TopicReviewVM LLILLJJLI;
    public final /* synthetic */ TopicReview LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626690Oi3(TopicReviewVM topicReviewVM, TopicReview topicReview, InterfaceC1364105Vn<? super C626690Oi3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = topicReviewVM;
        this.LLILLL = topicReview;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C626690Oi3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TopicReviewVM@21b6.delete$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TopicReviewVM topicReviewVM = this.LLILLJJLI;
            C626720Oi6 c626720Oi6 = topicReviewVM.LLILZ.LLILLJJLI;
            String str = topicReviewVM.LL;
            int i2 = topicReviewVM.LLILLJJLI;
            String str2 = this.LLILLL.reviewId;
            this.LL = 1;
            obj = c626720Oi6.LL.LL.deleteReview(str, i2, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TopicReviewVM@21b6.delete$1");
                return objLJFF;
            }
        }
        if (((BaseResponse) obj).status_code == 0) {
            this.LLILLJJLI.setState(new AwS588S0100000_9(this.LLILLL, 26));
            C626710Oi5 c626710Oi5 = C626710Oi5.LIZ;
            Object obj2 = ((LinkedHashMap) this.LLILLJJLI.LLILLL).get("previous_page");
            String strLIZ = C626730Oi7.LIZ(this.LLILLJJLI.LLILLJJLI);
            TopicReviewVM topicReviewVM2 = this.LLILLJJLI;
            String str3 = topicReviewVM2.LL;
            Object obj3 = ((LinkedHashMap) topicReviewVM2.LLILLL).get("topic_title");
            String uid = this.LLILLL.user.getUid();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c626710Oi5.getClass();
            C20684815ws.LJIILLIIL("delete_topic_review", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "topic_detail"), new Pair("previous_page", obj2), new Pair("category", strLIZ), new Pair("topic_id", str3), new Pair("topic_title", obj3), new Pair("to_user_id", uid)), linkedHashMap));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicReviewVM@21b6.delete$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
