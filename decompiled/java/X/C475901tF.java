package X;

import android.graphics.Bitmap;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.utils.ImageNLECompileUtils$captureVideoFrameAndFuzzySave$1$1", f = "ImageNLECompileUtils.kt", l = {784}, m = "invokeSuspend")
public final class C475901tF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ ByteBuffer LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ File LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475901tF(int i, int i2, ByteBuffer byteBuffer, Function0<Unit> function0, File file, InterfaceC1364105Vn<? super C475901tF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = byteBuffer;
        this.LLILZIL = function0;
        this.LLILZLL = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475901tF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageNLECompileUtils@ac6e.captureVideoFrameAndFuzzySave$1$1");
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
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.LLILLJJLI, this.LLILLL, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(this.LLILZ.position(0));
            C1DFB c1dfb = C0PEM.LIZJ;
            C475801tE c475801tE = new C475801tE(bitmapCreateBitmap, this.LLILZLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c1dfb, c475801tE) == objLJFF) {
                C1C7U.LIZIZ("ImageNLECompileUtils@ac6e.captureVideoFrameAndFuzzySave$1$1");
                return objLJFF;
            }
        }
        this.LLILZIL.invoke();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageNLECompileUtils@ac6e.captureVideoFrameAndFuzzySave$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
