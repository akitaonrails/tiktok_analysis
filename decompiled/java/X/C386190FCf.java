package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0FCf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386190FCf {
    public final VideoPublishEditModel LIZ;

    public C386190FCf(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = videoPublishEditModel;
    }

    public final void LIZIZ(C2344009Gk c2344009Gk) {
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZ.getCreationId());
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZ.getEnterFrom());
        c2344009Gk.LJIIIIZZ("shoot_way", this.LIZ.mShootWay);
    }

    public final void LIZ(int i, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", str);
        c2344009Gk.LJIIIIZZ("voice_modify_id", str2);
        c2344009Gk.LJIIIIZZ("effect_name", str3);
        c2344009Gk.LIZJ(i, "is_editor_pro");
        LIZIZ(c2344009Gk);
        C20684815ws.LJIILLIIL("voice_effect_show", c2344009Gk.LIZ);
    }
}
