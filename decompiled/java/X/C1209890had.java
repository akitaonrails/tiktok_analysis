package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0had, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209890had {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String str) {
        if (!TextUtils.equals("from_nearby", str) && !TextUtils.equals("from_search", str) && !TextUtils.equals("from_search_similar_aweme", str) && !C1209170hZT.LIZIZ(str)) {
            return false;
        }
        return true;
    }

    public static void LIZIZ(Aweme aweme, String str, int i, String str2, long j, int i2, C2189821An6 c2189821An6) {
        String searchType;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        c1er1.B0(aweme, str2);
        C737030Svd c737030Svd = new C737030Svd(66, c1er1.LLLII(aweme, AFwS257S0000000_19.get$arr$(779)));
        c737030Svd.LIZLLL = str;
        c737030Svd.LJI = i;
        c737030Svd.LJIIIIZZ = C1483410ohn.LJLJJI().getCurrentPosition();
        c737030Svd.LJIIIZ = C1483410ohn.LJLJJI().isPlaying();
        c737030Svd.LJ = str2;
        c737030Svd.LJFF = j;
        C1483410ohn.LJLJJI().LJIILL().LJIIIZ().LJJIJIL();
        c737030Svd.LJII = i2;
        Bundle bundle = new Bundle();
        if (c2189821An6 != null) {
            searchType = c2189821An6.getSearchType();
        } else {
            searchType = null;
        }
        C786410Ut5.LJJJI("key_search_type", searchType, bundle);
        if (c1er1.LJJII().LJFF(aweme)) {
            bundle.putBoolean("exit_from_rs", true);
        }
        c737030Svd.LIZJ = bundle;
        C1440005kM.LIZ(c737030Svd);
    }

    public static void LIZJ(Aweme aweme, String str, int i, String str2, long j, int i2, C2189821An6 c2189821An6) {
        String searchType;
        if (aweme == null) {
            return;
        }
        if (LIZ(str) || TextUtils.equals("from_search_jedi", str) || TextUtils.equals("potential_friends", str) || TextUtils.equals("from_no_request", str) || TextUtils.equals("from_commerce_seed", str) || TextUtils.equals("from_commerce_bill_share", str) || TextUtils.equals("from_anchor_video", str) || TextUtils.equals("from_profile_self", str) || TextUtils.equals("from_profile_other", str) || TextUtils.equals("from_commerce_banner", str) || TextUtils.equals("from_visual_search_result", str) || TextUtils.equals("from_familiar_tab", str) || TextUtils.equals("from_channel", str) || TextUtils.equals("from_search_commodity", str) || TextUtils.equals("from_mix_detail", str) || TextUtils.equals("from_trending_inflow", str) || TextUtils.equals("from_search_live", str) || TextUtils.equals("from_follow_often_watch", str) || TextUtils.equals("from_search_continuous_loading_card", str)) {
            C737030Svd c737030Svd = new C737030Svd(21, aweme);
            c737030Svd.LIZLLL = str;
            c737030Svd.LJI = i;
            if (C1209170hZT.LIZIZ(str)) {
                c737030Svd.LJIIIIZZ = C1483410ohn.LJLJJI().getCurrentPosition();
                c737030Svd.LJIIIZ = C1483410ohn.LJLJJI().isPlaying();
                c737030Svd.LJ = str2;
            }
            c737030Svd.LJFF = j;
            c737030Svd.LJII = i2;
            Bundle bundle = new Bundle();
            if (c2189821An6 != null) {
                searchType = c2189821An6.getSearchType();
            } else {
                searchType = null;
            }
            C786410Ut5.LJJJI("key_search_type", searchType, bundle);
            c737030Svd.LIZJ = bundle;
            C1440005kM.LIZ(c737030Svd);
        }
    }
}
