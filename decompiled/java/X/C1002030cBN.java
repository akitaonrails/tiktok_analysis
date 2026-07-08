package X;

import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.0cBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1002030cBN extends AbstractC1023470cjx {
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1002030cBN(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    public final int LJJIIZ(int i) {
        Aweme aweme;
        IAdPhotoModeService iAdPhotoModeService;
        Integer numLJIJJ;
        Object obj = getProvidedContexts().get(Aweme.class);
        if ((obj instanceof Aweme) && (aweme = (Aweme) obj) != null && (iAdPhotoModeService = (IAdPhotoModeService) PluggableExtentionKt.pluggableSpi$default(IAdPhotoModeService.class, false, false, false, 14, null)) != null && (numLJIJJ = iAdPhotoModeService.LJIJJ(i, aweme)) != null) {
            return numLJIJJ.intValue();
        }
        return -1;
    }

    public final String LJJIIZI(int i) {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        PhotoCarouselProductStruct photoCarouselProductStruct;
        String productId;
        Object obj = getProvidedContexts().get(Aweme.class);
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
                List<PhotoCarouselProductStruct> productList = photoCarouselInfo.getProductList();
                if (productList == null || (photoCarouselProductStruct = (PhotoCarouselProductStruct) C13LP.LJJJLZIJ(i, productList)) == null || (productId = photoCarouselProductStruct.getProductId()) == null) {
                    return "";
                }
                return productId;
            }
        } else {
            aweme = null;
        }
        return String.valueOf(((C1011220cQC) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJFF()).LIZ(i, aweme));
    }
}
