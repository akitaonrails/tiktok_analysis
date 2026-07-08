package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import x5h.d;

/* JADX INFO: renamed from: X.08nb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.photo.processor.OptimizeTakePhotoProcessor$onProcess$2$getOutputFileTask$1", f = "OptimizeTakePhotoProcessor.kt", l = {280}, m = "invokeSuspend")
public final class C2224508nb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ d LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2224508nb(d dVar, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C2224508nb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dVar;
        this.LLILLL = bitmap;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2224508nb(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getOutputFileTask$1");
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
            d dVar = this.LLILLJJLI;
            Bitmap bitmap = this.LLILLL;
            String str = this.LLILZ;
            this.LL = 1;
            dVar.getClass();
            obj = d.LJ(bitmap, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getOutputFileTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("OptimizeTakePhotoProcessor@e73a.onProcess$2$getOutputFileTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
