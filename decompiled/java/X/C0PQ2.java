package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.CommonLogParams;
import com.ss.android.ugc.aweme.model.ViewObjectWrapper;
import java.util.Map;

/* JADX INFO: renamed from: X.0PQ2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQ2 {
    public static final C0PQ2 LIZ = new C0PQ2();

    public static C0PLO LIZ(Aweme aweme) {
        C0PLQ c0plq;
        Object c098200Yq;
        CommonLogParams commonLogParams;
        Object obj = null;
        if (aweme == null) {
            return new C0PLO(C0PLQ.NONE, null, null);
        }
        String ecomAnchorViewObject = aweme.getEcomAnchorViewObject();
        if (ecomAnchorViewObject != null && C123100dR.LIZ(ecomAnchorViewObject)) {
            Integer ecomAnchorLiveStyle = aweme.getEcomAnchorLiveStyle();
            if (ecomAnchorLiveStyle != null && ecomAnchorLiveStyle.intValue() == 1) {
                c0plq = C0PLQ.CARD_BOTTOM;
            } else {
                c0plq = C0PLQ.PLAYER_INSIDE;
            }
            try {
                ViewObjectWrapper viewObjectWrapper = (ViewObjectWrapper) new Gson().LJII(ecomAnchorViewObject, ViewObjectWrapper.class);
                if (viewObjectWrapper != null && (commonLogParams = viewObjectWrapper.commonLogParams) != null) {
                    c098200Yq = commonLogParams.cardLog;
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return new C0PLO(c0plq, ecomAnchorViewObject, (Map) obj);
        }
        return new C0PLO(C0PLQ.NONE, null, null);
    }
}
