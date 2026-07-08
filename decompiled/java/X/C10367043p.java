package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemToCartData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.043p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10367043p extends Response<AddItemToCartData> implements Serializable {
    public static final int $stable = 8;

    public final boolean isValid() {
        return isCodeOK();
    }

    public C10367043p(int i, String str, AddItemToCartData addItemToCartData) {
        super(i, str, addItemToCartData, null, null);
    }
}
