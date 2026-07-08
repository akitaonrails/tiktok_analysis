package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS111S0110000_25;
import kotlin.jvm.internal.AwS37S0010000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.biz.reveal.RevealBlurControlComponent$onClickShowHideBlur$2", f = "RevealBlurControlComponent.kt", l = {}, m = "invokeSuspend")
public final class C1662930tNL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1662910tNJ LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662930tNL(C1662910tNJ c1662910tNJ, boolean z, InterfaceC1364105Vn<? super C1662930tNL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1662910tNJ;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1662930tNL c1662930tNL = new C1662930tNL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1662930tNL.LL = obj;
        return c1662930tNL;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapF4;
        Bitmap currDisplayImage;
        C1C7U.LIZ("RevealBlurControlComponent@1326.onClickShowHideBlur$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        AbstractC1452680nuE abstractC1452680nuEGc = this.LLILLJJLI.JY0().gc();
        if (abstractC1452680nuEGc != null && (currDisplayImage = abstractC1452680nuEGc.LJJ().getCurrDisplayImage()) != null) {
            Bitmap bitmapF42 = this.LLILLJJLI.F4(currDisplayImage);
            if (bitmapF42 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RevealBlurControlComponent@1326.onClickShowHideBlur$2");
                return unit;
            }
            C2296808zG.LJFF(interfaceC497601wk);
            this.LLILLJJLI.i3(new AwS111S0110000_25(bitmapF42, this.LLILLL, 8));
        } else if (this.LLILLJJLI.T2().LIZIZ != null) {
            C2296808zG.LJFF(interfaceC497601wk);
            this.LLILLJJLI.i3(new AwS37S0010000_25(this.LLILLL, 13));
        } else {
            Bitmap bitmap = this.LLILLJJLI.H4().get();
            if (bitmap != null && (bitmapF4 = this.LLILLJJLI.F4(bitmap)) != null) {
                C2296808zG.LJFF(interfaceC497601wk);
                this.LLILLJJLI.i3(new AwS111S0110000_25(bitmapF4, this.LLILLL, 9));
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("RevealBlurControlComponent@1326.onClickShowHideBlur$2");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RevealBlurControlComponent@1326.onClickShowHideBlur$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
