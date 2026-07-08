package X;

import android.os.Bundle;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeLibrarySongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeQueueSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeRequestSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSearchSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeSongListFragment;
import com.bytedance.android.live.effect.karaoke.fragments.KaraokeViewerSingsSongListFragment;

/* JADX INFO: renamed from: X.0Tzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765010Tzf {
    public static final /* synthetic */ int LIZ = 0;

    public static KaraokeSongListFragment LIZ(int i, long j, String str) {
        KaraokeSongListFragment karaokeSearchSongListFragment;
        if (j == -999) {
            karaokeSearchSongListFragment = new KaraokeQueueSongListFragment();
        } else if (j == -998) {
            karaokeSearchSongListFragment = new KaraokeRequestSongListFragment();
        } else if (j != -997 && j != -996) {
            if (j == -994) {
                karaokeSearchSongListFragment = new KaraokeViewerSingsSongListFragment();
            } else {
                karaokeSearchSongListFragment = new KaraokeLibrarySongListFragment();
            }
        } else {
            karaokeSearchSongListFragment = new KaraokeSearchSongListFragment();
        }
        Bundle bundle = new Bundle();
        bundle.putLong("tab", j);
        C786410Ut5.LJJJI("tab_name", str, bundle);
        bundle.putInt("com.bytedance.android.live.effect.karaoke.CATEGORY_ID", i);
        karaokeSearchSongListFragment.setArguments(bundle);
        return karaokeSearchSongListFragment;
    }
}
