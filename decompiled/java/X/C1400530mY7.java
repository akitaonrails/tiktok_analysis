package X;

import Y.ARunnableS54S0300000_21;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400530mY7 {
    public boolean LIZ;
    public boolean LIZIZ;
    public long LIZJ;
    public Function0<Unit> LIZLLL;
    public Function0<Unit> LJ;
    public boolean LJFF;
    public final Keva LJI = Keva.getRepo("mdp_guide_to_story");
    public final C1400570mYB LJII = new Object() { // from class: X.0mYB
    };
    public boolean LJIIIIZZ;

    public final boolean LIZJ() {
        if (this.LJI.getBoolean("sure_show_or_not", false)) {
            return this.LJI.getBoolean("show_anim", false);
        }
        if (C1400560mYA.LIZ().disableThreshold < 0 || this.LJI.getInt("dont_click_to_story", 0) <= C1400560mYA.LIZ().disableThreshold) {
            return true;
        }
        this.LJI.storeBoolean("show_anim", false);
        this.LJI.storeBoolean("sure_show_or_not", true);
        return false;
    }

    public static boolean LJ() {
        return C1400560mYA.LIZ().style == 1;
    }

    public final boolean LIZIZ() {
        return C1400560mYA.LIZ().enable && LIZJ();
    }

    public final void LIZLLL() {
        Function0<Unit> function0;
        Function0<Unit> function02;
        if (LIZIZ()) {
            this.LIZJ = System.currentTimeMillis();
            if (!this.LJFF || (function0 = this.LIZLLL) == null || (function02 = this.LJ) == null) {
                return;
            }
            C1481605r4.LIZ(C1400560mYA.LIZ().duration, new ARunnableS54S0300000_21(function0, this, function02, 10));
        }
    }

    public final void LIZ(Music music, String str) {
        Long lValueOf;
        int i;
        if (!LIZIZ()) {
            return;
        }
        if (this.LJIIIIZZ) {
            getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "single_song");
            if (music != null) {
                lValueOf = Long.valueOf(music.getId());
            } else {
                lValueOf = null;
            }
            c2344009Gk.LJ(lValueOf, "music_id");
            c2344009Gk.LJIIIIZZ("type", "click");
            if (music != null && music.isPgc()) {
                i = 1;
            } else {
                i = 0;
            }
            c2344009Gk.LIZJ(i, "is_pgc");
            c2344009Gk.LJIIIIZZ("click_region", str);
            C20684815ws.LJIILLIIL("add_to_story_music_pop", c2344009Gk.LIZ);
        }
        if (C1400560mYA.LIZ().disableThreshold >= 0 && this.LJI.getInt("dont_click_to_story", 0) <= C1400560mYA.LIZ().disableThreshold) {
            C12848051a.LIZIZ(this.LJI, Boolean.TRUE, "show_anim");
            this.LJI.storeBoolean("sure_show_or_not", true);
        }
    }

    public final void LJFF(Function0<Unit> function0, Function0<Unit> function02) {
        if (!LJ()) {
            function0.invoke();
        } else {
            function02.invoke();
        }
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = false;
    }
}
