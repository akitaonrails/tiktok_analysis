package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0QkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC679120QkQ implements Comparable<AbstractC679120QkQ> {
    public final List<InterfaceC679190QkX> LL = new ArrayList();
    public int LLILLJJLI;

    public final void LIZJ() {
        this.LLILLJJLI = 2;
        Iterator<InterfaceC679190QkX> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(this);
        }
    }

    public abstract String LJFF();

    public abstract int getPriority();

    public abstract void run();

    @Override // java.lang.Comparable
    public final int compareTo(AbstractC679120QkQ abstractC679120QkQ) {
        return getPriority() - abstractC679120QkQ.getPriority();
    }
}
