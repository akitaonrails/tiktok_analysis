package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.EffectTextModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09K2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverHelper$processCustomCoverInPicMode$1$1", f = "ChooseCoverHelper.kt", l = {}, m = "invokeSuspend")
public final class C09K2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ VideoPublishEditModel LLILLJJLI;
    public final /* synthetic */ C259800zU<Bitmap> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09K2(String str, VideoPublishEditModel videoPublishEditModel, C259800zU<Bitmap> c259800zU, InterfaceC1364105Vn<? super C09K2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = videoPublishEditModel;
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09K2(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EffectTextModel effectTextModel;
        C1C7U.LIZ("ChooseCoverHelper@ec4.processCustomCoverInPicMode$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmapLIZIZ = C1443400nfG.LIZIZ(this.LL);
        T tMergeCoverText = bitmapLIZIZ;
        if (this.LLILLJJLI.getCoverPublishModel() != null) {
            CoverPublishModel coverPublishModel = this.LLILLJJLI.getCoverPublishModel();
            tMergeCoverText = bitmapLIZIZ;
            if (coverPublishModel != null) {
                tMergeCoverText = bitmapLIZIZ;
                tMergeCoverText = bitmapLIZIZ;
                if (coverPublishModel.getEffectTextModel() != null && bitmapLIZIZ != null) {
                    CoverPublishModel coverPublishModel2 = this.LLILLJJLI.getCoverPublishModel();
                    if (coverPublishModel2 != null && (effectTextModel = coverPublishModel2.getEffectTextModel()) != null) {
                        tMergeCoverText = effectTextModel.mergeCoverText(bitmapLIZIZ);
                    } else {
                        tMergeCoverText = 0;
                    }
                }
            }
        }
        this.LLILLL.element = tMergeCoverText;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChooseCoverHelper@ec4.processCustomCoverInPicMode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
