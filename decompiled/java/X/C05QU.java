package X;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05QU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator$downloadImageFile$2$2$onCompleted$1$1", f = "Text2ImageGenerator.kt", l = {}, m = "invokeSuspend")
public final class C05QU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Function1<String, Unit> LLILLJJLI;
    public final /* synthetic */ File LLILLL;
    public final /* synthetic */ C572810MdL LLILZ;
    public final /* synthetic */ Bitmap LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05QU(boolean z, Function1<? super String, Unit> function1, File file, C572810MdL c572810MdL, Bitmap bitmap, InterfaceC1364105Vn<? super C05QU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = function1;
        this.LLILLL = file;
        this.LLILZ = c572810MdL;
        this.LLILZIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05QU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageGenerator@4a7d.downloadImageFile$2$2$onCompleted$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String absolutePath = null;
        if (this.LL) {
            Function1<String, Unit> function1 = this.LLILLJJLI;
            File file = this.LLILLL;
            if (file != null) {
                absolutePath = file.getAbsolutePath();
            }
            function1.invoke(absolutePath);
        } else {
            this.LLILZ.onFailed(null);
        }
        C786410Ut5.LJJJJ(this.LLILZIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageGenerator@4a7d.downloadImageFile$2$2$onCompleted$1$1");
        return unit;
    }
}
