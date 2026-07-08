package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.05V3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.aggregated.SocialThoughtAggregatedCellKt$SocialThoughtAggregatedCell$4$3$1$3", f = "SocialThoughtAggregatedCell.kt", l = {}, m = "invokeSuspend")
public final class C05V3 extends C09AX implements InterfaceC1631620sYq<InterfaceC595070NVp, C1378605aS, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C05P0<Long> LLILLJJLI;
    public final /* synthetic */ C05P0<Integer> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05V3(long j, C05P0<Long> c05p0, C05P0<Integer> c05p02, InterfaceC1364105Vn<? super C05V3> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = j;
        this.LLILLJJLI = c05p0;
        this.LLILLL = c05p02;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialThoughtAggregatedCellKt@4745.SocialThoughtAggregatedCell$4$3$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C05P0<Integer> c05p0 = this.LLILLL;
        C05P0<Long> c05p02 = this.LLILLJJLI;
        float f = C1675710thx.LIZ;
        long jLongValue = jCurrentTimeMillis - c05p02.getValue().longValue();
        int iIntValue = 1;
        if (jLongValue <= this.LL) {
            iIntValue = 1 + this.LLILLL.getValue().intValue();
        }
        c05p0.setValue(Integer.valueOf(iIntValue));
        this.LLILLJJLI.setValue(Long.valueOf(jCurrentTimeMillis));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialThoughtAggregatedCellKt@4745.SocialThoughtAggregatedCell$4$3$1$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC595070NVp interfaceC595070NVp, C1378605aS c1378605aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05V3(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
