package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dtj.u7;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0seM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635040seM implements IFetchCategoryEffectListener {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final IFetchCategoryEffectListener LIZLLL;
    public final C138P LJ = C138P.LIZ();
    public Map<String, ? extends Object> LJFF;

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        String msg;
        int iIntValue;
        Integer num;
        if (exceptionResult == null) {
            errorCode = -2;
            msg = "unknown error";
        } else {
            errorCode = exceptionResult.getErrorCode();
            msg = exceptionResult.getMsg();
        }
        if (u7.LJ() || u7.LIZLLL()) {
            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(errorCode));
            c543670LTx.LIZ.put("errorDesc", msg);
            c543670LTx.LIZ.put("count", Integer.valueOf(this.LIZIZ));
            c543670LTx.LIZ.put("cursor", Integer.valueOf(this.LIZJ));
            c543670LTx.LIZ.put("panel", this.LIZ);
            Map<String, ? extends Object> map = this.LJFF;
            Object obj = null;
            if (map != null) {
                obj = map.get("is_story");
            }
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c543670LTx.LIZ.put("is_story", Integer.valueOf(iIntValue));
            interfaceC1637880siwLIZJ.LJIIJJI(1, "sticker_list_error_rate", c543670LTx.LJ());
        }
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.LIZLLL;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(CategoryPageModel categoryPageModel) {
        Object obj;
        int iIntValue;
        long jLIZIZ = this.LJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchCategoryEffectListener iFetchCategoryEffectListener = this.LIZLLL;
        if (iFetchCategoryEffectListener != null) {
            iFetchCategoryEffectListener.onSuccess(categoryPageModel);
        }
        if (u7.LJ() || u7.LIZLLL()) {
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("duration", Long.valueOf(jLIZIZ));
            c543670LTx.LIZ.put("abParam", 2);
            c543670LTx.LIZ.put("count", Integer.valueOf(this.LIZIZ));
            c543670LTx.LIZ.put("cursor", Integer.valueOf(this.LIZJ));
            c543670LTx.LIZ.put("panel", this.LIZ);
            Map<String, ? extends Object> map = this.LJFF;
            Integer num = null;
            if (map != null) {
                obj = map.get("is_story");
            } else {
                obj = null;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c543670LTx.LIZ.put("is_story", Integer.valueOf(iIntValue));
            C0CHQ.LIZ().LIZJ().LJIIJJI(0, "sticker_list_error_rate", c543670LTx.LJ());
        }
    }

    public C1635040seM(String str, int i, int i2, C1635020seK c1635020seK) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = c1635020seK;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0seK] */
    public static final C1635040seM LIZ(final String str, int i, int i2, final IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        return new C1635040seM(str, i, i2, new IFetchCategoryEffectListener(str, iFetchCategoryEffectListener) { // from class: X.0seK
            public final String LIZ;
            public final IFetchCategoryEffectListener LIZIZ;
            public final C138P LIZJ = C138P.LIZ();

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener
            public final void onFail(ExceptionResult exceptionResult) {
                String msg;
                Integer numValueOf;
                long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
                IFetchCategoryEffectListener iFetchCategoryEffectListener2 = this.LIZIZ;
                if (iFetchCategoryEffectListener2 != null) {
                    iFetchCategoryEffectListener2.onFail(exceptionResult);
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
                if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                    msg = "empty_error_msg";
                }
                c0lab.LJ("error_msg", msg);
                if (exceptionResult != null) {
                    numValueOf = Integer.valueOf(exceptionResult.getErrorCode());
                } else {
                    numValueOf = null;
                }
                c0lab.LIZLLL(numValueOf, "error_code");
                c0lab.LIZ(0, "count");
                C2341909Fp.LIZ("tool_performance_api", c0lab.LIZ);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(CategoryPageModel categoryPageModel) {
                CategoryEffectModel category_effects;
                List<Effect> category_effects2;
                CategoryPageModel categoryPageModel2 = categoryPageModel;
                long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
                IFetchCategoryEffectListener iFetchCategoryEffectListener2 = this.LIZIZ;
                if (iFetchCategoryEffectListener2 != null) {
                    iFetchCategoryEffectListener2.onSuccess(categoryPageModel2);
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
                if (categoryPageModel2 != null && (category_effects = categoryPageModel2.getCategory_effects()) != null && (category_effects2 = category_effects.getCategory_effects()) != null) {
                    size = category_effects2.size();
                }
                c0lab.LIZ(size, "count");
                C2341909Fp.LIZ("tool_performance_api", c0lab.LIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = iFetchCategoryEffectListener;
            }
        });
    }
}
