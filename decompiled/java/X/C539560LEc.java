package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildRecordReturnArguments$1$result$resizeImageTask$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
public final class C539560LEc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ReturnEcommerceCommentModel>, Object> {
    public final /* synthetic */ C539580LEe LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C539560LEc(C539580LEe c539580LEe, String str, String str2, InterfaceC1364105Vn<? super C539560LEc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c539580LEe;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C539560LEc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExteriorMediaProcess@c447.buildRecordReturnArguments$1$result$resizeImageTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ReturnEcommerceCommentModel returnEcommerceCommentModelLIZJ = this.LL.LIZJ(this.LLILLJJLI, null, this.LLILLL, -1, "shoot");
        C1C7U.LIZIZ("ExteriorMediaProcess@c447.buildRecordReturnArguments$1$result$resizeImageTask$1");
        return returnEcommerceCommentModelLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ReturnEcommerceCommentModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
