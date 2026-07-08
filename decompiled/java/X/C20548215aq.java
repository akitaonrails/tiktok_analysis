package X;

import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.ab.StrategyGroup;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.15aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20548215aq {
    public static final C20548215aq LIZ = new C20548215aq();

    public static void LIZ(String str) {
        if (str != null) {
            try {
                if (!a0.LJJJIL(str) && C1550600qSA.LIZ(C1553670qX7.LIZ(), str)) {
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
        String strLIZ = C1553670qX7.LIZ();
        C1537050q6J.LIZ.getClass();
        C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(strLIZ);
        if (c1551950qULLIZ != null) {
            c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(strLIZ, Collections.singletonList(new CheckRequestBodyModel.TargetChannel(str)))), optionCheckUpdateParams);
        }
    }

    public static void LIZIZ(Map map) {
        List<String> list;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                String str = (String) entry.getValue();
                StrategyGroup strategyGroupLIZ = C1784290wX5.LIZ();
                if (strategyGroupLIZ != null && (list = strategyGroupLIZ.cardTypes) != null && list.contains(key)) {
                    LIZ.getClass();
                    LIZ(str);
                }
            }
        }
    }
}
