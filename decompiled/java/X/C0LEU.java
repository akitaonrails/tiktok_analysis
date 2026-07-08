package X;

import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LEU, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$result$resizeImageTask$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
public final class C0LEU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ReturnEcommerceCommentModel>, Object> {
    public final /* synthetic */ C539580LEe LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ TikTokMediaModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LEU(C539580LEe c539580LEe, TikTokMediaModel tikTokMediaModel, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c539580LEe;
        this.LLILLJJLI = str;
        this.LLILLL = tikTokMediaModel;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LEU(this.LL, this.LLILLL, this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$result$resizeImageTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C539580LEe c539580LEe = this.LL;
        String str = this.LLILLJJLI;
        TikTokMediaModel tikTokMediaModel = this.LLILLL;
        ReturnEcommerceCommentModel returnEcommerceCommentModelLIZJ = c539580LEe.LIZJ(str, tikTokMediaModel, this.LLILZ, tikTokMediaModel.selectIndex, "upload");
        C1C7U.LIZIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$result$resizeImageTask$1");
        return returnEcommerceCommentModelLIZJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ReturnEcommerceCommentModel> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
