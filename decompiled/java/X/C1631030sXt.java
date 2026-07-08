package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;

/* JADX INFO: renamed from: X.0sXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631030sXt {
    public static final boolean LIZ(FaceStickerBean faceStickerBean) {
        FaceStickerCommerceBean faceStickerCommerceBean;
        String str;
        if (!faceStickerBean.isBusi() || faceStickerBean.getFaceStickerCommerceBean() == null || (faceStickerCommerceBean = faceStickerBean.getFaceStickerCommerceBean()) == null || faceStickerCommerceBean.commerceStickerType != 1) {
            return false;
        }
        FaceStickerCommerceBean faceStickerCommerceBean2 = faceStickerBean.getFaceStickerCommerceBean();
        if (faceStickerCommerceBean2 != null) {
            str = faceStickerCommerceBean2.commerceStickerBuyText;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return true;
    }
}
