package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.util.AIPhotoCommentHelperKt$enterAIChatPage$1$result$1", f = "AIPhotoCommentHelper.kt", l = {119}, m = "invokeSuspend")
public final class C1354690lMB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C07YI>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1354700lMC LLILLJJLI;
    public final /* synthetic */ UrlModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354690lMB(InterfaceC1354700lMC interfaceC1354700lMC, UrlModel urlModel, String str, InterfaceC1364105Vn<? super C1354690lMB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1354700lMC;
        this.LLILLL = urlModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354690lMB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1$result$1");
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
            InterfaceC1354700lMC interfaceC1354700lMC = this.LLILLJJLI;
            UrlModel urlModel = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            obj = interfaceC1354700lMC.LIZJ(urlModel, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C07YI> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
