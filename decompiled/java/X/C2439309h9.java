package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.guides.PoiDetailGuidesCell$onBindItemView$3$1$1$onCompleted$2", f = "PoiDetailGuidesCell.kt", l = {158}, m = "invokeSuspend")
public final class C2439309h9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ PoiDetailGuidesCell LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2439309h9(Bitmap bitmap, PoiDetailGuidesCell poiDetailGuidesCell, InterfaceC1364105Vn<? super C2439309h9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = poiDetailGuidesCell;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2439309h9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1$1$onCompleted$2");
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
            FlyMainColor flyMainColor = FlyMainColor.LIZ;
            C2439109h7 c2439109h7 = new C2439109h7(this.LLILLJJLI, null);
            c2439109h7.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(0))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(0))), this.LLILLJJLI.getWidth(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(40))));
            C204674156y c204674156yLIZ = flyMainColor.LIZ(c2439109h7);
            c204674156yLIZ.LJFF(30.0f);
            c204674156yLIZ.LJI(0.0f);
            c204674156yLIZ.LJ(0.0f, 0.4f, 0.0f, 0.5f, 0.0f);
            Integer numLIZIZ = c204674156yLIZ.LIZIZ();
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = -16777216;
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2439409hA c2439409hA = new C2439409hA(this.LLILLL, this.LLILLJJLI, iIntValue, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c2439409hA) == objLJFF) {
                C1C7U.LIZIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1$1$onCompleted$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiDetailGuidesCell@cb0c.onBindItemView$3$1$1$onCompleted$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
