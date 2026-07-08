package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.IProfileService;

/* JADX INFO: renamed from: X.0XS3, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XS3 extends AbstractC846450XIl {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        C19EG c19eg;
        InterfaceC846460XIm interfaceC846460XIm = (InterfaceC846460XIm) xBaseParamModel;
        IProfileService iProfileService = (IProfileService) ServiceManager.get().getService(IProfileService.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("need_skip_restart", true);
        C786410Ut5.LJJJI("sdk_name", interfaceC846460XIm.getSdkName(), bundle);
        C786410Ut5.LJJJI("sdk_version", interfaceC846460XIm.getSdkVersion(), bundle);
        C1255390im1 c1255390im1 = new C1255390im1("authorize_screen", "auth_switch_account_button", interfaceC846460XIm.getClientKey(), interfaceC846460XIm.getSdkName(), interfaceC846460XIm.getSdkVersion(), null, 224);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            Activity activityLIZ = C0XS4.LIZ(context);
            if (activityLIZ == null) {
                C2382909Vj.LIZ(completionBlock, 0, "context can not convert to activity", null, 4);
                return;
            } else {
                if (!(activityLIZ instanceof C19EG) || (c19eg = (C19EG) activityLIZ) == null) {
                    return;
                }
                iProfileService.showInChooseAccountBottomSheet(c19eg.getSupportFragmentManager(), c1255390im1, "", bundle, null, null);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
