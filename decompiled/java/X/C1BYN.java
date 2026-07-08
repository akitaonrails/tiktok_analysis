package X;

import com.ss.android.ugc.aweme.launcher.service.account.IAccountApi;
import com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl;
import java.util.Collection;

/* JADX INFO: renamed from: X.1BYN, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BYN implements IAccountApi {
    public static final C1BYN LIZIZ = new C1BYN();
    public final /* synthetic */ IAccountApi LIZ;

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final boolean LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final C0XPE LJ() {
        return this.LIZ.LJ();
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJFF(String str, String str2, String str3) {
        this.LIZ.LJFF(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final void LJI(Collection<String> collection) {
        this.LIZ.LJI(collection);
    }

    @Override // com.ss.android.ugc.aweme.launcher.service.account.IAccountApi
    public final String getSessionId() {
        return this.LIZ.getSessionId();
    }

    public C1BYN() {
        IAccountApi iAccountApi;
        Object objLIZ = C04TD.LIZ(IAccountApi.class, false);
        if (objLIZ != null) {
            iAccountApi = (IAccountApi) objLIZ;
        } else {
            if (C04TD.D1 == null) {
                synchronized (IAccountApi.class) {
                    if (C04TD.D1 == null) {
                        C04TD.D1 = new AccountImpl();
                    }
                }
            }
            iAccountApi = C04TD.D1;
        }
        this.LIZ = iAccountApi;
    }
}
