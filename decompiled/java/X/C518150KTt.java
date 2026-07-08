package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0KTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C518150KTt {
    public final boolean LIZ;
    public final Map<String, IapProductDetail> LIZIZ;
    public final C0KQW LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C518150KTt() {
        this(false, null, 0 == true ? 1 : 0, 7);
    }

    public C518150KTt(boolean z, Map<String, IapProductDetail> map, C0KQW c0kqw) {
        this.LIZ = z;
        this.LIZIZ = map;
        this.LIZJ = c0kqw;
    }

    public /* synthetic */ C518150KTt(boolean z, Map map, C0KQW c0kqw, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new HashMap() : map, (i & 4) != 0 ? null : c0kqw);
    }
}
