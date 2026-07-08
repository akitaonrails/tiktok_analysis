package X;

import android.content.Context;
import android.os.Environment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import java.io.File;
import java.io.StringReader;
import java.util.Arrays;

/* JADX INFO: renamed from: X.09Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2349909Ir {
    public static final C2349909Ir LIZ = new C2349909Ir();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2350009Is());

    public static String LIZ() throws Throwable {
        File fileY2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context context = C2354709Kn.LIZ;
        if (Environment.isExternalStorageEmulated() || (fileY2 = C786410Ut5.y2(context, null)) == null) {
            fileY2 = C2354709Kn.LIZ(context);
        } else {
            C2354709Kn.LJI(fileY2);
        }
        sbLIZ.append(fileY2.getPath());
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("following_cache");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(str);
        sbLIZ2.append(C786410Ut5.j4("feed_cache_%s", Arrays.copyOf(new Object[]{((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId()}, 1)));
        return new C0VSJ(C2188811AlT.LIZIZ(sbLIZ2)).getAbsolutePath();
    }

    public static FollowFeedList LIZIZ() {
        try {
            C09CU c09cu = new C09CU(new StringReader(C2354709Kn.LJIJ(LIZ())));
            c09cu.LLILLJJLI = true;
            LIZ.getClass();
            return (FollowFeedList) ((Gson) LIZIZ.getValue()).LJ(c09cu, FollowFeedList.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl == null) {
                return null;
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFeedCacheFromFile error: ");
            sbLIZ.append(thM5exceptionOrNullimpl);
            C1720106oR.LIZ("FollowingFileStorage", C2188811AlT.LIZIZ(sbLIZ));
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            C2252408s6.LIZ(new C020P("read", message, 2));
            return null;
        }
    }

    public static void LIZJ(FollowFeedList followFeedList) throws Throwable {
        Object c098200Yq;
        String strLIZ = LIZ();
        try {
            LIZ.getClass();
            String strLJIILL = ((Gson) LIZIZ.getValue()).LJIILL(followFeedList);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("putFeedCacheToFile jsonString: ");
            sbLIZ.append(strLJIILL);
            C2188811AlT.LIZIZ(sbLIZ);
            c098200Yq = Boolean.valueOf(C2354709Kn.LJJ(strLIZ, strLJIILL));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("putFeedCacheToFile error: ");
            sbLIZ2.append(thM5exceptionOrNullimpl);
            C1720106oR.LIZ("FollowingFileStorage", C2188811AlT.LIZIZ(sbLIZ2));
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            C2252408s6.LIZ(new C020P("write", message, 2));
        }
    }

    public final void LIZLLL(FollowFeedList followFeedList) {
        synchronized (this) {
            LIZJ(followFeedList);
        }
    }
}
