package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import dtj.u7;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0seL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635030seL implements IFetchEffectChannelListener {
    public final String LIZ;
    public final IFetchEffectChannelListener LIZIZ;
    public final C138P LIZJ = C138P.LIZ();

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Integer numValueOf;
        String msg;
        long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZIZ;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onFail(exceptionResult);
        }
        if (u7.LIZ() && !u7.LIZLLL()) {
            return;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("api_type", C1634610sdf.LIZ(this.LIZ));
        c0lab.LIZIZ(jLIZIZ, "duration");
        c0lab.LIZ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(ListProtector.get(((IEffectPlatformFactory) ServiceManager.get().getService(IEffectPlatformFactory.class)).getHosts(), 0), "error_domain");
        if (exceptionResult != null) {
            numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
        } else {
            numValueOf = null;
        }
        c0lab.LIZLLL(numValueOf, "error_code");
        if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
            msg = "empty_error_msg";
        }
        c0lab.LJ("error_msg", msg);
        c0lab.LIZ(0, "count");
        C2341909Fp.LIZ("tool_performance_api", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(EffectChannelResponse effectChannelResponse) {
        List<Effect> all_category_effects;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchEffectChannelListener iFetchEffectChannelListener = this.LIZIZ;
        if (iFetchEffectChannelListener != null) {
            iFetchEffectChannelListener.onSuccess(effectChannelResponse2);
        }
        if (u7.LIZ() && !u7.LIZLLL()) {
            return;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("api_type", C1634610sdf.LIZ(this.LIZ));
        c0lab.LIZIZ(jLIZIZ, "duration");
        int size = 0;
        c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        if (effectChannelResponse2 != null && (all_category_effects = effectChannelResponse2.getAll_category_effects()) != null) {
            size = all_category_effects.size();
        }
        c0lab.LIZ(size, "count");
        C2341909Fp.LIZ("tool_performance_api", c0lab.LIZ);
    }

    public C1635030seL(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        this.LIZ = str;
        this.LIZIZ = iFetchEffectChannelListener;
    }
}
