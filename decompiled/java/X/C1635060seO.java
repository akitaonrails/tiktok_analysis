package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import dtj.u7;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0seO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635060seO implements IFetchPanelInfoListener {
    public final String LIZ;
    public final IFetchPanelInfoListener LIZIZ;
    public Map<String, ? extends Object> LIZLLL;
    public final C138P LIZJ = C138P.LIZ();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(99));

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
    public final void onFail(ExceptionResult exceptionResult) {
        int errorCode;
        Object obj;
        int iIntValue;
        Integer num;
        String str = "unknown error";
        if (exceptionResult == null) {
            errorCode = -2;
        } else {
            errorCode = exceptionResult.getErrorCode();
            String msg = exceptionResult.getMsg();
            if (msg != null) {
                str = msg;
            }
        }
        if (u7.LJ() || u7.LIZLLL()) {
            InterfaceC1637880siw interfaceC1637880siwLIZJ = C0CHQ.LIZ().LIZJ();
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put("errorCode", Integer.valueOf(errorCode));
            c543670LTx.LIZ.put("errorDesc", str);
            c543670LTx.LIZ.put("panel", this.LIZ);
            Map<String, ? extends Object> map = this.LIZLLL;
            if (map != null) {
                obj = map.get("is_story");
            } else {
                obj = null;
            }
            if ((obj instanceof Integer) && (num = (Integer) obj) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c543670LTx.LIZ.put("is_story", Integer.valueOf(iIntValue));
            interfaceC1637880siwLIZJ.LJIIJJI(1, "sticker_list_error_rate", c543670LTx.LJ());
        }
        if (u7.LJ()) {
            C543670LTx c543670LTx2 = new C543670LTx();
            c543670LTx2.LIZ.put("error_code", Integer.valueOf(errorCode));
            c543670LTx2.LIZ.put("error_msg", str);
            c543670LTx2.LIZ.put("panel_type", this.LIZ);
            JSONObject jSONObjectLJ = c543670LTx2.LJ();
            if (((Boolean) this.LJ.getValue()).booleanValue()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("tag", "ttlive_sdk");
                    if (jSONObjectLJ != null) {
                        jSONObject.put("extra", jSONObjectLJ);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_load_sticker_list_all", 1, null, jSONObject);
            }
            C0CHQ.LIZ().LIZJ().LJIIJJI(1, "ttlive_load_sticker_list_error", jSONObjectLJ);
        }
        IFetchPanelInfoListener iFetchPanelInfoListener = this.LIZIZ;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onFail(exceptionResult);
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final void onSuccess(PanelInfoModel panelInfoModel) {
        Object obj;
        int iIntValue;
        long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
        IFetchPanelInfoListener iFetchPanelInfoListener = this.LIZIZ;
        if (iFetchPanelInfoListener != null) {
            iFetchPanelInfoListener.onSuccess(panelInfoModel);
        }
        if (u7.LIZ() && !u7.LIZLLL()) {
            return;
        }
        C543670LTx c543670LTx = new C543670LTx();
        c543670LTx.LIZ.put("duration", Long.valueOf(jLIZIZ));
        c543670LTx.LIZ.put("abParam", 2);
        c543670LTx.LIZ.put("panel", this.LIZ);
        Map<String, ? extends Object> map = this.LIZLLL;
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
        JSONObject jSONObjectLJ = c543670LTx.LJ();
        if (u7.LJ() || u7.LIZLLL()) {
            C0CHQ.LIZ().LIZJ().LJIIJJI(0, "sticker_list_error_rate", jSONObjectLJ);
        }
        if (!u7.LJ() || !((Boolean) this.LJ.getValue()).booleanValue()) {
            return;
        }
        C543670LTx c543670LTx2 = new C543670LTx();
        c543670LTx2.LIZ.put("panel_type", this.LIZ);
        JSONObject jSONObjectLJ2 = c543670LTx2.LJ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", "ttlive_sdk");
            if (jSONObjectLJ2 != null) {
                jSONObject.put("extra", jSONObjectLJ2);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C0CHQ.LIZ().LIZJ().LJIIIZ("ttlive_load_sticker_list_all", 0, jSONObjectLJ, jSONObject);
    }

    public C1635060seO(String str, C1635000seI c1635000seI) {
        this.LIZ = str;
        this.LIZIZ = c1635000seI;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0seI] */
    public static final C1635060seO LIZ(final String str, final IFetchPanelInfoListener iFetchPanelInfoListener) {
        return new C1635060seO(str, new IFetchPanelInfoListener(str, iFetchPanelInfoListener) { // from class: X.0seI
            public final String LIZ;
            public final IFetchPanelInfoListener LIZIZ;
            public final C138P LIZJ = C138P.LIZ();

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener
            public final void onFail(ExceptionResult exceptionResult) {
                String strLIZ;
                Integer numValueOf;
                String msg;
                long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
                IFetchPanelInfoListener iFetchPanelInfoListener2 = this.LIZIZ;
                if (iFetchPanelInfoListener2 != null) {
                    iFetchPanelInfoListener2.onFail(exceptionResult);
                }
                if (u7.LIZ() && !u7.LIZLLL()) {
                    return;
                }
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                if (TextUtils.equals(this.LIZ, "default")) {
                    strLIZ = "effect_panel_info";
                } else {
                    strLIZ = C1634610sdf.LIZ(this.LIZ);
                }
                c0lab.LJ("api_type", strLIZ);
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
            public final void onSuccess(PanelInfoModel panelInfoModel) {
                String strLIZ;
                List<EffectCategoryModel> categoryList;
                PanelInfoModel panelInfoModel2 = panelInfoModel;
                long jLIZIZ = this.LIZJ.LIZIZ(TimeUnit.MILLISECONDS);
                IFetchPanelInfoListener iFetchPanelInfoListener2 = this.LIZIZ;
                if (iFetchPanelInfoListener2 != null) {
                    iFetchPanelInfoListener2.onSuccess(panelInfoModel2);
                }
                if (u7.LIZ() && !u7.LIZLLL()) {
                    return;
                }
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C0LAB c0lab = new C0LAB();
                if (TextUtils.equals(this.LIZ, "default")) {
                    strLIZ = "effect_panel_info";
                } else {
                    strLIZ = C1634610sdf.LIZ(this.LIZ);
                }
                c0lab.LJ("api_type", strLIZ);
                c0lab.LIZIZ(jLIZIZ, "duration");
                int size = 0;
                c0lab.LIZ(0, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                if (panelInfoModel2 != null && (categoryList = panelInfoModel2.getCategoryList()) != null) {
                    size = categoryList.size();
                }
                c0lab.LIZ(size, "count");
                C2341909Fp.LIZ("tool_performance_api", c0lab.LIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = iFetchPanelInfoListener;
            }
        });
    }
}
