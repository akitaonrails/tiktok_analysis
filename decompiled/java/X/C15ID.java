package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.ChooseMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.15ID, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ID {
    public static ChooseMusicFragment LIZ(int i, String str, MusicModel musicModel, C0CJ0 c0cj0, boolean z, boolean z2, Bundle bundle, String str2, String str3, int i2, boolean z3, String str4, UrlModel urlModel, int i3, boolean z4, boolean z5, String str5, boolean z6, String str6, String str7) {
        ChooseMusicFragment chooseMusicFragment = new ChooseMusicFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i);
        C786410Ut5.LJJIZ(bundle2, "challenge", str);
        C786410Ut5.LJJIZ(bundle2, "music_model", musicModel);
        C786410Ut5.LJJIZ(bundle2, "music_style", c0cj0);
        bundle2.putBoolean("music_allow_clear", z);
        bundle2.putBoolean("music_allow_cut", z3);
        C786410Ut5.LJJJI("creation_id", str3, bundle2);
        C786410Ut5.LJJJI("content_source", str6, bundle2);
        C786410Ut5.LJJJI("content_type", str7, bundle2);
        C786410Ut5.LJJJI("shoot_way", str2, bundle2);
        bundle2.putBoolean("music_is_photomv", z2);
        bundle2.putInt("sound_page_scene", i2);
        C786410Ut5.LJJIZ(bundle2, "reuse_original_sound_url", urlModel);
        C786410Ut5.LJJJI("reuse_original_sound_id", str4, bundle2);
        bundle2.putInt("reuse_original_sound_length", i3);
        C786410Ut5.LJJIZ(bundle2, "is_mv_theme_music", Boolean.valueOf(z4));
        bundle2.putBoolean("should_show_local_music", z5);
        C786410Ut5.LJJJI("music_default_query", str5, bundle2);
        bundle2.putBoolean("music_initial_load", z6);
        if (bundle != null) {
            C786410Ut5.LJJIIJZLJL(bundle2, bundle);
        }
        chooseMusicFragment.setArguments(bundle2);
        return chooseMusicFragment;
    }
}
