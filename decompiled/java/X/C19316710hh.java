package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.account.login.trustedfriends.RecoveryStatusPollingService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10hh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19316710hh extends AbstractC747130TSl {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        String str2;
        String str3;
        long j;
        String str4;
        String str5;
        Map<String, Object> info = ((InterfaceC1052520dUo) xBaseParamModel).getInfo();
        Object obj = info.get("polling_passport_ticket");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = "";
        if (str == null) {
            str = "";
        }
        C01GW c01gw = C19317010hk.LIZ;
        ((Keva) c01gw.getValue()).storeString("polling_passport_ticket", str);
        Object obj3 = info.get("login_passport_ticket");
        if (!(obj3 instanceof String) || (str2 = (String) obj3) == null) {
            str2 = "";
        }
        ((Keva) c01gw.getValue()).storeString("login_passport_ticket", str2);
        Object obj4 = info.get("pseudo_id");
        if (!(obj4 instanceof String) || (str3 = (String) obj4) == null) {
            str3 = "";
        }
        ((Keva) c01gw.getValue()).storeString("pseudo_id", str3);
        Object obj5 = info.get("start_timestamp");
        if ((obj5 instanceof String) && (str5 = (String) obj5) != null) {
            j = CastLongProtector.parseLong(str5);
        } else {
            j = 0;
        }
        ((Keva) c01gw.getValue()).storeLong("start_timestamp_seconds", j);
        Object obj6 = info.get("domain");
        if (!(obj6 instanceof String) || (str4 = (String) obj6) == null) {
            str4 = "";
        }
        ((Keva) c01gw.getValue()).storeString("domain", str4);
        Object obj7 = info.get("phase");
        if ((obj7 instanceof String) && obj7 != null) {
            obj2 = obj7;
        }
        if (Intrinsics.LJFF(obj2, C01C0.START.getValue())) {
            RecoveryStatusPollingService.LIZLLL().LIZ("webview");
        } else {
            if (!Intrinsics.LJFF(obj2, C01C0.UPDATE.getValue())) {
                return;
            }
            RecoveryStatusPollingService.LIZLLL().LIZIZ();
        }
    }
}
