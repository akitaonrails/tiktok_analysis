package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0zob, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1910470zob {
    public boolean LIZ;
    public Aweme LIZIZ;
    public final Map<Integer, C1910490zod> LIZJ = new LinkedHashMap();
    public final Map<Integer, Boolean> LIZLLL = new LinkedHashMap();
    public Integer LJ;
    public int LJFF;

    public final void LIZ() {
        int i;
        int i2;
        if (C0BUF.LIZ() && !this.LIZ) {
            Collection collectionValues = ((LinkedHashMap) this.LIZJ).values();
            int i3 = 0;
            if ((collectionValues instanceof Collection) && collectionValues.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = collectionValues.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((C1910490zod) it2.next()).LIZLLL && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            Collection collectionValues2 = ((LinkedHashMap) this.LIZJ).values();
            if ((collectionValues2 instanceof Collection) && collectionValues2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it3 = collectionValues2.iterator();
                i2 = 0;
                while (it3.hasNext()) {
                    if (((C1910490zod) it3.next()).LIZJ && (i2 = i2 + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            Map<Integer, C1910490zod> map = this.LIZJ;
            Integer num = this.LJ;
            C1910490zod c1910490zod = (C1910490zod) ((LinkedHashMap) map).get(Integer.valueOf(num != null ? num.intValue() : 0));
            int size = this.LIZLLL.size();
            String strLJJLIIIJ = this.LIZLLL.isEmpty() ? "" : C13LP.LJJLIIIJ(((LinkedHashMap) this.LIZLLL).keySet(), ",", null, null, 0, null, null, 62);
            C2344009Gk c2344009Gk = new C2344009Gk();
            Aweme aweme = this.LIZIZ;
            c2344009Gk.LJIIIIZZ("group_id", aweme != null ? aweme.getAid() : null);
            c2344009Gk.LJIIIIZZ("enter_from", "general_search");
            c2344009Gk.LIZJ(i, "loaded_image_cnt");
            Aweme aweme2 = this.LIZIZ;
            c2344009Gk.LIZJ(aweme2 != null ? C0ST8.LIZJ(aweme2) : 0, "image_cnt");
            c2344009Gk.LIZJ((c1910490zod == null || !c1910490zod.LIZJ) ? 0 : 1, "first_image_preload");
            if (c1910490zod != null && c1910490zod.LIZLLL) {
                i3 = 1;
            }
            c2344009Gk.LIZJ(i3, "first_image_loaded");
            c2344009Gk.LIZJ(i2, "preload_image_cnt");
            c2344009Gk.LIZJ(size, "black_screen_cnt");
            c2344009Gk.LJIIIIZZ("black_screen_idx_list", strLJJLIIIJ);
            c2344009Gk.LIZJ(this.LJFF + 1, "slides_cnt");
            C20684815ws.LJIILLIIL("search_image_play_end", c2344009Gk.LIZ);
            this.LIZ = true;
        }
    }
}
