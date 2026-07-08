package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import com.ss.android.ugc.aweme.feed.model.banner.ConditionData;
import com.ss.android.ugc.feed.platform.ab.FcpKmpCrossValidationExp;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS160S1100000_11;
import kotlin.jvm.internal.AwS96S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Re7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C700690Re7 {
    public static final Map<String, InterfaceC1631630sYr<C700720ReA, C700760ReE, List<String>, List<String>, List<String>>> LIZ = C2097608Jq.LJIIJ(new Pair("n_1", C700700Re8.LL), new Pair("m_n_area", C700710Re9.LL));

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b A[PHI: r0
      0x001b: PHI (r0v3 T) = (r0v2 T), (r0v4 T) binds: [B:10:0x0018, B:5:0x000b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T LJFF(java.lang.Object r2) {
        /*
            boolean r0 = r2 instanceof X.InterfaceC1452605mO
            r1 = 0
            if (r0 == 0) goto Le
            X.05mP r2 = (X.InterfaceC1452705mP) r2
            java.lang.Object r0 = r2.getData()
            if (r0 != 0) goto L1b
        Ld:
            return r1
        Le:
            boolean r0 = r2 instanceof X.InterfaceC700750ReD
            if (r0 == 0) goto Ld
            X.0ReD r2 = (X.InterfaceC700750ReD) r2
            java.lang.Object r0 = r2.getData()
            if (r0 != 0) goto L1b
            return r1
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700690Re7.LJFF(java.lang.Object):java.lang.Object");
    }

    public static final C700730ReB LIZ(C700720ReA c700720ReA, Function0 function0, C700730ReB c700730ReB) {
        Map<String, GlobalComponentData> map;
        Map<String, Integer> map2;
        Map<String, ConditionData> map3;
        boolean z;
        ClientStandardModel clientStandardModelKn = c700720ReA.LJFF.kn(c700720ReA.LIZIZ);
        if (clientStandardModelKn == null && (clientStandardModelKn = (ClientStandardModel) function0.invoke()) != null && (map3 = clientStandardModelKn.componentsConditionMap) != null) {
            ArrayList arrayList = new ArrayList(map3.size());
            Iterator<Map.Entry<String, ConditionData>> it2 = map3.entrySet().iterator();
            while (it2.hasNext()) {
                ConditionData value = it2.next().getValue();
                if (value.slotConsumeTimes > 0 && Intrinsics.LJFF(value.canDefaultApplySlot, Boolean.TRUE)) {
                    z = true;
                } else {
                    z = false;
                }
                value.setCanApplySlot(z);
                value.setCanApplyDisplay(Intrinsics.LJFF(value.canDefaultApplyDisplay, Boolean.TRUE));
                arrayList.add(Unit.LIZ);
            }
        }
        ArrayList arrayList2 = new ArrayList(c700730ReB.LIZ);
        ArrayList arrayList3 = new ArrayList(c700730ReB.LIZ);
        if (clientStandardModelKn != null) {
            arrayList2.clear();
            arrayList3.clear();
            c700720ReA.LJII.LJLI();
            FeedComponentPriorityData feedComponentPriorityDataInvoke = c700720ReA.LJ.invoke();
            Map<String, ConditionData> map4 = clientStandardModelKn.componentsConditionMap;
            if (map4 != null) {
                ArrayList arrayList4 = new ArrayList(map4.size());
                for (Map.Entry<String, ConditionData> entry : map4.entrySet()) {
                    FcpKmpCrossValidationExp fcpKmpCrossValidationExp = FcpKmpCrossValidationExp.LIZ;
                    String str = c700720ReA.LIZ;
                    fcpKmpCrossValidationExp.getClass();
                    if (!FcpKmpCrossValidationExp.LIZ(str) || ((map2 = clientStandardModelKn.componentsUiTypeMap) != null && map2.get(entry.getKey()) != null)) {
                        arrayList2.add(entry.getKey());
                        if (feedComponentPriorityDataInvoke != null && (map = feedComponentPriorityDataInvoke.globalComponentMap) != null && map.containsKey(entry.getKey())) {
                            arrayList3.add(entry.getKey());
                        }
                    }
                    arrayList4.add(Unit.LIZ);
                }
            }
            if (feedComponentPriorityDataInvoke != null) {
                c700720ReA.LJII.LJLI();
                C700080Rd8.LIZ(feedComponentPriorityDataInvoke, c700720ReA.LIZJ, arrayList3, c700720ReA.LIZIZ);
            }
            c700720ReA.LJFF.p5(clientStandardModelKn, c700720ReA.LIZIZ);
        }
        return C700730ReB.LIZ(c700730ReB, C13LP.LJJJJI(arrayList2), C13LP.LJJJJI(arrayList3), null, null, null, 28);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C700730ReB LIZIZ(X.C700720ReA r29, X.C700730ReB r30, java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700690Re7.LIZIZ(X.0ReA, X.0ReB, java.lang.Object):X.0ReB");
    }

    public static final C700730ReB LIZJ(C700720ReA c700720ReA, C700730ReB c700730ReB, Object obj) {
        ConditionData conditionData;
        boolean z;
        Map<String, ConditionData> map;
        String str = (String) LJFF(obj);
        ClientStandardModel clientStandardModelKn = c700720ReA.LJFF.kn(c700720ReA.LIZIZ);
        if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsConditionMap) != null) {
            conditionData = map.get(str);
        } else {
            conditionData = null;
        }
        ArrayList arrayList = new ArrayList(c700730ReB.LIZJ);
        ArrayList arrayList2 = new ArrayList(c700730ReB.LIZLLL);
        ArrayList arrayList3 = new ArrayList(c700730ReB.LJ);
        if (C123100dR.LIZ(str) && conditionData != null) {
            if (conditionData.slotConsumeTimes > 0) {
                z = true;
            } else {
                z = false;
            }
            conditionData.setCanApplySlot(z);
            conditionData.setCanApplyDisplay(conditionData.canApplySlot);
            if (conditionData.canApplySlot) {
                arrayList.add(str);
            } else {
                arrayList.remove(str);
                arrayList2.remove(str);
            }
            String strLJLI = c700720ReA.LJII.LJLI();
            if (arrayList2.contains(str)) {
                C697890RZb.LIZIZ(strLJLI, str, EnumC699110RbZ.FINALSHOW, C0RZ2.SUCCEED);
                arrayList3.add(str);
            } else {
                C697890RZb.LIZIZ(strLJLI, str, EnumC699110RbZ.FINALSHOW, C0RZ2.FAILED);
                arrayList3.remove(str);
            }
            c700720ReA.LJII.LJLI();
            new AwS160S1100000_11(str, conditionData, 14);
            C0T6L.LIZLLL();
        }
        return C700730ReB.LIZ(c700730ReB, null, null, C13LP.LJJJJI(arrayList), C13LP.LJJJJI(arrayList2), C13LP.LJJJJI(arrayList3), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x006b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C700730ReB LIZLLL(X.C700720ReA r15, X.C700730ReB r16, java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C700690Re7.LIZLLL(X.0ReA, X.0ReB, java.lang.Object):X.0ReB");
    }

    public static final C700730ReB LJ(C700720ReA c700720ReA, C700730ReB c700730ReB, Object obj) {
        Map<String, ConditionData> map;
        ConditionData conditionData;
        ClientStandardModel clientStandardModelKn = c700720ReA.LJFF.kn(c700720ReA.LIZIZ);
        String str = (String) LJFF(obj);
        ArrayList arrayList = new ArrayList(c700730ReB.LIZJ);
        ArrayList arrayList2 = new ArrayList(c700730ReB.LIZJ);
        ArrayList arrayList3 = new ArrayList(c700730ReB.LIZLLL);
        String strLJLI = c700720ReA.LJII.LJLI();
        if (C123100dR.LIZ(str)) {
            C697890RZb.LIZIZ(strLJLI, str, EnumC699110RbZ.FINALSHOW, C0RZ2.FAILED);
            arrayList2.remove(str);
            if (clientStandardModelKn != null && (map = clientStandardModelKn.componentsConditionMap) != null && (conditionData = map.get(str)) != null) {
                conditionData.setCanApplyDisplay(false);
                if (Intrinsics.LJFF(conditionData.canDefaultReleaseSlot, Boolean.TRUE)) {
                    conditionData.setSlotConsumeTimes(conditionData.slotConsumeTimes - 1);
                    conditionData.setCanApplySlot(false);
                    arrayList3.remove(str);
                    arrayList.remove(str);
                }
                c700720ReA.LJII.LJLI();
                new AwS160S1100000_11(str, conditionData, 15);
                C0T6L.LIZLLL();
            } else {
                c700720ReA.LJII.LJLI();
                new AwS96S1000000_11(str, 13);
                C0T6L.LIZLLL();
            }
        }
        return C700730ReB.LIZ(c700730ReB, null, null, C13LP.LJJJJI(arrayList), C13LP.LJJJJI(arrayList3), C13LP.LJJJJI(arrayList2), 3);
    }
}
