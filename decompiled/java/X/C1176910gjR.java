package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0gjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerRender$updateMarker$1", f = "PoiMapDetailMarkerRender.kt", l = {69}, m = "invokeSuspend")
public final class C1176910gjR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1176900gjQ LL;
    public Object LLILLJJLI;
    public C817403Hg LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ List<C1176630giz> LLIZ;
    public final /* synthetic */ C1176900gjQ LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ C817403Hg LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176910gjR(List<C1176630giz> list, C1176900gjQ c1176900gjQ, String str, C817403Hg c817403Hg, InterfaceC1364105Vn<? super C1176910gjR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = list;
        this.LLIZLLLIL = c1176900gjQ;
        this.LLJ = str;
        this.LLJI = c817403Hg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1176910gjR c1176910gjR = new C1176910gjR(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c1176910gjR.LLILZLL = obj;
        return c1176910gjR;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1176900gjQ c1176900gjQ;
        Object obj2;
        C817403Hg c817403Hg;
        Iterator<C1176630giz> it2;
        C1C7U.LIZ("PoiMapDetailMarkerRender@7f86.updateMarker$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        if (i != 0) {
            if (i == 1) {
                it2 = (Iterator) this.LLILZ;
                c817403Hg = this.LLILLL;
                obj2 = this.LLILLJJLI;
                c1176900gjQ = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILZLL;
            List<C1176630giz> list = this.LLIZ;
            if (list != null) {
                c1176900gjQ = this.LLIZLLLIL;
                obj2 = this.LLJ;
                c817403Hg = this.LLJI;
                it2 = list.iterator();
            }
            C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
            C1176900gjQ c1176900gjQ2 = this.LLIZLLLIL;
            c1176900gjQ2.getClass();
            c1176900gjQ2.LJIIJJI(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.updateMarker$1");
            return unit;
        }
        while (it2.hasNext()) {
            C1176630giz next = it2.next();
            boolean zLJFF = Intrinsics.LJFF(next.card.getPoiId(), obj2);
            float f = c817403Hg.element;
            c817403Hg.element = (-1.0f) + f;
            this.LLILZLL = interfaceC497601wk;
            this.LL = c1176900gjQ;
            this.LLILLJJLI = obj2;
            this.LLILLL = c817403Hg;
            this.LLILZ = it2;
            this.LLILZIL = 1;
            if (c1176900gjQ.LIZJ(next, zLJFF, f, this) == objLJFF) {
                C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.updateMarker$1");
                return objLJFF;
            }
        }
        C23118094a.LJI(interfaceC497601wk.getCoroutineContext());
        C1176900gjQ c1176900gjQ22 = this.LLIZLLLIL;
        c1176900gjQ22.getClass();
        c1176900gjQ22.LJIIJJI(null);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.updateMarker$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
