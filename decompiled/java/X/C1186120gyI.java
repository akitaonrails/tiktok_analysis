package X;

import com.google.gson.n;
import com.ss.android.ugc.aweme.image.exp.LsResourcePreloadConfigModel;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.Map;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gyI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186120gyI extends AbstractC1181640gr4 implements InterfaceC1181380gqe {
    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
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
        SlashPage slashPage;
        Map<String, Node> nodes;
        LsResourcePreloadConfigModel lsResourcePreloadConfigModelLIZIZ;
        C1186030gy9.LIZ(new AwS562S0100000_18(slashApiResponse, 2760));
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "ls_image_preload_enable", true) == 1 && slashApiResponse != null && (slashPage = slashApiResponse.page) != null && (nodes = slashPage.getNodes()) != null) {
            for (Map.Entry<String, Node> entry : nodes.entrySet()) {
                C1336370ksd c1336370ksd = C1336370ksd.LIZ;
                String key = entry.getKey();
                n nVar = entry.getValue().data;
                if (nVar != null && (lsResourcePreloadConfigModelLIZIZ = C1336370ksd.LIZIZ("/tiktok/poi/slash/v1", key)) != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1186130gyJ(nVar, lsResourcePreloadConfigModelLIZIZ, "/tiktok/poi/slash/v1", key, null), 3);
                }
            }
        }
    }
}
