package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.model.UrlStruct;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09MC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.keyframe.util.SearchThumbImageLoadUtil$loadImagesFromThumb$3$1$1$1", f = "SearchThumbImageLoadUtil.kt", l = {121}, m = "invokeSuspend")
public final class C09MC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchKeyFramePoint LLILLJJLI;
    public final /* synthetic */ C05XL<Bitmap> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09MC(SearchKeyFramePoint searchKeyFramePoint, C05XL<Bitmap> c05xl, InterfaceC1364105Vn<? super C09MC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchKeyFramePoint;
        this.LLILLL = c05xl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09MC(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String firstUrl;
        C1C7U.LIZ("SearchThumbImageLoadUtil@484c.loadImagesFromThumb$3$1$1$1");
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
            UrlStruct urlStruct = this.LLILLJJLI.LIZ;
            if (urlStruct != null && (firstUrl = urlStruct.getFirstUrl()) != null) {
                this.LL = 1;
                obj = C09MB.LIZ(firstUrl, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImagesFromThumb$3$1$1$1");
                    return objLJFF;
                }
            } else {
                this.LLILLL.LJIIZILJ(null);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImagesFromThumb$3$1$1$1");
                return unit;
            }
        }
        this.LLILLL.LJIIZILJ((Bitmap) obj);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchThumbImageLoadUtil@484c.loadImagesFromThumb$3$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
