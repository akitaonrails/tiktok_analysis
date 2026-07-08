package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import com.ss.android.ugc.aweme.im.common.model.BatchStrangerUnlimitRequestBody;
import com.ss.android.ugc.aweme.im.common.model.StrangerUnlimitRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05qL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1477105qL {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(364));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(361));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(362));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(360));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(363));

    public static TikTokImApi LIZJ() {
        return (TikTokImApi) LIZ.getValue();
    }

    public static Object LIZLLL(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLJI = MethodIDManager.LJI(137395);
        Object objQueryAwemeList = ((TikTokImApi) LIZIZ.getValue()).queryAwemeList(str, str2, 0, interfaceC1364105Vn);
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return objQueryAwemeList;
    }

    public static Object LIZIZ(String str, int i, InterfaceC1364105Vn interfaceC1364105Vn, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return LIZJ().getGroupInviteInfo(str, i, false, interfaceC1364105Vn);
    }

    public static Object LIZ(List list, Integer num, EnumC1477205qM enumC1477205qM, Boolean bool, C610280Nwg c610280Nwg) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            arrayList.add(new StrangerUnlimitRequest((Long) pair.getFirst(), (String) pair.getSecond()));
        }
        return LIZJ().batchPostChatStrangeUnlimit(new BatchStrangerUnlimitRequestBody(arrayList, num, enumC1477205qM.getValue(), bool), c610280Nwg);
    }
}
