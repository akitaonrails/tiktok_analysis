package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.sharevideopanel.fragment.ShareVideoPanelFragment;
import java.util.List;

/* JADX INFO: renamed from: X.0iW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245500iW4 {
    public static ShareVideoPanelFragment LIZ(List list, String str, String str2, int i, Bundle bundle, int i2) {
        String str3 = ShareVideoPanelFragment._pnsPageId;
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            i = 0;
        }
        if ((i2 & 16) != 0) {
            bundle = null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putIntArray("panel_type_list", C13LP.LLII(list));
        C786410Ut5.LJJJI("conversation_id", str, bundle2);
        bundle2.putInt("share_scene", i);
        if (str2 != null) {
            C786410Ut5.LJJJI("uuid", str2, bundle2);
        }
        C786410Ut5.LJJIIZI(bundle2, bundle, "key_local_ext");
        ShareVideoPanelFragment shareVideoPanelFragment = new ShareVideoPanelFragment();
        shareVideoPanelFragment.setArguments(bundle2);
        return shareVideoPanelFragment;
    }
}
