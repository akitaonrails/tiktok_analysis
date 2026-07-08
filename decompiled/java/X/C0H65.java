package X;

import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H65, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ui.feed.photos.PhotosItemViewHolder$applyMainColorBackground$1", f = "PhotoSlidesComponentWrapper.kt", l = {1080}, m = "invokeSuspend")
public final class C0H65 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21694119vH LLILLJJLI;
    public final /* synthetic */ PhotoModeImageUrlModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H65(C21694119vH c21694119vH, PhotoModeImageUrlModel photoModeImageUrlModel, String str, View view, InterfaceC1364105Vn<? super C0H65> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21694119vH;
        this.LLILLL = photoModeImageUrlModel;
        this.LLILZ = str;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H65(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zIsAdTraffic;
        C1C7U.LIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1");
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
            C21694119vH c21694119vH = this.LLILLJJLI;
            PhotoModeImageUrlModel photoModeImageUrlModel = this.LLILLL;
            Aweme aweme = c21694119vH.LLILZLL;
            if (aweme != null) {
                zIsAdTraffic = AwemeExtKt.isAdTraffic(aweme);
            } else {
                zIsAdTraffic = false;
            }
            UrlModel urlModelLJIJI = c21694119vH.LJIJI(photoModeImageUrlModel, zIsAdTraffic, this.LLILLJJLI.LLILLL, this.LLILZ);
            if (urlModelLJIJI != null && urlModelLJIJI.getUrlList() != null) {
                C1DFB c1dfb = C0PEM.LIZJ;
                C0H64 c0h64 = new C0H64(this.LLILZIL, urlModelLJIJI, this.LLILLJJLI, this.LLILLL, null);
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c0h64);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1");
                return unit;
            }
        }
        Integer num = (Integer) obj;
        if (num != null) {
            this.LLILLL.setDarkMainColor(num);
            this.LLILZIL.setBackgroundColor(num.intValue());
        } else {
            this.LLILLL.setDarkMainColor(C2286608xc.LJ(-16777216));
            this.LLILZIL.setBackgroundColor(-16777216);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotosItemViewHolder@c326.applyMainColorBackground$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
