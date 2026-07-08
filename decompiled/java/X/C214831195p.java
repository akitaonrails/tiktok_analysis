package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.195p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214831195p {
    public final List<InterfaceC214832195q> LIZ = new ArrayList();
    public volatile boolean LIZIZ;
    public AwS576S0100000_32 LIZJ;

    public final void LIZIZ() throws Throwable {
        if (this.LIZIZ) {
            C20441214yg.LJIIIZ("QuickCoHostInteractSoloComponentManager", "onCelebrationFinished — celebrationActive=false, dispatching OnCelebrationFinished then re-applying layout");
        }
        this.LIZIZ = false;
        LIZ(C214839195x.LIZ);
        AwS576S0100000_32 awS576S0100000_32 = this.LIZJ;
        if (awS576S0100000_32 != null) {
            awS576S0100000_32.invoke();
        }
    }

    public final void LIZ(AbstractC214838195w abstractC214838195w) {
        Iterator it2 = C13LP.LLIIII(this.LIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC214832195q) it2.next()).onEvent(abstractC214838195w);
        }
    }

    public final void LIZJ(InterfaceC214832195q interfaceC214832195q) {
        this.LIZ.add(interfaceC214832195q);
    }
}
