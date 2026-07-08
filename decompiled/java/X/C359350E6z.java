package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E6z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmapFromInfoStickerAsset$1$2$1", f = "StickerItemView.kt", l = {}, m = "invokeSuspend")
public final class C359350E6z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C367470Eav LL;
    public final /* synthetic */ Bitmap LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C359350E6z(C367470Eav c367470Eav, Bitmap bitmap, InterfaceC1364105Vn<? super C359350E6z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c367470Eav;
        this.LLILLJJLI = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C359350E6z(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C367470Eav c367470Eav = this.LL;
        Bitmap bitmap = this.LLILLJJLI;
        c367470Eav.LLJLLL = bitmap;
        if (bitmap != null) {
            c367470Eav.requestLayout();
            this.LL.invalidate();
        } else {
            c367470Eav.LJIIZILJ();
        }
        this.LL.LLJZIJLIL = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
