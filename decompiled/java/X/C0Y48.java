package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Y48, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y48 implements C0YDW {
    public final C0YEM LL;
    public final InterfaceC869500Y9c LLILLJJLI;
    public boolean LLILLL;
    public C0Y45 LLILZ;
    public final C0Y49 LLILZIL = new C0Y4A() { // from class: X.0Y49
        @Override // X.C0Y4B, X.InterfaceC868050Y3n
        public final void LJJLIIIJ(C0Y8T c0y8t) {
            if (c0y8t != null && c0y8t.isTemp()) {
                this.LL.LIZ(Collections.singletonList(Long.valueOf(c0y8t.getConversationShortId())), false);
            }
        }
    };

    public final C0Y45 LIZJ() {
        Object c098200Yq;
        C0Y45 c0y45 = this.LLILZ;
        if (c0y45 != null) {
            return c0y45;
        }
        try {
            c098200Yq = (C0Y45) C09EF.LIZ.LJII(this.LLILLJJLI.LJJJLL(), C0Y45.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C0Y45 c0y452 = (C0Y45) c098200Yq;
        this.LLILZ = c0y452;
        return c0y452;
    }

    public final void LIZLLL() {
        C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "logout", 4);
        this.LLILZ = null;
        this.LL.LJIIZILJ().LIZLLL().LIZ().LJJII(this.LLILZIL);
    }

    public final void LJ() {
        C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "login", 4);
        this.LL.LJIIZILJ().LIZLLL().LIZ().LJJLIIIJILLIZJL(this.LLILZIL);
    }

    @Override // X.C0YDW
    public final void LJJIJIL() {
        Pair pair;
        C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "checkNeedFetch: start", 4);
        if (this.LL.LJIIIZ().LJJLIIIIJ.LJIL) {
            C0Y45 c0y45LIZJ = LIZJ();
            if (c0y45LIZJ == null) {
                C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "checkNeedFetch: local no cache. <true true>", 4);
                Boolean bool = Boolean.TRUE;
                pair = new Pair(bool, bool);
            } else {
                long j = c0y45LIZJ.LIZLLL;
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                Calendar calendar = Calendar.getInstance(timeZone);
                calendar.setTimeInMillis(j);
                Calendar calendar2 = Calendar.getInstance(timeZone);
                if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
                    Collection<C0Y44> collectionValues = c0y45LIZJ.LIZ.values();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : collectionValues) {
                        if (((C0Y44) obj).LIZJ) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() < c0y45LIZJ.LIZIZ) {
                        C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "checkNeedFetch: available ids size less than threshold. <true true>", 4);
                        Boolean bool2 = Boolean.TRUE;
                        pair = new Pair(bool2, bool2);
                    } else {
                        C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "checkNeedFetch: no need to fetch. <false false>", 4);
                        Boolean bool3 = Boolean.FALSE;
                        pair = new Pair(bool3, bool3);
                    }
                } else {
                    C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "checkNeedFetch: not the same day. <true false>", 4);
                    pair = new Pair(Boolean.TRUE, Boolean.FALSE);
                }
            }
        } else {
            C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "checkNeedFetch: not hit experiment. <false false>", 4);
            Boolean bool4 = Boolean.FALSE;
            pair = new Pair(bool4, bool4);
        }
        if (((Boolean) pair.getFirst()).booleanValue()) {
            LIZIZ(((Boolean) pair.getSecond()).booleanValue());
        }
    }

    @Override // X.C0YDW
    public final List<Long> LJJI() {
        C0Y45 c0y45LIZJ = LIZJ();
        if (c0y45LIZJ == null) {
            return C13BV.INSTANCE;
        }
        Collection<C0Y44> collectionValues = c0y45LIZJ.LIZ.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((C0Y44) obj).LIZJ) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((C0Y44) it2.next()).LIZ));
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Y49] */
    public C0Y48(C0YEM c0yem) {
        this.LL = c0yem;
        this.LLILLJJLI = c0yem.LJIIZILJ().LIZIZ().LIZJ();
    }

    public final void LIZIZ(boolean z) {
        if (this.LLILLL) {
            C868780Y6i.LJIILJJIL(this.LL.LIZLLL(), "TAG_DefaultConversationPrefetchIdModel", "fetchConvIds: former fetch id request not finish, drop this request", 4);
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLILLL = true;
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchConvIds: start. needIds: ");
        sbLIZ.append(z);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "TAG_DefaultConversationPrefetchIdModel", C2188811AlT.LIZIZ(sbLIZ), 4);
        C23250099c.LIZLLL(this.LL.LIZJ(), null, null, new C0Y43(this, z, jCurrentTimeMillis, null), 3);
    }

    public final void LJFF(C0Y45 c0y45) {
        this.LLILLJJLI.LJIILL(GsonProtectorUtils.toJson(C09EF.LIZ, c0y45));
        this.LLILZ = c0y45;
    }

    @Override // X.C0YDW
    public final boolean LJIJJ(C0YMW c0ymw) {
        C0Y8K c0y8k;
        Throwable throwable = null;
        if (c0ymw != null) {
            throwable = c0ymw.getThrowable();
        }
        if ((throwable instanceof C0Y8K) && (c0y8k = (C0Y8K) throwable) != null) {
            return c0y8k.isRecoverableFailure();
        }
        return false;
    }

    public final void LIZ(final List<Long> list, boolean z) {
        C868780Y6i c868780Y6iLIZLLL = this.LL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear idWrapper cache, convShortId:");
        sbLIZ.append(list);
        sbLIZ.append(", needDelete:");
        sbLIZ.append(z);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "TAG_DefaultConversationPrefetchIdModel", C2188811AlT.LIZIZ(sbLIZ), 4);
        C0Y45 c0y45LIZJ = LIZJ();
        final int i = 0;
        if (c0y45LIZJ != null) {
            Set<Long> setKeySet = c0y45LIZJ.LIZ.keySet();
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                Iterator<T> it2 = setKeySet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (list.contains(Long.valueOf(((Number) it2.next()).longValue()))) {
                        Map<Long, C0Y44> map = c0y45LIZJ.LIZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<Long, C0Y44> entry : map.entrySet()) {
                            if (!list.contains(Long.valueOf(entry.getValue().LIZ))) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        LJFF(new C0Y45(c0y45LIZJ.LIZIZ, c0y45LIZJ.LIZJ, c0y45LIZJ.LIZLLL, new LinkedHashMap(linkedHashMap)));
                    }
                }
            }
        }
        if (z) {
            final ArrayList arrayList = new ArrayList();
            for (Long l : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    this.LL.LJIIZILJ().LIZLLL().LIZ().LJJLIL(String.valueOf(l.longValue()), new C863590XuH<C0Y8T>() { // from class: X.0XuJ
                        @Override // X.C863590XuH, X.InterfaceC863600XuI
                        public final void onSuccess(Object obj) {
                            C0Y8T c0y8t = (C0Y8T) obj;
                            if (c0y8t != null && c0y8t.isTemp()) {
                                arrayList.add(c0y8t);
                            }
                            if (i == list.size() - 1 && arrayList.size() > 0) {
                                List<C0Y8T> list2 = arrayList;
                                C0Y48 c0y48 = this;
                                ArrayList arrayList2 = new ArrayList();
                                for (C0Y8T c0y8t2 : list2) {
                                    if (!c0y48.LL.LJIIZILJ().LIZLLL().LIZLLL().LJJIJLIJ(c0y8t2.getConversationId())) {
                                        arrayList2.add(c0y8t2);
                                    }
                                }
                                C868780Y6i c868780Y6iLIZLLL2 = this.LL.LIZLLL();
                                StringBuilder sb = new StringBuilder("clear conversations, finalList: ");
                                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(((C0Y8T) it3.next()).getConversationId());
                                }
                                sb.append(arrayList3);
                                C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "TAG_DefaultConversationPrefetchIdModel", sb.toString(), 4);
                                if (!arrayList2.isEmpty()) {
                                    this.LL.LJIIZILJ().LIZLLL().LIZ().LJJIJIL(arrayList2, Boolean.TRUE, new C863590XuH());
                                }
                            }
                        }
                    });
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }
}
