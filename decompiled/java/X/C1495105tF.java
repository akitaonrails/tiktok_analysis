package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05tF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1495105tF implements C0Z7C {
    public final String LIZ = "dm_chat_list_user_experience_event";
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(832));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(836));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(838));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(834));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(837));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(835));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(839));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(833));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(274));
    public volatile AnonymousClass0956 LJIIJ;

    @Override // X.C0Z7C
    public final boolean LIZJ() {
        return ((AtomicBoolean) this.LJII.getValue()).get();
    }

    public final ConcurrentHashMap<String, Object> LJ() {
        return (ConcurrentHashMap) this.LJ.getValue();
    }

    public final C1495105tF LJI() {
        ((AtomicReference) this.LIZJ.getValue()).set("user_click_inbox");
        return this;
    }

    public final C1495105tF LJII() {
        ((AtomicLong) this.LIZLLL.getValue()).set(10000L);
        return this;
    }

    public static Map LIZLLL(C1495105tF c1495105tF) {
        Object next;
        long jLongValue;
        long jLongValue2;
        Long l;
        Long l2;
        ConcurrentHashMap<String, Object> concurrentHashMapLJ = c1495105tF.LJ();
        C823170WQx c823170WQx = (C823170WQx) c1495105tF.LIZIZ.getValue();
        c1495105tF.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(concurrentHashMapLJ.size()));
        Iterator<T> it2 = concurrentHashMapLJ.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        ArrayList arrayList = new ArrayList();
        Iterator it3 = c823170WQx.iterator();
        while (true) {
            next = null;
            if (!it3.hasNext()) {
                break;
            }
            Object obj = concurrentHashMapLJ.get(it3.next());
            if ((obj instanceof Long) && obj != null) {
                arrayList.add(obj);
            }
        }
        Long l3 = (Long) C13LP.LJJLIIIJLJLI(arrayList);
        if (l3 != null) {
            long jLongValue3 = l3.longValue();
            Iterator it4 = c823170WQx.iterator();
            if (it4.hasNext()) {
                next = it4.next();
                if (it4.hasNext()) {
                    Object obj2 = concurrentHashMapLJ.get(next);
                    if ((obj2 instanceof Long) && (l2 = (Long) obj2) != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = -1;
                    }
                    do {
                        Object next2 = it4.next();
                        Object obj3 = concurrentHashMapLJ.get(next2);
                        if ((obj3 instanceof Long) && (l = (Long) obj3) != null) {
                            jLongValue2 = l.longValue();
                        } else {
                            jLongValue2 = -1;
                        }
                        if (jLongValue < jLongValue2) {
                            next = next2;
                            jLongValue = jLongValue2;
                        }
                    } while (it4.hasNext());
                }
            }
            linkedHashMap2.put("end_from_start_duration", String.valueOf(jLongValue3));
            if (next == null) {
                next = "invalid";
            }
            linkedHashMap2.put("last_tag", next);
            return linkedHashMap2;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.C0Z7C
    public final C1495105tF LIZIZ(Map map) {
        LJ().putAll(map);
        return this;
    }

    public final C1495105tF LJFF(String... strArr) {
        C19719612Di.LJJII((C823170WQx) this.LIZIZ.getValue(), strArr);
        return this;
    }

    @Override // X.C0Z7C
    public final C1495105tF LIZ(long j, String str, String str2) {
        boolean z;
        if (LIZJ()) {
            return this;
        }
        if (Intrinsics.LJFF(str, ((AtomicReference) this.LIZJ.getValue()).get()) && ((AtomicLong) this.LJFF.getValue()).compareAndSet(-1L, j)) {
            return this;
        }
        if (str2 != null) {
            ConcurrentHashMap<String, Object> concurrentHashMapLJ = LJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_status");
            concurrentHashMapLJ.put(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        long j2 = ((AtomicLong) this.LJFF.getValue()).get();
        if (j2 != -1) {
            long j3 = j - j2;
            if (j3 >= 0) {
                if (!((C823170WQx) this.LIZIZ.getValue()).contains(str)) {
                    if (LJ().get(str) == null) {
                        LJ().put(str, Long.valueOf(j3));
                    }
                    return this;
                }
                if (LJ().containsKey(str)) {
                    return this;
                }
                LJ().put(str, Long.valueOf(j3));
                C823170WQx c823170WQx = (C823170WQx) this.LIZIZ.getValue();
                if ((c823170WQx instanceof Collection) && c823170WQx.isEmpty()) {
                    z = true;
                } else {
                    Iterator it2 = c823170WQx.iterator();
                    while (it2.hasNext()) {
                        if (!LJ().containsKey(it2.next())) {
                            z = false;
                            break;
                        }
                    }
                    z = true;
                }
                if (((Number) C1495205tG.LIZ.getValue()).intValue() != 1 && z) {
                    ((AtomicBoolean) this.LJII.getValue()).set(true);
                    Map<String, String> mapLIZLLL = LIZLLL(this);
                    if (mapLIZLLL.isEmpty()) {
                        return this;
                    }
                    ((InterfaceC1493105sv) this.LJIIIIZZ.getValue()).sendEvent(this.LIZ, mapLIZLLL);
                    return this;
                }
                if (((AtomicLong) this.LIZLLL.getValue()).get() != Long.MAX_VALUE && !((AtomicBoolean) this.LJII.getValue()).get()) {
                    ((AtomicReference) this.LJI.getValue()).set(str);
                    AnonymousClass0956 anonymousClass0956 = this.LJIIJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LJIIJ = C23250099c.LIZLLL((InterfaceC497601wk) this.LJIIIZ.getValue(), null, null, new C1495005tE(this, str, null), 3);
                }
                return this;
            }
        }
        LJ().put(str, 0);
        return this;
    }
}
