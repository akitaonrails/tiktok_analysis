package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerRender$asyncCreateMarker$2", f = "PoiMapDetailMarkerRender.kt", l = {323}, m = "invokeSuspend")
public final class C1176920gjS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1176900gjQ LLILLJJLI;
    public final /* synthetic */ C1177390gkD LLILLL;
    public final /* synthetic */ C1176630giz LLILZ;
    public final /* synthetic */ C1177000gja LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ float LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176920gjS(C1176900gjQ c1176900gjQ, C1177390gkD c1177390gkD, C1176630giz c1176630giz, C1177000gja c1177000gja, boolean z, float f, InterfaceC1364105Vn<? super C1176920gjS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1176900gjQ;
        this.LLILLL = c1177390gkD;
        this.LLILZ = c1176630giz;
        this.LLILZIL = c1177000gja;
        this.LLILZLL = z;
        this.LLIZ = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1176920gjS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailMarkerRender@7f86.asyncCreateMarker$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1176900gjQ c1176900gjQ = this.LLILLJJLI;
                C1177390gkD c1177390gkD = this.LLILLL;
                C1176630giz c1176630giz = this.LLILZ;
                C1177000gja c1177000gja = this.LLILZIL;
                boolean z = this.LLILZLL;
                float f = this.LLIZ;
                this.LL = 1;
                if (c1176900gjQ.LJFF(c1177390gkD, c1176630giz, c1177000gja, z, f, this) == objLJFF) {
                    C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.asyncCreateMarker$2");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.asyncCreateMarker$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
