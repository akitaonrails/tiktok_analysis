package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.167m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207236167m implements InterfaceC207240167q {
    public InterfaceC207240167q LIZ;

    @Override // X.InterfaceC207240167q
    public final void LIZ(boolean z) {
        InterfaceC207240167q interfaceC207240167q = this.LIZ;
        if (interfaceC207240167q != null) {
            interfaceC207240167q.LIZ(z);
        }
    }

    @C14EU
    public void onEvent(C848450XQd c848450XQd) {
        LIZ(((IUserService) ServiceManager.get().getService(IUserService.class)).isLogin());
    }

    @C14EU
    public void onEvent(C19276510bD c19276510bD) {
        LIZ(false);
    }
}
