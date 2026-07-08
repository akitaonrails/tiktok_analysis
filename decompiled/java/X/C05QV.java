package X;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$downloadImageFile$2$2$onCompleted$1", f = "Text2ImageGenerator.kt", l = {825}, m = "invokeSuspend")
public final class C05QV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ C572810MdL LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05QV(Bitmap bitmap, File file, Function1<? super String, Unit> function1, C572810MdL c572810MdL, InterfaceC1364105Vn<? super C05QV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = file;
        this.LLILZ = function1;
        this.LLILZIL = c572810MdL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("Text2ImageGenerator@4a7d.downloadImageFile$2$2$onCompleted$1");
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
            C2112908Pn c2112908Pn = C2112908Pn.LIZ;
            boolean zLIZJ = C2112908Pn.LIZJ(this.LLILLJJLI, this.LLILLL, Bitmap.CompressFormat.JPEG);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C05QU c05qu = new C05QU(zLIZJ, this.LLILZ, this.LLILLL, this.LLILZIL, this.LLILLJJLI, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c05qu) == objLJFF) {
                C1C7U.LIZIZ("Text2ImageGenerator@4a7d.downloadImageFile$2$2$onCompleted$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.downloadImageFile$2$2$onCompleted$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
