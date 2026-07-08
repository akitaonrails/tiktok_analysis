package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.08gH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2179108gH extends C2217421BqW implements Function1<Long, Unit> {
    public static final C2179108gH LL = new C2179108gH();

    public C2179108gH() {
        super(1, Thread.class, "sleep", "sleep(J)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) throws InterruptedException {
        Thread.sleep(l.longValue());
        return Unit.LIZ;
    }
}
