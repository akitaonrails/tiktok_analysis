package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0hyu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1224940hyu extends C1224950hyv {
    public C099G LLILZ;
    public final Set<String> LLILZIL;

    public final Set<String> LJJJJJ() {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
        if (interfaceC1226510i1R != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C1224840hyk> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LLILZ);
            }
            Set<String> setLLIIJI = C13LP.LLIIJI(arrayList);
            if (setLLIIJI != null) {
                return setLLIIJI;
            }
        }
        return C08CX.INSTANCE;
    }

    public C1224940hyu(AbstractC1225770i0F abstractC1225770i0F, C1227080i2M c1227080i2M) {
        super(abstractC1225770i0F, c1227080i2M);
        this.LLILZIL = new LinkedHashSet();
    }

    @Override // X.C1224950hyv, X.InterfaceC1223590hwj
    public final Object LJJIIZ(String str, InterfaceC1364105Vn<? super AbstractC1223670hwr> interfaceC1364105Vn) {
        return C2296808zG.LJ(new C1224930hyt(str, this, null), interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1224840hyk LJJJJIZL(X.C1224940hyu r14, X.C1224840hyk r15, java.lang.String r16, java.util.Set r17) {
        /*
            r6 = r15
            boolean r0 = r6.LLJILJILJ
            r5 = 0
            if (r0 != 0) goto L6e
            r0 = r14
            X.0i0F r3 = r0.LLILLJJLI
            X.0i1R r0 = r3.LLILLL
            if (r0 == 0) goto L58
            X.0hye r0 = r0.LJIILLIIL()
            if (r0 == 0) goto L58
            java.util.List<X.0hyk> r0 = r0.LIZIZ
            if (r0 == 0) goto L58
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r0.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L37
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0hyk r0 = (X.C1224840hyk) r0
            boolean r0 = r0.LLJILJILJ
            r0 = r0 ^ 1
            if (r0 == 0) goto L20
            r4.add(r1)
            goto L20
        L37:
            java.util.ArrayList r2 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C15438062q.LJIJJ(r4, r0)
            r2.<init>(r0)
            java.util.Iterator r1 = r4.iterator()
        L46:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r1.next()
            X.0hyk r0 = (X.C1224840hyk) r0
            java.lang.String r0 = r0.LLILZ
            r2.add(r0)
            goto L46
        L58:
            X.13BV r2 = X.C13BV.INSTANCE
        L5a:
            int r1 = r2.size()
            X.0i0G r0 = r3.LJJJJLL()
            X.0hxw r0 = r0.LIZJ()
            int r0 = r0.LIZIZ()
            if (r1 >= r0) goto L6e
            r13 = 0
            goto L6f
        L6e:
            r13 = 1
        L6f:
            X.0hyl r7 = new X.0hyl
            X.0bwD r1 = X.EnumC992630bwD.TYPE_SEARCH_PAGE
            java.lang.String r0 = ""
            r7.<init>(r1, r0)
            X.0hyj r8 = r6.LLILLJJLI
            java.lang.String r0 = r6.LLILZ
            r1 = r17
            boolean r12 = r1.contains(r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.LLJI
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r0)
            java.lang.String r1 = "is_search_page_item"
            java.lang.String r0 = "1"
            r10.put(r1, r0)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = "is_search_page_default_item"
            r10.put(r0, r1)
            r9 = 0
            r15 = 1
            r17 = 41212(0xa0fc, float:5.775E-41)
            r11 = r16
            r14 = r9
            r16 = r9
            X.0hyk r0 = X.C1224840hyk.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1224940hyu.LJJJJIZL(X.0hyu, X.0hyk, java.lang.String, java.util.Set):X.0hyk");
    }
}
