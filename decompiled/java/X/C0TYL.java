package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameFragment;

/* JADX INFO: renamed from: X.0TYL, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TYL {
    public static EditPlayListNameFragment LIZ(int i, String str, String str2, int i2, Aweme aweme, Long l, String str3, UrlModel urlModel, String str4, Integer num) {
        EditPlayListNameFragment editPlayListNameFragment = new EditPlayListNameFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("open_edit_fragment_type", i);
        C786410Ut5.LJJJI("user_last_name", str, bundle);
        C786410Ut5.LJJJI("default_playlist_name", str4, bundle);
        C786410Ut5.LJJJI("mix_id", str2, bundle);
        bundle.putInt("mix_label", i2);
        C786410Ut5.LJJIZ(bundle, "key_playlist_cover", urlModel);
        if (num != null) {
            bundle.putInt("playlist_post_cnt", num.intValue());
        }
        if (aweme != null) {
            C786410Ut5.LJJIZ(bundle, "key_mix_add_aweme_info", aweme);
        }
        if (l != null) {
            l.longValue();
            bundle.putLong("moderated_rename_timestamp", l.longValue());
        }
        C786410Ut5.LJJJI("enter_from", str3, bundle);
        editPlayListNameFragment.setArguments(bundle);
        return editPlayListNameFragment;
    }
}
