package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0tQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665050tQl {
    public final ShortVideoContext LIZ;
    public C1665130tQt LIZIZ;
    public Effect LIZJ;

    public C1665050tQl(ShortVideoContext shortVideoContext) {
        this.LIZ = shortVideoContext;
    }

    public final void LIZ(String str, boolean z) {
        String str2;
        Effect effect;
        C0LAB c0lab = new C0LAB();
        if (z && (effect = this.LIZJ) != null) {
            c0lab.LJ("effect_id", effect.getEffectId());
            c0lab.LJ("effect_name", effect.getName());
        }
        c0lab.LJ("tab_name", "Create");
        c0lab.LJ("creation_id", this.LIZ.getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", this.LIZ.shootWay);
        C1665130tQt c1665130tQt = this.LIZIZ;
        String str3 = null;
        if (c1665130tQt != null) {
            str2 = c1665130tQt.LIZ;
        } else {
            str2 = null;
        }
        c0lab.LJ("template_id", str2);
        C1665130tQt c1665130tQt2 = this.LIZIZ;
        if (c1665130tQt2 != null) {
            str3 = c1665130tQt2.LIZIZ;
        }
        c0lab.LJ("template_name", str3);
        C20684815ws.LJIILLIIL(str, c0lab.LIZ);
    }
}
