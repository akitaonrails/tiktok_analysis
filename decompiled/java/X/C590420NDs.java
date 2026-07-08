package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localcache.database.HistoryVideoInfoStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0NDs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590420NDs {
    public static final C590420NDs LIZ = new C590420NDs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C590430NDt());

    public static Keva LJI() {
        return (Keva) LIZIZ.getValue();
    }

    public static String LIZ() {
        return LJI().getString("aid_and_filekey_mapping_unconsumer", "");
    }

    public static String LIZIZ() {
        String string = LJI().getString("aid_and_gid_mapping_string", "");
        return string != null ? string : "";
    }

    public static long LIZJ() {
        return LJI().getLong("feed_video_cache_time", 0L);
    }

    public static String LIZLLL() {
        String string = LJI().getString("db_bundle_uid_index", "");
        return string != null ? string : "";
    }

    public static String LJ() {
        String string;
        Keva kevaLJI = LJI();
        return (kevaLJI == null || (string = kevaLJI.getString("history_speed_KBps", "")) == null) ? "" : string;
    }

    public static String LJFF() {
        String string = LJI().getString("incomplete_video_group_db", "");
        return string != null ? string : "";
    }

    public static int LJII() {
        return LJI().getInt("key_no_cache_reason", 0);
    }

    public static String LJIIIIZZ() {
        String string = LJI().getString("key_video_group_the_keep_brand_safety", "");
        return string != null ? string : "";
    }

    public static int LJIIIZ() {
        Keva kevaLJI = LJI();
        if (kevaLJI != null) {
            return kevaLJI.getInt("using_db_simplify_old", 0);
        }
        return 0;
    }

    public static String LJIIJ() {
        String string = LJI().getString("feed_video_group_key", "");
        return string != null ? string : "";
    }

    public static String LJIIJJI() {
        return LJI().getString("key_video_group_brand_safety", "");
    }

    public static String LJIIL() {
        return LJI().getString("key_video_group_ctg", "");
    }

    public static String LJIILIIL() {
        return LJI().getString("key_video_group_db", "");
    }

    public static String LJIILJJIL() {
        return LJI().getString("feed_video_group_rec_db", "");
    }

    public static List LJIILL() {
        Object c098200Yq;
        String[] stringArray = LJI().getStringArray("key_history_video_info", new String[0]);
        if (stringArray == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : stringArray) {
            C1227904rF.LIZ.getClass();
            try {
                c098200Yq = (HistoryVideoInfoStruct) C1227904rF.LJ().LJII(str, HistoryVideoInfoStruct.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            if (c098200Yq != null) {
                arrayList.add(c098200Yq);
            }
        }
        return arrayList;
    }

    public static void LJIILLIIL(int i) {
        LJI().storeInt("key_no_cache_reason", i);
    }

    public static void LJIIZILJ(String str) {
        LJI().storeString("feed_video_group_key", str);
    }

    public static void LJIJ(String str) {
        LJI().storeString("key_video_group_db", str);
    }

    public static void LJIJI(String str) {
        LJI().storeString("feed_video_group_rec_db", str);
    }
}
