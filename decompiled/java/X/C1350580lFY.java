package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0lFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350580lFY {
    public static final C1350580lFY LIZ = new C1350580lFY();

    public static HashMap LIZ(Aweme aweme) {
        String str;
        CommentTopBarComponent commentTopBarComponentLIZJ = LIZJ(aweme);
        if (commentTopBarComponentLIZJ != null) {
            str = commentTopBarComponentLIZJ.tracerInfo;
        } else {
            str = null;
        }
        return LIZIZ(str);
    }

    public static HashMap LIZIZ(String str) {
        boolean z;
        Object obj;
        String string;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        Object obj2 = null;
        if (z) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap(jSONObject.length());
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = jSONObject.opt(next);
                if (objOpt == null || (string = objOpt.toString()) == null) {
                    string = "";
                }
                map.put(next, string);
            }
            C189200o6.m2constructorimpl(map);
            obj = map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        if (!C189200o6.m7isFailureimpl(obj)) {
            obj2 = obj;
        }
        return (HashMap) obj2;
    }

    public static CommentTopBarComponent LIZJ(Aweme aweme) {
        C1350470lFN c1350470lFN = C1350470lFN.LIZ;
        Integer numValueOf = Integer.valueOf(EnumC1350510lFR.UG_DRAMA.getValue());
        c1350470lFN.getClass();
        return C1350470lFN.LJIIIZ(aweme, numValueOf, true);
    }
}
