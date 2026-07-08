package X;

import com.bytedance.android.livesdk.comp.api.pcs.infra.preloadengine.config.PreloadStrategyConfig;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fAP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116750fAP extends AbstractC1116780fAS {
    public final Map<String, InterfaceC1097470efJ> LLILLL = new LinkedHashMap();

    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        super.release();
        Iterator it2 = ((LinkedHashMap) this.LLILLL).entrySet().iterator();
        while (it2.hasNext()) {
            C1097400efC.LIZJ((InterfaceC1097470efJ) ((Map.Entry) it2.next()).getValue());
        }
        ((LinkedHashMap) this.LLILLL).clear();
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        final InterfaceC1116770fAR interfaceC1116770fAR = (InterfaceC1116770fAR) xBaseParamModel;
        String sceneKey = interfaceC1116770fAR.getSceneKey();
        Number action = interfaceC1116770fAR.getAction();
        if (sceneKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("the value of sceneKey=");
            sbLIZ.append(sceneKey);
            sbLIZ.append(" is wrong");
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return;
        }
        if (Intrinsics.LJFF(action, 1)) {
            InterfaceC1097470efJ interfaceC1097470efJ = new InterfaceC1097470efJ() { // from class: X.0fAQ
                @Override // X.InterfaceC1097470efJ
                public final boolean LIZ() {
                    return false;
                }

                @Override // X.InterfaceC1097470efJ
                public final void LIZIZ(PreloadStrategyConfig preloadStrategyConfig) {
                }

                @Override // X.InterfaceC1097470efJ
                public final void LJ() {
                }

                @Override // X.InterfaceC1097470efJ
                public final boolean LJFF(PreloadStrategyConfig preloadStrategyConfig) {
                    return true;
                }

                @Override // X.InterfaceC1097470efJ
                public final Map<String, String> LIZJ() {
                    Map<String, Object> schemaParam = interfaceC1116770fAR.getSchemaParam();
                    return schemaParam != null ? C500260Jjc.LLD(schemaParam) : new LinkedHashMap();
                }

                @Override // X.InterfaceC1097470efJ
                public final Map<String, Object> LJII() {
                    Map<String, Object> apiParam = interfaceC1116770fAR.getApiParam();
                    return apiParam != null ? C500260Jjc.LLD(apiParam) : new LinkedHashMap();
                }

                @Override // X.InterfaceC1097470efJ
                public final Map<String, String> getLogParam() {
                    Map<String, Object> logParam = interfaceC1116770fAR.getLogParam();
                    return logParam != null ? C500260Jjc.LLD(logParam) : new LinkedHashMap();
                }

                @Override // X.InterfaceC1097470efJ
                public final String getSceneKey() {
                    return interfaceC1116770fAR.getSceneKey();
                }

                @Override // X.InterfaceC1097470efJ
                public final void LJI(String str, long j) {
                    CompletionBlock<InterfaceC1116790fAT> completionBlock2 = completionBlock;
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1116790fAT.class, null);
                    InterfaceC1116790fAT interfaceC1116790fAT = (InterfaceC1116790fAT) xBaseModelLIZJ;
                    interfaceC1116790fAT.setTriggerStrategyKey(str);
                    interfaceC1116790fAT.setTriggerStrategyValue(Long.valueOf(j));
                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                }
            };
            C1097400efC.LIZIZ(interfaceC1097470efJ);
            this.LLILLL.put(interfaceC1116770fAR.getSceneKey(), interfaceC1097470efJ);
            return;
        }
        if (Intrinsics.LJFF(action, 2)) {
            InterfaceC1097470efJ interfaceC1097470efJ2 = (InterfaceC1097470efJ) ((LinkedHashMap) this.LLILLL).get(interfaceC1116770fAR.getSceneKey());
            if (interfaceC1097470efJ2 == null) {
                C2382909Vj.LIZ(completionBlock, 0, "no such a scene", null, 4);
                return;
            } else {
                C1097400efC.LIZJ(interfaceC1097470efJ2);
                completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1116790fAT.class, null), "exit scene done.");
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("the value of action=");
        sbLIZ2.append(sceneKey);
        sbLIZ2.append(" is wrong, it should 1 or 2");
        C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
    }
}
