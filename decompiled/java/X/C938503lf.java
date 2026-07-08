package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.RecommendAfterAddData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.03lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C938503lf extends Response<RecommendAfterAddData> implements Serializable {
    public static final int $stable = 8;

    public final boolean isValid() {
        return isCodeOK();
    }

    public C938503lf(int i, String str, RecommendAfterAddData recommendAfterAddData) {
        super(i, str, recommendAfterAddData, null, null);
    }
}
