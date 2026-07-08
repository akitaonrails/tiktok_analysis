package Y;

import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1398280mUU;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS36S2100000_9;

/* JADX INFO: loaded from: classes10.dex */
public class ACListenerS13S1110000_9 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS13S1110000_9 aCListenerS13S1110000_9, View view) {
        String str;
        Long lValueOf;
        if (aCListenerS13S1110000_9.z2) {
            str = "music_tab";
        } else {
            str = "single_song";
        }
        C1398280mUU.LIZIZ(((MusicDetailAwemeListFragment) aCListenerS13S1110000_9.l1).LLILLL, aCListenerS13S1110000_9.s0, str, "edit");
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "//music/artist/awemelist");
        Music music = ((MusicDetailAwemeListFragment) aCListenerS13S1110000_9.l1).LLLIZZ;
        String musicName = null;
        if (music != null) {
            lValueOf = Long.valueOf(music.getId());
        } else {
            lValueOf = null;
        }
        smartRouteBuildRoute.withParam("artist_music_id", String.valueOf(lValueOf));
        Music music2 = ((MusicDetailAwemeListFragment) aCListenerS13S1110000_9.l1).LLLIZZ;
        if (music2 != null) {
            musicName = music2.getMusicName();
        }
        smartRouteBuildRoute.withParam("artist_music_name", musicName);
        smartRouteBuildRoute.withParam("artist_music_featured_aweme_id", aCListenerS13S1110000_9.s0);
        smartRouteBuildRoute.withParam("artist_music_data", ((MusicDetailAwemeListFragment) aCListenerS13S1110000_9.l1).LLLIZZ);
        smartRouteBuildRoute.withParam("enter_method", str);
        smartRouteBuildRoute.open();
    }

    public static final void onClick$1(ACListenerS13S1110000_9 aCListenerS13S1110000_9, View view) {
        String str;
        if (aCListenerS13S1110000_9.z2) {
            str = "music_tab";
        } else {
            str = "single_song";
        }
        C1398280mUU.LIZIZ(((MusicDetailAwemeListFragment) aCListenerS13S1110000_9.l1).LLILLL, aCListenerS13S1110000_9.s0, str, "remove");
        MusicDetailAwemeListFragment musicDetailAwemeListFragment = (MusicDetailAwemeListFragment) aCListenerS13S1110000_9.l1;
        String str2 = aCListenerS13S1110000_9.s0;
        musicDetailAwemeListFragment.getClass();
        C1397620mTQ c1397620mTQ = new C1397620mTQ(view.getContext());
        c1397620mTQ.LJFF(2131834505, new AwS36S2100000_9(musicDetailAwemeListFragment, str2, str, 7));
        c1397620mTQ.LJII(2131834504, AFwS240S0000000_9.get$arr$(926));
        C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
        c1397580mTM.LJI(musicDetailAwemeListFragment.getString(2131834507));
        c1397580mTM.LIZIZ(musicDetailAwemeListFragment.getString(2131834506));
        c1397580mTM.LJIIL = c1397620mTQ;
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public ACListenerS13S1110000_9(boolean z, MusicDetailAwemeListFragment musicDetailAwemeListFragment, String str, int i) {
        this.$t = i;
        this.z2 = z;
        this.l1 = musicDetailAwemeListFragment;
        this.s0 = str;
    }
}
