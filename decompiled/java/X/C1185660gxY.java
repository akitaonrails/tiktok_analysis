package X;

import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS134S1200000_18;

/* JADX INFO: renamed from: X.0gxY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185660gxY extends AbstractC1181640gr4 implements InterfaceC1181380gqe {
    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

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
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
        C1494690ozz c1494690ozz;
        new AwS134S1200000_18(th, enumC1181510gqr, str, 6).invoke();
        if (enumC1181510gqr == EnumC1181510gqr.REQUEST && C297550BlR.LIZ() && (th instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) th) != null && c1494690ozz.getCronetInternalErrorCode() == -2223) {
            AFwS206S0000000_18.get$arr$(822).getClass();
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            if (interfaceC1181010gq3 != null) {
                interfaceC1181010gq3.refresh();
            }
        }
    }
}
