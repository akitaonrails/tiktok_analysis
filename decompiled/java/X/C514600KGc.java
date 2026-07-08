package X;

import com.bytedance.android.livesdk.subscribe.model.PreCheckResult;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KGc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514600KGc {
    public final Map<String, List<SubscriptionProductDetailWithTemplateInfo>> LIZ;
    public final String LIZIZ;
    public final C515430KJh LIZJ;
    public final C0KH1 LIZLLL;

    public final boolean LIZ() {
        C515430KJh c515430KJh;
        C0KH1 c0kh1 = this.LIZLLL;
        Integer numValueOf = c0kh1 != null ? Integer.valueOf(c0kh1.LIZJ) : null;
        return (numValueOf != null && (numValueOf.intValue() == 5 || numValueOf.intValue() == 6)) || ((c515430KJh = this.LIZJ) != null && c515430KJh.LIZIZ == 4025009);
    }

    public final boolean LIZIZ() {
        C0KH1 c0kh1;
        PreCheckResult preCheckResult;
        if (this.LIZ.isEmpty()) {
            return false;
        }
        C515430KJh c515430KJh = this.LIZJ;
        return (c515430KJh == null || c515430KJh.LIZIZ == 4025009) && ((c0kh1 = this.LIZLLL) == null || (preCheckResult = c0kh1.LJ) == null || preCheckResult.status == 0) && !LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C514600KGc(Map<String, ? extends List<SubscriptionProductDetailWithTemplateInfo>> map, String str, C515430KJh c515430KJh, C0KH1 c0kh1) {
        this.LIZ = map;
        this.LIZIZ = str;
        this.LIZJ = c515430KJh;
        this.LIZLLL = c0kh1;
    }
}
