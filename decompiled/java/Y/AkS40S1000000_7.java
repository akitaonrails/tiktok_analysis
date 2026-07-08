package Y;

import X.C0IKQ;
import X.C0ITM;
import X.C0ITP;
import X.C467130ITn;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class AkS40S1000000_7 implements InterfaceC1487280oo2 {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public AkS40S1000000_7(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }

    public static final Object apply$0(AkS40S1000000_7 akS40S1000000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        ArrayList arrayList = new ArrayList(baseListResponse.data);
        C467130ITn.LIZJ(arrayList);
        if (!C0IKQ.LIZ(arrayList)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C467130ITn.LIZIZ((FeedItem) it2.next());
            }
        }
        return new C0ITM(new C0ITP(arrayList, (FeedExtra) baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "click", akS40S1000000_7.s0);
    }

    public static final Object apply$1(AkS40S1000000_7 akS40S1000000_7, Object obj) {
        BaseListResponse baseListResponse = (BaseListResponse) obj;
        ArrayList arrayList = new ArrayList(baseListResponse.data);
        C467130ITn.LIZJ(arrayList);
        if (!C0IKQ.LIZ(arrayList)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C467130ITn.LIZIZ((FeedItem) it2.next());
            }
        }
        return new C0ITM(new C0ITP(arrayList, (FeedExtra) baseListResponse.extra), baseListResponse.LIZIZ, baseListResponse.LIZJ, baseListResponse.LIZLLL, "click", akS40S1000000_7.s0);
    }
}
