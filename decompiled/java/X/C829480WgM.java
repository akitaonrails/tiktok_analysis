package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WgM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829480WgM extends AbstractC829500WgO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        final Activity activityLIZ;
        final HashMap map;
        InterfaceC829490WgN interfaceC829490WgN = (InterfaceC829490WgN) xBaseParamModel;
        String operation = interfaceC829490WgN.getOperation();
        if (operation == null) {
            operation = "";
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null && !activityLIZ.isFinishing()) {
            boolean zLIZJ = C824390WVp.LIZJ(activityLIZ);
            int i = 2;
            if (Intrinsics.LJFF(operation, "get")) {
                if (!zLIZJ) {
                    i = 0;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC829510WgP.class, null);
                ((InterfaceC829510WgP) xBaseModelLIZJ).setStatus(String.valueOf(i));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            if (!zLIZJ) {
                Map<String, Object> trackInfo = interfaceC829490WgN.getTrackInfo();
                if (trackInfo != null) {
                    map = new HashMap();
                    for (Map.Entry<String, Object> entry : trackInfo.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            map.put(key, value);
                        } else {
                            map.put(key, value.toString());
                        }
                    }
                } else {
                    map = new HashMap();
                }
                final InterfaceC829510WgP interfaceC829510WgP = (InterfaceC829510WgP) C1909107dp.LIZJ(InterfaceC829510WgP.class, null);
                C21566919al c21566919al = new C21566919al(activityLIZ);
                c21566919al.LJFF(2131847796);
                c21566919al.LIZ(2131847799);
                c21566919al.LJIIJ(2131847798, new DialogInterface.OnClickListener() { // from class: X.0WgJ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C829480WgM c829480WgM = this.LL;
                        Map<String, String> map2 = map;
                        c829480WgM.getClass();
                        C20684815ws.LJIILLIIL("push_pre_permission_auth", map2);
                        interfaceC829510WgP.setAuthResult(2);
                        completionBlock.onSuccess(interfaceC829510WgP, "");
                        try {
                            C824390WVp.LIZLLL(activityLIZ);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            Context context2 = activityLIZ;
                            Intent intent = new Intent("android.settings.SETTINGS");
                            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context2, intent, "Context_startActivity_1");
                            C1701330uNH.LIZ(intent, context2);
                            C2204961BRm.LJJJJJL(context2, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOytLZLLyDqfCkRSWfF0aDxVZNhwdIr+IzyXTRzIPvMebg==", null));
                        }
                    }
                }, false);
                c21566919al.LJII(2131847797, new DialogInterface.OnClickListener() { // from class: X.0WgK
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C829480WgM c829480WgM = this.LL;
                        Map<String, String> map2 = map;
                        c829480WgM.getClass();
                        C20684815ws.LJIILLIIL("push_pre_permission_deny", map2);
                        interfaceC829510WgP.setAuthResult(0);
                        completionBlock.onSuccess(interfaceC829510WgP, "");
                    }
                }, false);
                new C21566519ah(c21566919al).LIZLLL();
                C20684815ws.LJIILLIIL("push_pre_permission_show", map);
                return;
            }
            XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC829510WgP.class, null);
            ((InterfaceC829510WgP) xBaseModelLIZJ2).setAuthResult(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -1, "activity is null", null, 4);
    }
}
