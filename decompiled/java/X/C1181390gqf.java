package X;

import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0gqf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181390gqf implements InterfaceC1181380gqe {
    public final CopyOnWriteArraySet<InterfaceC1181380gqe> LL = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().onSuccess(str);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().Ag(slashRequestParam, str);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().a9(slashApiResponse, str);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().iM(c1180620gpQ, str);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().up(slashApiResponse, str);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().JC(th, enumC1181510gqr, str);
        }
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
        Iterator<InterfaceC1181380gqe> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            it2.next().mC(c1180620gpQ, enumC1181510gqr, z, str);
        }
    }
}
