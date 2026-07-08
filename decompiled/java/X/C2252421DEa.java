package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1DEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final /* synthetic */ class C2252421DEa extends C2217421BqW implements Function2<Long, C1DEX, C1DEX> {
    public static final C2252421DEa LL = new C2252421DEa();

    public C2252421DEa() {
        super(2, C2252461DEe.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C1DEX invoke(Long l, C1DEX c1dex) {
        int i = C2252461DEe.LIZ;
        return new C1DEX(l.longValue(), c1dex, 0);
    }
}
