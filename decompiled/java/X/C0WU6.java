package X;

import android.os.Build;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.shortcut.IShortcutService;

/* JADX INFO: renamed from: X.0WU6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WU6 extends C0WUA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0WUE c0wue = (C0WUE) xBaseParamModel;
        IShortcutService iShortcutService = (IShortcutService) ServiceManager.get().getService(IShortcutService.class);
        if (iShortcutService.LIZ() && Build.VERSION.SDK_INT >= 26) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C0WUD.class, null);
            ((C0WUD) xBaseModelLIZJ).setExist(Boolean.valueOf(iShortcutService.LIZIZ(c0wue.getShortcutId())));
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "shortcut is not supported", null, 4);
    }
}
