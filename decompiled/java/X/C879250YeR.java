package X;

import com.bytedance.im.core.proto.UrlStruct;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YeR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879250YeR {
    public static final boolean LIZLLL(C0YA1 c0ya1) {
        C1CHK c098200Yq;
        C1CHK c1chk;
        Object bizExtraCache = c0ya1.getBizExtraCache();
        if (!(bizExtraCache instanceof C1CHK) || (c1chk = (C1CHK) bizExtraCache) == null) {
            ByteString bizExtra = c0ya1.getBizExtra();
            if (bizExtra != null && bizExtra.size() != 0) {
                try {
                    c098200Yq = C1CHK.ADAPTER.decode(bizExtra);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                c1chk = (C1CHK) c098200Yq;
                if (c1chk != null) {
                    c0ya1.setBizExtraCache(c1chk);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return Intrinsics.LJFF(c1chk.is_ai, Boolean.TRUE);
    }

    public static final List<C455420HtU> LIZ(C869590Y9l c869590Y9l, String str) {
        UrlStruct urlStruct;
        long jLongValue;
        Long lLJIILIIL;
        Map<String, List<C0YA1>> propertyItemListMap = c869590Y9l.getPropertyItemListMap();
        if (propertyItemListMap != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<C0YA1>> entry : propertyItemListMap.entrySet()) {
                String key = entry.getKey();
                List<C0YA1> value = entry.getValue();
                if (C879170YeJ.LIZJ(key) && !value.isEmpty()) {
                    Iterator<C0YA1> it2 = value.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it2.next().idempotent_id, str)) {
                            C0YA1 c0ya1 = (C0YA1) C13LP.LJJJLL(value);
                            if (c0ya1 != null && (urlStruct = c0ya1.url) != null) {
                                String str2 = c0ya1.idempotent_id;
                                if (str2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
                                    jLongValue = lLJIILIIL.longValue();
                                } else {
                                    jLongValue = 0;
                                }
                                C455420HtU c455420HtULIZ = C879170YeJ.LIZ(jLongValue, key, new C0Z70(urlStruct.uri, urlStruct.url_list, urlStruct.width, urlStruct.height));
                                if (c455420HtULIZ != null) {
                                    arrayList.add(c455420HtULIZ);
                                }
                            }
                        }
                    }
                }
            }
            List<C455420HtU> listLLIIII = C13LP.LLIIII(arrayList);
            if (listLLIIII != null) {
                return listLLIIII;
            }
        }
        return C13BV.INSTANCE;
    }

    public static final List<C459160HzW> LIZIZ(C869590Y9l c869590Y9l, String str) {
        C0YA1 next;
        EnumC879260YeS enumC879260YeS;
        Map<String, List<C0YA1>> propertyItemListMap = c869590Y9l.getPropertyItemListMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<C0YA1>> entry : propertyItemListMap.entrySet()) {
            String key = entry.getKey();
            List<C0YA1> value = entry.getValue();
            if (C879170YeJ.LIZLLL(key)) {
                Iterator<C0YA1> it2 = value.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.idempotent_id, str)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C0YA1 c0ya1 = next;
                if (c0ya1 != null) {
                    boolean zLIZLLL = LIZLLL(c0ya1);
                    String str2 = C879170YeJ.LIZIZ(key).LIZ;
                    EnumC879260YeS.Companion.getClass();
                    if (zLIZLLL) {
                        enumC879260YeS = EnumC879260YeS.BOT;
                    } else {
                        enumC879260YeS = EnumC879260YeS.HUMAN;
                    }
                    arrayList.add(new C459160HzW(str2, enumC879260YeS));
                }
            }
        }
        return arrayList;
    }

    public static final List<C459160HzW> LIZJ(C869590Y9l c869590Y9l, String str) {
        List<C459160HzW> listLIZIZ = LIZIZ(c869590Y9l, str);
        ArrayList arrayList = new ArrayList();
        for (C459160HzW c459160HzW : listLIZIZ) {
            if (!c459160HzW.LIZIZ.isBot()) {
                arrayList.add(c459160HzW);
            }
        }
        return arrayList;
    }
}
