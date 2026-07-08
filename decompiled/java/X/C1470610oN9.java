package X;

import com.ss.ttvideo.TTKPlayerV2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.0oN9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470610oN9 {
    public final C1470640oNC LIZ;
    public final C1470630oNB LIZIZ;
    public final C1470630oNB LIZJ;
    public int LIZLLL;
    public final C1469150oKn<InterfaceC1467090oHT> LJ = new C1469150oKn<>();

    public final Map<String, Integer> LIZIZ() {
        HashMap map = new HashMap();
        Iterator<C2032207xg<InterfaceC1467090oHT>> it2 = this.LJ.LIZ.keySet().iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (it2.hasNext()) {
            InterfaceC1467090oHT interfaceC1467090oHT = it2.next().get();
            if (interfaceC1467090oHT != null) {
                if (interfaceC1467090oHT.getRecycleState() == 1) {
                    i3++;
                } else if (interfaceC1467090oHT.getRecycleState() == 2) {
                    i++;
                } else if (interfaceC1467090oHT.getRecycleState() == 3) {
                    i2++;
                }
            }
        }
        map.put("reuse_scip", Integer.valueOf(i));
        map.put("reuse_scrw", Integer.valueOf(i2));
        map.put("reuse_sciu", Integer.valueOf(i3));
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0oNB, X.0oNC] */
    public C1470610oN9() {
        ?? r0 = new C1470630oNB() { // from class: X.0oNC
            @Override // X.C1470630oNB, X.InterfaceC1470540oN2
            public final InterfaceC1470600oN8 LIZIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new TTKPlayerV2(abstractC1470590oN7, interfaceC1469660oLc);
            }

            @Override // X.C1470630oNB
            /* JADX INFO: renamed from: LJ */
            public final InterfaceC1470660oNE LIZIZ(AbstractC1470590oN7 abstractC1470590oN7, InterfaceC1469660oLc interfaceC1469660oLc) {
                return new TTKPlayerV2(abstractC1470590oN7, interfaceC1469660oLc);
            }
        };
        this.LIZ = r0;
        this.LIZJ = r0;
        this.LIZIZ = r0;
        this.LIZLLL = 1;
        if (C1474810oTv.LLJI().enableMixReuse) {
            C1470630oNB c1470630oNB = new C1470630oNB() { // from class: X.0oNI
            };
            this.LIZJ = c1470630oNB;
            this.LIZIZ = c1470630oNB;
            this.LIZLLL = 0;
            return;
        }
        if (C1474810oTv.LLJI().enableLiveReuse) {
            this.LIZJ = new C1470630oNB() { // from class: X.0oNF
                @Override // X.C1470630oNB
                public final boolean LIZLLL(AbstractC1470590oN7 abstractC1470590oN7) {
                    return abstractC1470590oN7.LIZLLL();
                }
            };
            this.LIZLLL = 0;
        }
        if (C1474810oTv.LLJI().enableVodReuse) {
            this.LIZIZ = new C1470630oNB() { // from class: X.0oND
                @Override // X.C1470630oNB
                public final boolean LIZLLL(AbstractC1470590oN7 abstractC1470590oN7) {
                    if (abstractC1470590oN7.LIZJ() == EnumC1469090oKh.VOD_PLAYER) {
                        return true;
                    }
                    return false;
                }
            };
            this.LIZLLL = 0;
        }
    }

    public static C1470610oN9 LIZ() {
        return C1470690oNH.LIZ;
    }
}
