package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zaB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901530zaB implements InterfaceC427710Gpt {
    public static final C1901530zaB LL;
    public static List<Map<String, String>> LLILLJJLI;
    public static final ConcurrentHashMap<String, String> LLILLL;
    public static String LLILZ;
    public static final List<String> LLILZIL;
    public static final String[] LLILZLL;
    public static final C01GW LLIZ;

    public final synchronized String LIZJ() {
        List<Map<String, String>> list = LLILLJJLI;
        if (list != null) {
            return JsonParseUtils.LJ(list);
        }
        List<Map<String, String>> listLIZIZ = LIZIZ();
        LLILZ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        LLILLJJLI = listLIZIZ;
        return JsonParseUtils.LJ(listLIZIZ);
    }

    static {
        C1901530zaB c1901530zaB = new C1901530zaB();
        LL = c1901530zaB;
        C0XQ7.LJFF().LJJIFFI(c1901530zaB);
        LLILLL = new ConcurrentHashMap<>();
        LLILZIL = C1697810uHb.LJIILJJIL("nickname_instead_of_username", "activity_flush_strategy", "activity_sort_strategy", "inbox_activity_load_optimize_strategy", "use_rec_notice_follow_page", "creator_inbox_experiment", "enable_tako_entrance", "tiktok_ai_creator_assistant_entrance", "inbox_style_opt", "inbox_creator_notification_entrance_style", "enable_inbox_activity_classification", "enable_activity_priority", "enable_follow_page_priority", "alias_consumption_switch");
        LLILZLL = new String[0];
        LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(540));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZIZ() {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1901530zaB.LIZIZ():java.util.List");
    }

    public static String LIZLLL() {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        ConcurrentHashMap<String, String> concurrentHashMap = LLILLL;
        String str = concurrentHashMap.get(curUserId == null ? "" : curUserId);
        if (str != null) {
            return str;
        }
        String strLJ = JsonParseUtils.LJ(LIZIZ());
        LLILZ = curUserId == null ? "" : curUserId;
        if (curUserId == null) {
            curUserId = "";
        }
        concurrentHashMap.put(curUserId, strLJ);
        return strLJ;
    }

    public static Map LIZ(String str, String str2) {
        return C2097608Jq.LJIIIIZZ(new Pair("key", str), new Pair("value", str2));
    }

    @Override // X.InterfaceC427710Gpt
    public final void LLLLLLZZ(int i, User user, User user2) {
        if (user2 != null && !Intrinsics.LJFF(LLILZ, user2.getUid())) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("SystemNotificationExperimentListHelper", "User onChanged: resetAbCache");
            LLILZ = user2.getUid();
            if (C286610BLf.LIZ()) {
                LL.getClass();
                LLILLL.clear();
            } else {
                synchronized (LL) {
                    LLILLJJLI = null;
                }
            }
        }
    }
}
