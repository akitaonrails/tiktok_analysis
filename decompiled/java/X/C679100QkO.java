package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QkO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679100QkO {
    public final HashMap<String, AbstractC679110QkP> LIZ = new HashMap<>();
    public final PriorityQueue<AbstractC679120QkQ> LIZIZ = new PriorityQueue<>();
    public final CopyOnWriteArrayList<String> LIZJ = new CopyOnWriteArrayList<>();

    public final void LJ() {
        Iterator<Map.Entry<String, AbstractC679110QkP>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZLLL();
        }
    }

    public final void LJI() {
        this.LIZIZ.clear();
        this.LIZJ.clear();
        Iterator<Map.Entry<String, AbstractC679110QkP>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            AbstractC679110QkP value = it2.next().getValue();
            value.LIZIZ.clear();
            ((LinkedHashMap) value.LIZJ).clear();
        }
    }

    public final boolean LIZLLL(AbstractC679120QkQ abstractC679120QkQ) {
        AbstractC679120QkQ abstractC679120QkQPeek = this.LIZIZ.peek();
        if (abstractC679120QkQPeek != null && abstractC679120QkQ.getPriority() > abstractC679120QkQPeek.getPriority()) {
            return false;
        }
        return true;
    }

    public final void LJFF(AbstractC679110QkP abstractC679110QkP) {
        this.LIZ.put(abstractC679110QkP.LIZ(), abstractC679110QkP);
    }

    public static void LIZIZ(C679100QkO c679100QkO, C0OUI c0oui) {
        AbstractC679110QkP abstractC679110QkP = c679100QkO.LIZ.get("v_search_fourth_layer");
        if (abstractC679110QkP != null) {
            ((ArrayList) c0oui.LL).add(abstractC679110QkP.LIZLLL);
            abstractC679110QkP.LIZIZ.add(c0oui);
        }
        AbstractC679110QkP abstractC679110QkP2 = c679100QkO.LIZ.get("v_search_fourth_layer");
        if (abstractC679110QkP2 != null) {
            abstractC679110QkP2.LIZLLL();
        }
    }

    public final AbstractC679120QkQ LIZJ(String str, String str2) {
        AbstractC679110QkP abstractC679110QkP = this.LIZ.get(str);
        AbstractC679120QkQ abstractC679120QkQ = null;
        if (abstractC679110QkP == null) {
            return null;
        }
        AbstractC679120QkQ abstractC679120QkQ2 = (AbstractC679120QkQ) ((LinkedHashMap) abstractC679110QkP.LIZJ).get(str2);
        if (abstractC679120QkQ2 == null) {
            Iterator<AbstractC679120QkQ> it2 = abstractC679110QkP.LIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC679120QkQ next = it2.next();
                if (Intrinsics.LJFF(next.LJFF(), str2)) {
                    abstractC679120QkQ = next;
                    break;
                }
            }
            return abstractC679120QkQ;
        }
        return abstractC679120QkQ2;
    }

    public final void LIZ(String str, AbstractC679120QkQ abstractC679120QkQ, boolean z) {
        AbstractC679110QkP abstractC679110QkP = this.LIZ.get(str);
        if (abstractC679110QkP != null) {
            ((ArrayList) abstractC679120QkQ.LL).add(abstractC679110QkP.LIZLLL);
            abstractC679110QkP.LIZIZ.add(abstractC679120QkQ);
        }
        if (z) {
            this.LIZIZ.add(abstractC679120QkQ);
        }
    }
}
