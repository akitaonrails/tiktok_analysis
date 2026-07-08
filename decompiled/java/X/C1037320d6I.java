package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0d6I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037320d6I extends AbstractC1037330d6J {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1037340d6K interfaceC1037340d6K = (InterfaceC1037340d6K) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        String str = "";
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1037360d6M.class, containerID), "");
        String event = interfaceC1037340d6K.getEvent();
        if (event != null) {
            int iHashCode = event.hashCode();
            if (iHashCode != -1263216736) {
                if (iHashCode != -1263205773) {
                    if (iHashCode == 691453791 && event.equals("sendMessage")) {
                        C1440005kM.LIZ(new C1036420d4q(interfaceC1037340d6K.getData()));
                        return;
                    }
                    return;
                }
                if (!event.equals("openSku")) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(interfaceC1037340d6K.getData());
                String strOptString = jSONObject.optString("pid");
                if (strOptString != null) {
                    str = strOptString;
                }
                C1440005kM.LIZ(new C1036390d4n(jSONObject.optString("url"), str));
                return;
            }
            if (!event.equals("openIAB")) {
                return;
            }
            C1440005kM.LIZ(new IEvent() { // from class: X.0d6L
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C1440005kM.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C1440005kM.LIZIZ(this);
                    return this;
                }
            });
        }
    }
}
