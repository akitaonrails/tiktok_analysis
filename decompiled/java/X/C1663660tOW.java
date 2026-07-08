package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0tOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1663660tOW {
    public static final C1663660tOW LIZ = new C1663660tOW();

    public static String LIZ() {
        return C306040Bz8.LIZIZ() ? "record_return" : C306040Bz8.LIZLLL() ? "vad_return" : C306040Bz8.LIZJ() ? "sample_preview" : "";
    }

    public static C0LAB LJII(ShortVideoContext shortVideoContext) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("content_source", shortVideoContext.LJ().getContentSource());
        c0lab.LJ("content_type", shortVideoContext.LJ().getContentType());
        return c0lab;
    }

    public static void LJ(ShortVideoContext shortVideoContext, Effect effect) {
        C0LAB c0labLJII = LJII(shortVideoContext);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        c0labLJII.LJ("voice_play_type", LIZ());
        C20684815ws.LJIILLIIL("voice_effect_preview_play_start", c0labLJII.LIZ);
    }

    public static void LJFF(ShortVideoContext shortVideoContext, Effect effect) {
        C0LAB c0labLJII = LJII(shortVideoContext);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        C20684815ws.LJIILLIIL("voice_effect_preview_record_start", c0labLJII.LIZ);
    }

    public static void LIZIZ(ShortVideoContext shortVideoContext, String str, Effect effect) {
        int i;
        C0LAB c0labLJII = LJII(shortVideoContext);
        c0labLJII.LJ("enter_method", str);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        if (C1664460tPo.LJIIIIZZ(effect).length() > 0) {
            i = 1;
        } else {
            i = 0;
        }
        c0labLJII.LIZ(i, "is_voice_effect");
        C20684815ws.LJIILLIIL("voice_effect_panel_close", c0labLJII.LIZ);
    }

    public static void LIZLLL(ShortVideoContext shortVideoContext, Effect effect, boolean z) {
        C0LAB c0labLJII = LJII(shortVideoContext);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        c0labLJII.LJ("shoot_entrance", shortVideoContext.LJ().getStoryShootEntrance());
        c0labLJII.LIZ(z ? 1 : 0, "is_play");
        c0labLJII.LJ("voice_play_type", LIZ());
        C20684815ws.LJIILLIIL("voice_effect_preview_play_interrupt", c0labLJII.LIZ);
    }

    public static void LIZJ(ShortVideoContext shortVideoContext, Effect effect, long j, boolean z) {
        C0LAB c0labLJII = LJII(shortVideoContext);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        c0labLJII.LIZIZ(j, "duration");
        c0labLJII.LIZ(z ? 1 : 0, "is_finish");
        c0labLJII.LJ("voice_play_type", LIZ());
        C20684815ws.LJIILLIIL("voice_effect_preview_play_end", c0labLJII.LIZ);
    }

    public static void LJI(ShortVideoContext shortVideoContext, Effect effect, boolean z, boolean z2) {
        String str;
        C0LAB c0labLJII = LJII(shortVideoContext);
        c0labLJII.LJ("effect_id", effect.getEffect_id());
        c0labLJII.LJ("effect_name", effect.getName());
        c0labLJII.LJ("shoot_entrance", shortVideoContext.LJ().getStoryShootEntrance());
        c0labLJII.LJ("to_status", "add");
        if (z) {
            str = "default_selection";
        } else {
            str = "user_selection";
        }
        c0labLJII.LJ("select_type", str);
        c0labLJII.LIZ(z2 ? 1 : 0, "is_prop_on");
        C20684815ws.LJIILLIIL("select_voice_effect", c0labLJII.LIZ);
    }
}
