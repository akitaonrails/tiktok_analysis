package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.v2.base.AccountFlowSharedViewModel;

/* JADX INFO: renamed from: X.0iIt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1237330iIt implements InterfaceC853780XeS {
    public final /* synthetic */ AccountFlowSharedViewModel LIZ;
    public final /* synthetic */ InterfaceC853790XeT<?> LIZIZ;

    public C1237330iIt(AccountFlowSharedViewModel accountFlowSharedViewModel, InterfaceC853790XeT<?> interfaceC853790XeT) {
        this.LIZ = accountFlowSharedViewModel;
        this.LIZIZ = interfaceC853790XeT;
    }

    @Override // X.InterfaceC853780XeS
    public final void LIZIZ(Bundle bundle, boolean z) {
        this.LIZ.LLILZ.postValue(Boolean.FALSE);
        if (z) {
            this.LIZ.vQ2(this.LIZIZ, bundle);
        }
    }

    @Override // X.InterfaceC853780XeS
    public final void LIZ(Throwable th, boolean z, Bundle bundle) {
        this.LIZ.LLILZ.postValue(Boolean.FALSE);
        if (z) {
            this.LIZ.vQ2(this.LIZIZ, bundle);
        }
        if (th.getMessage() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Error handling action [");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(']');
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
