package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.api.revenue.enigma.IEnigmaService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.15Ov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20513915Ov extends AbstractC20514015Ow {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        String str;
        Number number;
        Number number2;
        Number number3;
        Number number4;
        InterfaceC20514115Ox interfaceC20514115Ox = (InterfaceC20514115Ox) xBaseParamModel;
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("from", interfaceC20514115Ox.getFrom(), bundle);
        bundle.putBoolean("eea", interfaceC20514115Ox.getEea());
        String contractId = interfaceC20514115Ox.getContractId();
        if (contractId != null) {
            C786410Ut5.LJJJI("contractId", contractId, bundle);
        }
        String contractExpiry = interfaceC20514115Ox.getContractExpiry();
        if (contractExpiry != null) {
            C786410Ut5.LJJJI("contractExpiry", contractExpiry, bundle);
        }
        Map<String, Object> enigma = interfaceC20514115Ox.getEnigma();
        if (enigma != null) {
            Object obj = enigma.get("subscription_end");
            if ((obj instanceof Number) && (number4 = (Number) obj) != null) {
                bundle.putLong("subscription_end", number4.longValue());
            }
            Object obj2 = enigma.get("subscription_start");
            if ((obj2 instanceof Number) && (number3 = (Number) obj2) != null) {
                bundle.putLong("subscription_start", number3.longValue());
            }
            Object obj3 = enigma.get("sub_status");
            if ((obj3 instanceof Number) && (number2 = (Number) obj3) != null) {
                bundle.putInt("sub_status", number2.intValue());
            }
            Object obj4 = enigma.get("sub_type");
            if ((obj4 instanceof Number) && (number = (Number) obj4) != null) {
                bundle.putInt("sub_type", number.intValue());
            }
            Object obj5 = enigma.get("user_code");
            if ((obj5 instanceof String) && (str = (String) obj5) != null) {
                C786410Ut5.LJJJI("user_code", str, bundle);
            }
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null && C1388190mED.LIZIZ(context) != null && context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null && ((fragmentLJJJJZI = supportFragmentManager.LJJJJZI("enigma_paywal_dialog")) == null || !fragmentLJJJJZI.isAdded())) {
            ((IEnigmaService) C1161920gLG.LIZJ(IEnigmaService.class)).V00(bundle, supportFragmentManager);
        }
        InterfaceC20514215Oy interfaceC20514215Oy = (InterfaceC20514215Oy) C1909107dp.LIZJ(InterfaceC20514215Oy.class, null);
        interfaceC20514215Oy.setMessage("success");
        completionBlock.onSuccess(interfaceC20514215Oy, "");
    }
}
