package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.MiniDramaETInjectService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0s40, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612500s40 {
    public int LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public int LJIILJJIL;
    public int LJIILLIIL;
    public boolean LIZ = true;
    public final List<String> LJIIL = new ArrayList();
    public final HashMap<String, C1613650s5r> LJIILIIL = new HashMap<>();
    public boolean LJIILL = true;
    public int LJIIZILJ = -1;

    public static void LIZJ(C1612500s40 c1612500s40) {
        c1612500s40.LIZJ = "homepage_series";
        c1612500s40.LIZLLL = null;
        c1612500s40.LJ = null;
        c1612500s40.LJFF = null;
        c1612500s40.LJI = null;
        c1612500s40.LJII = null;
        c1612500s40.LJIIIIZZ = null;
        c1612500s40.LJIIIZ = null;
        c1612500s40.LJIIJ = null;
    }

    public final void LIZ(Aweme aweme) {
        int i;
        int i2;
        int i3;
        if (aweme.isAd()) {
            C1613650s5r c1613650s5r = this.LJIILIIL.get(aweme.getAid());
            if (c1613650s5r != null) {
                i = 1;
                i2 = c1613650s5r.LIZ;
                i3 = c1613650s5r.LIZIZ;
            } else {
                i = 0;
                if (this.LJIILL) {
                    this.LJIILLIIL = this.LJIILJJIL;
                    this.LJIILL = false;
                    i2 = -1;
                } else {
                    i2 = this.LJIILJJIL;
                }
                i3 = 1 + this.LJIIZILJ;
                this.LJIIZILJ = i3;
                this.LJIILIIL.put(aweme.getAid(), new C1613650s5r(i2, i3));
                this.LJIILJJIL = 0;
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("enter_from", this.LIZJ);
            c2344009Gk.LIZJ(this.LIZ ? 1 : 0, "is_first_show");
            c2344009Gk.LIZJ(this.LIZIZ, "ad_gap");
            c2344009Gk.LJFF("group_id", aweme.getAid());
            c2344009Gk.LJFF("collection_id", this.LIZLLL);
            c2344009Gk.LJFF("series_state", this.LJ);
            c2344009Gk.LJFF("series_enter_entrance", this.LJFF);
            c2344009Gk.LJFF("source_group_id", this.LJI);
            c2344009Gk.LJFF("source_video_id", this.LJII);
            c2344009Gk.LJFF("source_author_id", this.LJIIIIZZ);
            c2344009Gk.LJFF("source_video_type", this.LJIIIZ);
            c2344009Gk.LJFF("series_category", this.LJIIJ);
            c2344009Gk.LJFF("entrance_enter_from", this.LJIIJJI);
            c2344009Gk.LIZJ(this.LJIILLIIL, "session_start_pos");
            c2344009Gk.LIZJ(i2, "session_ad_gap");
            c2344009Gk.LIZJ(i3, "session_ad_index");
            c2344009Gk.LIZJ(i, "session_is_reshow");
            MiniDramaETInjectService.LIZ.getClass();
            MiniDramaETInjectService miniDramaETInjectServiceLIZ = C1611550s2T.LIZ();
            if (miniDramaETInjectServiceLIZ != null) {
                miniDramaETInjectServiceLIZ.onEventV3("mini_drama_ad_show", c2344009Gk.LIZ);
            }
            this.LIZIZ = 0;
            this.LIZ = false;
            return;
        }
        this.LIZIZ++;
        if (((ArrayList) this.LJIIL).contains(aweme.getAid())) {
            return;
        }
        ((ArrayList) this.LJIIL).add(aweme.getAid());
        this.LJIILJJIL++;
    }

    public final void LIZIZ(String str) {
        String str2 = this.LJIIJJI;
        if (str2 == null || str2.length() == 0) {
            this.LJIIJJI = str;
        }
    }
}
