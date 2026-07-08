package X;

import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0cg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1021080cg6 extends AbstractC1021230cgL<InterfaceC1021100cg8> {
    public final InterfaceC1021100cg8 LLILLJJLI;
    public int LLILLL;

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LLILLJJLI;
    }

    public C1021080cg6(InterfaceC1021100cg8 interfaceC1021100cg8) {
        this.LLILLJJLI = interfaceC1021100cg8;
    }

    @Override // X.AbstractC1021230cgL
    public final C1021060cg4 LIZ(String str) {
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        boolean z;
        PhotoCarouselInfoStruct photoCarouselInfoStructLIZJ = this.LLILLJJLI.LIZJ();
        if (photoCarouselInfoStructLIZJ != null && (productList = photoCarouselInfoStructLIZJ.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(this.LLILLL, productList)) != null) {
            CRouterCoreModel cRouterCoreModel = new CRouterCoreModel(null, 0, null, new CRouterWebModel(photoCarouselProductStruct.getWebUrl(), photoCarouselProductStruct.getAnchorTitle(), false, false, 0, null), null, null, null);
            if (str != null) {
                z = true;
            } else {
                z = false;
            }
            return new C1021060cg4(cRouterCoreModel, new C1025430cn7(null, null, null, new AiAgentConfig(z, str, photoCarouselProductStruct.getBotConfig()), 95), 4);
        }
        return null;
    }

    @Override // X.AbstractC1021230cgL, X.InterfaceC1021210cgJ
    public final void RO1(AbstractC1021310cgT abstractC1021310cgT) {
        String productId;
        List<PhotoCarouselProductStruct> productList;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        Map<String, String> map = abstractC1021310cgT.LIZ;
        String str = AbstractC1021310cgT.LJ;
        PhotoCarouselInfoStruct photoCarouselInfoStructLIZJ = this.LLILLJJLI.LIZJ();
        if (photoCarouselInfoStructLIZJ != null && (productList = photoCarouselInfoStructLIZJ.getProductList()) != null && (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(this.LLILLL, productList)) != null) {
            productId = photoCarouselProductStruct.getProductId();
        } else {
            productId = null;
        }
        map.put(str, productId);
        super.RO1(abstractC1021310cgT);
    }

    @Override // X.AbstractC1021230cgL, X.InterfaceC1021210cgJ
    public final void jJ2(int i) {
        this.LLILLL = i;
    }
}
