package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1597860rgO {
    public final HashMap<String, String> LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public Boolean LJFF;
    public long LJI = -1;

    public abstract String LIZ();

    public abstract String LIZJ();

    public abstract String LIZLLL();

    public AbstractC1597860rgO(HashMap<String, String> map) {
        this.LIZ = map;
    }

    public final C2344009Gk LIZIZ(HashMap<String, String> map) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJI(this.LIZ);
        if (map != null) {
            c2344009Gk.LJI(map);
        }
        if (Intrinsics.LJFF(this.LJFF, Boolean.TRUE)) {
            c2344009Gk.LJFF("is_cold_start", "1");
            return c2344009Gk;
        }
        c2344009Gk.LJFF("is_cold_start", CardStruct.IStatusCode.DEFAULT);
        return c2344009Gk;
    }

    public static void LJ(AbstractC1597860rgO abstractC1597860rgO, boolean z) {
        String str;
        if (abstractC1597860rgO.LJI > 0 && !abstractC1597860rgO.LJ) {
            int i = abstractC1597860rgO.LIZIZ;
            int i2 = 0;
            if (1 <= i && i < 4) {
                C2344009Gk c2344009GkLIZIZ = abstractC1597860rgO.LIZIZ(null);
                long jCurrentTimeMillis = System.currentTimeMillis() - abstractC1597860rgO.LJI;
                c2344009GkLIZIZ.LJFF("duration", String.valueOf(jCurrentTimeMillis));
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009GkLIZIZ.LJFF("is_cache", str);
                if (!z) {
                    i2 = 3;
                }
                c2344009GkLIZIZ.LIZJ(i2, "request_status");
                C20684815ws.LJIILLIIL(abstractC1597860rgO.LIZ(), c2344009GkLIZIZ.LIZ);
                abstractC1597860rgO.LIZIZ = 4;
                abstractC1597860rgO.LJ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportClickDuration: ");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public static void LJI(AbstractC1597860rgO abstractC1597860rgO, boolean z) {
        String str;
        if (abstractC1597860rgO.LJI > 0 && !abstractC1597860rgO.LIZLLL) {
            int i = abstractC1597860rgO.LIZIZ;
            int i2 = 0;
            if (1 <= i && i < 3) {
                C2344009Gk c2344009GkLIZIZ = abstractC1597860rgO.LIZIZ(null);
                long jCurrentTimeMillis = System.currentTimeMillis() - abstractC1597860rgO.LJI;
                c2344009GkLIZIZ.LJFF("duration", String.valueOf(jCurrentTimeMillis));
                if (z) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009GkLIZIZ.LJFF("is_cache", str);
                if (!z) {
                    i2 = 3;
                }
                c2344009GkLIZIZ.LIZJ(i2, "request_status");
                C20684815ws.LJIILLIIL(abstractC1597860rgO.LIZLLL(), c2344009GkLIZIZ.LIZ);
                abstractC1597860rgO.LIZIZ = 3;
                abstractC1597860rgO.LIZLLL = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("reportShowDuration: ");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    public static void LJFF(AbstractC1597860rgO abstractC1597860rgO, boolean z, int i) {
        int i2;
        String str;
        if (abstractC1597860rgO.LJI > 0 && !abstractC1597860rgO.LIZJ && 1 <= (i2 = abstractC1597860rgO.LIZIZ) && i2 < 2) {
            C2344009Gk c2344009GkLIZIZ = abstractC1597860rgO.LIZIZ(null);
            long jCurrentTimeMillis = System.currentTimeMillis() - abstractC1597860rgO.LJI;
            c2344009GkLIZIZ.LJFF("duration", String.valueOf(jCurrentTimeMillis));
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009GkLIZIZ.LJFF("is_cache", str);
            c2344009GkLIZIZ.LJFF("request_status", String.valueOf(i));
            C20684815ws.LJIILLIIL(abstractC1597860rgO.LIZJ(), c2344009GkLIZIZ.LIZ);
            abstractC1597860rgO.LIZIZ = 2;
            abstractC1597860rgO.LIZJ = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reportLoadDuration: ");
            sbLIZ.append(jCurrentTimeMillis);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
