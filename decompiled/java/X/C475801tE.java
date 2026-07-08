package X;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.ImageNLECompileUtils$captureVideoFrameAndFuzzySave$1$1$1", f = "ImageNLECompileUtils.kt", l = {}, m = "invokeSuspend")
public final class C475801tE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ File LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475801tE(Bitmap bitmap, File file, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = file;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475801tE(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ImageNLECompileUtils@ac6e.captureVideoFrameAndFuzzySave$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.exists()) {
            this.LL.delete();
        }
        C2477909nN.LJFF(this.LLILLJJLI, this.LL.getPath(), Bitmap.CompressFormat.JPEG, 100);
        C786410Ut5.LJJJJ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageNLECompileUtils@ac6e.captureVideoFrameAndFuzzySave$1$1$1");
        return unit;
    }
}
