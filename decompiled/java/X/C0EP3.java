package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;

/* JADX INFO: renamed from: X.0EP3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EP3 {
    public static AIGCInfo LIZ(String str) {
        if (str == null) {
            return null;
        }
        try {
            return (AIGCInfo) new Gson().LJII(str, AIGCInfo.class);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
