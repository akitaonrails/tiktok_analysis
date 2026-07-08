package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommercebase.model.EnhancedBrandLogo;
import webcast.data.oec_msg.ShopBrandLogo;

/* JADX INFO: renamed from: X.001y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0132001y {
    public static final EnhancedBrandLogo LIZ(ShopBrandLogo shopBrandLogo) {
        Image imageLIZIZ;
        Image imageLIZIZ2;
        Image imageLIZIZ3;
        Image imageLIZIZ4;
        ImageModel imageModel = shopBrandLogo.sellerLogo;
        Image imageLIZIZ5 = null;
        if (imageModel != null) {
            imageLIZIZ = LIZIZ(imageModel);
        } else {
            imageLIZIZ = null;
        }
        String str = shopBrandLogo.sellerName;
        ImageModel imageModel2 = shopBrandLogo.blueVImage;
        if (imageModel2 != null) {
            imageLIZIZ2 = LIZIZ(imageModel2);
        } else {
            imageLIZIZ2 = null;
        }
        ImageModel imageModel3 = shopBrandLogo.darkBlueVImage;
        if (imageModel3 != null) {
            imageLIZIZ3 = LIZIZ(imageModel3);
        } else {
            imageLIZIZ3 = null;
        }
        ImageModel imageModel4 = shopBrandLogo.topBrandImage;
        if (imageModel4 != null) {
            imageLIZIZ4 = LIZIZ(imageModel4);
        } else {
            imageLIZIZ4 = null;
        }
        ImageModel imageModel5 = shopBrandLogo.darkTopBrandImage;
        if (imageModel5 != null) {
            imageLIZIZ5 = LIZIZ(imageModel5);
        }
        return new EnhancedBrandLogo(imageLIZIZ, str, imageLIZIZ2, imageLIZIZ3, imageLIZIZ4, imageLIZIZ5);
    }

    public static final Image LIZIZ(ImageModel imageModel) {
        return new Image(Integer.valueOf(imageModel.width), Integer.valueOf(imageModel.height), null, imageModel.getUri(), imageModel.getUrls(), null, null, null, null, null, null, null, null);
    }
}
