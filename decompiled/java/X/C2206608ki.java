package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.08ki, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2206608ki {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("repost_sort", "2002019"), new Pair("share_more", "2002019"), new Pair("skylight_activity_status", "2002019"), new Pair("im_user", "2002019"), new Pair("shared_feed_client_ai", "2002019"));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(293));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(294));

    public static List LIZ() {
        List listLJJJJI = C13LP.LJJJJI(((Map) LIZJ.getValue()).values());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJJJI, 10));
        Iterator it2 = listLJJJJI.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
        }
        return arrayList;
    }
}
