package X;

import Y.AfS167S0200000_34;
import Y.AfS198S0100000_29;
import com.bytedance.android.livesdk.client.IMessageApi;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Byl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public abstract class AbstractC2222531Byl implements IMessageWsClient {
    public IMessageApi LIZ;

    public final IMessageApi LIZ() {
        IMessageApi iMessageApi = this.LIZ;
        if (iMessageApi != null) {
            return iMessageApi;
        }
        C480460Ism.LIZ().getClass();
        IMessageApi iMessageApi2 = (IMessageApi) C480460Ism.LIZLLL(IMessageApi.class);
        this.LIZ = iMessageApi2;
        return iMessageApi2;
    }

    public static String LIZIZ(C2175508fh c2175508fh) {
        C080U next;
        String str;
        List<C080U> list = c2175508fh.LIZLLL;
        if (list != null) {
            Iterator<C080U> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF("x-tt-logid", next.LIZ)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C080U c080u = next;
            if (c080u != null && (str = c080u.LIZIZ) != null) {
                return str;
            }
        }
        return "";
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient
    public final AbstractC19666311wz<C2222611Byt, Exception> executeMessagePost(C1500700p9g c1500700p9g) {
        try {
            HashMap map = new HashMap();
            Map<String, String> map2 = c1500700p9g.LJII;
            if (map2 != null) {
                map.putAll(map2);
            }
            IMessageApi iMessageApiLIZ = LIZ();
            String str = c1500700p9g.LIZIZ;
            Map<String, String> map3 = c1500700p9g.LIZJ;
            if (map3 == null) {
                map3 = new HashMap<>();
            }
            Map<String, String> map4 = c1500700p9g.LIZLLL;
            if (map4 == null) {
                map4 = new HashMap<>();
            }
            C2175508fh c2175508fh = iMessageApiLIZ.doPost(str, map3, map4, map).execute().LIZ;
            if (c2175508fh.LIZJ()) {
                byte[] bytes = ((TypedByteArray) c2175508fh.LJ).getBytes();
                List<C080U> list = c2175508fh.LIZLLL;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (C080U c080u : list) {
                    arrayList.add(new C2221941Bxo(c080u.LIZ, c080u.LIZIZ));
                }
                C2222641Byw c2222641Byw = new C2222641Byw();
                int i = c2175508fh.LIZIZ;
                C2222611Byt c2222611Byt = c2222641Byw.LIZ;
                c2222611Byt.LIZ = i;
                c2222611Byt.LIZIZ = c2175508fh.LIZJ;
                c2222611Byt.LIZJ = arrayList;
                c2222611Byt.LIZLLL = bytes;
                return new C19666111wx(c2222611Byt);
            }
            String strLIZIZ = LIZIZ(c2175508fh);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("http post response failed, code: ");
            sbLIZ.append(c2175508fh.LIZIZ);
            sbLIZ.append(". logId: ");
            sbLIZ.append(strLIZIZ);
            C20441214yg.LJ("AbsMessageClient", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("status: ");
            sbLIZ2.append(c2175508fh.LIZIZ);
            sbLIZ2.append(", response: ");
            sbLIZ2.append(LIZIZ(c2175508fh));
            C20441214yg.LJ("AbsMessageClient", C2188811AlT.LIZIZ(sbLIZ2));
            return new C19666211wy(new Exception("response failed"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new C19666211wy(new Exception("http exception"));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient, X.InterfaceC2222651Byx
    public final void get(C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1) {
        IMessageApi iMessageApiLIZ = LIZ();
        String str = c1500700p9g.LIZIZ;
        Map<String, String> map = c1500700p9g.LIZJ;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = c1500700p9g.LIZLLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        iMessageApiLIZ.doGetAsync(str, map, map2).LJIILIIL(new C0UO0()).LJJLL(new AfS167S0200000_34(this, interfaceC19666511x1, 0), new AfS198S0100000_29(interfaceC19666511x1, 54));
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.IMessageWsClient, X.InterfaceC2222651Byx
    public final void post(C1500700p9g c1500700p9g, InterfaceC19666511x1 interfaceC19666511x1) {
        TypedByteArray typedByteArray = new TypedByteArray(c1500700p9g.LJI, c1500700p9g.LIZ(), new String[0]);
        IMessageApi iMessageApiLIZ = LIZ();
        String str = c1500700p9g.LIZIZ;
        Map<String, String> map = c1500700p9g.LIZJ;
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, String> map2 = c1500700p9g.LIZLLL;
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        iMessageApiLIZ.doPostAsync(str, map, map2, typedByteArray).LJIILIIL(new C0UO0()).LJJLL(new AfS167S0200000_34(this, interfaceC19666511x1, 1), new AfS198S0100000_29(interfaceC19666511x1, 55));
    }
}
