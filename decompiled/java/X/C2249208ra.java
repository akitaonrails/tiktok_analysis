package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker;
import com.ss.android.ugc.aweme.settings.AnoleVideoPreloadModel;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2249208ra {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1741));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1742));
    public static final Keva LIZJ = Keva.getRepo("anole_video_preload_cache");
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1740));
    public static volatile C2249308rb LJ = new C2249308rb();

    public static C08SK LIZ() {
        String str = ((AnoleVideoPreloadModel) C2249408rc.LIZIZ.getValue()).videoPreloadStrategy;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 75663) {
                if (iHashCode != 76348) {
                    if (iHashCode == 83404 && str.equals("TTL")) {
                        return new C08SM();
                    }
                } else if (str.equals("MIX")) {
                    return new C08SK() { // from class: X.08SL
                        public final C08SM LIZ = new C08SM();
                        public final C08SJ LIZIZ = new C08SJ();

                        @Override // X.C08SK
                        public final void LIZ(C0VSJ c0vsj, C2249308rb c2249308rb) {
                            this.LIZ.LIZ(c0vsj, c2249308rb);
                            this.LIZIZ.LIZ(c0vsj, c2249308rb);
                        }
                    };
                }
            } else if (str.equals("LRU")) {
                return new C08SJ();
            }
        }
        return new C08SJ();
    }

    public static IAnoleVideoPreloadTracker LIZIZ() {
        return (IAnoleVideoPreloadTracker) LIZIZ.getValue();
    }
}
