package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796760wrC {
    public final AbstractC1795460wp6 LIZ;
    public Function1<? super String, Unit> LIZIZ;
    public final RunnableC1796770wrD LIZJ = new Runnable(this) { // from class: X.0wrD
        public final C1796760wrC LL;

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("GooglePlayRegionProvider$ConnectionTimeoutTask@b011.run");
            try {
                C1796760wrC c1796760wrC = this.LL;
                c1796760wrC.getClass();
                C1796780wrE.LIZ(null, c1796760wrC, null);
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("GooglePlayRegionProvider$ConnectionTimeoutTask@b011.run");
        }

        {
            this.LL = this;
        }
    };
    public final C1796740wrA LIZLLL = new InterfaceC2200341B9s(this) { // from class: X.0wrA
        public final C1796760wrC LIZ;

        @Override // X.InterfaceC2200341B9s
        public final void LIZ() {
            C1796760wrC c1796760wrC = this.LIZ;
            c1796760wrC.getClass();
            C1796780wrE.LIZ(null, c1796760wrC, null);
        }

        {
            this.LIZ = this;
        }

        @Override // X.InterfaceC2200341B9s
        public final void LJ(C19885612rG c19885612rG) {
            if (c19885612rG.LIZ == 0) {
                C1796760wrC c1796760wrC = this.LIZ;
                new C1796360wqY();
                c1796760wrC.LIZ.LJ(c1796760wrC.LJ);
            } else {
                C1796760wrC c1796760wrC2 = this.LIZ;
                c1796760wrC2.getClass();
                C1796780wrE.LIZ(null, c1796760wrC2, null);
            }
        }
    };
    public final C1796750wrB LJ = new InterfaceC1796790wrF(this) { // from class: X.0wrB
        public final C1796760wrC LIZ;

        {
            this.LIZ = this;
        }

        @Override // X.InterfaceC1796790wrF
        public final void LIZ(C19885612rG c19885612rG, C1796080wq6 c1796080wq6) {
            String str;
            if (c19885612rG.LIZ != 0 || c1796080wq6 == null || (str = c1796080wq6.LIZ) == null) {
                str = null;
            }
            C1796760wrC c1796760wrC = this.LIZ;
            c1796760wrC.getClass();
            C1796780wrE.LIZ(str, c1796760wrC, null);
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0wrD] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0wrA] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0wrB] */
    public C1796760wrC(C1BAY c1bay, Function1 function1) {
        this.LIZ = c1bay;
        this.LIZIZ = function1;
    }
}
