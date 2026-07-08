package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0mYJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1400650mYJ {
    public boolean LIZ;
    public final /* synthetic */ MusicDetailAwemeListFragment LIZIZ;

    public final void LIZ() {
        Music music;
        Music music2;
        if (!this.LIZ) {
            this.LIZ = true;
            Bundle arguments = this.LIZIZ.getArguments();
            String string = arguments != null ? arguments.getString("detail_aweme_from_aid") : null;
            Bundle arguments2 = this.LIZIZ.getArguments();
            String string2 = arguments2 != null ? arguments2.getString("author_id") : null;
            Bundle arguments3 = this.LIZIZ.getArguments();
            String string3 = arguments3 != null ? arguments3.getString("detail_aweme_from") : null;
            Bundle arguments4 = this.LIZIZ.getArguments();
            String string4 = arguments4 != null ? arguments4.getString("enter_method") : null;
            Bundle arguments5 = this.LIZIZ.getArguments();
            boolean z = arguments5 != null ? arguments5.getBoolean("is_ai_alive") : false;
            MusicDetail musicDetailLIZ = this.LIZIZ.wS().getState().LL.LIZ();
            Music music3 = musicDetailLIZ != null ? musicDetailLIZ.music : null;
            MusicDetail musicDetail = this.LIZIZ.LLLLIILL;
            String strLIZLLL = (musicDetail == null || (music2 = musicDetail.music) == null) ? null : C630980Ooy.LIZLLL(music2);
            MusicDetail musicDetail2 = this.LIZIZ.LLLLIILL;
            C1398280mUU.LJIIJJI(false, null, music3, string, string2, string3, string4, strLIZLLL, (musicDetail2 == null || (music = musicDetail2.music) == null) ? null : Integer.valueOf(music.getUserCount()), z);
        }
        C818480W8w.LIZJ("single_song", C0W93.FAIL, null, C2097608Jq.LJ());
    }

    public final void LIZIZ() {
        ArrayList arrayList;
        Music music;
        Music music2;
        List<Aweme> list;
        if (this.LIZ) {
            return;
        }
        this.LIZ = true;
        Bundle arguments = this.LIZIZ.getArguments();
        Integer numValueOf = null;
        String string = arguments != null ? arguments.getString("detail_aweme_from") : null;
        Bundle arguments2 = this.LIZIZ.getArguments();
        String string2 = arguments2 != null ? arguments2.getString("enter_method") : null;
        Bundle arguments3 = this.LIZIZ.getArguments();
        String string3 = arguments3 != null ? arguments3.getString("detail_aweme_from_aid") : null;
        Bundle arguments4 = this.LIZIZ.getArguments();
        String string4 = arguments4 != null ? arguments4.getString("author_id") : null;
        Bundle arguments5 = this.LIZIZ.getArguments();
        boolean z = arguments5 != null ? arguments5.getBoolean("is_ai_alive") : false;
        C636120OxG c636120OxG = C636120OxG.LIZ;
        MusicAwemeList musicAwemeList = this.LIZIZ.LLLLLIL;
        c636120OxG.getClass();
        if (musicAwemeList == null || (list = musicAwemeList.items) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Aweme aweme : list) {
                if (!AwemeExtKt.isMDPSquareType(aweme)) {
                    arrayList.add(aweme);
                }
            }
        }
        C636120OxG.LIZLLL.LIZJ(arrayList != null ? arrayList.size() : 0, "mdp_all_video_cnt");
        C636120OxG.LIZLLL.LIZJ(musicAwemeList != null ? musicAwemeList.hasMore : 0, "has_more");
        MusicDetailAwemeListFragment musicDetailAwemeListFragment = this.LIZIZ;
        MusicAwemeList musicAwemeList2 = musicDetailAwemeListFragment.LLLLLIL;
        MusicDetail musicDetailLIZ = musicDetailAwemeListFragment.wS().getState().LL.LIZ();
        Music music3 = musicDetailLIZ != null ? musicDetailLIZ.music : null;
        MusicDetail musicDetail = this.LIZIZ.LLLLIILL;
        String strLIZLLL = (musicDetail == null || (music2 = musicDetail.music) == null) ? null : C630980Ooy.LIZLLL(music2);
        MusicDetail musicDetail2 = this.LIZIZ.LLLLIILL;
        if (musicDetail2 != null && (music = musicDetail2.music) != null) {
            numValueOf = Integer.valueOf(music.getUserCount());
        }
        C1398280mUU.LJIIJJI(true, musicAwemeList2, music3, string3, string4, string, string2, strLIZLLL, numValueOf, z);
    }

    public C1400650mYJ(MusicDetailAwemeListFragment musicDetailAwemeListFragment) {
        this.LIZIZ = musicDetailAwemeListFragment;
    }
}
