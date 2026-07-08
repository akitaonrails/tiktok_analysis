package X;

import com.ss.android.ugc.aweme.comment.experiment.ExposedCommentConfig;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mDh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387870mDh {
    public static final C1387870mDh LIZ = new C1387870mDh();
    public static final ConcurrentHashMap<String, C1387890mDj> LIZIZ = new ConcurrentHashMap<>(100);
    public static final ConcurrentLinkedQueue<String> LIZJ = new ConcurrentLinkedQueue<>();

    public static boolean LIZIZ() {
        C1387860mDg.LIZ.getClass();
        if (C1387860mDg.LIZIZ().getBoolean(C1387860mDg.LIZ("is_permanently_exit"), false)) {
            return false;
        }
        int i = C1387860mDg.LIZIZ().getInt(C1387860mDg.LIZ("unclick_count"), 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = C1387860mDg.LIZIZ().getLong(C1387860mDg.LIZ("last_exit_time_stamp"), -1L);
        if (j != -1) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            C1387910mDl.LIZ.getClass();
            if (jCurrentTimeMillis2 <= ((ExposedCommentConfig) C1387910mDl.LIZJ.getValue()).exitDays * 86400000) {
                return false;
            }
        }
        C1387910mDl.LIZ.getClass();
        C01GW c01gw = C1387910mDl.LIZJ;
        if (i < ((ExposedCommentConfig) c01gw.getValue()).noClickExitLimit) {
            return true;
        }
        int i2 = C1387860mDg.LIZIZ().getInt(C1387860mDg.LIZ("exit_count"), 0) + 1;
        if (i2 >= ((ExposedCommentConfig) c01gw.getValue()).maxExitTimes) {
            C1387860mDg.LIZIZ().storeBoolean(C1387860mDg.LIZ("is_permanently_exit"), true);
            return false;
        }
        C1387860mDg.LIZIZ().storeLong(C1387860mDg.LIZ("last_exit_time_stamp"), jCurrentTimeMillis);
        C1387860mDg.LIZIZ().storeInt(C1387860mDg.LIZ("exit_count"), i2);
        C1387860mDg.LIZIZ().storeInt(C1387860mDg.LIZ("unclick_count"), 0);
        return false;
    }

    public static String LIZ(String str) {
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        C1387890mDj c1387890mDj = LIZIZ.get(LIZ(str));
        if (c1387890mDj == null) {
            return false;
        }
        return c1387890mDj.LIZIZ;
    }

    public static boolean LIZLLL(String str) {
        if (str == null) {
            return false;
        }
        C1387890mDj c1387890mDj = LIZIZ.get(LIZ(str));
        if (c1387890mDj == null) {
            return false;
        }
        return c1387890mDj.LIZ;
    }

    public static Pair LJ(Comment comment) {
        Integer hotCommentShowType = comment.getHotCommentShowType();
        int value = EnumC1387880mDi.DIGG.getValue();
        if (hotCommentShowType != null && hotCommentShowType.intValue() == value) {
            return new Pair("like", Long.valueOf(comment.getDiggCount()));
        }
        int value2 = EnumC1387880mDi.REPLY.getValue();
        if (hotCommentShowType != null && hotCommentShowType.intValue() == value2) {
            return new Pair("reply", Long.valueOf(comment.getReplyCommentTotal()));
        }
        return new Pair(null, null);
    }

    public static boolean LJFF(String str) {
        if (str == null) {
            return false;
        }
        C1387890mDj c1387890mDj = LIZIZ.get(LIZ(str));
        if (c1387890mDj == null) {
            return false;
        }
        return c1387890mDj.LIZJ;
    }

    public static void LJI(String str) {
        String strPoll;
        LIZJ.add(str);
        while (true) {
            ConcurrentHashMap<String, C1387890mDj> concurrentHashMap = LIZIZ;
            if (concurrentHashMap.size() > 100 && (strPoll = LIZJ.poll()) != null) {
                concurrentHashMap.remove(strPoll);
            } else {
                return;
            }
        }
    }

    public static void LJII(String str) {
        if (str == null) {
            return;
        }
        String strLIZ = LIZ(str);
        ConcurrentHashMap<String, C1387890mDj> concurrentHashMap = LIZIZ;
        C1387890mDj c1387890mDj = concurrentHashMap.get(strLIZ);
        if (c1387890mDj != null) {
            c1387890mDj.LIZJ = true;
        } else {
            concurrentHashMap.put(strLIZ, new C1387890mDj(false, false, true, null, null, 27));
            LJI(strLIZ);
        }
    }
}
