package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0otQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class ExecutorC1490620otQ implements Executor {
    public static volatile C1490590otN LL;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        boolean zLJIILLIIL;
        int iLLI;
        if (runnable != null) {
            EnumC1490640otS enumC1490640otS = EnumC1490640otS.NORMAL;
            if (runnable instanceof InterfaceRunnableC1490390ot3) {
                InterfaceRunnableC1490390ot3 interfaceRunnableC1490390ot3 = (InterfaceRunnableC1490390ot3) runnable;
                int iPriority = interfaceRunnableC1490390ot3.priority();
                if (iPriority == 0) {
                    enumC1490640otS = EnumC1490640otS.LOW;
                } else if (1 != iPriority) {
                    if (2 == iPriority) {
                        enumC1490640otS = EnumC1490640otS.HIGH;
                    } else if (3 == iPriority) {
                        enumC1490640otS = EnumC1490640otS.IMMEDIATE;
                    } else if (-1 == iPriority) {
                        enumC1490640otS = EnumC1490640otS.LOWEST;
                    }
                }
                zLJIILLIIL = interfaceRunnableC1490390ot3.LJIILLIIL();
                iLLI = interfaceRunnableC1490390ot3.LLI();
            } else {
                zLJIILLIIL = false;
                iLLI = 0;
            }
            if (LL == null) {
                LL = C1490590otN.LIZJ();
            }
            C1490630otR c1490630otR = new C1490630otR("NetExecutor", enumC1490640otS, iLLI, runnable);
            if (zLJIILLIIL) {
                LL.LIZIZ(c1490630otR);
            } else {
                LL.LIZ(c1490630otR);
            }
        }
    }
}
