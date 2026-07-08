package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductInfoPackData;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758290vr9 extends Response<ProductInfoPackData> {
    public final List<? extends JSONObject> LL;
    public JSONObject LLILLJJLI;

    public C1758290vr9() {
        this(0, null, null, 31);
    }

    static {
    }

    public C1758290vr9(int i, String str, ProductInfoPackData productInfoPackData, int i2) {
        super((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : productInfoPackData, null, null);
        this.LL = null;
        this.LLILLJJLI = null;
        SystemClock.elapsedRealtime();
    }
}
