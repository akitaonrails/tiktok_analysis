package X;

import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1534540q2G implements InterfaceC1535220q3M<C1533790q13, AbstractC1534220q1k<?>> {
    public volatile C1535040q34 LIZ;
    public ResourceFetcher LIZIZ;
    public C1492150ovt LIZJ;

    public void LJI() {
    }

    public abstract void LJII(C1533790q13 c1533790q13, Function1<? super AbstractC1534220q1k<?>, Unit> function1);

    public boolean LJIIIZ(C1533790q13 c1533790q13) {
        return true;
    }

    public final C1535040q34 LIZLLL() {
        C1535040q34 c1535040q34 = this.LIZ;
        if (c1535040q34 != null) {
            return c1535040q34;
        }
        return null;
    }

    public final C1492150ovt LJ() {
        C1492150ovt c1492150ovt = this.LIZJ;
        if (c1492150ovt != null) {
            return c1492150ovt;
        }
        return null;
    }

    public final void LJFF(AbstractC1534540q2G abstractC1534540q2G) {
        C1535040q34 c1535040q34LIZLLL = LIZLLL();
        ResourceFetcher resourceFetcher = this.LIZIZ;
        if (resourceFetcher == null) {
            resourceFetcher = null;
        }
        abstractC1534540q2G.LIZJ = resourceFetcher.getTimer();
        abstractC1534540q2G.LIZIZ = resourceFetcher;
        abstractC1534540q2G.LIZ = c1535040q34LIZLLL;
    }

    public final void LJIIIIZZ(String str) {
        ResourceFetcher resourceFetcher = this.LIZIZ;
        if (resourceFetcher == null) {
            resourceFetcher = null;
        }
        resourceFetcher.recordMessage(str);
    }
}
