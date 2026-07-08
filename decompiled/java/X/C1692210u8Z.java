package X;

import Y.AComparatorS44S0000000_25;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0u8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692210u8Z implements InterfaceC1692630u9F {
    public final C1692220u8a LIZ;
    public final List<C1692270u8f<C1680210tpD>> LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final List<C1692590u9B> LJ;

    @Override // X.InterfaceC1692630u9F
    public final boolean LIZ() {
        List<C1692590u9B> list = this.LJ;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((C1692590u9B) ListProtector.get(list, i)).LIZ.LIZ()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1692630u9F
    public final float LIZIZ() {
        return ((Number) this.LIZJ.getValue()).floatValue();
    }

    @Override // X.InterfaceC1692630u9F
    public final float LIZJ() {
        return ((Number) this.LIZLLL.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1692210u8Z(C1692220u8a c1692220u8a, C1693430uAX c1693430uAX, List<C1692270u8f<C1680210tpD>> list, InterfaceC1690500u5o interfaceC1690500u5o, InterfaceC594710NUf interfaceC594710NUf) {
        String strSubstring;
        this.LIZ = c1692220u8a;
        this.LIZIZ = list;
        EnumC452301pR enumC452301pR = EnumC452301pR.NONE;
        this.LIZJ = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1181));
        this.LIZLLL = C452501pT.LIZ(enumC452301pR, new AwS569S0100000_25(this, 1180));
        C1693480uAc c1693480uAc = c1693430uAX.LIZIZ;
        C1692220u8a c1692220u8a2 = C1692250u8d.LIZ;
        List<C1692270u8f<C1693480uAc>> list2 = c1692220u8a.LLILZ;
        List listLJLLLL = (list2 == null || (listLJLLLL = C13LP.LJLLLL(new AComparatorS44S0000000_25(11), list2)) == null) ? C13BV.INSTANCE : listLJLLLL;
        ArrayList arrayList = new ArrayList();
        C13E8 c13e8 = new C13E8();
        int size = listLJLLLL.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            C1692270u8f c1692270u8f = (C1692270u8f) ListProtector.get(listLJLLLL, i2);
            C1692270u8f c1692270u8fLIZ = C1692270u8f.LIZ(c1692270u8f, c1693480uAc.LIZ((C1693480uAc) c1692270u8f.LIZ), i, 14);
            while (i3 < c1692270u8fLIZ.LIZIZ && (!c13e8.isEmpty())) {
                C1692270u8f c1692270u8f2 = (C1692270u8f) c13e8.last();
                int i4 = c1692270u8fLIZ.LIZIZ;
                int i5 = c1692270u8f2.LIZJ;
                if (i4 < i5) {
                    arrayList.add(new C1692270u8f(i3, i4, c1692270u8f2.LIZ));
                    i3 = c1692270u8fLIZ.LIZIZ;
                } else {
                    arrayList.add(new C1692270u8f(i3, i5, c1692270u8f2.LIZ));
                    i3 = c1692270u8f2.LIZJ;
                    while ((!c13e8.isEmpty()) && i3 == ((C1692270u8f) c13e8.last()).LIZJ) {
                        c13e8.removeLast();
                    }
                }
            }
            int i6 = c1692270u8fLIZ.LIZIZ;
            if (i3 < i6) {
                arrayList.add(new C1692270u8f(i3, i6, c1693480uAc));
                i3 = c1692270u8fLIZ.LIZIZ;
            }
            C1692270u8f c1692270u8f3 = (C1692270u8f) c13e8.LJIIIIZZ();
            if (c1692270u8f3 != null) {
                int i7 = c1692270u8f3.LIZIZ;
                if (i7 == c1692270u8fLIZ.LIZIZ && c1692270u8f3.LIZJ == c1692270u8fLIZ.LIZJ) {
                    c13e8.removeLast();
                    c13e8.addLast(new C1692270u8f(c1692270u8fLIZ.LIZIZ, c1692270u8fLIZ.LIZJ, ((C1693480uAc) c1692270u8f3.LIZ).LIZ((C1693480uAc) c1692270u8fLIZ.LIZ)));
                } else {
                    int i8 = c1692270u8f3.LIZJ;
                    if (i7 == i8) {
                        arrayList.add(new C1692270u8f(i7, i8, c1692270u8f3.LIZ));
                        c13e8.removeLast();
                        c13e8.addLast(new C1692270u8f(c1692270u8fLIZ.LIZIZ, c1692270u8fLIZ.LIZJ, c1692270u8fLIZ.LIZ));
                    } else if (i8 >= c1692270u8fLIZ.LIZJ) {
                        c13e8.addLast(new C1692270u8f(c1692270u8fLIZ.LIZIZ, c1692270u8fLIZ.LIZJ, ((C1693480uAc) c1692270u8f3.LIZ).LIZ((C1693480uAc) c1692270u8fLIZ.LIZ)));
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                c13e8.addLast(new C1692270u8f(c1692270u8fLIZ.LIZIZ, c1692270u8fLIZ.LIZJ, c1692270u8fLIZ.LIZ));
            }
            i2++;
            i = 0;
        }
        while (i3 <= c1692220u8a.LLILLJJLI.length() && (!c13e8.isEmpty())) {
            C1692270u8f c1692270u8f4 = (C1692270u8f) c13e8.last();
            arrayList.add(new C1692270u8f(i3, c1692270u8f4.LIZJ, c1692270u8f4.LIZ));
            i3 = c1692270u8f4.LIZJ;
            while ((!c13e8.isEmpty()) && i3 == ((C1692270u8f) c13e8.last()).LIZJ) {
                c13e8.removeLast();
            }
        }
        if (i3 < c1692220u8a.LLILLJJLI.length()) {
            arrayList.add(new C1692270u8f(i3, c1692220u8a.LLILLJJLI.length(), c1693480uAc));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C1692270u8f(0, 0, c1693480uAc));
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C1692270u8f c1692270u8f5 = (C1692270u8f) ListProtector.get(arrayList, i9);
            int i10 = c1692270u8f5.LIZIZ;
            int i11 = c1692270u8f5.LIZJ;
            if (i10 != i11) {
                strSubstring = c1692220u8a.LLILLJJLI.substring(i10, i11);
            } else {
                strSubstring = "";
            }
            List listLIZ = C1692250u8d.LIZ(c1692220u8a, i10, i11, AFwS266S0000000_25.get$arr$(604));
            C1692220u8a c1692220u8a3 = new C1692220u8a(strSubstring, (List<? extends C1692270u8f<? extends InterfaceC1692820u9Y>>) (listLIZ == null ? C13BV.INSTANCE : listLIZ));
            C1693480uAc c1693480uAc2 = (C1693480uAc) c1692270u8f5.LIZ;
            C1693430uAX c1693430uAX2 = new C1693430uAX(c1693430uAX.LIZ, c1693430uAX.LIZIZ.LIZ(c1693480uAc2.LIZIZ == Integer.MIN_VALUE ? new C1693480uAc(c1693480uAc2.LIZ, c1693480uAc.LIZIZ, c1693480uAc2.LIZJ, c1693480uAc2.LIZLLL, c1693480uAc2.LJ, c1693480uAc2.LJFF, c1693480uAc2.LJI, c1693480uAc2.LJII, c1693480uAc2.LJIIIIZZ) : c1693480uAc2));
            List list3 = c1692220u8a3.LL;
            list3 = list3 == null ? C13BV.INSTANCE : list3;
            List<C1692270u8f<C1680210tpD>> list4 = this.LIZIZ;
            int i12 = c1692270u8f5.LIZIZ;
            int i13 = c1692270u8f5.LIZJ;
            ArrayList arrayList3 = new ArrayList(list4.size());
            int size3 = list4.size();
            for (int i14 = 0; i14 < size3; i14++) {
                C1692270u8f c1692270u8f6 = (C1692270u8f) ListProtector.get(list4, i14);
                if (C1692250u8d.LIZIZ(i12, i13, c1692270u8f6.LIZIZ, c1692270u8f6.LIZJ)) {
                    if (i12 > c1692270u8f6.LIZIZ || c1692270u8f6.LIZJ > i13) {
                        C1681000tqU.LIZ("placeholder can not overlap with paragraph.");
                    }
                    arrayList3.add(new C1692270u8f(c1692270u8f6.LIZIZ - i12, c1692270u8f6.LIZJ - i12, c1692270u8f6.LIZ));
                }
            }
            arrayList2.add(new C1692590u9B(new C1695120uDG(c1693430uAX2, interfaceC594710NUf, interfaceC1690500u5o, strSubstring, list3, arrayList3), c1692270u8f5.LIZIZ, c1692270u8f5.LIZJ));
        }
        this.LJ = arrayList2;
    }
}
