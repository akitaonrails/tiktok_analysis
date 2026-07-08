package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.15BL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15BL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str) {
        C20441214yg.LIZIZ("ChampionAlgo", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LIZ(List list, List list2) {
        int size = ((ArrayList) list).size();
        int size2 = ((ArrayList) list2).size();
        int i = size + 1;
        C1198504mV[][] c1198504mVArr = new C1198504mV[i][];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = size2 + 1;
            C1198504mV[] c1198504mVArr2 = new C1198504mV[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                c1198504mVArr2[i4] = new C1198504mV();
            }
            c1198504mVArr[i2] = c1198504mVArr2;
        }
        if (1 <= size) {
            int i5 = 1;
            while (true) {
                if (1 <= size2) {
                    int i6 = 1;
                    while (true) {
                        int i7 = i5 - 1;
                        int i8 = i6 - 1;
                        if (((C15BM) ListProtector.get(list, i7)).LIZIZ == ((C15BM) ListProtector.get(list2, i8)).LIZIZ) {
                            c1198504mVArr[i5][i6] = new C1198504mV(C13LP.LJLILLLLZI(new Pair(Long.valueOf(((C15BM) ListProtector.get(list2, i8)).LIZJ), Integer.valueOf(i8)), c1198504mVArr[i7][i8].LIZ));
                        } else {
                            Object[] objArr = c1198504mVArr[i7][i6];
                            Object[] objArr2 = c1198504mVArr[i5];
                            objArr2[i6] = C13LP.LJJJJZI(C13LP.LJLLLL(C20085613iQ.LIZ(AFwS276S0000000_31.get$arr$(305), AFwS276S0000000_31.get$arr$(306), AFwS276S0000000_31.get$arr$(307)), C1697810uHb.LJIIJJI(objArr, objArr2[i8])));
                        }
                        if (i6 == size2) {
                            break;
                        }
                        i6++;
                    }
                }
                if (i5 == size) {
                    break;
                }
                i5++;
            }
        }
        List<Pair<Long, Integer>> list3 = c1198504mVArr[size][size2].LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator<Pair<Long, Integer>> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList.add(ListProtector.get(list2, it2.next().getSecond().intValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        r7.add(new X.C15BH(X.C15BK.REMOVE, r8, -1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C13EO LIZJ(java.util.List r9, java.util.List r10) {
        /*
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.util.Iterator r9 = r9.iterator()
        Lb:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r8 = r9.next()
            X.15BM r8 = (X.C15BM) r8
            r0 = r10
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r6 = r0.iterator()
        L1e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r5 = r6.next()
            r0 = r5
            X.15BM r0 = (X.C15BM) r0
            long r3 = r0.LIZIZ
            long r1 = r8.LIZIZ
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1e
            if (r5 != 0) goto Lb
        L35:
            X.15BH r2 = new X.15BH
            X.15BK r1 = X.C15BK.REMOVE
            r0 = -1
            r2.<init>(r1, r8, r0)
            r7.add(r2)
            goto Lb
        L41:
            X.13EO r0 = new X.13EO
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15BL.LIZJ(java.util.List, java.util.List):X.13EO");
    }
}
