package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0s9d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.panel.viewpager.TimeSlicingDispatchStrategy$flushEvent$1$1$2", f = "DispatchStrategy.kt", l = {224}, m = "invokeSuspend")
public final class C1615990s9d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AE LLILLJJLI;
    public final /* synthetic */ C1616000s9e LLILLL;
    public final /* synthetic */ C1616020s9g LLILZ;
    public final /* synthetic */ AbstractC1616100s9o LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1615990s9d(C09AE c09ae, C1616000s9e c1616000s9e, C1616020s9g c1616020s9g, AbstractC1616100s9o abstractC1616100s9o, InterfaceC1364105Vn<? super C1615990s9d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09ae;
        this.LLILLL = c1616000s9e;
        this.LLILZ = c1616020s9g;
        this.LLILZIL = abstractC1616100s9o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1615990s9d(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TimeSlicingDispatchStrategy@95b0.flushEvent$1$1$2");
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
            C09AE c09ae = this.LLILLJJLI;
            if (c09ae != null) {
                this.LL = 1;
                if (c09ae.LJJZ(this) == objLJFF) {
                    C1C7U.LIZIZ("TimeSlicingDispatchStrategy@95b0.flushEvent$1$1$2");
                    return objLJFF;
                }
            }
        }
        C1616020s9g c1616020s9g = this.LLILZ;
        AbstractC1616100s9o abstractC1616100s9o = this.LLILZIL;
        try {
            C1604000rqI c1604000rqI = c1616020s9g.LIZIZ;
            C1604000rqI c1604000rqI2 = new C1604000rqI(c1604000rqI.LIZ, null, c1604000rqI.LIZIZ, c1604000rqI.LIZLLL);
            int iOrdinal = c1616020s9g.LIZ.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    abstractC1616100s9o.getClass();
                } else {
                    throw new C1954807lC();
                }
            } else {
                abstractC1616100s9o.LIZ(c1604000rqI2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TimeSlicingDispatchStrategy@95b0.flushEvent$1$1$2");
        return unit;
    }
}
