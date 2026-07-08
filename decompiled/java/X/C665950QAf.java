package X;

import X.C665950QAf;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QAf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C665950QAf<T extends C665950QAf<T>> extends C0Q78<T> {
    public static final C01GW<ExecutorService> LJIIZILJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(778));

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("searchTransferEnter", C093Y.LJ("enter_from", "from_group_id"));
        concurrentHashMap.put("search_music_notice", C093Y.LJ("search_id"));
        concurrentHashMap.put("search_result_click", C093Y.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a"));
        concurrentHashMap.put("search_result_show", C093Y.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a"));
        concurrentHashMap.put("music_play_time", C093Y.LJ("rank_a", "search_id_a", "impr_id_a", "enter_from_a", "search_keyword_a"));
        concurrentHashMap.put("search_result_show_video", C093Y.LJ("impr_id_a", "search_id_a"));
    }

    public C665950QAf(String str) {
        super(str);
    }
}
