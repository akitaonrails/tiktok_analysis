package X;

import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS102S1000000_18;
import kotlin.jvm.internal.AwS419S0200000_18;

/* JADX INFO: renamed from: X.0gqg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181400gqg extends AbstractC1181640gr4 implements InterfaceC1181380gqe {
    public String LLILLJJLI;

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
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
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
        C1180170goh.LIZLLL().LIZ(new AwS102S1000000_18(str, 3));
        this.LLILLJJLI = str;
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
        SlashPage slashPage;
        Map<String, Node> nodes;
        Set<String> setKeySet;
        C1180170goh.LIZLLL().LIZ(new AwS419S0200000_18(this, slashApiResponse, 12));
        String str2 = this.LLILLJJLI;
        if (str2 != null && str2.length() != 0 && slashApiResponse != null && (slashPage = slashApiResponse.page) != null && (nodes = slashPage.getNodes()) != null && (setKeySet = nodes.keySet()) != null) {
            for (String str3 : setKeySet) {
                InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
                if (interfaceC1181010gq3 != null) {
                    interfaceC1181010gq3.as(str3);
                }
            }
        }
    }
}
