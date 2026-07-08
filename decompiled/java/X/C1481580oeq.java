package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0oeq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1481580oeq {
    public String LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public long LJIILLIIL;
    public int LJIIZILJ;
    public String LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public String LIZ = "";
    public String LIZIZ = "";
    public String LIZJ = "";
    public int LIZLLL = -1;
    public int LJ = 2;
    public String LJFF = "";
    public String LJI = "";
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -3;
    public int LJIIJ = -1;
    public String LJIIJJI = "";
    public final HashMap<String, Object> LJIJJLI = new HashMap<>();
    public EnumC585580Mxw LJIL = EnumC585580Mxw.DEFAULT;

    public final String toString() {
        return "VideoPlayStartInfo(appVersion=" + this.LIZJ + ", appId=" + this.LIZ + ", videoDuration=" + this.LIZLLL + ", group_id=" + this.LIZIZ + ", preloader_type=" + this.LJ + ", play_sess=" + this.LJFF + ", access=" + this.LJI + ", isHitCache=" + this.LJII + ",isCacheCompleted=" + this.LJIIIIZZ + ", preCacheSize=" + this.LJIIIZ + ", customMap=" + this.LJIJJLI + ')';
    }

    public final void LIZIZ(HashMap map) {
        if (map != null) {
            for (Object obj : map.keySet()) {
                Object obj2 = map.get(obj);
                if (obj2 != null) {
                    this.LJIJJLI.put((String) obj, obj2);
                }
            }
        }
    }

    public final void LIZ(Object obj, String str) {
        if (obj != null) {
            this.LJIJJLI.put(str, obj);
        }
    }
}
