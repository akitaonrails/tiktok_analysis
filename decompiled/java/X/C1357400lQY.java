package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lQY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1357400lQY {
    public static final C1357400lQY LIZ = new C1357400lQY();

    public static boolean LIZIZ(AnchorCommonStruct anchorCommonStruct) {
        Object c098200Yq;
        String logExtra = anchorCommonStruct.getLogExtra();
        boolean z = false;
        if (logExtra == null) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(logExtra);
            String strOptString = jSONObject.optString("outreach_key", "");
            String strOptString2 = jSONObject.optString("outreach_content", "");
            if (strOptString.length() > 0 && strOptString2.length() > 0) {
                z = true;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static Map LIZ(AnchorCommonStruct anchorCommonStruct, String str, boolean z) {
        boolean z2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String logExtra = anchorCommonStruct.getLogExtra();
        if (logExtra != null && logExtra.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            try {
                JSONObject jSONObject = new JSONObject(logExtra);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object objOpt = jSONObject.opt(next);
                    if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                        c2344009Gk.LJFF(next, objOpt.toString());
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJFF("enter_from", str);
        if (z) {
            c2344009Gk.LJFF("outreach_click_method", "pre_click");
            c2344009Gk.LJFF("outreach_click_type", "click_outreach");
        }
        return c2344009Gk.LIZ;
    }
}
