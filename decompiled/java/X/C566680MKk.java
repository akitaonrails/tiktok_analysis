package X;

import Y.AObjectS527S0100000_8;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0MKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566680MKk extends CountDownLatch {
    public final int LIZ;
    public final Function2<Long, Long, Unit> LIZIZ;

    @Override // java.util.concurrent.CountDownLatch
    public final void countDown() {
        super.countDown();
        this.LIZIZ.invoke(Long.valueOf(getCount()), Long.valueOf(this.LIZ));
    }

    public C566680MKk(int i, AObjectS527S0100000_8 aObjectS527S0100000_8) {
        super(i);
        this.LIZ = i;
        this.LIZIZ = aObjectS527S0100000_8;
    }
}
