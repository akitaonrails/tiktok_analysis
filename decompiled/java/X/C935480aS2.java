package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0aS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935480aS2 {
    public final LiveEffect LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public long LIZLLL;
    public long LJ;
    public C11JF LJFF;

    public static boolean LIZ() {
        C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
        C307001Gy.LIZ().getClass();
        return C927600aFK.LJII() == EnumC918970a1P.GRID_FIX;
    }

    public final void LIZIZ() {
        if (this.LJ > 0 || C921180a4y.LJIIL(C915980Zwa.LJIIIIZZ()) < 1) {
            return;
        }
        this.LJ = System.currentTimeMillis();
        LiveEffect liveEffect = this.LIZ;
        boolean z = this.LIZIZ;
        String str = this.LIZJ;
        HashMap map = new HashMap();
        C935470aS1.LIZJ(map);
        C935470aS1.LIZIZ = C917520Zz4.LJIILIIL();
        C935470aS1.LIZIZ(map, null);
        C935470aS1.LIZ(liveEffect, map);
        map.put("is_default", String.valueOf(z ? 1 : 0));
        map.put("position", str);
        C935470aS1.LJI("livesdk_anchor_shared_background_select_onstage", map);
    }

    public final void LIZJ() {
        if (this.LIZLLL > 0) {
            LiveEffect liveEffect = this.LIZ;
            boolean z = this.LIZIZ;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LIZLLL);
            String str = this.LIZJ;
            HashMap map = new HashMap();
            C935470aS1.LIZJ(map);
            C935470aS1.LIZIZ(map, C935470aS1.LIZ);
            C935470aS1.LIZ(liveEffect, map);
            map.put("is_default", String.valueOf(z ? 1 : 0));
            map.put("use_time", String.valueOf(iCurrentTimeMillis));
            map.put("position", str);
            C935470aS1.LJI("livesdk_anchor_shared_background_use_time", map);
            this.LIZLLL = 0L;
            C11JF c11jf = this.LJFF;
            if (c11jf != null) {
                c11jf.dispose();
            }
        }
        LIZLLL();
    }

    public final void LIZLLL() {
        if (this.LJ > 0) {
            LiveEffect liveEffect = this.LIZ;
            boolean z = this.LIZIZ;
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() - this.LJ);
            String str = this.LIZJ;
            HashMap map = new HashMap();
            C935470aS1.LIZJ(map);
            C935470aS1.LIZIZ(map, C935470aS1.LIZIZ);
            C935470aS1.LIZ(liveEffect, map);
            map.put("is_default", String.valueOf(z ? 1 : 0));
            map.put("use_time", String.valueOf(iCurrentTimeMillis));
            map.put("position", str);
            C935470aS1.LJI("livesdk_anchor_shared_background_use_time_onstage", map);
            this.LJ = 0L;
        }
    }

    public C935480aS2(LiveEffect liveEffect, String str, boolean z) {
        this.LIZ = liveEffect;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
