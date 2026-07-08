package X;

import Y.AComparatorS44S0000000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692220u8a implements CharSequence {
    public final List<C1692270u8f<? extends InterfaceC1692820u9Y>> LL;
    public final String LLILLJJLI;
    public final List<C1692270u8f<C1693450uAZ>> LLILLL;
    public final List<C1692270u8f<C1693480uAc>> LLILZ;

    public C1692220u8a() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = this.LLILLJJLI.hashCode() * 31;
        List<C1692270u8f<? extends InterfaceC1692820u9Y>> list = this.LL;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.LLILLJJLI.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.LLILLJJLI;
    }

    public C1692220u8a(String str) {
        this(str, C13BV.INSTANCE);
    }

    public final List LIZ(int i) {
        List<C1692270u8f<? extends InterfaceC1692820u9Y>> list = this.LL;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = ListProtector.get(list, i2);
                C1692270u8f c1692270u8f = (C1692270u8f) obj;
                if ((c1692270u8f.LIZ instanceof AbstractC1693010u9r) && C1692250u8d.LIZIZ(0, i, c1692270u8f.LIZIZ, c1692270u8f.LIZJ)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.LLILLJJLI.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692220u8a)) {
            return false;
        }
        C1692220u8a c1692220u8a = (C1692220u8a) obj;
        if (Intrinsics.LJFF(this.LLILLJJLI, c1692220u8a.LLILLJJLI) && Intrinsics.LJFF(this.LL, c1692220u8a.LL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1692220u8a(List<? extends C1692270u8f<? extends InterfaceC1692820u9Y>> list, String str) {
        ArrayList arrayList;
        List listLJLLLL;
        this.LL = list;
        this.LLILLJJLI = str;
        ArrayList arrayList2 = null;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            for (int i = 0; i < size; i++) {
                C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i);
                T t = c1692270u8f.LIZ;
                if (t instanceof C1693450uAZ) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1692270u8f);
                } else if (t instanceof C1693480uAc) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1692270u8f);
                }
            }
        } else {
            arrayList = null;
        }
        this.LLILLL = arrayList2;
        this.LLILZ = arrayList;
        if (arrayList != null && (listLJLLLL = C13LP.LJLLLL(new AComparatorS44S0000000_25(10), arrayList)) != null && !listLJLLLL.isEmpty()) {
            int i2 = ((C1692270u8f) C13LP.LJJJJZI(listLJLLLL)).LIZJ;
            C1688450u2V c1688450u2V = C1689960u4w.LIZ;
            C1688450u2V c1688450u2V2 = new C1688450u2V(1);
            c1688450u2V2.LIZJ(i2);
            int size2 = listLJLLLL.size();
            for (int i3 = 1; i3 < size2; i3++) {
                C1692270u8f c1692270u8f2 = (C1692270u8f) ListProtector.get(listLJLLLL, i3);
                while (true) {
                    if (c1688450u2V2.LIZIZ == 0) {
                        break;
                    }
                    int iLIZIZ = c1688450u2V2.LIZIZ();
                    if (c1692270u8f2.LIZIZ >= iLIZIZ) {
                        c1688450u2V2.LJFF(c1688450u2V2.LIZIZ - 1);
                    } else if (c1692270u8f2.LIZJ > iLIZIZ) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Paragraph overlap not allowed, end ");
                        sbLIZ.append(c1692270u8f2.LIZJ);
                        sbLIZ.append(" should be less than or equal to ");
                        sbLIZ.append(iLIZIZ);
                        C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                c1688450u2V2.LIZJ(c1692270u8f2.LIZJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1692220u8a subSequence(int r12, int r13) {
        /*
            r11 = this;
            r7 = 0
            if (r12 > r13) goto L31
            r0 = 1
        L4:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r0 != 0) goto L26
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r1.append(r12)
            java.lang.String r0 = ") should be less or equal to end ("
            r1.append(r0)
            r1.append(r13)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1681000tqU.LIZ(r0)
        L26:
            if (r12 != 0) goto L33
            java.lang.String r0 = r11.LLILLJJLI
            int r0 = r0.length()
            if (r13 != r0) goto L33
            return r11
        L31:
            r0 = 0
            goto L4
        L33:
            java.lang.String r0 = r11.LLILLJJLI
            java.lang.String r6 = r0.substring(r12, r13)
            java.util.List<X.0u8f<? extends X.0u9Y>> r5 = r11.LL
            X.0u8a r0 = X.C1692250u8d.LIZ
            if (r12 <= r13) goto L5b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r3)
            r1.append(r12)
            java.lang.String r0 = ") should be less than or equal to end ("
            r1.append(r0)
            r1.append(r13)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1681000tqU.LIZ(r0)
        L5b:
            if (r5 == 0) goto L9f
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r5.size()
            r8.<init>(r0)
            int r9 = r5.size()
        L6a:
            if (r7 >= r9) goto L99
            java.lang.Object r10 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, r7)
            X.0u8f r10 = (X.C1692270u8f) r10
            int r1 = r10.LIZIZ
            int r0 = r10.LIZJ
            boolean r0 = X.C1692250u8d.LIZIZ(r12, r13, r1, r0)
            if (r0 == 0) goto L96
            X.0u8f r4 = new X.0u8f
            T r3 = r10.LIZ
            int r0 = r10.LIZIZ
            int r2 = java.lang.Math.max(r12, r0)
            int r2 = r2 - r12
            int r0 = r10.LIZJ
            int r1 = java.lang.Math.min(r13, r0)
            int r1 = r1 - r12
            java.lang.String r0 = r10.LIZLLL
            r4.<init>(r3, r2, r1, r0)
            r8.add(r4)
        L96:
            int r7 = r7 + 1
            goto L6a
        L99:
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto La0
        L9f:
            r8 = 0
        La0:
            X.0u8a r0 = new X.0u8a
            r0.<init>(r8, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1692220u8a.subSequence(int, int):X.0u8a");
    }

    public C1692220u8a(String str, List<? extends C1692270u8f<? extends InterfaceC1692820u9Y>> list) {
        this(list.isEmpty() ? null : list, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1692220u8a(String str, List list, int i) {
        C13BV c13bv;
        list = (i & 2) != 0 ? C13BV.INSTANCE : list;
        ArrayList arrayList = null;
        if ((i & 4) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        C1692220u8a c1692220u8a = C1692250u8d.LIZ;
        if (list.isEmpty() && c13bv.isEmpty()) {
            list = arrayList;
        } else if (!c13bv.isEmpty()) {
            if (list.isEmpty()) {
                list = c13bv;
            } else {
                arrayList = new ArrayList(list.size() + c13bv.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(ListProtector.get(list, i2));
                }
                int size2 = c13bv.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    arrayList.add(ListProtector.get(c13bv, i3));
                }
                list = arrayList;
            }
        }
        this((List<? extends C1692270u8f<? extends InterfaceC1692820u9Y>>) list, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List LIZIZ(int i, int i2, String str) {
        List<C1692270u8f<? extends InterfaceC1692820u9Y>> list = this.LL;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(list, i3);
                if ((c1692270u8f.LIZ instanceof C1556440qba) && Intrinsics.LJFF(str, c1692270u8f.LIZLLL) && C1692250u8d.LIZIZ(i, i2, c1692270u8f.LIZIZ, c1692270u8f.LIZJ)) {
                    arrayList.add(new C1692270u8f(((C1556440qba) c1692270u8f.LIZ).LIZ, c1692270u8f.LIZIZ, c1692270u8f.LIZJ, c1692270u8f.LIZLLL));
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
