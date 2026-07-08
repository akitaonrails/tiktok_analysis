package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.HashMap;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rgS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597900rgS {
    public static final C01GW<C1597900rgS> LIZLLL = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(698));
    public static final C01GW<C1597900rgS> LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(699));
    public static final C01GW<C1597900rgS> LJFF = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
    public final C1597870rgP LIZ;
    public final C1597880rgQ LIZIZ;
    public long LIZJ = -1;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rgP] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.0rgQ] */
    public C1597900rgS(final HashMap<String, String> map) {
        this.LIZ = new AbstractC1597860rgO(map) { // from class: X.0rgP
            @Override // X.AbstractC1597860rgO
            public final String LIZ() {
                return "livesdk_skylight_first_client_click_time";
            }

            @Override // X.AbstractC1597860rgO
            public final String LIZJ() {
                return "livesdk_skylight_load_time";
            }

            @Override // X.AbstractC1597860rgO
            public final String LIZLLL() {
                return "livesdk_skylight_first_client_show_time";
            }
        };
        this.LIZIZ = new AbstractC1597860rgO(map) { // from class: X.0rgQ
            @Override // X.AbstractC1597860rgO
            public final String LIZ() {
                return "story_skylight_first_client_click_time";
            }

            @Override // X.AbstractC1597860rgO
            public final String LIZJ() {
                return "story_skylight_load_time";
            }

            @Override // X.AbstractC1597860rgO
            public final String LIZLLL() {
                return "story_skylight_first_client_show_time";
            }
        };
    }

    public static boolean LIZ(C1597900rgS c1597900rgS) {
        C1597870rgP c1597870rgP = c1597900rgS.LIZ;
        if (!c1597870rgP.LIZLLL && c1597870rgP.LIZIZ < 3) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(C1597900rgS c1597900rgS) {
        if (c1597900rgS.LIZJ <= 0) {
            c1597900rgS.LIZJ = System.currentTimeMillis();
        }
        C1597870rgP c1597870rgP = c1597900rgS.LIZ;
        long j = c1597900rgS.LIZJ;
        c1597870rgP.LJI = j;
        c1597900rgS.LIZIZ.LJI = j;
    }

    public static void LIZJ(C1597900rgS c1597900rgS, boolean z) {
        AbstractC1597860rgO.LJ(c1597900rgS.LIZ, z);
    }

    public static void LJFF(C1597900rgS c1597900rgS, boolean z) {
        AbstractC1597860rgO.LJI(c1597900rgS.LIZ, z);
    }

    public final void LIZLLL(int i, boolean z, boolean z2) {
        if (z2) {
            AbstractC1597860rgO.LJFF(this.LIZ, z, i);
        } else {
            AbstractC1597860rgO.LJFF(this.LIZIZ, z, i);
        }
    }
}
