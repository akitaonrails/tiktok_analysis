package X;

import androidx.lifecycle.MutableLiveData;
import java.util.List;

/* JADX INFO: renamed from: X.0eMS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085780eMS {
    public static final C1085780eMS LIZ = new C1085780eMS();
    public static final MutableLiveData<List<String>> LIZIZ = new MutableLiveData<>();
    public static C11JF LIZJ;
    public static volatile boolean LIZLLL;

    public static final void LIZ() {
        LIZLLL = false;
        C11NZ<String> c11nzLJ = C2275708vr.LJ();
        LIZJ = (C11JF) (c11nzLJ != null ? c11nzLJ.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0eMR
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AISuggestedQueryManager@ba11.preloadAIQueries$1");
                String str = (String) obj;
                if (!C1085780eMS.LIZLLL) {
                    C1085780eMS.LIZLLL = true;
                    C11NZ.LJIJJLI(new C2502309rJ(str, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0eMV
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            C1C7U.LIZ("AISuggestedQueryManager@ba11.preloadAIQueries$1$1");
                            AnonymousClass0880.LIZ(C1085780eMS.LIZIZ, obj2);
                            C1C7U.LIZIZ("AISuggestedQueryManager@ba11.preloadAIQueries$1$1");
                        }
                    }, new C09JN() { // from class: X.0eMU
                        @Override // X.C09JN
                        public final void accept(Object obj2) {
                            C1C7U.LIZ("AISuggestedQueryManager@ba11.preloadAIQueries$1$2");
                            AnonymousClass0880.LIZ(C1085780eMS.LIZIZ, C13BV.INSTANCE);
                            C1C7U.LIZIZ("AISuggestedQueryManager@ba11.preloadAIQueries$1$2");
                        }
                    });
                    C11JF c11jf = C1085780eMS.LIZJ;
                    if (c11jf != null && (true ^ c11jf.isDisposed())) {
                        c11jf.dispose();
                    }
                }
                C1C7U.LIZIZ("AISuggestedQueryManager@ba11.preloadAIQueries$1");
            }
        }, new C09JN() { // from class: X.0eMT
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("AISuggestedQueryManager@ba11.preloadAIQueries$2");
                C11JF c11jf = C1085780eMS.LIZJ;
                if (c11jf != null && (!c11jf.isDisposed())) {
                    c11jf.dispose();
                }
                C1C7U.LIZIZ("AISuggestedQueryManager@ba11.preloadAIQueries$2");
            }
        }) : null);
    }
}
