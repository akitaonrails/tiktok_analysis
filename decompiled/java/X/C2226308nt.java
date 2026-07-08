package X;

import com.bytedance.android.livesdk.pad.widget.PadAutoRotateScreenGuideWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08nt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.pad.widget.PadAutoRotateScreenGuideWidget$showGuideDelay$1", f = "PadAutoRotateScreenGuideWidget.kt", l = {148, 149}, m = "invokeSuspend")
public final class C2226308nt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ PadAutoRotateScreenGuideWidget LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2226308nt(long j, PadAutoRotateScreenGuideWidget padAutoRotateScreenGuideWidget, InterfaceC1364105Vn<? super C2226308nt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = padAutoRotateScreenGuideWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2226308nt(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C476290Im3 c476290Im3 = new C476290Im3(this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c476290Im3) == objLJFF) {
            C1C7U.LIZIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PadAutoRotateScreenGuideWidget@d6ef.showGuideDelay$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
