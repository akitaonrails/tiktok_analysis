package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0WYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825100WYi extends C09AY implements Function0<Object> {
    public final /* synthetic */ C0WZH LL;
    public final /* synthetic */ C0WZJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C825100WYi(C0WZH c0wzh, C0WZJ c0wzj) {
        super(0);
        this.LL = c0wzh;
        this.LLILLJJLI = c0wzj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0WZH c0wzh = this.LL;
        Object[] objArr = this.LLILLJJLI.LIZJ;
        c0wzh.getClass();
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            URL url = new URL(String.valueOf(objArr != null ? objArr[0] : null));
            String host = url.getHost();
            String path = url.getPath();
            linkedHashMap.put("Domain", host);
            linkedHashMap.put("Path", path);
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(String.valueOf(objArr != null ? objArr[1] : null), new String[]{";"}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
            }
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) C13LP.LJJJJZI(arrayList), new String[]{"="}, 0, 6);
            if (listLJJLIIIJILLIZJL2.size() == 2) {
                linkedHashMap.put("Name", a0.LJLIIIL((String) listLJJLIIIJILLIZJL2.get(0)).toString());
            } else if (listLJJLIIIJILLIZJL2.size() == 1) {
                linkedHashMap.put("Name", "pns-null");
            }
            Iterator it3 = C13LP.LJJJJIZL(arrayList, 1).iterator();
            while (it3.hasNext()) {
                List listLJJLIIIJILLIZJL3 = a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 0, 6);
                if (listLJJLIIIJILLIZJL3.size() == 2) {
                    linkedHashMap.put(a0.LJLIIIL((String) listLJJLIIIJILLIZJL3.get(0)).toString(), a0.LJLIIIL((String) listLJJLIIIJILLIZJL3.get(1)).toString());
                } else if (listLJJLIIIJILLIZJL3.size() == 1) {
                    linkedHashMap.put(a0.LJLIIIL((String) listLJJLIIIJILLIZJL3.get(0)).toString(), "1");
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            List<String> listLJIIJJI = C1697810uHb.LJIIJJI("Name", "Domain", "Path", "HttpOnly", "SameSite", "Partitioned", "Secure", "Expires", "Max-Age");
            for (String str : listLJIIJJI) {
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = "pns-null";
                }
                linkedHashMap2.put(str, obj);
            }
            Set setKeySet = linkedHashMap.keySet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : setKeySet) {
                if (!listLJIIJJI.contains((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                arrayList3.add(C2097908Jt.LIZJ(new Pair("field_name", (String) it4.next())));
            }
            linkedHashMap2.put("cookie_content_fields", arrayList3);
            return new Gson().LJIILL(linkedHashMap2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ("PB_API_CALLING", new C5182020e(e, 557), 3, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("error:");
            sbLIZ.append(e.getMessage());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
