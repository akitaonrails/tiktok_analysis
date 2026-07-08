package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS376S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import u4.q0;

/* JADX INFO: renamed from: X.0Pzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663180Pzo {
    public static boolean LIZJ;
    public static final C663180Pzo LIZ = new C663180Pzo();
    public static final HashMap<Integer, String> LIZIZ = new HashMap<>();
    public static final Map<String, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("singular", C20642515q3.LIZLLL(2131755054, 1)), new Pair("plural", C20642515q3.LIZLLL(2131755054, 2)));

    public static final boolean LJI() {
        AccessibilityManager accessibilityManager;
        LIZ.getClass();
        C844470XAv.LIZ.getClass();
        Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "accessibility");
        return (objH2 instanceof AccessibilityManager) && (accessibilityManager = (AccessibilityManager) objH2) != null && accessibilityManager.isTouchExplorationEnabled();
    }

    public static void LIZ(C1012300cRw c1012300cRw) {
        if (c1012300cRw == null) {
            return;
        }
        LIZIZ(c1012300cRw, new AwS554S0100000_10(c1012300cRw, 1322));
    }

    public static String LIZLLL(int i) {
        HashMap<Integer, String> map = LIZIZ;
        Integer numValueOf = Integer.valueOf(i);
        String strLJI = map.get(numValueOf);
        if (strLJI == null) {
            strLJI = C20642515q3.LJI(i);
            map.put(numValueOf, strLJI);
        }
        return strLJI;
    }

    public static void LJIIIIZZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("video_id", str);
        C20684815ws.LJIILLIIL("view_video_unmute_button", c2344009Gk.LIZ);
    }

    public static void LIZIZ(View view, Function0 function0) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        int i = C20094413jq.LJIIZILJ;
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LIZIZ = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZJ = null;
        c1397760mTe.LJIIIZ = new AwS376S0200000_10(context, function0, 155);
        q0.LJIJ(view, c1397760mTe.LIZ());
    }

    public static CharSequence LIZJ(Aweme aweme, boolean z) {
        String nickname;
        VideoTag videoTag;
        String title;
        String str;
        User author;
        String roomTitle;
        String strLIZLLL;
        ArrayList arrayList = new ArrayList();
        User author2 = aweme.getAuthor();
        if (C10EU.LJIJ(author2)) {
            nickname = author2.getUniqueId();
        } else {
            nickname = author2.getNickname();
        }
        if (nickname != null && nickname.length() != 0) {
            if (z) {
                strLIZLLL = LIZLLL(2131823319);
            } else {
                strLIZLLL = LIZLLL(2131823320);
            }
            arrayList.add(C786410Ut5.j4(strLIZLLL, Arrays.copyOf(new Object[]{nickname}, 1)));
        }
        String desc = aweme.getDesc();
        if (desc != null && desc.length() != 0) {
            arrayList.add(desc);
        }
        if (z && (author = aweme.getAuthor()) != null && (roomTitle = author.getRoomTitle()) != null && roomTitle.length() != 0) {
            arrayList.add(roomTitle);
        }
        if (!C666750QDh.LIZ()) {
            AwemeStatistics statistics = aweme.getStatistics();
            if (statistics != null) {
                long diggCount = statistics.getDiggCount();
                String string = C820940WIi.LIZ(diggCount).toString();
                int i = (int) diggCount;
                LIZ.getClass();
                if (i <= 1) {
                    str = LIZLLL.get("singular");
                } else {
                    str = LIZLLL.get("plural");
                }
                if (str == null) {
                    str = "";
                }
                arrayList.add(C786410Ut5.j4(str, Arrays.copyOf(new Object[]{string}, 1)));
            }
            if (z) {
                String strLIZ = C656400Pos.LIZ(aweme);
                if (strLIZ.length() > 0) {
                    arrayList.add(C786410Ut5.j4(LIZLLL(2131823321), Arrays.copyOf(new Object[]{strLIZ}, 1)));
                }
            }
        }
        Video video = aweme.getVideo();
        if (video != null && (videoTag = video.getVideoTag()) != null && (title = videoTag.getTitle()) != null && title.length() != 0) {
            arrayList.add(title);
        }
        return C13LP.LJJLIIIJ(arrayList, ", ", "", null, 0, null, null, 60);
    }

    public static void LJII(int i, String str) {
        String str2;
        if (LJI() && C301290BrT.LIZ()) {
            if (i == 0) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("status_to", str2);
            c2344009Gk.LJIIIIZZ("video_id", str);
            C20684815ws.LJIILLIIL("tap_video_unmute_button", c2344009Gk.LIZ);
        }
    }

    public static void LJ(View view, Aweme aweme, C661470Px3 c661470Px3, Function0 function0) {
        if (aweme == null) {
            return;
        }
        CharSequence charSequenceLIZJ = LIZJ(aweme, false);
        if (view != null) {
            q0.LJIJ(view, new C663190Pzp(charSequenceLIZJ, c661470Px3, null, function0));
        }
    }

    public static void LJFF(C658530PsJ c658530PsJ, Aweme aweme, C663070Pzd c663070Pzd, Function0 function0) {
        if (aweme == null) {
            return;
        }
        CharSequence charSequenceLIZJ = LIZJ(aweme, true);
        if (c658530PsJ != null) {
            q0.LJIJ(c658530PsJ, new C663190Pzp(charSequenceLIZJ, null, c663070Pzd, function0));
        }
    }
}
