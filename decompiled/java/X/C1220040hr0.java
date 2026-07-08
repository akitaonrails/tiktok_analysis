package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.fragments.MentionVideoListFragment;

/* JADX INFO: renamed from: X.0hr0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220040hr0 {
    public static MentionVideoListFragment LIZ(int i, String str, String str2) {
        MentionVideoListFragment mentionVideoListFragment = new MentionVideoListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("page_type", i);
        C786410Ut5.LJJJI("music_id", str, bundle);
        C786410Ut5.LJJJI("music_title", str2, bundle);
        mentionVideoListFragment.setArguments(bundle);
        return mentionVideoListFragment;
    }
}
