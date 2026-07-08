package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ILoginService;

/* JADX INFO: renamed from: X.10Jv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19226910Jv extends AbstractC19227110Jx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Activity activityLIZ = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC1748950vc5 interfaceC1748950vc5 = new InterfaceC1748950vc5() { // from class: X.10Jw
            @Override // X.InterfaceC1748950vc5
            public void onExit() {
            }

            @Override // X.InterfaceC1748950vc5
            public void onChanged(String str, String str2) {
                InterfaceC19227210Jy interfaceC19227210Jy = (InterfaceC19227210Jy) C1909107dp.LIZJ(InterfaceC19227210Jy.class, null);
                interfaceC19227210Jy.setPhoneCode(str);
                interfaceC19227210Jy.setShortCountryName(str2);
                completionBlock.onSuccess(interfaceC19227210Jy, "");
            }
        };
        ILoginService iLoginServiceLIZJ = C0XQ7.LIZJ();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        }
        iLoginServiceLIZJ.openCountryListActivity(activityLIZ, interfaceC1748950vc5);
    }
}
