package Y;

import X.C1468940oKS;
import X.C1480620odI;
import X.C1499180p7E;
import X.C1499230p7J;
import X.C1534250q1n;
import X.C1551910qUH;
import X.C1C7U;
import X.InterfaceC1499200p7G;
import android.net.Network;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.forest.Forest;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.geckox.model.UpdatePackage;
import com.ttnet.org.chromium.net.NetworkChangeNotifierAutoDetect;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS23S0210000_23 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    public static final void run$2(ARunnableS23S0210000_23 aRunnableS23S0210000_23) {
        C1468940oKS.LLZLI((C1468940oKS) aRunnableS23S0210000_23.l0, (SurfaceHolder) aRunnableS23S0210000_23.l1, aRunnableS23S0210000_23.z2);
    }

    public static final void run$3(ARunnableS23S0210000_23 aRunnableS23S0210000_23) {
        C1480620odI.LJLLJ((C1480620odI) aRunnableS23S0210000_23.l0, (Surface) aRunnableS23S0210000_23.l1, aRunnableS23S0210000_23.z2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1534250q1n c1534250q1n = C1534250q1n.LIZ;
        C1534250q1n.LIZ(c1534250q1n, "GeckoXAdapter", "postDelayed to check LazyUpdateManager");
        Map<String, UpdatePackage> map = C1551910qUH.LIZIZ;
        Collection<UpdatePackage> collectionValues = map != null ? ((ConcurrentHashMap) map).values() : null;
        if (collectionValues != null && !collectionValues.isEmpty()) {
            GeckoXAdapter.Companion.checkUpdate(collectionValues, (Map) this.l1, (Forest) this.l0);
            return;
        }
        C1534250q1n.LIZ(c1534250q1n, "GeckoXAdapter", "lazyPackages is empty");
        if (this.z2) {
            GeckoXAdapter.Companion.lazyUpdate((Forest) this.l0, (Map) this.l1, false);
        }
    }

    public static final void run$0(ARunnableS23S0210000_23 aRunnableS23S0210000_23) {
        boolean zLIZ;
        C1C7U.LIZ("GeckoXAdapter$Companion@40d5.lazyUpdate$1");
        try {
            aRunnableS23S0210000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GeckoXAdapter$Companion@40d5.lazyUpdate$1");
    }

    public static final void run$1(ARunnableS23S0210000_23 aRunnableS23S0210000_23) {
        boolean zLIZ;
        C1C7U.LIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onLost$1");
        try {
            InterfaceC1499200p7G interfaceC1499200p7G = ((C1499230p7J) aRunnableS23S0210000_23.l1).LIZIZ.LIZLLL;
            ((C1499180p7E) interfaceC1499200p7G).LIZ.LJ(NetworkChangeNotifierAutoDetect.LJ((Network) aRunnableS23S0210000_23.l0), aRunnableS23S0210000_23.z2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NetworkChangeNotifierAutoDetect$MyNetworkCallback@2051.onLost$1");
    }

    public ARunnableS23S0210000_23(C1468940oKS c1468940oKS, SurfaceHolder surfaceHolder, int i) {
        this.$t = i;
        this.l0 = c1468940oKS;
        this.l1 = surfaceHolder;
        this.z2 = false;
    }

    public ARunnableS23S0210000_23(C1480620odI c1480620odI, Surface surface, int i) {
        this.$t = i;
        this.l0 = c1480620odI;
        this.l1 = surface;
        this.z2 = true;
    }

    public ARunnableS23S0210000_23(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
