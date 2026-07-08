package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rav, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC698710Rav implements Runnable {
    public final /* synthetic */ C699060RbU LL;
    public final /* synthetic */ Function1<C698810Rb5, Unit> LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public RunnableC698710Rav(C699060RbU c699060RbU, Function1<? super C698810Rb5, Unit> function1) {
        this.LL = c699060RbU;
        this.LLILLJJLI = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ComponentPriorityMaker@4add.buildMobDataAsync$1");
        try {
            this.LL.LJFF(this.LLILLJJLI);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ComponentPriorityMaker@4add.buildMobDataAsync$1");
    }
}
