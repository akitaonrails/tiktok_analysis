package Y;

import X.AbstractC1686530tzP;
import X.C1378605aS;
import X.C15438062q;
import X.C1668330tW3;
import X.C1670950taH;
import X.C1682380tsi;
import X.C1682390tsj;
import X.C19719212De;
import X.C2097608Jq;
import X.C341440Da2;
import X.EnumC584600MwM;
import X.InterfaceC1672350tcX;
import X.InterfaceC1673370teB;
import X.InterfaceC1680500tpg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS85S0201000_25 implements Function2 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS85S0201000_25 aObjectS85S0201000_25, Object obj, Object obj2) {
        Function2 function2 = (Function2) aObjectS85S0201000_25.l0;
        Function2 function22 = (Function2) aObjectS85S0201000_25.l1;
        int i = aObjectS85S0201000_25.i2;
        ((Integer) obj2).intValue();
        C1670950taH.LIZJ(function2, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS85S0201000_25 aObjectS85S0201000_25, Object obj, Object obj2) {
        Function2 function2 = (Function2) aObjectS85S0201000_25.l0;
        Function2 function22 = (Function2) aObjectS85S0201000_25.l1;
        int i = aObjectS85S0201000_25.i2;
        ((Integer) obj2).intValue();
        C1668330tW3.LIZ(function2, function22, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(i | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS85S0201000_25 aObjectS85S0201000_25, Object obj, Object obj2) {
        final List list = (List) aObjectS85S0201000_25.l0;
        final int i = aObjectS85S0201000_25.i2;
        Function2 function2 = (Function2) aObjectS85S0201000_25.l1;
        InterfaceC1672350tcX interfaceC1672350tcX = (InterfaceC1672350tcX) obj;
        final C1682380tsi c1682380tsi = (C1682380tsi) obj2;
        list.clear();
        List<InterfaceC1673370teB> listLJJLIL = interfaceC1672350tcX.LJJLIL(EnumC584600MwM.LL, new C19719212De(-1486430040, new AObjectS532S0100000_19(function2, 2), true));
        if (listLJJLIL.isEmpty()) {
            return interfaceC1672350tcX.LJLJJL(C1682380tsi.LJIIJ(c1682380tsi.LIZ), C1682380tsi.LJIIIZ(c1682380tsi.LIZ), C2097608Jq.LJ(), new AObjectS124S0000000_25(13));
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIL, 10));
        Iterator<InterfaceC1673370teB> it2 = listLJJLIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LJJJJZ(C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE)));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            Object next = it3.next();
            if (it3.hasNext()) {
                int i2 = ((AbstractC1686530tzP) next).LL;
                do {
                    Object next2 = it3.next();
                    int i3 = ((AbstractC1686530tzP) next2).LL;
                    if (i2 < i3) {
                        next = next2;
                        i2 = i3;
                    }
                } while (it3.hasNext());
            }
            int i4 = ((AbstractC1686530tzP) next).LL;
            Iterator it4 = arrayList.iterator();
            if (it4.hasNext()) {
                Object next3 = it4.next();
                if (it4.hasNext()) {
                    int i5 = ((AbstractC1686530tzP) next3).LLILLJJLI;
                    do {
                        Object next4 = it4.next();
                        int i6 = ((AbstractC1686530tzP) next4).LLILLJJLI;
                        if (i5 < i6) {
                            next3 = next4;
                            i5 = i6;
                        }
                    } while (it4.hasNext());
                }
                final int i7 = ((AbstractC1686530tzP) next3).LLILLJJLI;
                final int size = arrayList.size();
                int i8 = (size - 1) * i;
                int i9 = (i4 * size) + i8;
                List<InterfaceC1673370teB> listLJJLIL2 = interfaceC1672350tcX.LJJLIL(EnumC584600MwM.LLILLJJLI, new C19719212De(904908171, new AObjectS532S0100000_19(function2, 1), true));
                if (C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ) < i9) {
                    long jLIZ = C1682380tsi.LIZ(C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ), C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ), i7, i7);
                    final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIL2, 10));
                    Iterator<InterfaceC1673370teB> it5 = listLJJLIL2.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(it5.next().LJJJJZ(jLIZ));
                    }
                    return interfaceC1672350tcX.LJLJJL(C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ), (size * i) + (i7 * size), C2097608Jq.LJ(), new Function1() { // from class: X.0tcY
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            List list2 = arrayList2;
                            int i10 = i7;
                            int i11 = i;
                            List list3 = list;
                            C1682380tsi c1682380tsi2 = c1682380tsi;
                            AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj3;
                            int i12 = 0;
                            int i13 = 0;
                            for (Object obj4 : list2) {
                                int i14 = i13 + 1;
                                if (i13 >= 0) {
                                    int i15 = (i13 * i10) + (i14 * i11);
                                    AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) obj4, i12, i15);
                                    float f = i15;
                                    list3.add(new Pair(new C1378605aS((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L)), new C1378605aS((((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(C1682380tsi.LJIIIIZZ(c1682380tsi2.LIZ)) << 32))));
                                    i13 = i14;
                                    i12 = 0;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            return Unit.LIZ;
                        }
                    });
                }
                final int iLJIIIIZZ = (C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ) - i8) / size;
                long jLIZ2 = C1682380tsi.LIZ(iLJIIIIZZ, iLJIIIIZZ, i7, i7);
                list.add(new Pair(new C1378605aS((((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), new C1378605aS((((long) Float.floatToRawIntBits(C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L))));
                final ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(listLJJLIL2, 10));
                Iterator<InterfaceC1673370teB> it6 = listLJJLIL2.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(it6.next().LJJJJZ(jLIZ2));
                }
                return interfaceC1672350tcX.LJLJJL(C1682380tsi.LJIIIIZZ(c1682380tsi.LIZ), i7 + i, C2097608Jq.LJ(), new Function1() { // from class: X.0tcZ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        List list2 = arrayList3;
                        int i10 = iLJIIIIZZ;
                        int i11 = i;
                        int i12 = size;
                        List list3 = list;
                        int i13 = i7;
                        AbstractC1683310tuD abstractC1683310tuD = (AbstractC1683310tuD) obj3;
                        int i14 = 0;
                        int i15 = 0;
                        for (Object obj4 : list2) {
                            int i16 = i15 + 1;
                            if (i15 >= 0) {
                                int i17 = (i15 * i10) + (i15 * i11);
                                AbstractC1683310tuD.LJFF(abstractC1683310tuD, (AbstractC1686530tzP) obj4, i17, i14);
                                if (i15 < i12 - 1) {
                                    float f = i17 + i10;
                                    list3.add(new Pair(new C1378605aS((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), new C1378605aS((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(i13)) & 4294967295L))));
                                }
                                i15 = i16;
                                i14 = 0;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        return Unit.LIZ;
                    }
                });
            }
            throw new NoSuchElementException();
        }
        throw new NoSuchElementException();
    }

    public AObjectS85S0201000_25(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.l1 = obj2;
        this.i2 = i;
    }
}
