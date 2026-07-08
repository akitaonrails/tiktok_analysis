package X;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.viewpager.TimeSlicingDispatchStrategy$scheduleFirstFrameTimeoutIfNeeded$1", f = "DispatchStrategy.kt", l = {172}, m = "invokeSuspend")
public final class C1615980s9c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1616000s9e LLILLJJLI;
    public final /* synthetic */ C1616020s9g LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615980s9c(C1616000s9e c1616000s9e, C1616020s9g c1616020s9g, InterfaceC1364105Vn<? super C1615980s9c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1616000s9e;
        this.LLILLL = c1616020s9g;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1615980s9c(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TimeSlicingDispatchStrategy@95b0.scheduleFirstFrameTimeoutIfNeeded$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("TimeSlicingDispatchStrategy@95b0.scheduleFirstFrameTimeoutIfNeeded$1");
                return objLJFF;
            }
        }
        ArrayDeque<C1616020s9g> arrayDeque = this.LLILLJJLI.LJ;
        C1616020s9g c1616020s9g = this.LLILLL;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator<C1616020s9g> it2 = arrayDeque.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next() == c1616020s9g) {
                    C1616020s9g c1616020s9g2 = this.LLILLL;
                    if (!c1616020s9g2.LIZLLL) {
                        this.LLILLJJLI.getClass();
                        c1616020s9g2.LIZLLL = true;
                        C09AE c09ae = c1616020s9g2.LJ;
                        if (c09ae != null) {
                            c09ae.LIZIZ(null);
                        }
                        c1616020s9g2.LJ = null;
                        C1616000s9e c1616000s9e = this.LLILLJJLI;
                        c1616000s9e.LIZ(c1616000s9e.LIZJ, c1616000s9e.LIZLLL);
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TimeSlicingDispatchStrategy@95b0.scheduleFirstFrameTimeoutIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
