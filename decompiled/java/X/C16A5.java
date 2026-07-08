package X;

import com.bytedance.android.live.liveinteract.multihost.biz.lynx.InteractionLynxContainerLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: X.16A5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C16A5 {
    public final int LIZ;
    public final WeakReference<InteractionLynxContainerLayout> LIZIZ;

    public final void LIZJ() {
        InteractionLynxContainerLayout interactionLynxContainerLayoutLIZ = LIZ("onLoadFinish");
        if (interactionLynxContainerLayoutLIZ == null) {
            return;
        }
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", "onLoadFinish start flushDataQueue");
        interactionLynxContainerLayoutLIZ.LLJLIL = true;
        if (interactionLynxContainerLayoutLIZ.kp()) {
            Iterator it2 = ((ArrayList) interactionLynxContainerLayoutLIZ.LLJJJJLIIL).iterator();
            while (it2.hasNext()) {
                interactionLynxContainerLayoutLIZ.sp((C1199804mi) it2.next());
            }
            ((ArrayList) interactionLynxContainerLayoutLIZ.LLJJJJLIIL).clear();
        }
    }

    public final void LIZLLL() {
        InteractionLynxContainerLayout interactionLynxContainerLayoutLIZ = LIZ("onRuntimeReady");
        if (interactionLynxContainerLayoutLIZ == null) {
            return;
        }
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", "onRuntimeReady start flushEventQueue");
        interactionLynxContainerLayoutLIZ.LLJL = true;
        if (interactionLynxContainerLayoutLIZ.kp()) {
            for (Pair pair : (ArrayList) interactionLynxContainerLayoutLIZ.LLJJJJJIL) {
                interactionLynxContainerLayoutLIZ.op((C16A4) pair.getFirst(), pair.getSecond());
            }
            ((ArrayList) interactionLynxContainerLayoutLIZ.LLJJJJJIL).clear();
        }
    }

    public final InteractionLynxContainerLayout LIZ(String str) {
        InteractionLynxContainerLayout interactionLynxContainerLayout = this.LIZIZ.get();
        if (interactionLynxContainerLayout == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(" after container GC, skip");
            C20441214yg.LJIIL("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
        if (interactionLynxContainerLayout.LLJLILLLLZIIL != this.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(" stale callback (gen=");
            sbLIZ2.append(this.LIZ);
            sbLIZ2.append(", current=");
            sbLIZ2.append(interactionLynxContainerLayout.LLJLILLLLZIIL);
            sbLIZ2.append("), skip");
            C20441214yg.LJIIL("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        return interactionLynxContainerLayout;
    }

    public final void LIZIZ(C1542120qEU c1542120qEU) {
        InteractionLynxContainerLayout interactionLynxContainerLayoutLIZ = LIZ("onLoadFailed");
        if (interactionLynxContainerLayoutLIZ == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed errorCode=");
        sbLIZ.append(c1542120qEU.LIZ);
        sbLIZ.append(", errorReason=");
        sbLIZ.append(c1542120qEU.LIZIZ);
        C20441214yg.LJ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
        interactionLynxContainerLayoutLIZ.tp();
    }

    public C16A5(InteractionLynxContainerLayout interactionLynxContainerLayout, int i) {
        this.LIZ = i;
        this.LIZIZ = new WeakReference<>(interactionLynxContainerLayout);
    }
}
