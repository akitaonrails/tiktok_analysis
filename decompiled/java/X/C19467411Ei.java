package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.11Ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19467411Ei implements InterfaceC341420Da0 {
    @Override // X.InterfaceC341420Da0
    public final boolean LIZIZ(String str) {
        return C19724912Fj.LIZLLL().LJIIJ(C2429209fW.LIZ().appendDataFlowId(new Bundle(), "402657282"), str);
    }

    @Override // X.InterfaceC341420Da0
    public final boolean LIZJ(String str) {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().stickerInfo().idUnlocked(str);
    }

    @Override // X.InterfaceC341420Da0
    public final boolean isScanUnLockType(String str) {
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).infoService().stickerInfo().isScanUnLockType(str);
    }

    @Override // X.InterfaceC341420Da0
    public final boolean LIZ(Context context, String str) {
        return AbstractC1025070cmX.LJIILJJIL(context, str, false);
    }

    @Override // X.InterfaceC341420Da0
    public final void LJ(Context context, String str) {
        AbstractC1025070cmX.LJIILL(context, str, "");
    }

    @Override // X.InterfaceC341420Da0
    public final void LIZLLL(Context context, String str, String str2, String str3) {
        if (!AbstractC1025070cmX.LJIILJJIL(context, str, false)) {
            AbstractC1025070cmX.LJIILL(context, str2, str3);
        }
    }
}
