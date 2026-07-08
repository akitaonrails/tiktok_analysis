package X;

import com.ss.android.ugc.aweme.pipfeed.api.IPipFeedService;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TJI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TJI {
    public static boolean LIZIZ;
    public static C11N2<Long> LIZLLL;
    public static final C11NJ LIZ = new C11NJ();
    public static long LIZJ = 30000;
    public static final C01GW LJ = C452501pT.LIZIZ(new C0TJJ());

    public static void LIZ() {
        C11N2<Long> c11n2 = LIZLLL;
        if (c11n2 != null) {
            c11n2.dispose();
            LIZLLL = null;
        }
        C11O8 c11o8LJJJLZIJ = C11NZ.LJLJJLL(LIZJ, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ());
        C11N2<Long> c11n22 = new C11N2<Long>() { // from class: X.0TJK
            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
                if (!C1906580ziK.LJI() || C2281231EQv.LIZIZ.LJIJJLI()) {
                    return;
                }
                C01GW c01gw = C0TJI.LJ;
                if (((IPipFeedService) c01gw.getValue()).md()) {
                    ((IPipFeedService) c01gw.getValue()).LIZJ(AFwS199S0000000_12.get$arr$(516));
                } else {
                    C1483410ohn.LJLJJI().release();
                }
            }

            @Override // X.InterfaceC626120Oh8
            public final /* bridge */ /* synthetic */ void onNext(Object obj) {
                ((Number) obj).longValue();
            }
        };
        c11o8LJJJLZIJ.LIZIZ(c11n22);
        LIZLLL = c11n22;
    }
}
