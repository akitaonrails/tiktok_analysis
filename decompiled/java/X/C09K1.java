package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09K1, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.image.ImageHeaderModule$updateCoverWithCoverText$3$1", f = "ImageHeaderModule.kt", l = {}, m = "invokeSuspend")
public final class C09K1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C259800zU<Bitmap> LLILLJJLI;
    public final /* synthetic */ C214848196g LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09K1(C214848196g c214848196g, String str, InterfaceC1364105Vn interfaceC1364105Vn, C259800zU c259800zU) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = c214848196g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09K1(this.LLILLL, this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageHeaderModule@1844.updateCoverWithCoverText$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZIZ = C1443400nfG.LIZIZ(this.LL);
        if (bitmapLIZIZ != null) {
            C259800zU<Bitmap> c259800zU = this.LLILLJJLI;
            CoverPublishModel coverPublishModel = this.LLILLL.LIZ.getCoverPublishModel();
            T t = bitmapLIZIZ;
            if (coverPublishModel != null) {
                EffectTextModel effectTextModel = coverPublishModel.getEffectTextModel();
                t = bitmapLIZIZ;
                if (effectTextModel != null) {
                    Bitmap bitmapMergeCoverText = effectTextModel.mergeCoverText(bitmapLIZIZ);
                    t = bitmapLIZIZ;
                    if (bitmapMergeCoverText != null) {
                        t = bitmapMergeCoverText;
                    }
                }
            }
            c259800zU.element = t;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageHeaderModule@1844.updateCoverWithCoverText$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
