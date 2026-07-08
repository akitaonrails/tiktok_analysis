package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: X.0os7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489810os7 {
    public static volatile C1489810os7 LIZ;
    public static C1489820os8 LIZIZ;
    public static final ReentrantReadWriteLock LIZJ = new ReentrantReadWriteLock();

    public static List LIZIZ(Request request, C1489830os9 c1489830os9, C1489840osA c1489840osA) {
        ArrayList arrayList = null;
        if (request != null) {
            if ((C086I.LIZIZ(c1489830os9.LIZLLL) && c1489830os9.LIZJ == null) || ((HashMap) c1489830os9.LIZJ).isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            if (!C086I.LIZIZ(c1489830os9.LIZLLL) && !request.getHeaders().isEmpty()) {
                for (String str : (HashSet) c1489830os9.LIZLLL) {
                    List<C080U> listHeaders = request.headers(str);
                    if (listHeaders != null) {
                        arrayList2.addAll(listHeaders);
                        hashSet.add(str);
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                c1489840osA.LIZLLL = hashSet;
                arrayList = new ArrayList(request.getHeaders());
                arrayList.removeAll(arrayList2);
            }
            Map<String, String> map = c1489830os9.LIZJ;
            if (map != null && !((HashMap) map).isEmpty()) {
                if (arrayList == null) {
                    arrayList = new ArrayList(request.getHeaders());
                }
                HashSet hashSet2 = new HashSet();
                for (Map.Entry entry : ((HashMap) c1489830os9.LIZJ).entrySet()) {
                    arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                    hashSet2.add(entry.getKey());
                }
                if (!hashSet2.isEmpty()) {
                    c1489840osA.LIZJ = hashSet2;
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(Map map, C1489830os9 c1489830os9, C1489840osA c1489840osA) {
        if (!map.isEmpty()) {
            if (!C086I.LIZIZ(c1489830os9.LIZIZ)) {
                HashSet hashSet = new HashSet();
                for (String str : (HashSet) c1489830os9.LIZIZ) {
                    try {
                        String strDecode = URLDecoder.decode(str, "UTF-8");
                        if (!TextUtils.isEmpty(strDecode) && map.containsKey(strDecode)) {
                            map.remove(strDecode);
                            hashSet.add(str);
                        }
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new RuntimeException(e);
                    }
                }
                if (!hashSet.isEmpty()) {
                    c1489840osA.LIZIZ = hashSet;
                }
            }
            HashSet hashSet2 = new HashSet();
            for (Map.Entry entry : ((HashMap) c1489830os9.LIZ).entrySet()) {
                map.put(entry.getKey(), Collections.singletonList(entry.getValue()));
                hashSet2.add(entry.getKey());
            }
            if (!hashSet2.isEmpty()) {
                c1489840osA.LIZ = hashSet2;
            }
        }
    }

    public static String LIZ(String str, Request request, C1489840osA c1489840osA, List list) {
        ReentrantReadWriteLock.ReadLock lock;
        List list2;
        C1489830os9 c1489830os9LIZIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZLLL = null;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = LIZJ;
            reentrantReadWriteLock.readLock().lock();
            C1489820os8 c1489820os8 = LIZIZ;
            if (c1489820os8 != null && c1489820os8.LIZ.get() && (c1489830os9LIZIZ = LIZIZ.LIZIZ(str)) != null) {
                pairLIZLLL = C2088908Gh.LIZLLL(str, linkedHashMap);
                LIZJ(linkedHashMap, c1489830os9LIZIZ, c1489840osA);
                List listLIZIZ = LIZIZ(request, c1489830os9LIZIZ, c1489840osA);
                if (!C086I.LIZIZ(listLIZIZ)) {
                    ((ArrayList) list).addAll(listLIZIZ);
                }
                lock = reentrantReadWriteLock.readLock();
            } else {
                reentrantReadWriteLock.readLock().unlock();
                return str;
            }
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                lock = LIZJ.readLock();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                LIZJ.readLock().unlock();
                throw th2;
            }
        }
        lock.unlock();
        if (pairLIZLLL == null) {
            return str;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) pairLIZLLL.first);
            sbLIZ.append((String) pairLIZLLL.second);
            C2089008Gi c2089008Gi = new C2089008Gi(C2188811AlT.LIZIZ(sbLIZ));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && (list2 = (List) entry.getValue()) != null && !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            c2089008Gi.LIZLLL((String) entry.getKey(), (String) it2.next());
                        }
                    }
                }
            }
            String strLJ = c2089008Gi.LJ();
            String encodedFragment = UriProtector.parse(str).getEncodedFragment();
            if (!TextUtils.isEmpty(encodedFragment)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJ);
                sbLIZ2.append("#");
                sbLIZ2.append(encodedFragment);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
            return strLJ;
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            return str;
        }
    }
}
