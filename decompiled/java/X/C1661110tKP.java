package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IAVMobService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* JADX INFO: renamed from: X.0tKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661110tKP {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public long LIZLLL;

    public final void LIZ(int i, ExceptionResult exceptionResult) {
        Integer numValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        IAVMobService aVMobService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAVMobService();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("resource_type", "effect");
        c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
        c2344009Gk.LIZJ(i, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        String str = this.LIZIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("effect_id", str);
        String str3 = this.LIZJ;
        if (str3 != null) {
            str2 = str3;
        }
        c2344009Gk.LJIIIIZZ("music_id", str2);
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZ);
        if (i == 1) {
            String msg = null;
            if (exceptionResult != null) {
                numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
            } else {
                numValueOf = null;
            }
            c2344009Gk.LJ(numValueOf, "error_code");
            if (exceptionResult != null) {
                msg = exceptionResult.getMsg();
            }
            c2344009Gk.LJFF("error_msg", msg);
        }
        aVMobService.onEventV3("tool_performance_resource_download", c2344009Gk.LIZ);
        C305790Byj.LIZ(Long.valueOf(this.LIZLLL), Long.valueOf(jCurrentTimeMillis));
    }

    public C1661110tKP(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
