package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.choose.PlaylistChoosePanelFragment;

/* JADX INFO: renamed from: X.0gVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1168470gVp {
    public static PlaylistChoosePanelFragment LIZ(Aweme aweme, String str, String str2, String str3, String str4, boolean z) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("key_selected_playlist_id", str3, bundle);
        C786410Ut5.LJJJI("key_selected_playlist_name", str4, bundle);
        C786410Ut5.LJJJI("enter_from", str, bundle);
        C786410Ut5.LJJJI("enter_method", str2, bundle);
        C786410Ut5.LJJIZ(bundle, "key_aweme_add_to_playlist", aweme);
        C786410Ut5.LJJIZ(bundle, "key_is_from_publish", Boolean.valueOf(z));
        PlaylistChoosePanelFragment playlistChoosePanelFragment = new PlaylistChoosePanelFragment();
        playlistChoosePanelFragment.setArguments(bundle);
        return playlistChoosePanelFragment;
    }
}
