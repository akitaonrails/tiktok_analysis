package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Sdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726090Sdz implements InterfaceC726100Se0 {
    public volatile InterfaceC734540Src LIZ;
    public volatile InterfaceC717320SBu LIZIZ;

    @Override // X.InterfaceC726100Se0
    public final InterfaceC717320SBu LIZ() {
        InterfaceC717320SBu interfaceC717320SBuLIZIZ = this.LIZIZ;
        if (interfaceC717320SBuLIZIZ == null) {
            synchronized (this) {
                interfaceC717320SBuLIZIZ = this.LIZIZ;
                if (interfaceC717320SBuLIZIZ == null) {
                    InterfaceC717320SBu.LIZ.getClass();
                    interfaceC717320SBuLIZIZ = C717290SBr.LIZIZ();
                    this.LIZIZ = interfaceC717320SBuLIZIZ;
                }
            }
        }
        return interfaceC717320SBuLIZIZ;
    }

    @Override // X.InterfaceC726100Se0
    public final InterfaceC734540Src LIZIZ() {
        InterfaceC734540Src interfaceC734540Src = this.LIZ;
        if (interfaceC734540Src == null) {
            synchronized (this) {
                interfaceC734540Src = this.LIZ;
                if (interfaceC734540Src == null) {
                    interfaceC734540Src = (InterfaceC734540Src) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQT.LIZJ).create(InterfaceC734540Src.class);
                    this.LIZ = interfaceC734540Src;
                }
            }
        }
        return interfaceC734540Src;
    }

    @Override // X.InterfaceC726100Se0
    public final C10AO LIZJ() {
        C10AO.LIZ.getClass();
        return (C10AO) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).LIZ(C0CQS.LIZIZ.getValue()).create(C10AO.class);
    }

    @Override // X.InterfaceC726100Se0
    public final String LIZLLL() {
        User currentUser;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService == null || (currentUser = iUserService.getCurrentUser()) == null) {
            return null;
        }
        return currentUser.getUid();
    }
}
