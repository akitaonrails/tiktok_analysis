package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0RO6, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RO6 {
    public final C0SR2 LIZ;
    public final Map<String, Aweme> LIZIZ = new LinkedHashMap();

    public C0RO6(C0SR2 c0sr2) {
        this.LIZ = c0sr2;
    }

    public final void LIZ(String str, boolean z, C2189821An6 c2189821An6, long j, String str2) {
        Aweme aweme = (Aweme) ((LinkedHashMap) this.LIZIZ).get(str);
        if (aweme != null && !z && j / ((long) LSPassThroughRecordSizeConfig.DEFAULT) >= ((Number) C0AW1.LIZ.getValue()).intValue()) {
            C0SR2 c0sr2 = this.LIZ;
            c0sr2.getClass();
            if (c2189821An6 != null) {
                C0SR2.LJI(aweme, "onPlayFinishFirstTime");
                try {
                    c0sr2.LJ(aweme, c2189821An6, str2).LJIILJJIL();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            this.LIZIZ.remove(str);
        }
    }
}
