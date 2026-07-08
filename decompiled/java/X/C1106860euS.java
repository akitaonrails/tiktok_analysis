package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0euS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106860euS<KEY, VALUE> implements InterfaceC1106780euK<KEY, VALUE> {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1106880euU());
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public final PriorityBlockingQueue<Pair<Long, KEY>> LIZJ = new PriorityBlockingQueue<>(10, new Comparator() { // from class: X.0euT
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Intrinsics.LJII(((Number) ((Pair) obj).getFirst()).longValue(), ((Number) ((Pair) obj2).getFirst()).longValue());
        }
    });

    @Override // X.InterfaceC1106780euK
    public final void LIZIZ() {
        C20441214yg.LIZIZ("DataCenterCache", "clear cache");
        C09AE c09ae = (C09AE) this.LIZIZ.LL.get(C09AE.LJJLJ);
        if (c09ae != null) {
            C23118094a.LJFF(c09ae);
        }
        LJI().clear();
        this.LIZJ.clear();
    }

    public final ConcurrentHashMap<KEY, C1106820euO<VALUE>> LJI() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    @Override // X.InterfaceC1106780euK
    public final int LIZJ() {
        return LJI().size();
    }

    @Override // X.InterfaceC1106780euK
    public final void LIZ(KEY key) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("delete cache entry : key : ");
        sbLIZ.append(key);
        C20441214yg.LIZIZ("DataCenterCache", C2188811AlT.LIZIZ(sbLIZ));
        LJI().remove(key);
    }

    @Override // X.InterfaceC1106780euK
    public final boolean LIZLLL(KEY key) {
        return LJI().containsKey(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1106780euK
    public final void LJ(C1877807Xc c1877807Xc) {
        List listLLIIII = C13LP.LLIIII(LJI().keySet());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLLIIII) {
            if (((Boolean) c1877807Xc.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LIZ(it2.next());
        }
    }

    @Override // X.InterfaceC1106780euK
    public final C1106820euO<VALUE> get(KEY key) {
        C0KA2 c0ka2;
        C1106820euO<VALUE> c1106820euO = LJI().get(key);
        if (c1106820euO != null) {
            c1106820euO.LIZJ++;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("get cache entry: key: ");
        sbLIZ.append(key);
        C20441214yg.LIZIZ("DataCenterCache", C2188811AlT.LIZIZ(sbLIZ));
        if (c1106820euO != null) {
            c0ka2 = c1106820euO.LIZIZ;
        } else {
            c0ka2 = null;
        }
        if (Intrinsics.LJFF(c0ka2, C0KA3.LIZ) && c1106820euO.LIZJ >= 1) {
            LJI().remove(key);
            LJII(key, c1106820euO.LIZIZ, System.currentTimeMillis());
        }
        return c1106820euO;
    }

    public static void LJII(Object obj, C0KA2 c0ka2, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache expires: key: ");
        sbLIZ.append(obj);
        sbLIZ.append(" mode: ");
        sbLIZ.append(c0ka2);
        sbLIZ.append(" expireTime: ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("DataCenterCache", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1106780euK
    public final void LJFF(KEY key, VALUE value, C0KA2 c0ka2) {
        long jCurrentTimeMillis;
        C0KA3 c0ka3 = C0KA3.LIZ;
        if (Intrinsics.LJFF(c0ka2, c0ka3)) {
            jCurrentTimeMillis = -1;
        } else if (c0ka2 instanceof C0KA1) {
            jCurrentTimeMillis = System.currentTimeMillis() + (((C0KA1) c0ka2).LIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        } else {
            throw new C1954807lC();
        }
        ConcurrentHashMap<KEY, C1106820euO<VALUE>> concurrentHashMapLJI = LJI();
        System.currentTimeMillis();
        concurrentHashMapLJI.put(key, new C1106820euO<>(value, c0ka2, jCurrentTimeMillis));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new cache entry: key: ");
        sbLIZ.append(key);
        sbLIZ.append(" mode: ");
        sbLIZ.append(c0ka2);
        sbLIZ.append(" expireTime: ");
        sbLIZ.append(jCurrentTimeMillis);
        C20441214yg.LIZIZ("DataCenterCache", C2188811AlT.LIZIZ(sbLIZ));
        if (c0ka2 instanceof C0KA1) {
            C0KA1 c0ka1 = (C0KA1) c0ka2;
            if (jCurrentTimeMillis >= System.currentTimeMillis()) {
                long jLongValue = Long.MAX_VALUE;
                if (c0ka1.LIZ != Long.MAX_VALUE) {
                    Pair<Long, KEY> pairPeek = this.LIZJ.peek();
                    this.LIZJ.add(new Pair<>(Long.valueOf(jCurrentTimeMillis), key));
                    if (pairPeek != null) {
                        jLongValue = pairPeek.getFirst().longValue();
                    }
                    if (jCurrentTimeMillis < jLongValue) {
                        C09AE c09ae = (C09AE) this.LIZIZ.LL.get(C09AE.LJJLJ);
                        if (c09ae != null) {
                            C23118094a.LJFF(c09ae);
                        }
                        C23250099c.LIZLLL(this.LIZIZ, null, null, new C759650Tr1(this, null), 3);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c0ka2, c0ka3)) {
        } else {
            throw new C1954807lC();
        }
    }
}
