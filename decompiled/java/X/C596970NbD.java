package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sync.IByteSyncApi;

/* JADX INFO: renamed from: X.0NbD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C596970NbD implements IByteSyncApi {
    public static final C596970NbD LIZIZ = new C596970NbD();
    public final /* synthetic */ IByteSyncApi LIZ = (IByteSyncApi) ServiceManager.get().getService(IByteSyncApi.class);

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final void LIZ(EnumC1733330vCt enumC1733330vCt, InterfaceC596980NbE interfaceC596980NbE) {
        this.LIZ.LIZ(enumC1733330vCt, interfaceC596980NbE);
    }

    @Override // com.ss.android.ugc.aweme.sync.IByteSyncApi
    public final void LIZIZ(EnumC1733330vCt enumC1733330vCt) {
        this.LIZ.LIZIZ(enumC1733330vCt);
    }
}
