package X;

import Y.ARunnableS16S1100000_11;
import Y.ARunnableS90S0000000_11;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710360Rti {
    public static boolean LIZ;
    public static final List<String> LIZIZ;
    public static final String[] LIZJ;
    public static final String[] LIZLLL;

    static {
        ArrayList arrayList = new ArrayList();
        LIZIZ = arrayList;
        LIZJ = new String[]{"common_feed_layout_video_desc", "common_feed_layout_translation_controls", "common_feed_layout_translation_status", "layout_video_multi_tag", "common_feed_layout_video_digg", "common_feed_view_video_progress_bar", "common_feed_layout_video_comment_count", "common_feed_layout_video_share", "common_feed_tns_common_layout", "common_feed_layout_feed_avatar", "common_feed_view_video_caution", "common_feed_layout_video_title_music", "common_feed_layout_video_cover_music", "profile_fragment_user_mt", "profile_fragment_aweme_list_mus"};
        LIZLLL = new String[]{"common_feed_item_feed"};
        if (((Boolean) C303460Buy.LIZIZ.getValue()).booleanValue()) {
            arrayList.add("homepage_common_fragment_main_page_opt");
        } else {
            arrayList.add("homepage_common_fragment_main_page");
        }
        if (C303460Buy.LIZJ()) {
            arrayList.add("homepage_common_fragment_main_opt");
        } else {
            arrayList.add("homepage_common_fragment_main");
        }
        if (!((Boolean) C1251404v2.LIZJ.getValue()).booleanValue()) {
            if (C303460Buy.LIZ()) {
                arrayList.add("homepage_common_view_main_tab_item_follow_opt");
            } else {
                arrayList.add("homepage_common_view_main_tab_item_follow");
            }
        }
        if (C303460Buy.LIZIZ()) {
            arrayList.add("common_feed_fragment_feed_opt");
        } else {
            arrayList.add("common_feed_fragment_feed");
        }
    }

    public static synchronized void LIZJ(Context context) {
        Iterator it2 = ((ArrayList) LIZIZ).iterator();
        while (it2.hasNext()) {
            C20673215v0.LJII(context, (String) it2.next());
        }
    }

    public static void LIZ(C19EG c19eg, Fragment fragment) {
        Context contextLJIIL;
        C20673215v0.LJI(R.layout.cd3, c19eg);
        C21265018Js c21265018Js = C20673215v0.LIZ;
        if (c21265018Js != null && c21265018Js.LJ && c21265018Js.LJFF) {
            C21172617tM.LJFF.LIZIZ().execute(new ARunnableS90S0000000_11(0));
        }
        if (fragment != null) {
            contextLJIIL = SAFExtensionKt.LJIILIIL(fragment);
        } else {
            contextLJIIL = SAFExtensionKt.LJIIL(c19eg);
        }
        if (contextLJIIL == null) {
            contextLJIIL = c19eg;
        }
        int i = 0;
        if (C1514430pVp.LIZLLL().booleanValue()) {
            if (C104100aN.LIZ().isNewUser()) {
                C20673215v0.LJII(c19eg, "common_feed_swipe_up_strengthen_layout");
            }
            if (C104100aN.LIZ().LJIIL()) {
                ((ArrayList) LIZIZ).add("legacy_fragment_page_container");
                LIZJ(contextLJIIL);
            }
            LIZIZ(((Number) C1486210omJ.LJ.getValue()).intValue(), contextLJIIL);
            if (((Boolean) C1787106zF.LIZJ.getValue()).booleanValue()) {
                String[] strArr = LIZJ;
                int length = strArr.length;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    long j = ((long) i2) * 50;
                    C786410Ut5.LJLIIL(j, C2113808Pw.LIZIZ.LL, new ARunnableS16S1100000_11(c19eg, strArr[i], 3));
                    i++;
                    i2 = i3;
                }
            }
        } else if (LIZ) {
            if (((Boolean) C1782506yV.LIZ.getValue()).booleanValue()) {
                C722660SWi.LIZ = false;
            }
        } else {
            LIZJ(contextLJIIL);
            LIZIZ(((Number) C291900BcK.LIZ.getValue()).intValue(), contextLJIIL);
        }
        LIZ = true;
    }

    public static void LIZIZ(int i, Context context) {
        if (context == null) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            for (String str : LIZLLL) {
                if (!Intrinsics.LJFF(str, "common_feed_item_feed") || !((Boolean) C2184411AeN.LIZIZ.getValue()).booleanValue() || !C2184411AeN.LJIIJ.compareAndSet(false, true)) {
                    C20673215v0.LJII(context, str);
                }
            }
        }
    }

    public static synchronized void LIZLLL(C19EG c19eg, Fragment fragment) {
        LIZ(c19eg, fragment);
    }
}
