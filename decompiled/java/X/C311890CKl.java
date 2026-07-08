package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.settingsrequest.AbTestManagerApiImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi;

/* JADX INFO: renamed from: X.0CKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311890CKl implements IAbTestManagerApi {
    public static final C311890CKl LIZIZ = new C311890CKl();
    public final /* synthetic */ IAbTestManagerApi LIZ;

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZIZ(n nVar) {
        this.LIZ.LIZIZ(nVar);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZLLL(boolean z) {
        this.LIZ.LIZLLL(true);
    }

    @Override // com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LJ(InterfaceC302500BtQ interfaceC302500BtQ) {
        this.LIZ.LJ(interfaceC302500BtQ);
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean isContainsKeyWithLruEntries() {
        return this.LIZ.isContainsKeyWithLruEntries();
    }

    @Override // com.ss.android.ugc.aweme.settingsrequest.api.IAbTestManagerApi
    public final boolean isReplaceAwemeCache() {
        return this.LIZ.isReplaceAwemeCache();
    }

    public C311890CKl() {
        IAbTestManagerApi iAbTestManagerApi;
        Object objLIZ = C04TD.LIZ(IAbTestManagerApi.class, false);
        if (objLIZ != null) {
            iAbTestManagerApi = (IAbTestManagerApi) objLIZ;
        } else {
            if (C04TD.V4 == null) {
                synchronized (IAbTestManagerApi.class) {
                    if (C04TD.V4 == null) {
                        C04TD.V4 = new AbTestManagerApiImpl();
                    }
                }
            }
            iAbTestManagerApi = C04TD.V4;
        }
        this.LIZ = iAbTestManagerApi;
    }
}
