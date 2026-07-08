package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.ugc.android.editor.base.view.CropImageView$setCroppedBitmap$1$1", f = "CropImageView.kt", l = {}, m = "invokeSuspend")
public final class C432330GxL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C428430Gr3 LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C432330GxL(C428430Gr3 c428430Gr3, Bitmap bitmap, InterfaceC1364105Vn<? super C432330GxL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c428430Gr3;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C432330GxL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CropImageView@f351.setCroppedBitmap$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setImageBitmap(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CropImageView@f351.setCroppedBitmap$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
