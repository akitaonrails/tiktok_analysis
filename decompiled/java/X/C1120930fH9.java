package X;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0fH9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120930fH9 {
    public final LinkedList<C1121190fHZ> LIZ = new LinkedList<>();
    public C1121190fHZ LIZIZ;

    public final void LIZ(C1121190fHZ c1121190fHZ) {
        LIZIZ(c1121190fHZ);
        long j = c1121190fHZ.LIZJ;
        for (C1121190fHZ c1121190fHZ2 : this.LIZ) {
            if (c1121190fHZ2.LIZIZ == EnumC1118040fCU.DOT) {
                c1121190fHZ2.LIZJ = j;
            }
        }
        this.LIZ.addFirst(c1121190fHZ);
    }

    public final void LIZIZ(C1121190fHZ c1121190fHZ) {
        if (c1121190fHZ == null) {
            return;
        }
        Iterator<C1121190fHZ> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            C1121190fHZ next = it2.next();
            EnumC1118040fCU enumC1118040fCU = next.LIZIZ;
            EnumC1118040fCU enumC1118040fCU2 = EnumC1118040fCU.BUBBLE;
            if (enumC1118040fCU != enumC1118040fCU2 && enumC1118040fCU == c1121190fHZ.LIZIZ) {
                it2.remove();
            } else if (enumC1118040fCU == enumC1118040fCU2 && next.LIZ == c1121190fHZ.LIZ) {
                it2.remove();
            }
        }
    }
}
