package X;

import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.io.File;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14vX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20421714vX implements InterfaceC979390bar {
    public final /* synthetic */ C259800zU<CompletionBlock<InterfaceC20422214vc>> LIZ;
    public final /* synthetic */ C20421814vY LIZIZ;
    public final /* synthetic */ C20361214lm LIZJ;
    public final /* synthetic */ InterfaceC20422114vb LIZLLL;
    public final /* synthetic */ PlayRule LJ;

    @Override // X.InterfaceC979390bar
    public final void LIZ(boolean z) {
    }

    @Override // X.InterfaceC979390bar
    public final void LIZIZ(long j, String str) {
    }

    @Override // X.InterfaceC979390bar
    public final void LJ() {
    }

    @Override // X.InterfaceC979390bar
    public final void LJFF() {
    }

    @Override // X.InterfaceC979390bar
    public final void LIZJ() {
        CompletionBlock<InterfaceC20422214vc> completionBlock = this.LIZ.element;
        if (completionBlock != null) {
            C2382909Vj.LIZ(completionBlock, -3, null, null, 6);
        }
        this.LIZ.element = null;
    }

    @Override // X.InterfaceC979390bar
    public final void LIZLLL(long j, String str) {
        C766270U4b.LJIIJJI("Edit parameter fail.");
        CompletionBlock<InterfaceC20422214vc> completionBlock = this.LIZ.element;
        if (completionBlock != null) {
            C2382909Vj.LIZ(completionBlock, -2, null, null, 6);
        }
        this.LIZ.element = null;
    }

    @Override // X.InterfaceC979390bar
    public final void LJI(long j, String str, boolean z) throws JSONException {
        String containerID;
        C20425514w9 c20425514w9;
        C20426114wF c20426114wFLJ;
        List<C20425114w5> list;
        C20425114w5 c20425114w5LIZIZ;
        C20424814w2 c20424814w2;
        String containerID2;
        CompletionBlock<InterfaceC20422214vc> completionBlock = this.LIZ.element;
        if (completionBlock != null) {
            this.LIZIZ.getClass();
            InterfaceC634840OvC interfaceC634840OvC = this.LIZIZ.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID2 = interfaceC634840OvC.getContainerID();
            } else {
                containerID2 = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC20422214vc.class, containerID2);
            this.LIZJ.LIZIZ(str);
            ((InterfaceC20422214vc) xBaseModelLIZJ).setParamsJsonString(str);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } else {
            C20421814vY c20421814vY = this.LIZIZ;
            InterfaceC20422114vb interfaceC20422114vb = this.LIZLLL;
            PlayRule playRule = this.LJ;
            C20361214lm c20361214lm = this.LIZJ;
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = c20421814vY.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ != null && (c20425514w9 = (C20425514w9) c1537480q70LIZIZ.LJFF(C20425514w9.class)) != null && (c20426114wFLJ = c20425514w9.LJ()) != null && (list = c20426114wFLJ.LIZLLL) != null && (c20425114w5LIZIZ = C20379214og.LIZIZ(Long.valueOf(interfaceC20422114vb.getStateId().longValue()), list)) != null && (c20424814w2 = c20425114w5LIZIZ.LIZJ) != null) {
                C20361314ln c20361314lnLIZLLL = playRule.LIZLLL(new C20424814w2(c20424814w2.LIZ, c20424814w2.LIZIZ, c20424814w2.LIZJ, c20424814w2.LIZLLL, c20424814w2.LJ, c20424814w2.LJFF, c20424814w2.LJI, str, c20424814w2.LJIIIIZZ), "");
                c20361214lm.LIZIZ(str);
                JSONObject jSONObject = new JSONObject();
                C20365714mV c20365714mV = c20361314lnLIZLLL.LJFF;
                if (c20365714mV != null) {
                    File file = c20365714mV.LIZIZ;
                    if (file != null) {
                        jSONObject.put("contentImagePath", file.toURI().toString());
                        if (!c20361314lnLIZLLL.LJ.isEmpty()) {
                            jSONObject.put("descList", new JSONArray((Collection) c20361314lnLIZLLL.LJ));
                        }
                        LJII(j, str, c20421814vY, jSONObject);
                        return;
                    }
                    Function1<InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>, Unit> function1 = c20365714mV.LJ;
                    if (function1 != null) {
                        function1.invoke(new C20422014va(jSONObject, c20361314lnLIZLLL, j, str, c20421814vY));
                        return;
                    }
                }
                if (!c20361314lnLIZLLL.LJ.isEmpty()) {
                    jSONObject.put("descList", new JSONArray((Collection) c20361314lnLIZLLL.LJ));
                }
                LJII(j, str, c20421814vY, jSONObject);
            }
        }
        this.LIZ.element = null;
    }

    public static final void LJII(long j, String str, C20421814vY c20421814vY, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("stateId", j);
        jSONObject2.put("newJsonParameter", str);
        jSONObject2.put("uiConfig", jSONObject);
        InterfaceC634840OvC interfaceC634840OvC = c20421814vY.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC634840OvC.sendEvent("updatePlaybookParamsUIConfig", jSONObject2);
        }
    }

    public C20421714vX(C259800zU<CompletionBlock<InterfaceC20422214vc>> c259800zU, C20421814vY c20421814vY, C20361214lm c20361214lm, InterfaceC20422114vb interfaceC20422114vb, PlayRule playRule) {
        this.LIZ = c259800zU;
        this.LIZIZ = c20421814vY;
        this.LIZJ = c20361214lm;
        this.LIZLLL = interfaceC20422114vb;
        this.LJ = playRule;
    }
}
