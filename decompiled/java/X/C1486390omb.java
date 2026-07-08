package X;

import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0omb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1486390omb {
    public static final C1486380oma LIZ = new AbstractC1505150pGr() { // from class: X.0oma
        public static final /* synthetic */ int LIZLLL = 0;
        public IStarshipSolariaProfile LIZIZ;
        public boolean LIZJ;

        @Override // X.AbstractC1505150pGr
        @InterfaceC1294060jmO
        public final ConcurrentHashMap<String, String> LJI() {
            Map<String, String> mapLIZJ;
            IStarshipSolariaProfile iStarshipSolariaProfile = this.LIZIZ;
            if (iStarshipSolariaProfile == null || (mapLIZJ = iStarshipSolariaProfile.LIZJ()) == null || !(!mapLIZJ.isEmpty())) {
                return null;
            }
            ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
            for (Map.Entry<String, String> entry : mapLIZJ.entrySet()) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
            return concurrentHashMap;
        }

        public final IStarshipSolariaProfile LJIIIIZZ() {
            if (this.LIZJ) {
                return this.LIZIZ;
            }
            IStarshipSolariaProfile iStarshipSolariaProfileLJII = StarshipSolariaProfile.LJII();
            this.LIZIZ = iStarshipSolariaProfileLJII;
            this.LIZJ = true;
            return iStarshipSolariaProfileLJII;
        }

        @Override // X.AbstractC1505150pGr
        public final void LIZIZ() {
            LJIIIIZZ();
        }

        @Override // X.AbstractC1505150pGr
        public final boolean LIZ(String str) {
            IStarshipSolariaProfile iStarshipSolariaProfileLJIIIIZZ = LJIIIIZZ();
            if (iStarshipSolariaProfileLJIIIIZZ != null) {
                return iStarshipSolariaProfileLJIIIIZZ.LIZ(str);
            }
            return false;
        }

        @Override // X.AbstractC1505150pGr
        public final String LIZJ(String str) {
            IStarshipSolariaProfile iStarshipSolariaProfileLJIIIIZZ = LJIIIIZZ();
            if (iStarshipSolariaProfileLJIIIIZZ != null) {
                return iStarshipSolariaProfileLJIIIIZZ.LIZLLL(str);
            }
            return null;
        }
    };
}
