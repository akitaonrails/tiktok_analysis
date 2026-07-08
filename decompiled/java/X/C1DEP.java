package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1DEP, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C1DEP extends C2217421BqW implements Function2<Long, C1DEM<Object>, C1DEM<Object>> {
    public static final C1DEP LL = new C1DEP();

    public C1DEP() {
        super(2, C1DEN.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1DEM<Object> invoke(Long l, C1DEM<Object> c1dem) {
        long jLongValue = l.longValue();
        C1DEM<Object> c1dem2 = c1dem;
        C1DEM<Object> c1dem3 = C1DEN.LIZ;
        return new C1DEM<>(jLongValue, c1dem2, c1dem2.LLILZIL, 0);
    }
}
