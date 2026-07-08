package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vCB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732890vCB implements InterfaceC1731950vAf {
    public final /* synthetic */ InterfaceC1732920vCE LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC600660NhA> LIZIZ;

    @Override // X.InterfaceC1731950vAf
    public final void onSuccess() {
        AbstractC1732690vBr abstractC1732690vBr;
        boolean needClear = this.LIZ.getNeedClear();
        WeakReference<AbstractC1732690vBr> weakReference = C1732220vB6.LIZ;
        if (weakReference != null && (abstractC1732690vBr = weakReference.get()) != null) {
            if (C2296808zG.LJI(abstractC1732690vBr.LLIZLLLIL)) {
                C23250099c.LIZLLL(abstractC1732690vBr.LLIZLLLIL, null, null, new C1732800vC2(abstractC1732690vBr, needClear, null), 3);
            } else {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("ecbillboard", "#toggleClearPreviewScreen, scope cancelled");
            }
        }
        C1729270v6L.LIZ("jsb_success", null, "jsb", null, null, null, "", 0, 0, this.LIZ.getActionType().intValue(), 442);
        this.LIZIZ.onSuccess(new InterfaceC600660NhA() { // from class: X.0Nd2
            public String LIZIZ;
            public Boolean LIZ = Boolean.TRUE;
            public Map<String, ? extends Object> LIZJ = C2097608Jq.LJ();

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("isSuccess", Boolean.TRUE);
                pairArr[1] = new Pair("errMessage", String.valueOf(this.LIZIZ));
                Map<String, ? extends Object> mapLJ = this.LIZJ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                pairArr[2] = new Pair("extraParams", mapLJ);
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSuccess", this.LIZ);
                jSONObject.put("errMessage", this.LIZIZ);
                jSONObject.put("extraParams", this.LIZJ);
                return jSONObject;
            }

            @Override // X.InterfaceC600660NhA
            public final String getErrMessage() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC600660NhA
            public final Map<String, Object> getExtraParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC600660NhA
            public final Boolean isSuccess() {
                return this.LIZ;
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
            public final List<String> provideResultList() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC600660NhA
            public final void setErrMessage(String str) {
                this.LIZIZ = str;
            }

            @Override // X.InterfaceC600660NhA
            public final void setExtraParams(Map<String, ? extends Object> map) {
                this.LIZJ = map;
            }

            @Override // X.InterfaceC600660NhA
            public final void setSuccess(Boolean bool) {
                this.LIZ = bool;
            }
        }, "default");
    }

    @Override // X.InterfaceC1731950vAf
    public final void LIZ(final String str) {
        C1729270v6L.LIZ("jsb_error", str, "jsb", null, null, null, "", 0, 0, this.LIZ.getActionType().intValue(), 440);
        this.LIZIZ.onSuccess(new InterfaceC600660NhA(str) { // from class: X.0Nd3
            public String LIZIZ;
            public final /* synthetic */ String LIZLLL;
            public Boolean LIZ = Boolean.FALSE;
            public Map<String, ? extends Object> LIZJ = C2097608Jq.LJ();

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final Map<String, Object> convert() {
                Pair[] pairArr = new Pair[3];
                pairArr[0] = new Pair("isSuccess", Boolean.FALSE);
                pairArr[1] = new Pair("errMessage", this.LIZLLL);
                Map<String, ? extends Object> mapLJ = this.LIZJ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                pairArr[2] = new Pair("extraParams", mapLJ);
                return C2097608Jq.LJIIIIZZ(pairArr);
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
            public final JSONObject toJSON() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                String str2 = this.LIZLLL;
                jSONObject.put("isSuccess", this.LIZ);
                jSONObject.put("errMessage", str2);
                jSONObject.put("extraParams", this.LIZJ);
                return jSONObject;
            }

            @Override // X.InterfaceC600660NhA
            public final String getErrMessage() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC600660NhA
            public final Map<String, Object> getExtraParams() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC600660NhA
            public final Boolean isSuccess() {
                return this.LIZ;
            }

            @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
            public final List<String> provideResultList() {
                return C13BV.INSTANCE;
            }

            {
                this.LIZLLL = str;
                this.LIZIZ = str;
            }

            @Override // X.InterfaceC600660NhA
            public final void setErrMessage(String str2) {
                this.LIZIZ = str2;
            }

            @Override // X.InterfaceC600660NhA
            public final void setExtraParams(Map<String, ? extends Object> map) {
                this.LIZJ = map;
            }

            @Override // X.InterfaceC600660NhA
            public final void setSuccess(Boolean bool) {
                this.LIZ = bool;
            }
        }, "default");
    }

    public C1732890vCB(InterfaceC1732920vCE interfaceC1732920vCE, CompletionBlock<InterfaceC600660NhA> completionBlock) {
        this.LIZ = interfaceC1732920vCE;
        this.LIZIZ = completionBlock;
    }
}
