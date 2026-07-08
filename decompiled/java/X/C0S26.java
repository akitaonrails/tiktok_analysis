package X;

import com.ss.android.ugc.aweme.comment.exposedcmt.FypExposedCommentVM;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S26, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.exposedcmt.FypExposedCommentVM$onBind$3$1$resp$1", f = "FypExposedCommentVM.kt", l = {97}, m = "invokeSuspend")
public final class C0S26 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList>, Object> {
    public int LL;
    public final /* synthetic */ FypExposedCommentVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S26(FypExposedCommentVM fypExposedCommentVM, String str, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C0S26> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fypExposedCommentVM;
        this.LLILLL = str;
        this.LLILZ = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S26(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLLJLIL = obj;
        C1C7U.LIZ("FypExposedCommentVM@7d93.onBind$3$1$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLLJLIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLLJLIL);
            C0S28 c0s28 = (C0S28) this.LLILLJJLI.LL.getValue().getOperator();
            String str = this.LLILLL;
            Aweme aweme = this.LLILZ.getAweme();
            String str2 = this.LLILZ.mEventType;
            ArrayList arrayList = new ArrayList();
            Long lLJFF = C2286608xc.LJFF(C1344240l5K.LIZIZ(this.LLILZ.getAweme()));
            Integer numLJ = C2286608xc.LJ(32);
            this.LL = 1;
            objLLJLIL = c0s28.LLJLIL(str, 0L, 20, "", 0, 0, aweme, str2, arrayList, null, lLJFF, numLJ, null, false, null, false, null, null, this);
            if (objLLJLIL == objLJFF) {
                C1C7U.LIZIZ("FypExposedCommentVM@7d93.onBind$3$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FypExposedCommentVM@7d93.onBind$3$1$resp$1");
        return objLLJLIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
