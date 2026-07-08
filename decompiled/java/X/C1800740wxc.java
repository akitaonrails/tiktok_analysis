package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wxc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800740wxc extends AbstractC1800690wxX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLIZLLL;
        JSONObject json = ((InterfaceC1800700wxY) xBaseParamModel).getData().toJSON();
        Intent intent = new Intent();
        intent.putExtra("star_atlas_object", C786410Ut5.J3(json));
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (activityLIZLLL = interfaceC634840OvC.LIZLLL()) != null) {
            C0CHQ.LIZ().LJI().LJIILL().LIZ(activityLIZLLL, intent, true, false);
        }
    }
}
