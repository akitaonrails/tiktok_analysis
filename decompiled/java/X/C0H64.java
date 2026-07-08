package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H64, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.PhotosItemViewHolder$applyMainColorBackground$1$darkPrimaryMainColor$1", f = "PhotoSlidesComponentWrapper.kt", l = {1081, 1087}, m = "invokeSuspend")
public final class C0H64 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ UrlModel LLILLL;
    public final /* synthetic */ C21694119vH LLILZ;
    public final /* synthetic */ PhotoModeImageUrlModel LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H64(View view, UrlModel urlModel, C21694119vH c21694119vH, PhotoModeImageUrlModel photoModeImageUrlModel, InterfaceC1364105Vn<? super C0H64> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = urlModel;
        this.LLILZ = c21694119vH;
        this.LLILZIL = photoModeImageUrlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H64(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1$darkPrimaryMainColor$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZ);
                    C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1$darkPrimaryMainColor$1");
                    return objLIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            Context context = this.LLILLJJLI.getContext();
            UrlModel urlModel = this.LLILLL;
            C21694119vH c21694119vH = this.LLILZ;
            EnumC1338240kve enumC1338240kveLJIJJ = c21694119vH.LJIJJ(urlModel, this.LLILZIL.aspectFillThreshold, c21694119vH.LJIJ());
            this.LL = 1;
            if (context == null) {
                objLIZ = null;
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel.getUrlList()));
                c1331670kl3LJIIJ.LJIL = Bitmap.Config.RGB_565;
                c1331670kl3LJIIJ.LJJ = enumC1338240kveLJIJJ;
                c1331670kl3LJIIJ.LJJIJL(context);
                c1331670kl3LJIIJ.LJJII(new C511301yx(c23260099m, 2));
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1$darkPrimaryMainColor$1");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) objLIZ;
        if (bitmap == null) {
            C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1$darkPrimaryMainColor$1");
            return null;
        }
        this.LL = 2;
        C23260099m c23260099m2 = new C23260099m(C099M.LIZLLL(this));
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
        c204674156yLIZ.LJFF(0.0f);
        c204674156yLIZ.LJ(0.0f, 0.4f, 0.0f, 1.0f, 0.0f);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ == null) {
            C189200o6.m2constructorimpl(null);
            c23260099m2.resumeWith(null);
        } else {
            Integer numLJ = C2286608xc.LJ(C2441009hQ.LJI(C1ER1.LIZIZ.LLILII(), numLIZIZ.intValue(), -16777216));
            C189200o6.m2constructorimpl(numLJ);
            c23260099m2.resumeWith(numLJ);
        }
        objLIZ = c23260099m2.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(this);
        }
        if (objLIZ == objLJFF) {
            C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1$darkPrimaryMainColor$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1$darkPrimaryMainColor$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
