package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0EXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366250EXn implements C0EY4 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot>>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.List<kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot>>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List<kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrack, com.bytedance.ies.nle.editor_jni.NLETrackSlot>>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List<com.bytedance.ies.nle.editor_jni.NLETrack>] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List<com.bytedance.ies.nle.editor_jni.NLETrack>] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List<com.bytedance.ies.nle.editor_jni.NLETrack>] */
    public static void LIZIZ(EnumC366290EXr enumC366290EXr, Set set, C366270EXp c366270EXp, Map map) {
        ?? arrayList;
        ?? arrayList2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c366270EXp.getClass();
        int i = C366280EXq.LIZ[enumC366290EXr.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        arrayList = c366270EXp.LIZLLL;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    List<C0EY8> list = c366270EXp.LIZJ;
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<C0EY8> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().LIZIZ);
                    }
                }
            } else {
                arrayList = c366270EXp.LIZ;
            }
        } else {
            arrayList = c366270EXp.LIZIZ;
        }
        for (NLETrack nLETrack : arrayList) {
            Iterator it3 = set.iterator();
            while (it3.hasNext()) {
                InterfaceC366210EXj interfaceC366210EXj = (InterfaceC366210EXj) it3.next();
                if (interfaceC366210EXj.LIZJ(nLETrack)) {
                    C366330EXv c366330EXv = (C366330EXv) linkedHashMap.get(interfaceC366210EXj.getClass());
                    if (c366330EXv == null) {
                        c366330EXv = new C366330EXv(interfaceC366210EXj);
                    }
                    linkedHashMap.put(interfaceC366210EXj.getClass(), c366330EXv);
                    c366330EXv.LIZIZ.add(nLETrack);
                }
            }
        }
        int i2 = C366280EXq.LIZ[enumC366290EXr.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        arrayList2 = c366270EXp.LJII;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    List<C0EXF> list2 = c366270EXp.LJI;
                    arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<C0EXF> it4 = list2.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(it4.next().LIZIZ);
                    }
                }
            } else {
                arrayList2 = c366270EXp.LJ;
            }
        } else {
            arrayList2 = c366270EXp.LJFF;
        }
        for (Pair pair : arrayList2) {
            NLETrack nLETrack2 = (NLETrack) pair.getFirst();
            NLETrackSlot nLETrackSlot = (NLETrackSlot) pair.getSecond();
            Iterator it5 = set.iterator();
            while (it5.hasNext()) {
                InterfaceC366210EXj interfaceC366210EXj2 = (InterfaceC366210EXj) it5.next();
                if (interfaceC366210EXj2.LJII(nLETrack2, nLETrackSlot)) {
                    C366330EXv c366330EXv2 = (C366330EXv) linkedHashMap.get(interfaceC366210EXj2.getClass());
                    if (c366330EXv2 == null) {
                        c366330EXv2 = new C366330EXv(interfaceC366210EXj2);
                    }
                    linkedHashMap.put(interfaceC366210EXj2.getClass(), c366330EXv2);
                    c366330EXv2.LIZJ.add(nLETrackSlot);
                }
            }
        }
        for (C366330EXv c366330EXv3 : linkedHashMap.values()) {
            C0EXG c0exg = new C0EXG(C13LP.LLIIII(c366330EXv3.LIZIZ), C13LP.LLIIII(c366330EXv3.LIZJ));
            InterfaceC366210EXj interfaceC366210EXj3 = c366330EXv3.LIZ;
            C366240EXm c366240EXm = (C366240EXm) ((LinkedHashMap) map).get(interfaceC366210EXj3.getClass());
            if (c366240EXm == null) {
                c366240EXm = new C366240EXm(interfaceC366210EXj3);
            }
            map.put(interfaceC366210EXj3.getClass(), c366240EXm);
            c366240EXm.LIZ(enumC366290EXr, c0exg, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007a -> B:12:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0095 -> B:11:0x0037). Please report as a decompilation issue!!! */
    @Override // X.C0EY4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.C366270EXp r13, java.util.Set r14, X.C0EY3 r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C366250EXn.LIZ(X.0EXp, java.util.Set, X.0EY3, X.05Vn):java.lang.Object");
    }
}
