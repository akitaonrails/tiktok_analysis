package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Srd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734550Srd extends C734560Sre<C737390SwD, InterfaceC734510SrZ> {
    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onSuccess() {
        C0WIY<String, Integer> c0wiy;
        T t = this.LL;
        if (t == 0) {
            c0wiy = null;
        } else {
            c0wiy = (C0WIY) t.getData();
            if (c0wiy != null) {
                ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).yr(c0wiy.LIZIZ.intValue(), c0wiy.LIZ);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, c0wiy.LIZIZ);
                    jSONObject.put("awemeId", c0wiy.LIZ);
                    C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(jSONObject), "likeStatusChange"));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw new RuntimeException(e);
                }
            }
        }
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC734510SrZ) k).oP1(c0wiy);
        }
    }

    @Override // X.C1260870iur, X.InterfaceC1526205yG
    public final void onFailed(Exception exc) {
        K k = this.LLILLJJLI;
        if (k != 0) {
            ((InterfaceC734510SrZ) k).KE(exc);
        }
    }
}
