package X;

import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.story.model.ContentReuseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.repo.CommentLongPressRepository$generateShareToStoryAction$2$3", f = "CommentLongPressRepository.kt", l = {371}, m = "invokeSuspend")
public final class C2234508pD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Comment LLILLJJLI;
    public final /* synthetic */ InterfaceC2234608pE LLILLL;
    public final /* synthetic */ CommentLongPressFragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234508pD(Comment comment, InterfaceC2234608pE interfaceC2234608pE, CommentLongPressFragment commentLongPressFragment, InterfaceC1364105Vn<? super C2234508pD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = comment;
        this.LLILLL = interfaceC2234608pE;
        this.LLILZ = commentLongPressFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2234508pD(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Integer num;
        C1C7U.LIZ("CommentLongPressRepository@e69f.generateShareToStoryAction$2$3");
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
            C2234308pB c2234308pB = C2234308pB.LIZ;
            Comment comment = this.LLILLJJLI;
            this.LL = 1;
            c2234308pB.getClass();
            C2232208oq<ContentReuseResponse> c2232208oq = C2234308pB.LIZJ;
            obj = null;
            if (c2232208oq != null) {
                obj2 = c2232208oq.LIZ;
            } else {
                obj2 = null;
            }
            if (Intrinsics.LJFF(obj2, comment.getUser().getUid())) {
                C2232208oq<ContentReuseResponse> c2232208oq2 = C2234308pB.LIZJ;
                if (c2232208oq2 != null) {
                    obj = c2232208oq2.LIZ(this);
                }
            } else {
                C2234308pB.LIZ(comment);
                C2232208oq<ContentReuseResponse> c2232208oq3 = C2234308pB.LIZJ;
                if (c2232208oq3 != null) {
                    obj = c2232208oq3.LIZ(this);
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentLongPressRepository@e69f.generateShareToStoryAction$2$3");
                return objLJFF;
            }
        }
        ContentReuseResponse contentReuseResponse = (ContentReuseResponse) obj;
        if (contentReuseResponse != null && (num = contentReuseResponse.allowReuseOfContent) != null && num.intValue() == 1) {
            this.LLILLL.LIZIZ();
        } else {
            this.LLILLL.LIZIZ();
            this.LLILLL.LIZJ(new AwS582S0100000_3(this.LLILZ, 29));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentLongPressRepository@e69f.generateShareToStoryAction$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
