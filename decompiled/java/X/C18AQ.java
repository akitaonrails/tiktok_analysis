package X;

import Y.ARunnableS101S0200000_32;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18AQ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18AQ {
    public static final C21240218Ae LIZ = new C21240218Ae();
    public static final CopyOnWriteArrayList<C18AN> LIZIZ = new CopyOnWriteArrayList<>(C1697810uHb.LJIIJJI(new C18AN() { // from class: X.18AR
        @Override // X.C18AN
        public final List LIZ(C18AO c18ao, C18AY c18ay, boolean z) {
            BcmParams bcmParams = c18ao.getBcmParams();
            if (bcmParams == null) {
                return C13BV.INSTANCE;
            }
            List<C18AX> list = c18ay.LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C18AX> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZ());
            }
            HashSet hashSet = new HashSet(bcmParams.toMap().keySet());
            hashSet.removeAll(C13LP.LLIIJI(arrayList));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(hashSet, 10));
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                arrayList2.add(C18AG.LIZ((String) it3.next(), C18AF.UNNEEDED_PARAM, null, null));
            }
            return arrayList2;
        }
    }, new C18AS(), new C18AN() { // from class: X.18AT
        @Override // X.C18AN
        public final List LIZ(C18AO c18ao, C18AY c18ay, boolean z) {
            Map<String, Object> map;
            Set<String> setKeySet;
            List<C18AX> list = c18ay.LIZ;
            ArrayList arrayList = new ArrayList();
            for (C18AX c18ax : list) {
                if (c18ax.LIZJ()) {
                    arrayList.add(c18ax);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C18AX) it2.next()).LIZ());
            }
            Set setLLIIIZ = C13LP.LLIIIZ(arrayList2);
            BcmParams bcmParams = c18ao.getBcmParams();
            if (bcmParams != null && (map = bcmParams.toMap()) != null && (setKeySet = map.keySet()) != null) {
                setLLIIIZ.removeAll(setKeySet);
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(setLLIIIZ, 10));
            Iterator it3 = setLLIIIZ.iterator();
            while (it3.hasNext()) {
                arrayList3.add(C18AG.LIZ((String) it3.next(), C18AF.MISS_PARAM, null, null));
            }
            return arrayList3;
        }
    }, new C18AN() { // from class: X.18AU
        public final C01GW LIZ = C452501pT.LIZIZ(new C18AW());

        @Override // X.C18AN
        public final List LIZ(C18AO c18ao, C18AY c18ay, boolean z) {
            Map<String, Object> map;
            boolean z2;
            if (!z) {
                return C13BV.INSTANCE;
            }
            BcmParams bcmParams = c18ao.getBcmParams();
            if (bcmParams != null) {
                map = bcmParams.toMap();
            } else {
                map = null;
            }
            String str = c18ay.LIZIZ;
            boolean z3 = false;
            if (map != null && !map.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (str == null || str.length() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    try {
                        C1778170wND c1778170wNDRun = ((InterfaceC1780150wQP) this.LIZ.getValue()).run();
                        C18CK.LIZ("Params_ExtraRule", new AwS147S1200000_32(c18ao, str, c1778170wNDRun, 8), true);
                        c1778170wNDRun.getClass();
                        if (!Intrinsics.LJFF(c1778170wNDRun.LIZ, Boolean.TRUE)) {
                            return Collections.singletonList(new C18AK(str));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                    return C13BV.INSTANCE;
                }
            }
            return C13BV.INSTANCE;
        }
    }));

    public static void LIZ(C18AO c18ao) {
        C18AY c18ayLIZ = LIZ.LIZ(c18ao.getBtm());
        if (c18ayLIZ == null) {
            C18CK.LIZ("ParamsChecker", new AwS576S0100000_32(c18ao, 41), false);
        } else {
            C18CK.LIZ("ParamsChecker", new AwS433S0200000_32(c18ao, c18ayLIZ, 3), false);
            C18GU.LIZ.LIZ(new ARunnableS101S0200000_32(c18ao, c18ayLIZ, 10), false);
        }
    }
}
