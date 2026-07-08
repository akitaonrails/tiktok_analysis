package X;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.146b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202103146b {
    public static C146A LIZ(int i, final String str) {
        AbstractC2225271C7p abstractC2225271C7p;
        if (i <= 2 && i >= 0) {
            int i2 = C146T.LIZIZ.LJFF;
            if (i2 == 0 ? i != 2 : !(i2 == 1 && i != 2)) {
                ConcurrentHashMap<String, C146A>[] concurrentHashMapArr = C202104146c.LIZ;
                C146A c146a = concurrentHashMapArr[i].get(str);
                if (c146a != null) {
                    return c146a;
                }
                if (i != 0) {
                    if (i != 1) {
                        abstractC2225271C7p = new AbstractC2225271C7p(str) { // from class: X.146e
                        };
                    } else {
                        abstractC2225271C7p = new AbstractC2225271C7p(str) { // from class: X.146f
                        };
                    }
                } else {
                    abstractC2225271C7p = new AbstractC2225271C7p(str) { // from class: X.146d
                    };
                }
                concurrentHashMapArr[i].put(str, abstractC2225271C7p);
                return abstractC2225271C7p;
            }
            return new C146A() { // from class: X.146B
                @Override // X.C146A
                public final void LIZ(String str2) {
                }

                @Override // X.C146A
                public final void LIZIZ(float f) {
                }

                @Override // X.C146A
                public final void LIZJ(String str2) {
                }

                @Override // X.C146A
                public final void LIZLLL(AnonymousClass1467 anonymousClass1467) {
                }

                @Override // X.C146A
                public final boolean LJ() {
                    return false;
                }

                @Override // X.C146A
                public final void LJFF(String str2, ArrayList<C1909907dx> arrayList) {
                }

                @Override // X.C146A
                public final void bm(long j) {
                }

                @Override // X.C146A
                public final void stop() {
                }
            };
        }
        throw new IllegalArgumentException("type is error");
    }
}
