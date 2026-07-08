package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import defpackage.c0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q8x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665610Q8x extends c0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lValueOf;
        String containerID;
        String requestKeyword;
        String searchChannel;
        String newSource;
        try {
            e eVar = new e();
            eVar.LJIIJ = true;
            eVar.LJIILIIL = true;
            Gson gsonLIZ = eVar.LIZ();
            JSONObject json = xBaseParamModel.toJSON();
            try {
                GlobalDoodleConfig globalDoodleConfig = (GlobalDoodleConfig) gsonLIZ.LJII(JSONObjectProtectorUtils.getString(json, "global_doodle_config"), GlobalDoodleConfig.class);
                JSONObject jSONObjectOptJSONObject = json.optJSONObject("extra");
                if (jSONObjectOptJSONObject != null) {
                    lValueOf = Long.valueOf(jSONObjectOptJSONObject.optLong("now"));
                    jSONObjectOptJSONObject.optString("logid");
                    jSONObjectOptJSONObject.optJSONArray("fatal_item_ids");
                    jSONObjectOptJSONObject.optString("search_request_id");
                } else {
                    lValueOf = null;
                }
                try {
                    LogPbBean logPbBean = (LogPbBean) gsonLIZ.LJII(JSONObjectProtectorUtils.getString(json, "log_pb"), LogPbBean.class);
                    boolean zOptBoolean = json.optBoolean("is_load_more");
                    C1440005kM.LIZ(new C2344509Gp(globalDoodleConfig, logPbBean, zOptBoolean));
                    if (!zOptBoolean) {
                        C01GW<C669480QNu> c01gw = C669480QNu.LJ;
                        C669480QNu c669480QNuLIZ = C326370Cqp.LIZ();
                        if (globalDoodleConfig != null) {
                            requestKeyword = globalDoodleConfig.getRequestKeyword();
                        } else {
                            requestKeyword = null;
                        }
                        String imprId = logPbBean.getImprId();
                        if (globalDoodleConfig != null) {
                            searchChannel = globalDoodleConfig.getSearchChannel();
                            newSource = globalDoodleConfig.getNewSource();
                        } else {
                            searchChannel = null;
                            newSource = null;
                        }
                        c669480QNuLIZ.LJIJJLI(new LastSearch(requestKeyword, imprId, searchChannel, newSource, lValueOf, 0L));
                    }
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    } else {
                        containerID = null;
                    }
                    completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(c0.c.class, containerID), "");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parsing log_pb with exception ");
                    sbLIZ.append(th.getMessage());
                    C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ), null, 4);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("parsing global_doodle_config with exception: ");
                sbLIZ2.append(th2.getMessage());
                C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("handle jsb with exception: ");
            sbLIZ3.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ3), null, 4);
        }
    }
}
