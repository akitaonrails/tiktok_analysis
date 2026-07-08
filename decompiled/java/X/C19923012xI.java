package X;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: renamed from: X.12xI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19923012xI {
    public final ArrayDeque<AbstractC19922812xG> LIZ = new ArrayDeque<>();

    public final void LIZ(AbstractC19922812xG abstractC19922812xG) {
        if (abstractC19922812xG.LJIIL()) {
            int iBinarySearch = Arrays.binarySearch(C19922912xH.LLIZLLLIL, abstractC19922812xG.size());
            if (iBinarySearch < 0) {
                iBinarySearch = (-(iBinarySearch + 1)) - 1;
            }
            int iLJIJI = C19922912xH.LJIJI(iBinarySearch + 1);
            if (!this.LIZ.isEmpty() && this.LIZ.peek().size() < iLJIJI) {
                int iLJIJI2 = C19922912xH.LJIJI(iBinarySearch);
                AbstractC19922812xG abstractC19922812xGPop = this.LIZ.pop();
                while (!this.LIZ.isEmpty() && this.LIZ.peek().size() < iLJIJI2) {
                    abstractC19922812xGPop = new C19922912xH(this.LIZ.pop(), abstractC19922812xGPop);
                }
                C19922912xH c19922912xH = new C19922912xH(abstractC19922812xGPop, abstractC19922812xG);
                while (!this.LIZ.isEmpty()) {
                    int iBinarySearch2 = Arrays.binarySearch(C19922912xH.LLIZLLLIL, c19922912xH.LLILLL);
                    if (iBinarySearch2 < 0) {
                        iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
                    }
                    if (this.LIZ.peek().size() >= C19922912xH.LJIJI(iBinarySearch2 + 1)) {
                        break;
                    } else {
                        c19922912xH = new C19922912xH(this.LIZ.pop(), c19922912xH);
                    }
                }
                this.LIZ.push(c19922912xH);
                return;
            }
            this.LIZ.push(abstractC19922812xG);
            return;
        }
        if (abstractC19922812xG instanceof C19922912xH) {
            C19922912xH c19922912xH2 = (C19922912xH) abstractC19922812xG;
            LIZ(c19922912xH2.LLILZ);
            LIZ(c19922912xH2.LLILZIL);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Has a new type of ByteString been created? Found ");
            sbLIZ.append(abstractC19922812xG.getClass());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
