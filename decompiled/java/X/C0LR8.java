package X;

import com.ss.android.ugc.image.format.ImagePreprocessServiceImpl;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LR8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.image.format.ImagePreprocessServiceImpl$preprocess$result$1", f = "ImagePreprocessServiceImpl.kt", l = {125}, m = "invokeSuspend")
public final class C0LR8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LR3>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ ImagePreprocessServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C0LRB LLILZIL;
    public final /* synthetic */ File LLILZLL;
    public final /* synthetic */ List<C0LRC> LLIZ;
    public final /* synthetic */ C0LR5 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LR8(Long l, ImagePreprocessServiceImpl imagePreprocessServiceImpl, String str, C0LRB c0lrb, File file, List<? extends C0LRC> list, C0LR5 c0lr5, InterfaceC1364105Vn<? super C0LR8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = imagePreprocessServiceImpl;
        this.LLILZ = str;
        this.LLILZIL = c0lrb;
        this.LLILZLL = file;
        this.LLIZ = list;
        this.LLIZLLLIL = c0lr5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LR8(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImagePreprocessServiceImpl@a4a3.preprocess$result$1");
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
            long jLongValue = this.LLILLJJLI.longValue();
            C0LR9 c0lr9 = new C0LR9(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null);
            this.LL = 1;
            obj = C099A.LIZJ(jLongValue, c0lr9, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImagePreprocessServiceImpl@a4a3.preprocess$result$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImagePreprocessServiceImpl@a4a3.preprocess$result$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LR3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
