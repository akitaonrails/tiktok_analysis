package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import java.util.Set;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0NHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591440NHq {
    public static final void LIZ(Aweme aweme) {
        C590760NFa c590760NFaLIZ;
        LoadMorePerfComponent.LLJILLL.LIZIZ(new AwS553S0100000_9(aweme, 1839));
        Set<String> set = C321101Mj.LIZ;
        String aid = aweme.getAid();
        if (aid != null && aid.length() != 0) {
            Set<String> set2 = C321101Mj.LIZ;
            synchronized (set2) {
                try {
                    set2.remove(aid);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0NHH c0nhh = (C0NHH) C0OBE.LIZ(aweme, "common_cache_item");
        if (c0nhh != null && (c590760NFaLIZ = C0NEM.LIZ.LIZ(C0NEN.REACH_BOTTOM, c0nhh.LIZ)) != null) {
            c590760NFaLIZ.LJII(c0nhh);
        }
    }
}
