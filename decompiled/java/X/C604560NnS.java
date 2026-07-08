package X;

import android.app.Activity;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;

/* JADX INFO: renamed from: X.0NnS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C604560NnS extends AbstractC601060Nho {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C19EG c19eg;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Activity activityLIZLLL = null;
        if (interfaceC634840OvC != null) {
            activityLIZLLL = interfaceC634840OvC.LIZLLL();
        }
        if ((activityLIZLLL instanceof C19EG) && (c19eg = (C19EG) activityLIZLLL) != null) {
            new EditProfileBadgeDialog(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser(), 2).show(c19eg.getSupportFragmentManager(), "EditProfileBadgeDialog");
        }
    }
}
