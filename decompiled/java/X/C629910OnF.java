package X;

import Y.ARunnableS42S0300000_9;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicSearchHintInfo;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.zhiliaoapp.musically.R;
import irm.AkS54S0200000_9;

/* JADX INFO: renamed from: X.0OnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629910OnF implements InterfaceC629870OnB {
    public final MusicDetail LIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZIZ;

    @Override // X.InterfaceC629870OnB
    public final void LIZJ(int i) {
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.038U, android.view.View, java.lang.Object] */
    @Override // X.InterfaceC629870OnB
    public final void LIZ(TuxNavBar tuxNavBar) {
        String string;
        Music music;
        MusicSearchHintInfo musicSearchHintInfo;
        MusicSearchHintInfo musicSearchHintInfo2;
        String word;
        final Context context = this.LIZIZ.getContext();
        if (context == null) {
            return;
        }
        View viewLJII = tuxNavBar.LJII("center_title");
        if (viewLJII != null) {
            C786410Ut5.LJLLLLLL(8, viewLJII);
        }
        ?? r5 = new FrameLayout(context) { // from class: X.038U
            {
                super(context, null, 0);
                View viewSd = C786410Ut5.Sd(R.layout.dr2, C786410Ut5.ne(context), this);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJ = C1308910kAL.LIZJ(R.attr.a1k, context);
                c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                viewSd.setBackground(c384050F3z.LIZ(context));
            }

            public final void setHint(String str) {
                ((TextView) findViewById(R.id.tv_search_sug_word)).setText(str);
            }
        };
        Music music2 = this.LIZ.music;
        boolean z = false;
        if (music2 != null && (musicSearchHintInfo2 = music2.musicSearchHintInfo) != null && (word = musicSearchHintInfo2.getWord()) != null && word.length() > 0) {
            z = true;
        }
        if (!z || (music = this.LIZ.music) == null || (musicSearchHintInfo = music.musicSearchHintInfo) == null || (string = musicSearchHintInfo.getWord()) == null) {
            string = context.getString(2131847195);
        }
        r5.setHint(string);
        int visibility = r5.getVisibility();
        r5.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, r5);
        C1250280idm c1250280idm = new C1250280idm();
        c1250280idm.LIZIZ = "search";
        c1250280idm.LIZLLL = true;
        c1250280idm.LIZJ = r5;
        tuxNavBar.LIZIZ(c1250280idm);
        TuxTextView tuxTextView = this.LIZIZ.LLJJIII;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        HandlerHook.viewPost(tuxNavBar, new ARunnableS42S0300000_9(tuxNavBar, context, this, 3));
    }

    @Override // X.InterfaceC629870OnB
    public final void LIZIZ(TuxNavBar tuxNavBar) {
        View viewLJII = tuxNavBar.LJII("search");
        if ((viewLJII instanceof C038U) && viewLJII != null) {
            C786410Ut5.I7(new AkS54S0200000_9(this, this.LIZIZ, 3), viewLJII);
        }
    }

    public C629910OnF(MusicDetailNavBarAssem musicDetailNavBarAssem, MusicDetail musicDetail) {
        this.LIZIZ = musicDetailNavBarAssem;
        this.LIZ = musicDetail;
    }
}
