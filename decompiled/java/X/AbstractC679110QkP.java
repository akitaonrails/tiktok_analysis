package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: X.0QkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC679110QkP {
    public final C679100QkO LIZ;
    public final PriorityQueue<AbstractC679120QkQ> LIZIZ = new PriorityQueue<>();
    public final Map<String, AbstractC679120QkQ> LIZJ = new LinkedHashMap();
    public final C679130QkR LIZLLL = new InterfaceC679190QkX() { // from class: X.0QkR
        @Override // X.InterfaceC679190QkX
        public final void LIZ(AbstractC679120QkQ abstractC679120QkQ) {
            this.LIZ.LIZJ.remove(abstractC679120QkQ.LJFF());
            this.LIZ.LIZ.LIZIZ.remove(abstractC679120QkQ);
            this.LIZ.LIZ.LJ();
        }
    };

    public abstract String LIZ();

    public boolean LIZIZ(String str, String str2) {
        return false;
    }

    public abstract boolean LIZJ(AbstractC679120QkQ abstractC679120QkQ);

    public final void LIZLLL() {
        AbstractC679120QkQ abstractC679120QkQPeek;
        if (!(!this.LIZIZ.isEmpty()) || (abstractC679120QkQPeek = this.LIZIZ.peek()) == null) {
            return;
        }
        int priority = abstractC679120QkQPeek.getPriority();
        Iterator<AbstractC679120QkQ> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            AbstractC679120QkQ next = it2.next();
            if (next.getPriority() == priority || LIZIZ(abstractC679120QkQPeek.LJFF(), next.LJFF())) {
                if (LIZJ(next)) {
                    this.LIZ.LIZJ.addIfAbsent(next.LJFF());
                    it2.remove();
                    if (next.LLILLJJLI < 1) {
                        this.LIZJ.put(next.LJFF(), next);
                        next.LLILLJJLI = 1;
                        next.run();
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0QkR] */
    public AbstractC679110QkP(C679100QkO c679100QkO) {
        this.LIZ = c679100QkO;
    }
}
