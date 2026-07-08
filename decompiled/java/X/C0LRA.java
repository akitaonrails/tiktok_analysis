package X;

import com.ss.android.ugc.image.format.ImagePreprocessServiceImpl;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LRA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.image.format.ImagePreprocessServiceImpl$preprocess$result$1$1$1", f = "ImagePreprocessServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LRA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LR3>, Object> {
    public final /* synthetic */ ImagePreprocessServiceImpl LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0LRB LLILLL;
    public final /* synthetic */ File LLILZ;
    public final /* synthetic */ List<C0LRC> LLILZIL;
    public final /* synthetic */ C0LR5 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LRA(ImagePreprocessServiceImpl imagePreprocessServiceImpl, String str, C0LRB c0lrb, File file, List<? extends C0LRC> list, C0LR5 c0lr5, InterfaceC1364105Vn<? super C0LRA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = imagePreprocessServiceImpl;
        this.LLILLJJLI = str;
        this.LLILLL = c0lrb;
        this.LLILZ = file;
        this.LLILZIL = list;
        this.LLILZLL = c0lr5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LRA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImagePreprocessServiceImpl@a4a3.preprocess$result$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ImagePreprocessServiceImpl imagePreprocessServiceImpl = this.LL;
        String str = this.LLILLJJLI;
        C0LRB c0lrb = this.LLILLL;
        File file = this.LLILZ;
        List<C0LRC> list = this.LLILZIL;
        C0LR5 c0lr5 = this.LLILZLL;
        imagePreprocessServiceImpl.getClass();
        C0LR3 c0lr3LIZLLL = ImagePreprocessServiceImpl.LIZLLL(str, c0lrb, file, list, c0lr5);
        C1C7U.LIZIZ("ImagePreprocessServiceImpl@a4a3.preprocess$result$1$1$1");
        return c0lr3LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LR3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
