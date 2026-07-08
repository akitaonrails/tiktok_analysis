package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.abilities.ContainerEventDispatcher$RefreshActionCallBackAbility;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;

/* JADX INFO: renamed from: X.0gxR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185590gxR extends AbstractC1181640gr4 implements InterfaceC1181380gqe {
    public boolean LLILLJJLI = true;

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
        Fragment fragmentS8;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (fragmentS8 = interfaceC1181010gq3.S8()) != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentS8, null);
            if (this.LLILLJJLI) {
                this.LLILLJJLI = false;
                ContainerEventDispatcher$RefreshActionCallBackAbility containerEventDispatcher$RefreshActionCallBackAbility = (ContainerEventDispatcher$RefreshActionCallBackAbility) C1558520qew.LIZ(interfaceC665370Q7zLJFF, ContainerEventDispatcher$RefreshActionCallBackAbility.class, null);
                if (containerEventDispatcher$RefreshActionCallBackAbility != null) {
                    containerEventDispatcher$RefreshActionCallBackAbility.i1();
                }
            }
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
        Fragment fragmentS8;
        ContainerEventDispatcher$RefreshActionCallBackAbility containerEventDispatcher$RefreshActionCallBackAbility;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (fragmentS8 = interfaceC1181010gq3.S8()) != null && (containerEventDispatcher$RefreshActionCallBackAbility = (ContainerEventDispatcher$RefreshActionCallBackAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentS8, null), ContainerEventDispatcher$RefreshActionCallBackAbility.class, null)) != null) {
            containerEventDispatcher$RefreshActionCallBackAbility.t0();
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
        Fragment fragmentS8;
        ContainerEventDispatcher$RefreshActionCallBackAbility containerEventDispatcher$RefreshActionCallBackAbility;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (fragmentS8 = interfaceC1181010gq3.S8()) != null && (containerEventDispatcher$RefreshActionCallBackAbility = (ContainerEventDispatcher$RefreshActionCallBackAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentS8, null), ContainerEventDispatcher$RefreshActionCallBackAbility.class, null)) != null) {
            containerEventDispatcher$RefreshActionCallBackAbility.LLLLLZIL(th);
        }
    }
}
