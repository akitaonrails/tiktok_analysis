package X;

import com.ss.android.ugc.aweme.comment.audio.model.CommentASRResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$tryFetchAudioASRIFNeed$1$3$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1343950l4r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ CommentASRResponse LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343950l4r(CommentPublishViewModel commentPublishViewModel, long j, CommentASRResponse commentASRResponse, InterfaceC1364105Vn<? super C1343950l4r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = commentASRResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343950l4r(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentPublishViewModel commentPublishViewModel = this.LL;
        long j = this.LLILLJJLI;
        CommentASRResponse commentASRResponse = this.LLILLL;
        commentPublishViewModel.PQ2(commentASRResponse.asrStatus, commentASRResponse.asrText, j, commentASRResponse.asrLang);
        CommentPublishViewModel commentPublishViewModel2 = this.LL;
        long j2 = this.LLILLJJLI;
        CommentASRResponse commentASRResponse2 = this.LLILLL;
        commentPublishViewModel2.JQ2(commentASRResponse2.asrStatus, j2, commentASRResponse2.asrLang);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
