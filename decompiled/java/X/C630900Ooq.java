package X;

import Y.ACListenerS113S0200000_9;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.MatchedPGCSoundInfo;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0Ooq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630900Ooq {
    public static final C630900Ooq LIZ = new C630900Ooq();

    public static void LIZJ(View view, Music music) {
        String string;
        List<MusicOwnerInfo> highlightMusicOwnerInfo;
        UrlModel coverMedium;
        List<String> urlList;
        String str;
        Context context = view.getContext();
        if (context == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, view);
        C786410Ut5.I7(new ACListenerS113S0200000_9(context, music, 49), view);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.p7j);
        if (smartImageView != null && (coverMedium = music.getCoverMedium()) != null && (urlList = coverMedium.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            smartImageView.LIZ(C1331660kl2.LJIIIZ(str).LIZJ());
        }
        TextView textView = (TextView) view.findViewById(R.id.oua);
        if (textView != null && (string = context.getString(2131837108)) != null && (highlightMusicOwnerInfo = music.getHighlightMusicOwnerInfo()) != null && !highlightMusicOwnerInfo.isEmpty()) {
            textView.setText(C786410Ut5.j4(string, Arrays.copyOf(new Object[]{((MusicOwnerInfo) ListProtector.get(music.getHighlightMusicOwnerInfo(), 0)).getNickName()}, 1)));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.oub);
        if (textView2 != null) {
            textView2.setText(music.getMusicName());
        }
        C419980GdQ c419980GdQ = (C419980GdQ) view.findViewById(R.id.ovy);
        if (c419980GdQ != null) {
            c419980GdQ.setFont(72);
        }
    }

    public static boolean LIZIZ(Music music, String str, boolean z) {
        MusicReleaseInfo musicReleaseInfo;
        if (z) {
            if (music != null && (musicReleaseInfo = music.getMusicReleaseInfo()) != null && musicReleaseInfo.isNewReleaseSong()) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "single_song");
                c2344009Gk.LJIIIIZZ("music_id", music.getMid());
                c2344009Gk.LJIIIIZZ("group_id", str);
                c2344009Gk.LJIIIIZZ("music_new_show", "1");
                c2344009Gk.LJIIIIZZ("location", "title");
                C20684815ws.LJIILLIIL("new_release_show", c2344009Gk.LIZ);
                return true;
            }
        } else if (music != null && music.getMatchedPGCSoundInfo() != null && music.getMatchedPGCSoundInfo().getMusicReleaseInfo() != null && music.getMatchedPGCSoundInfo().getMusicReleaseInfo().isNewReleaseSong()) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            c2344009Gk2.LJIIIIZZ("enter_from", "single_song");
            c2344009Gk2.LJIIIIZZ("music_id", music.getMatchedPGCSoundInfo().getId());
            c2344009Gk2.LJIIIIZZ("from_music_id", music.getMid());
            c2344009Gk2.LJIIIIZZ("group_id", str);
            c2344009Gk2.LJIIIIZZ("music_new_show", "1");
            c2344009Gk2.LJIIIIZZ("location", "music_feedback");
            C20684815ws.LJIILLIIL("new_release_show", c2344009Gk2.LIZ);
            return true;
        }
        return false;
    }

    public static void LIZ(SpannableStringBuilder spannableStringBuilder, Music music, Context context, boolean z, boolean z2) {
        MusicReleaseInfo musicReleaseInfo;
        if (context != null && music != null) {
            if (!z2) {
                MusicReleaseInfo musicReleaseInfo2 = music.getMusicReleaseInfo();
                if (musicReleaseInfo2 != null && musicReleaseInfo2.isNewReleaseSong()) {
                    C419980GdQ c419980GdQ = new C419980GdQ(context, null, 0);
                    if (z) {
                        c419980GdQ.setFont(62);
                    } else {
                        c419980GdQ.setFont(72);
                    }
                    C430750Gun c430750Gun = new C430750Gun(c419980GdQ);
                    SpannableString spannableString = new SpannableString("T");
                    C786410Ut5.p2(spannableString, c430750Gun, spannableString.length() - 1, spannableString.length(), 17);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    return;
                }
                return;
            }
            MatchedPGCSoundInfo matchedPGCSoundInfo = music.getMatchedPGCSoundInfo();
            if (matchedPGCSoundInfo == null || (musicReleaseInfo = matchedPGCSoundInfo.getMusicReleaseInfo()) == null || !musicReleaseInfo.isNewReleaseSong()) {
                return;
            }
            C419980GdQ c419980GdQ2 = new C419980GdQ(context, null, 0);
            if (z) {
                c419980GdQ2.setFont(62);
            } else {
                c419980GdQ2.setFont(72);
            }
            C430750Gun c430750Gun2 = new C430750Gun(c419980GdQ2);
            SpannableString spannableString2 = new SpannableString("T");
            C786410Ut5.p2(spannableString2, c430750Gun2, spannableString2.length() - 1, spannableString2.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
    }
}
