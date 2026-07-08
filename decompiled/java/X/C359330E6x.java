package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E6x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.track.fuctiontrack.sticker.StickerItemView$getDrawBitmapFromInfoStickerAsset$1$3", f = "StickerItemView.kt", l = {784, 785}, m = "invokeSuspend")
public final class C359330E6x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1452610nu7 LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C367470Eav LLILZ;
    public final /* synthetic */ double LLILZIL;
    public final /* synthetic */ double LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C359330E6x(String str, C367470Eav c367470Eav, double d, double d2, InterfaceC1364105Vn<? super C359330E6x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c367470Eav;
        this.LLILZIL = d;
        this.LLILZLL = d2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C359330E6x(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1452610nu7 c1452610nu7LIZ;
        Object objLJIILL = obj;
        C1C7U.LIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJIILL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1452610nu7LIZ = this.LL;
            C155000ia.LIZIZ(objLJIILL);
        } else {
            C155000ia.LIZIZ(objLJIILL);
            c1452610nu7LIZ = C20137413qm.LIZ.LIZ(this.LLILLL);
            C367470Eav c367470Eav = this.LLILZ;
            String str = this.LLILLL;
            int i2 = c1452610nu7LIZ.LIZ;
            int i3 = c1452610nu7LIZ.LIZIZ;
            this.LL = c1452610nu7LIZ;
            this.LLILLJJLI = 1;
            objLJIILL = c367470Eav.LJIILL(i2, i3, str, this);
            if (objLJIILL == objLJFF) {
                C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$3");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C359340E6y c359340E6y = new C359340E6y(this.LLILZ, (Bitmap) objLJIILL, this.LLILZIL, c1452610nu7LIZ, this.LLILZLL, null);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c359340E6y) == objLJFF) {
            C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StickerItemView@8b0e.getDrawBitmapFromInfoStickerAsset$1$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
