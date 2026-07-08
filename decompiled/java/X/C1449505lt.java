package X;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1449505lt extends C2217421BqW implements Function1<C1378605aS, Unit> {
    public final /* synthetic */ C05P1<C1294720jnS> LL;
    public final /* synthetic */ C05P0<FrameLayout> LLILLJJLI;
    public final /* synthetic */ C05P0<InterfaceC1692950u9l> LLILLL;
    public final /* synthetic */ C05P0<Long> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1449505lt(C05P0 c05p0, C05P0 c05p02, C05P0 c05p03, C05P0 c05p04) {
        super(1, C1449605lu.class, "playHandAtWindow", "SocialThoughtAggregatedPanel$playHandAtWindow(Landroidx/compose/runtime/State;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;J)V", 0);
        this.LL = c05p0;
        this.LLILLJJLI = c05p02;
        this.LLILLL = c05p03;
        this.LLILZ = c05p04;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1378605aS c1378605aS) {
        FrameLayout value;
        long jLJFF;
        long j = c1378605aS.LIZ;
        C05P1<C1294720jnS> c05p1 = this.LL;
        C05P0<FrameLayout> c05p0 = this.LLILLJJLI;
        C05P0<InterfaceC1692950u9l> c05p02 = this.LLILLL;
        C05P0<Long> c05p03 = this.LLILZ;
        C1294720jnS value2 = c05p1.getValue();
        if (value2 != null && (value = c05p0.getValue()) != null) {
            InterfaceC1692950u9l value3 = c05p02.getValue();
            if (value3 != null) {
                jLJFF = C1692940u9k.LJFF(value3);
            } else {
                jLJFF = 0;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - c05p03.getValue().longValue() >= 200) {
                c05p03.setValue(Long.valueOf(jCurrentTimeMillis));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (jLJFF >> 32));
                C1683170ttz.LJI(value2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (jLJFF & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), value);
            }
        }
        return Unit.LIZ;
    }
}
