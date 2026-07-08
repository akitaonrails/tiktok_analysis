package X;

import com.ss.android.ugc.slideslip.fullwidthhorizontal.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Qe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.fullwidthhorizontal.FullWidthEffectCarouselComponent$observeCarouselUIEvent$1$1", f = "FullWidthEffectCarouselComponent.kt", l = {2128}, m = "invokeSuspend")
public final class C1350205Qe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ o LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350205Qe(o oVar, int i, InterfaceC1364105Vn<? super C1350205Qe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = oVar;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1350205Qe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullWidthEffectCarouselComponent@e1ee.observeCarouselUIEvent$1$1");
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
            C1401605eA c1401605eAO7 = this.LLILLJJLI.o7();
            if (c1401605eAO7 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeCarouselUIEvent$1$1");
                return unit;
            }
            InterfaceC1664360tPe<C1350505Qh> value = this.LLILLJJLI.LLLF.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
            Iterator<C1350505Qh> it2 = value.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ);
            }
            C1401605eA c1401605eALIZ = C1401605eA.LIZ(c1401605eAO7, new C1350305Qf(this.LLILLL, C05TY.ANIMATED), C1687430u0r.LIZJ(arrayList), null, false, 28);
            InterfaceC332260D0u<InterfaceC1627870sSn> interfaceC332260D0u = this.LLILLJJLI.LLLJL;
            this.LL = 1;
            if (interfaceC332260D0u.emit(c1401605eALIZ, this) == objLJFF) {
                C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeCarouselUIEvent$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FullWidthEffectCarouselComponent@e1ee.observeCarouselUIEvent$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
