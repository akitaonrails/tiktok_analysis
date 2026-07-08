package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.15IC, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15IC {
    public final /* synthetic */ BaseChooseMusicFragment LIZ;

    public C15IC(BaseChooseMusicFragment baseChooseMusicFragment) {
        this.LIZ = baseChooseMusicFragment;
    }

    public final void LIZ(MusicModel musicModel) {
        BaseChooseMusicFragment baseChooseMusicFragment = this.LIZ;
        baseChooseMusicFragment.LLLFFI.LLILLJJLI = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("change_music_page");
        sbLIZ.append("_");
        sbLIZ.append(C15IK.LIZ.split("_")[1]);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", baseChooseMusicFragment.LLJJJJLIIL);
        c2344009Gk.LJIIIIZZ("enter_from", strLIZIZ);
        c2344009Gk.LJIIIIZZ("enter_method", "change_music_bar");
        c2344009Gk.LJIIIIZZ("shoot_way", baseChooseMusicFragment.LLJL);
        c2344009Gk.LJIIIIZZ("music_id", musicModel.getMusicId());
        c2344009Gk.LJIIIIZZ("content_source", baseChooseMusicFragment.LLJJL);
        c2344009Gk.LJIIIIZZ("content_type", baseChooseMusicFragment.LLJJLIIIJLLLLLLLZ);
        c2344009Gk.LJIIIIZZ("music_selected_from", baseChooseMusicFragment.LLJJIJI);
        if (C15IK.LJ().booleanValue()) {
            c2344009Gk.LJIIIIZZ("from_location", C15IK.LJIILJJIL);
            c2344009Gk.LJIIIIZZ("type", C15IK.LJIILL);
            c2344009Gk.LIZJ(1, "is_editor_pro");
        } else {
            c2344009Gk.LIZJ(0, "is_editor_pro");
        }
        c2344009Gk.LJFF("music_selected_method", baseChooseMusicFragment.LLJJIJIIJIL);
        c2344009Gk.LJ(Boolean.valueOf(musicModel.isPgc()), "is_pgc");
        if (musicModel.getMatchedSongInfo() != null) {
            c2344009Gk.LJFF("meta_song_id", musicModel.getMatchedSongInfo().getId());
        } else {
            c2344009Gk.LJFF("meta_song_id", "");
        }
        C20684815ws.LJIILLIIL("unselect_music", c2344009Gk.LIZ);
    }
}
