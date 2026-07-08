package X;

import com.ss.android.ugc.aweme.comment.audio.model.CommentASRResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$tryFetchAudioASRIFNeed$1$4", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1343960l4s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C259800zU<CommentASRResponse> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343960l4s(CommentPublishViewModel commentPublishViewModel, long j, C259800zU<CommentASRResponse> c259800zU, InterfaceC1364105Vn<? super C1343960l4s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343960l4s(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num = null;
        this.LL.PQ2(C2286608xc.LJ(EnumC992030bvF.FAILED.getCode()), null, this.LLILLJJLI, null);
        CommentPublishViewModel commentPublishViewModel = this.LL;
        long j = this.LLILLJJLI;
        CommentASRResponse commentASRResponse = this.LLILLL.element;
        CommentASRResponse commentASRResponse2 = commentASRResponse;
        String str = null;
        if (commentASRResponse2 != null) {
            num = commentASRResponse2.asrStatus;
        }
        CommentASRResponse commentASRResponse3 = commentASRResponse;
        if (commentASRResponse3 != null) {
            str = commentASRResponse3.asrLang;
        }
        commentPublishViewModel.JQ2(num, j, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.tryFetchAudioASRIFNeed$1$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
