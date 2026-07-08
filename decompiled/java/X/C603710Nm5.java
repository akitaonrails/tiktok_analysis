package X;

import Y.ARunnableS109S0100000_9;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Nm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C603710Nm5 extends AbstractC603680Nm2 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        C1537720q7O c1537720q7O;
        try {
            Map<String, ? extends Object> params = ((InterfaceC603690Nm3) xBaseParamModel).getParams();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                view = interfaceC634840OvC.getView();
            } else {
                view = null;
            }
            if ((view instanceof C1537720q7O) && (c1537720q7O = (C1537720q7O) view) != null) {
                ViewParent parent = c1537720q7O.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    }
                    if (parent instanceof C1196900hFg) {
                        C1196900hFg c1196900hFg = (C1196900hFg) parent;
                        if (c1196900hFg != null) {
                            c1196900hFg.LJJIIJ(params);
                            HandlerHook.viewPost(c1196900hFg, new ARunnableS109S0100000_9((Object) c1196900hFg, 202));
                            completionBlock.onSuccess(new XBaseResultModel() { // from class: X.00p2
                                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                                public final JSONObject toJSON() {
                                    return new JSONObject();
                                }

                                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                                public final Map<String, Object> convert() {
                                    return C2097608Jq.LJ();
                                }

                                @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
                                public final List<String> provideResultList() {
                                    return C13BV.INSTANCE;
                                }
                            }, "");
                            return;
                        }
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            C2382909Vj.LIZ(completionBlock, -1, "PoiCardView instance not found in SDK context", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to handle searchPoiCardClick: ");
            sbLIZ.append(e.getMessage());
            C2382909Vj.LIZ(completionBlock, -2, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
