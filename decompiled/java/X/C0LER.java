package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LER, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$result$compressResult$compressTask$1", f = "ExteriorMediaProcess.kt", l = {173}, m = "invokeSuspend")
public final class C0LER extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ C539580LEe LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ TikTokMediaModel LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LER(C539580LEe c539580LEe, TikTokMediaModel tikTokMediaModel, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c539580LEe;
        this.LLILLL = str;
        this.LLILZ = tikTokMediaModel;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LER(this.LLILLJJLI, this.LLILZ, this.LLILLL, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$result$compressResult$compressTask$1");
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
            C539580LEe c539580LEe = this.LLILLJJLI;
            String str = this.LLILLL;
            TikTokMediaModel tikTokMediaModel = this.LLILZ;
            String str2 = this.LLILZIL;
            this.LL = 1;
            obj = c539580LEe.LJFF(str, tikTokMediaModel, str2, "upload", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$result$compressResult$compressTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$result$compressResult$compressTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
