package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.component.phone.GetPhoneNumberFragment;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0put, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529970put extends AbstractC1528670psn {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context contextN3;
        FragmentManager fragmentManagerLJ;
        Context context;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            contextN3 = C786410Ut5.N3(context);
        } else {
            contextN3 = null;
        }
        if (contextN3 == null) {
            C2382909Vj.LIZ(completionBlock, -3, "can not find context", null, 4);
            return;
        }
        if (!C0V4V.LIZ(contextN3)) {
            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("result", "not_available"));
            c1716310ulR.getClass();
            C1716310ulR.LIZLLL("rd_pipo_phone_hint_request", mapLIZJ);
            C2382909Vj.LIZ(completionBlock, -4, "google service not available", null, 4);
            return;
        }
        GetPhoneNumberFragment getPhoneNumberFragment = new GetPhoneNumberFragment(contextN3, new C1528650psl(this, completionBlock));
        AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
        if (abstractC1387200mCcLIZJ == null || (fragmentManagerLJ = abstractC1387200mCcLIZJ.LJ()) == null) {
            return;
        }
        getPhoneNumberFragment.show(fragmentManagerLJ, "get_phone_number_dialog");
    }
}
