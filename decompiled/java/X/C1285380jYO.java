package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0jYO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285380jYO {
    public final String LIZ;
    public final int LIZIZ;
    public final CopyOnWriteArraySet<AbstractC1285340jYK> LIZJ = new CopyOnWriteArraySet<>();
    public C1285490jYZ LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size:");
        sbLIZ.append(this.LIZJ.size());
        sbLIZ.append(" elements:");
        sbLIZ.append(this.LIZJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(AbstractC1285340jYK abstractC1285340jYK) {
        AbstractC1285340jYK next;
        if (this.LIZJ.size() == this.LIZIZ) {
            Iterator<AbstractC1285340jYK> it2 = this.LIZJ.iterator();
            C1285410jYR c1285410jYR = C1285350jYL.LJI.LJ;
            Iterator<AbstractC1285340jYK> it3 = this.LIZJ.iterator();
            AbstractC1285340jYK abstractC1285340jYK2 = null;
            if (it3.hasNext()) {
                next = it3.next();
            } else {
                next = null;
            }
            if (c1285410jYR.LIZ == EnumC1285440jYU.SAME && next != null) {
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC1285340jYK next2 = it2.next();
                    if (TextUtils.equals(next.LIZLLL, next2.LIZLLL)) {
                        abstractC1285340jYK2 = next2;
                        break;
                    }
                }
                next = abstractC1285340jYK2;
            }
            LIZIZ(next);
        }
        this.LIZJ.add(abstractC1285340jYK);
    }

    public final void LIZIZ(AbstractC1285340jYK abstractC1285340jYK) {
        if (this.LIZJ.remove(abstractC1285340jYK)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pool:");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" remove ");
            sbLIZ.append(abstractC1285340jYK);
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZLLL != null) {
                abstractC1285340jYK.LJIILIIL();
                return;
            }
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("pool:");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(" remove ");
        sbLIZ2.append(abstractC1285340jYK);
        sbLIZ2.append(" not found");
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public C1285380jYO(int i, String str) {
        this.LIZIZ = i;
        this.LIZ = str;
    }
}
