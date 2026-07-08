package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.basicinfo.header.topvideos.assem.PoiHeaderTopVideosAssem$loadBg$1$2$onCompleted$1", f = "PoiHeaderTopVideosAssem.kt", l = {743, 754}, m = "invokeSuspend")
public final class C433210Gyl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ PoiHeaderTopVideosAssem LLILZIL;
    public final /* synthetic */ Drawable LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433210Gyl(Bitmap bitmap, boolean z, PoiHeaderTopVideosAssem poiHeaderTopVideosAssem, Drawable drawable, Context context, InterfaceC1364105Vn<? super C433210Gyl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = bitmap;
        this.LLILZ = z;
        this.LLILZIL = poiHeaderTopVideosAssem;
        this.LLILZLL = drawable;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C433210Gyl c433210Gyl = new C433210Gyl(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c433210Gyl.LLILLJJLI = obj;
        return c433210Gyl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LLILLL;
        if (bitmap == null) {
            PoiHeaderTopVideosAssem poiHeaderTopVideosAssem = this.LLILZIL;
            Drawable drawable = this.LLILZLL;
            SmartImageView smartImageView = poiHeaderTopVideosAssem.LLJJJIL;
            if (smartImageView != null) {
                smartImageView.setImageDrawable(drawable);
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
            return unit3;
        }
        if (this.LLILZ) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C433200Gyk c433200Gyk = new C433200Gyk(this.LLILZIL, bitmap, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c433200Gyk) == objLJFF) {
                C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
            return unit22;
        }
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(this.LLILLL, null));
        c204674156yLIZ.LJFF(30.0f);
        c204674156yLIZ.LJ(0.03f, 0.4f, 0.0f, 0.3f, 0.0f);
        c204674156yLIZ.LJI(0.0f);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C433190Gyj c433190Gyj = new C433190Gyj(numLIZIZ, this.LLILZIL, this.LLILLL, this.LLIZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq2, c433190Gyj) == objLJFF) {
            C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("PoiHeaderTopVideosAssem@28c.loadBg$1$2$onCompleted$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
