package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.api.profit.IapListResult;

/* JADX INFO: renamed from: X.0x3R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1804350x3R {
    public final List<? extends Diamond> LIZ;
    public final IapListResult.ListResultExtra LIZIZ;
    public final List<? extends Diamond> LIZJ;

    public static void LIZ(List list, Map map) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Diamond diamond = (Diamond) it2.next();
            Diamond diamond2 = (Diamond) ((LinkedHashMap) map).get(diamond.iapId);
            if (diamond2 != null) {
                diamond.LJFF = diamond2.LJFF;
                String str = diamond2.LIZIZ;
                diamond.LJI = str;
                diamond.price = diamond2.price;
                diamond.LIZJ = diamond2.LIZJ;
                diamond.LIZIZ = str;
                diamond.LJ = diamond2.LJ;
            }
        }
    }

    public C1804350x3R(List list, List list2, IapListResult.ListResultExtra listResultExtra) {
        this.LIZ = list;
        this.LIZIZ = listResultExtra;
        this.LIZJ = list2;
    }
}
