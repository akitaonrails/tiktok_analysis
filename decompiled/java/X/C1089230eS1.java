package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eS1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089230eS1 implements InterfaceC1089220eS0 {
    public final Map<String, Pair<Strategy, InterfaceC1089740eSq>> LIZ = new LinkedHashMap();
    public final Map<String, C443120HZe<C1089700eSm<Object>, List<InterfaceC1089750eSr<Object>>, AbstractC1089300eS8<Object>>> LIZIZ = new LinkedHashMap();

    @Override // X.InterfaceC1089220eS0
    public final void prepare() {
    }

    @Override // X.InterfaceC1089220eS0
    public final Iterator<Pair<Strategy, InterfaceC1089740eSq>> LIZJ() {
        return ((LinkedHashMap) this.LIZ).values().iterator();
    }

    @Override // X.InterfaceC1089220eS0
    public final Collection<C443120HZe<C1089700eSm<Object>, List<InterfaceC1089750eSr<Object>>, AbstractC1089300eS8<Object>>> LJI() {
        return ((LinkedHashMap) this.LIZIZ).values();
    }

    @Override // X.InterfaceC1089220eS0
    public final void release() {
        Iterator<T> it2 = LJI().iterator();
        while (it2.hasNext()) {
            AbstractC1089300eS8 abstractC1089300eS8 = (AbstractC1089300eS8) ((C443120HZe) it2.next()).getThird();
            ((ArrayList) abstractC1089300eS8.LLILLJJLI).clear();
            abstractC1089300eS8.release();
        }
        Iterator<Pair<Strategy, InterfaceC1089740eSq>> itLIZJ = LIZJ();
        while (itLIZJ.hasNext()) {
            InterfaceC1089740eSq second = itLIZJ.next().getSecond();
            if (second != null) {
                second.onDestroy();
            }
        }
    }

    @Override // X.InterfaceC1089220eS0
    public final AbstractC1089300eS8<Object> LIZIZ(String str) {
        C443120HZe c443120HZe = (C443120HZe) ((LinkedHashMap) this.LIZIZ).get(str);
        if (c443120HZe != null) {
            return (AbstractC1089300eS8) c443120HZe.getThird();
        }
        return null;
    }

    @Override // X.InterfaceC1089220eS0
    public final Pair<Strategy, InterfaceC1089740eSq> LJ(String str) {
        return (Pair) ((LinkedHashMap) this.LIZ).get(str);
    }

    @Override // X.InterfaceC1089220eS0
    public final void LJFF(List<String> list) {
        if (list != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                Strategy strategyLIZIZ = C1089660eSi.LIZIZ(it2.next(), "");
                if (strategyLIZIZ != null) {
                    this.LIZ.put(strategyLIZIZ.decisionKey, new Pair<>(strategyLIZIZ, null));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0011 A[SYNTHETIC] */
    @Override // X.InterfaceC1089220eS0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<kotlin.Pair<com.bytedance.android.live.dynamicstrategy.strategy.Strategy, X.InterfaceC1089740eSq>> LJIIIIZZ(java.lang.String r6) {
        /*
            r5 = this;
            java.util.Map<java.lang.String, kotlin.Pair<com.bytedance.android.live.dynamicstrategy.strategy.Strategy, X.0eSq>> r0 = r5.LIZ
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L11:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r0 = r0.getSecond()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r3.getValue()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.getFirst()
            com.bytedance.android.live.dynamicstrategy.strategy.Strategy r1 = (com.bytedance.android.live.dynamicstrategy.strategy.Strategy) r1
            r1.getClass()
            com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting r0 = com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L68
            java.util.List r0 = r1.LIZIZ()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L4a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r1.next()
            X.0J0E r0 = (X.C0J0E) r0
            java.lang.String r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r6)
            if (r0 == 0) goto L4a
        L5e:
            java.lang.Object r0 = r3.getValue()
            if (r0 == 0) goto L11
            r2.add(r0)
            goto L11
        L68:
            java.util.List<java.lang.String> r0 = r1.relativeFactors
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L5e
            java.util.List<java.lang.String> r0 = r1.conditionFactors
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L11
            goto L5e
        L79:
            java.util.List r0 = X.C13LP.LLIIII(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1089230eS1.LJIIIIZZ(java.lang.String):java.util.List");
    }

    @Override // X.InterfaceC1089220eS0
    public final void LJII(Strategy strategy, InterfaceC1089740eSq interfaceC1089740eSq) {
        this.LIZ.put(strategy.decisionKey, new Pair<>(strategy, interfaceC1089740eSq));
    }

    @Override // X.InterfaceC1089220eS0
    public final <T> void LIZLLL(C1089700eSm<T> c1089700eSm, List<? extends InterfaceC1089750eSr<T>> list, AbstractC1089300eS8<T> abstractC1089300eS8) {
        this.LIZIZ.put(c1089700eSm.LIZ, new C443120HZe<>(c1089700eSm, list, abstractC1089300eS8));
    }
}
