package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0l8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1346170l8R {
    public static C1346160l8Q LIZ;
    public static final LinkedList<String> LIZIZ = new LinkedList<>();
    public static final LinkedList<String> LIZJ = new LinkedList<>();
    public static final int LIZLLL = C0C64.LJIILLIIL().LJIJ(31744, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, "sort_with_session_cids_limit_count", true);

    public static String LIZ() {
        String str;
        try {
            str = new SimpleDateFormat("yyyyMMddHHmmss", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis()));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        C827070WcT.LIZ.getClass();
        sb.append(C827070WcT.LIZJ());
        sb.append(str);
        return sb.toString();
    }

    public static void LIZIZ(List list, boolean z) {
        LinkedList<String> linkedList;
        int size;
        int i = LIZLLL;
        if (i <= 0) {
            return;
        }
        if (z) {
            linkedList = LIZJ;
        } else {
            linkedList = LIZIZ;
        }
        linkedList.clear();
        if (list != null && (!list.isEmpty())) {
            if (list.size() < i) {
                size = 0;
            } else {
                size = list.size() - i;
            }
            int size2 = list.size() - 1;
            if (size > size2) {
                return;
            }
            while (true) {
                linkedList.add(((Comment) ListProtector.get(list, size2)).getCid());
                if (size2 != size) {
                    size2--;
                } else {
                    return;
                }
            }
        }
    }

    public static void LIZJ(String str, boolean z) {
        C1346160l8Q c1346160l8Q;
        if ((str == null || (c1346160l8Q = LIZ) == null || !c1346160l8Q.LIZ || !TextUtils.equals(c1346160l8Q.LIZJ, str)) && LIZLLL > 0) {
            LIZ = new C1346160l8Q(z, LIZ(), str);
            LIZIZ.clear();
            LIZJ.clear();
        } else {
            C1346160l8Q c1346160l8Q2 = LIZ;
            if (c1346160l8Q2 != null) {
                c1346160l8Q2.LIZ = false;
            }
        }
    }
}
