package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.christmas.FestivalEntity;

/* JADX INFO: renamed from: X.0We2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C828040We2 {
    public static int LIZ = 1;
    public static volatile FestivalEntity LIZIZ;

    public static FestivalEntity LIZ() {
        if (LIZIZ != null) {
            return LIZIZ;
        }
        String strLIZ = C746350TPl.LIZ.LJ().LIZ();
        if (TextUtils.isEmpty(strLIZ)) {
            return null;
        }
        try {
            LIZIZ = (FestivalEntity) new Gson().LJII(strLIZ, FestivalEntity.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZIZ = null;
        }
        return LIZIZ;
    }

    public static boolean LIZIZ() {
        return LIZ() != null && LIZ().inActivity;
    }
}
