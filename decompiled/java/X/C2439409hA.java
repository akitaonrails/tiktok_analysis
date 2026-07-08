package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09hA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell$onBindItemView$3$1$1$onCompleted$2$1", f = "PoiDetailGuidesCell.kt", l = {}, m = "invokeSuspend")
public final class C2439409hA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PoiDetailGuidesCell LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439409hA(PoiDetailGuidesCell poiDetailGuidesCell, Bitmap bitmap, int i, InterfaceC1364105Vn<? super C2439409hA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = poiDetailGuidesCell;
        this.LLILLJJLI = bitmap;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2439409hA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1$1$onCompleted$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20627315nb c20627315nb = this.LL.LLILZLL;
        if (c20627315nb != null) {
            c20627315nb.setLoading(false);
        }
        ImageView imageView = this.LL.LLILLL;
        if (imageView != null) {
            imageView.setImageBitmap(this.LLILLJJLI);
        }
        this.LL.P5(C2286608xc.LJ(this.LLILLL));
        this.LL.N5();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1$1$onCompleted$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
