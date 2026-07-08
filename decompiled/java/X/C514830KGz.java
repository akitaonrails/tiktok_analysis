package X;

import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0KGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514830KGz {
    public List<SubscriptionProductDetailWithTemplateInfo> LIZ;
    public C515430KJh LIZIZ;
    public C0KH1 LIZJ;
    public Map<String, C0KFB> LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public C514830KGz() {
        this(null, null, null, null, false, false, 63);
    }

    public C514830KGz(List list, C515430KJh c515430KJh, C0KH1 c0kh1, Map map, boolean z, boolean z2, int i) {
        list = (i & 1) != 0 ? new ArrayList() : list;
        c515430KJh = (i & 2) != 0 ? null : c515430KJh;
        c0kh1 = (i & 4) != 0 ? null : c0kh1;
        map = (i & 8) != 0 ? C2097608Jq.LJ() : map;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? false : z2;
        this.LIZ = list;
        this.LIZIZ = c515430KJh;
        this.LIZJ = c0kh1;
        this.LIZLLL = map;
        this.LJ = z;
        this.LJFF = z2;
    }
}
