package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1DEZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C1DEZ extends C2217421BqW implements Function2<Long, C1DEX, C1DEX> {
    public static final C1DEZ LL = new C1DEZ();

    public C1DEZ() {
        super(2, C2252461DEe.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1DEX invoke(Long l, C1DEX c1dex) {
        int i = C2252461DEe.LIZ;
        return new C1DEX(l.longValue(), c1dex, 0);
    }
}
