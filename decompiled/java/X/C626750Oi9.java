package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Oi9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM$toggleDigg$1", f = "TopicReviewListVM.kt", l = {137, 139}, m = "invokeSuspend")
public final class C626750Oi9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C626770OiB LLILLJJLI;
    public final /* synthetic */ TopicReviewListVM LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626750Oi9(C626770OiB c626770OiB, TopicReviewListVM topicReviewListVM, int i, InterfaceC1364105Vn<? super C626750Oi9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c626770OiB;
        this.LLILLL = topicReviewListVM;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C626750Oi9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse;
        Object objDiggReview = obj;
        C1C7U.LIZ("TopicReviewListVM@98b3.toggleDigg$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(objDiggReview);
                    baseResponse = (BaseResponse) objDiggReview;
                } else {
                    C155000ia.LIZIZ(objDiggReview);
                    baseResponse = (BaseResponse) objDiggReview;
                }
            } else {
                C155000ia.LIZIZ(objDiggReview);
                TopicReview topicReview = this.LLILLJJLI.LL;
                if (topicReview.userDigged) {
                    TopicReviewListVM topicReviewListVM = this.LLILLL;
                    C626720Oi6 c626720Oi6 = topicReviewListVM.LLILZIL.LLILLJJLI;
                    String str = topicReviewListVM.LL;
                    int i2 = topicReviewListVM.LLILLJJLI;
                    String str2 = topicReview.reviewId;
                    this.LL = 1;
                    objDiggReview = c626720Oi6.LL.LL.undiggReview(str, i2, str2, this);
                    if (objDiggReview == objLJFF) {
                        C1C7U.LIZIZ("TopicReviewListVM@98b3.toggleDigg$1");
                        return objLJFF;
                    }
                    baseResponse = (BaseResponse) objDiggReview;
                } else {
                    TopicReviewListVM topicReviewListVM2 = this.LLILLL;
                    C626720Oi6 c626720Oi62 = topicReviewListVM2.LLILZIL.LLILLJJLI;
                    String str3 = topicReviewListVM2.LL;
                    int i3 = topicReviewListVM2.LLILLJJLI;
                    String str4 = topicReview.reviewId;
                    this.LL = 2;
                    objDiggReview = c626720Oi62.LL.LL.diggReview(str3, i3, str4, this);
                    if (objDiggReview == objLJFF) {
                        C1C7U.LIZIZ("TopicReviewListVM@98b3.toggleDigg$1");
                        return objLJFF;
                    }
                    baseResponse = (BaseResponse) objDiggReview;
                }
            }
            if (baseResponse.status_code != 0) {
                throw new Exception("toggle digg failed");
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.listSetItemAt(this.LLILZ, this.LLILLJJLI);
        }
        if (this.LLILLJJLI.LL.userDigged) {
            C626710Oi5 c626710Oi5 = C626710Oi5.LIZ;
            Object obj2 = ((LinkedHashMap) this.LLILLL.LLILLL).get("previous_page");
            String strLIZ = C626730Oi7.LIZ(this.LLILLL.LLILLJJLI);
            TopicReviewListVM topicReviewListVM3 = this.LLILLL;
            String str5 = topicReviewListVM3.LL;
            Object obj3 = ((LinkedHashMap) topicReviewListVM3.LLILLL).get("topic_title");
            String uid = this.LLILLJJLI.LL.user.getUid();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c626710Oi5.getClass();
            C20684815ws.LJIILLIIL("cancel_like_topic_review", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "topic_detail"), new Pair("previous_page", obj2), new Pair("category", strLIZ), new Pair("topic_id", str5), new Pair("topic_title", obj3), new Pair("to_user_id", uid)), linkedHashMap));
        } else {
            C626710Oi5 c626710Oi52 = C626710Oi5.LIZ;
            Object obj4 = ((LinkedHashMap) this.LLILLL.LLILLL).get("previous_page");
            String strLIZ2 = C626730Oi7.LIZ(this.LLILLL.LLILLJJLI);
            TopicReviewListVM topicReviewListVM4 = this.LLILLL;
            String str6 = topicReviewListVM4.LL;
            Object obj5 = ((LinkedHashMap) topicReviewListVM4.LLILLL).get("topic_title");
            String uid2 = this.LLILLJJLI.LL.user.getUid();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            c626710Oi52.getClass();
            C20684815ws.LJIILLIIL("like_topic_review", C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "topic_detail"), new Pair("previous_page", obj4), new Pair("category", strLIZ2), new Pair("topic_id", str6), new Pair("topic_title", obj5), new Pair("to_user_id", uid2)), linkedHashMap2));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicReviewListVM@98b3.toggleDigg$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
