package X;

import com.ss.android.ugc.aweme.comment.audio.model.CommentASRResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$tryFetchAudioASRIFNeed$1$1$1", f = "CommentPublishViewModel.kt", l = {987}, m = "invokeSuspend")
public final class C1343900l4m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentASRResponse>, Object> {
    public int LL;
    public final /* synthetic */ CommentPublishViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343900l4m(CommentPublishViewModel commentPublishViewModel, long j, InterfaceC1364105Vn<? super C1343900l4m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentPublishViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343900l4m(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$1$1");
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
            InterfaceC1343910l4n interfaceC1343910l4n = (InterfaceC1343910l4n) this.LLILLJJLI.LLIZ.getValue().getOperator();
            long j = this.LLILLL;
            this.LL = 1;
            obj = interfaceC1343910l4n.LJIIL(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentASRResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
