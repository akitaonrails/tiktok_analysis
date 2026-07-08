package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704320uS6 implements C1AJ5 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Function0<Long> LIZ;
    public long LIZIZ;
    public long LIZJ;

    static {
        new C1704330uS7();
    }

    @Override // X.C1AJ5
    public final long LIZ() {
        return this.LIZJ - this.LIZIZ;
    }

    @Override // X.C1AJ5
    public final void start() {
        this.LIZIZ = this.LIZ.invoke().longValue();
    }

    @Override // X.C1AJ5
    public final void stop() {
        this.LIZJ = this.LIZ.invoke().longValue();
    }

    public C1704320uS6(int i) {
        C1449305lr c1449305lr;
        if ((i & 2) != 0) {
            c1449305lr = C1449305lr.LL;
        } else {
            c1449305lr = null;
        }
        this.LIZ = c1449305lr;
    }
}
