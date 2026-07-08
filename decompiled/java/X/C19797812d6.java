package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12d6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19797812d6 {
    public final Map<String, AbstractC19798312dB> LIZ = new HashMap();
    public final C19798812dG LIZIZ = new AbstractC19798312dB() { // from class: X.12dG
        @Override // X.AbstractC19798312dB
        public final InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
            if (str != null && !str.isEmpty() && c19795712cl.LJFF(str)) {
                InterfaceC19797112cz interfaceC19797112czLIZJ = c19795712cl.LIZJ(str);
                if (interfaceC19797112czLIZJ instanceof AbstractC19795912cn) {
                    return ((AbstractC19795912cn) interfaceC19797112czLIZJ).LIZ(c19795712cl, list);
                }
                throw new IllegalArgumentException(C786410Ut5.j4("Function %s is not defined", new Object[]{str}));
            }
            throw new IllegalArgumentException(C786410Ut5.j4("Command not found: %s", new Object[]{str}));
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.12dG] */
    public C19797812d6() {
        LIZIZ(new AbstractC19798312dB() { // from class: X.12d9
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_AND);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_LEFT_SHIFT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_NOT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_OR);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_RIGHT_SHIFT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_UNSIGNED_RIGHT_SHIFT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BITWISE_XOR);
            }

            @Override // X.AbstractC19798312dB
            public final InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                switch (C19799212dK.LIZ[C19796312cr.LIZIZ(str).ordinal()]) {
                    case 1:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_AND, 2, list);
                        return new C19816212g4(Double.valueOf(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()) & C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue())));
                    case 2:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_LEFT_SHIFT, 2, list);
                        return new C19816212g4(Double.valueOf(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()) << ((int) (C19796312cr.LJIIL(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue()) & 31))));
                    case 3:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_NOT, 1, list);
                        return new C19816212g4(Double.valueOf(~C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue())));
                    case 4:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_OR, 2, list);
                        return new C19816212g4(Double.valueOf(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()) | C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue())));
                    case 5:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_RIGHT_SHIFT, 2, list);
                        return new C19816212g4(Double.valueOf(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()) >> ((int) (C19796312cr.LJIIL(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue()) & 31))));
                    case 6:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                        return new C19816212g4(Double.valueOf(C19796312cr.LJIIL(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()) >>> ((int) (C19796312cr.LJIIL(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue()) & 31))));
                    case 7:
                        C19796312cr.LJFF(EnumC19798012d8.BITWISE_XOR, 2, list);
                        return new C19816212g4(Double.valueOf(C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue()) ^ C19796312cr.LJIIIIZZ(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue())));
                    default:
                        LIZIZ(str);
                        throw null;
                }
            }
        });
        LIZIZ(new AbstractC19798312dB() { // from class: X.12d4
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.EQUALS);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.GREATER_THAN);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.GREATER_THAN_EQUALS);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.IDENTITY_EQUALS);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.IDENTITY_NOT_EQUALS);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.LESS_THAN);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.LESS_THAN_EQUALS);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.NOT_EQUALS);
            }

            public static boolean LIZJ(InterfaceC19797112cz interfaceC19797112cz, InterfaceC19797112cz interfaceC19797112cz2) {
                InterfaceC19797112cz c19816212g4;
                InterfaceC19797112cz c19816212g42;
                while (!interfaceC19797112cz.getClass().equals(interfaceC19797112cz2.getClass())) {
                    if (((interfaceC19797112cz instanceof C19796212cq) || (interfaceC19797112cz instanceof C19794812cc)) && ((interfaceC19797112cz2 instanceof C19796212cq) || (interfaceC19797112cz2 instanceof C19794812cc))) {
                        return true;
                    }
                    boolean z = interfaceC19797112cz instanceof C19816212g4;
                    if (z && (interfaceC19797112cz2 instanceof C19797512d3)) {
                        c19816212g42 = new C19816212g4(interfaceC19797112cz2.LJ());
                    } else {
                        boolean z2 = interfaceC19797112cz instanceof C19797512d3;
                        if (z2 && (interfaceC19797112cz2 instanceof C19816212g4)) {
                            c19816212g4 = new C19816212g4(interfaceC19797112cz.LJ());
                        } else if (interfaceC19797112cz instanceof C19798912dH) {
                            c19816212g4 = new C19816212g4(interfaceC19797112cz.LJ());
                        } else if (interfaceC19797112cz2 instanceof C19798912dH) {
                            c19816212g42 = new C19816212g4(interfaceC19797112cz2.LJ());
                        } else if ((z2 || z) && (interfaceC19797112cz2 instanceof InterfaceC19797012cy)) {
                            c19816212g42 = new C19797512d3(interfaceC19797112cz2.LJFF());
                        } else {
                            if (!(interfaceC19797112cz instanceof InterfaceC19797012cy) || (!(interfaceC19797112cz2 instanceof C19797512d3) && !(interfaceC19797112cz2 instanceof C19816212g4))) {
                                return false;
                            }
                            c19816212g4 = new C19797512d3(interfaceC19797112cz.LJFF());
                        }
                        interfaceC19797112cz = c19816212g4;
                    }
                    interfaceC19797112cz2 = c19816212g42;
                }
                if ((interfaceC19797112cz instanceof C19796212cq) || (interfaceC19797112cz instanceof C19794812cc)) {
                    return true;
                }
                if (interfaceC19797112cz instanceof C19816212g4) {
                    if (Double.isNaN(interfaceC19797112cz.LJ().doubleValue()) || Double.isNaN(interfaceC19797112cz2.LJ().doubleValue()) || interfaceC19797112cz.LJ().doubleValue() != interfaceC19797112cz2.LJ().doubleValue()) {
                        return false;
                    }
                    return true;
                }
                if (interfaceC19797112cz instanceof C19797512d3) {
                    return interfaceC19797112cz.LJFF().equals(interfaceC19797112cz2.LJFF());
                }
                if (interfaceC19797112cz instanceof C19798912dH) {
                    return interfaceC19797112cz.LIZLLL().equals(interfaceC19797112cz2.LIZLLL());
                }
                if (interfaceC19797112cz != interfaceC19797112cz2) {
                    return false;
                }
                return true;
            }

            public static boolean LIZLLL(InterfaceC19797112cz interfaceC19797112cz, InterfaceC19797112cz interfaceC19797112cz2) {
                if (interfaceC19797112cz instanceof InterfaceC19797012cy) {
                    interfaceC19797112cz = new C19797512d3(interfaceC19797112cz.LJFF());
                }
                if (interfaceC19797112cz2 instanceof InterfaceC19797012cy) {
                    interfaceC19797112cz2 = new C19797512d3(interfaceC19797112cz2.LJFF());
                }
                if ((interfaceC19797112cz instanceof C19797512d3) && (interfaceC19797112cz2 instanceof C19797512d3)) {
                    if (interfaceC19797112cz.LJFF().compareTo(interfaceC19797112cz2.LJFF()) < 0) {
                        return true;
                    }
                    return false;
                }
                double dDoubleValue = interfaceC19797112cz.LJ().doubleValue();
                double dDoubleValue2 = interfaceC19797112cz2.LJ().doubleValue();
                if (!Double.isNaN(dDoubleValue) && !Double.isNaN(dDoubleValue2) && ((dDoubleValue != 0.0d || dDoubleValue2 != -0.0d) && ((dDoubleValue != -0.0d || dDoubleValue2 != 0.0d) && Double.compare(dDoubleValue, dDoubleValue2) < 0))) {
                    return true;
                }
                return false;
            }

            public static boolean LJ(InterfaceC19797112cz interfaceC19797112cz, InterfaceC19797112cz interfaceC19797112cz2) {
                if (interfaceC19797112cz instanceof InterfaceC19797012cy) {
                    interfaceC19797112cz = new C19797512d3(interfaceC19797112cz.LJFF());
                }
                if (interfaceC19797112cz2 instanceof InterfaceC19797012cy) {
                    interfaceC19797112cz2 = new C19797512d3(interfaceC19797112cz2.LJFF());
                }
                if (((!(interfaceC19797112cz instanceof C19797512d3) || !(interfaceC19797112cz2 instanceof C19797512d3)) && (Double.isNaN(interfaceC19797112cz.LJ().doubleValue()) || Double.isNaN(interfaceC19797112cz2.LJ().doubleValue()))) || LIZLLL(interfaceC19797112cz2, interfaceC19797112cz)) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
            @Override // X.AbstractC19798312dB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC19797112cz LIZ(java.lang.String r5, X.C19795712cl r6, java.util.List<X.InterfaceC19797112cz> r7) {
                /*
                    r4 = this;
                    X.12d8 r0 = X.C19796312cr.LIZIZ(r5)
                    java.lang.String r1 = r0.name()
                    r0 = 2
                    X.C19796312cr.LJ(r0, r1, r7)
                    r0 = 0
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
                    X.12cz r0 = (X.InterfaceC19797112cz) r0
                    X.12cz r3 = r6.LIZIZ(r0)
                    r0 = 1
                    java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r0)
                    X.12cz r0 = (X.InterfaceC19797112cz) r0
                    X.12cz r2 = r6.LIZIZ(r0)
                    int[] r1 = X.C19799012dI.LIZ
                    X.12d8 r0 = X.C19796312cr.LIZIZ(r5)
                    int r0 = r0.ordinal()
                    r0 = r1[r0]
                    switch(r0) {
                        case 1: goto L36;
                        case 2: goto L3b;
                        case 3: goto L40;
                        case 4: goto L45;
                        case 5: goto L4a;
                        case 6: goto L4f;
                        case 7: goto L54;
                        case 8: goto L59;
                        default: goto L31;
                    }
                L31:
                    r4.LIZIZ(r5)
                    r0 = 0
                    throw r0
                L36:
                    boolean r0 = LIZJ(r3, r2)
                    goto L5f
                L3b:
                    boolean r0 = LIZLLL(r2, r3)
                    goto L5f
                L40:
                    boolean r0 = LJ(r2, r3)
                    goto L5f
                L45:
                    boolean r0 = X.C19796312cr.LJII(r3, r2)
                    goto L5f
                L4a:
                    boolean r0 = X.C19796312cr.LJII(r3, r2)
                    goto L5d
                L4f:
                    boolean r0 = LIZLLL(r3, r2)
                    goto L5f
                L54:
                    boolean r0 = LJ(r3, r2)
                    goto L5f
                L59:
                    boolean r0 = LIZJ(r3, r2)
                L5d:
                    r0 = r0 ^ 1
                L5f:
                    if (r0 == 0) goto L64
                    X.12dH r0 = X.InterfaceC19797112cz.LJIJ
                    return r0
                L64:
                    X.12dH r0 = X.InterfaceC19797112cz.LJIJI
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19797612d4.LIZ(java.lang.String, X.12cl, java.util.List):X.12cz");
            }
        });
        LIZIZ(new AbstractC19798312dB() { // from class: X.12d1
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.APPLY);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BLOCK);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.BREAK);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.CASE);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.DEFAULT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.CONTINUE);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.DEFINE_FUNCTION);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FN);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.IF);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.QUOTE);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.RETURN);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.SWITCH);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.TERNARY);
            }

            public static C19795612ck LIZJ(C19795712cl c19795712cl, List list) {
                C19796312cr.LJIIJ(EnumC19798012d8.FN, 2, list);
                InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                if (interfaceC19797112czLIZIZ2 instanceof C19796612cu) {
                    List<InterfaceC19797112cz> listLJJ = ((C19796612cu) interfaceC19797112czLIZIZ2).LJJ();
                    List arrayList = new ArrayList();
                    ArrayList arrayList2 = (ArrayList) list;
                    if (arrayList2.size() > 2) {
                        arrayList = arrayList2.subList(2, arrayList2.size());
                    }
                    return new C19795612ck(interfaceC19797112czLIZIZ.LJFF(), listLJJ, arrayList, c19795712cl);
                }
                throw new IllegalArgumentException(C786410Ut5.j4("FN requires an ArrayValue of parameter names found %s", new Object[]{interfaceC19797112czLIZIZ2.getClass().getCanonicalName()}));
            }

            @Override // X.AbstractC19798312dB
            public final InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                InterfaceC19797112cz interfaceC19797112czLIZ;
                InterfaceC19797112cz interfaceC19797112czLIZIZ = null;
                int i = 0;
                switch (C19798512dD.LIZ[C19796312cr.LIZIZ(str).ordinal()]) {
                    case 1:
                        C19796312cr.LJFF(EnumC19798012d8.APPLY, 3, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        String strLJFF = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJFF();
                        InterfaceC19797112cz interfaceC19797112czLIZIZ3 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 2));
                        if (interfaceC19797112czLIZIZ3 instanceof C19796612cu) {
                            if (!strLJFF.isEmpty()) {
                                return interfaceC19797112czLIZIZ2.LJIIJ(strLJFF, c19795712cl, ((C19796612cu) interfaceC19797112czLIZIZ3).LJJ());
                            }
                            throw new IllegalArgumentException("Function name for apply is undefined");
                        }
                        throw new IllegalArgumentException(C786410Ut5.j4("Function arguments for Apply are not a list found %s", new Object[]{interfaceC19797112czLIZIZ3.getClass().getCanonicalName()}));
                    case 2:
                        return c19795712cl.LIZLLL().LIZ(new C19796612cu(list));
                    case 3:
                        C19796312cr.LJFF(EnumC19798012d8.BREAK, 0, list);
                        return InterfaceC19797112cz.LJIILLIIL;
                    case 4:
                    case 5:
                        ArrayList arrayList = (ArrayList) list;
                        if (!arrayList.isEmpty()) {
                            InterfaceC19797112cz interfaceC19797112czLIZIZ4 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList, 0));
                            if (interfaceC19797112czLIZIZ4 instanceof C19796612cu) {
                                return c19795712cl.LIZ((C19796612cu) interfaceC19797112czLIZIZ4);
                            }
                        }
                        return InterfaceC19797112cz.LJIILIIL;
                    case 6:
                        C19796312cr.LJFF(EnumC19798012d8.BREAK, 0, list);
                        return InterfaceC19797112cz.LJIILL;
                    case 7:
                        C19796312cr.LJIIJ(EnumC19798012d8.DEFINE_FUNCTION, 2, list);
                        C19795612ck c19795612ckLIZJ = LIZJ(c19795712cl, list);
                        String str2 = c19795612ckLIZJ.LL;
                        if (str2 == null) {
                            c19795712cl.LJI("", c19795612ckLIZJ);
                            return c19795612ckLIZJ;
                        }
                        c19795712cl.LJI(str2, c19795612ckLIZJ);
                        return c19795612ckLIZJ;
                    case 8:
                        return LIZJ(c19795712cl, list);
                    case BdTuring.TYPE_ECAF /* 9 */:
                        C19796312cr.LJIIJ(EnumC19798012d8.IF, 2, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ5 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ6 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        ArrayList arrayList2 = (ArrayList) list;
                        if (arrayList2.size() > 2) {
                            interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList2, 2));
                        }
                        InterfaceC19797112cz interfaceC19797112cz = InterfaceC19797112cz.LJIILIIL;
                        if (interfaceC19797112czLIZIZ5.LIZLLL().booleanValue()) {
                            interfaceC19797112czLIZ = c19795712cl.LIZ((C19796612cu) interfaceC19797112czLIZIZ6);
                        } else if (interfaceC19797112czLIZIZ != null) {
                            interfaceC19797112czLIZ = c19795712cl.LIZ((C19796612cu) interfaceC19797112czLIZIZ);
                        } else {
                            interfaceC19797112czLIZ = interfaceC19797112cz;
                        }
                        if (interfaceC19797112czLIZ instanceof C19797212d0) {
                            return interfaceC19797112czLIZ;
                        }
                        return interfaceC19797112cz;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        return new C19796612cu(list);
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        ArrayList arrayList3 = (ArrayList) list;
                        if (arrayList3.isEmpty()) {
                            return InterfaceC19797112cz.LJIIZILJ;
                        }
                        C19796312cr.LJFF(EnumC19798012d8.RETURN, 1, arrayList3);
                        return new C19797212d0("return", c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList3, 0)));
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        C19796312cr.LJFF(EnumC19798012d8.SWITCH, 3, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ7 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ8 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ9 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 2));
                        if (interfaceC19797112czLIZIZ8 instanceof C19796612cu) {
                            if (interfaceC19797112czLIZIZ9 instanceof C19796612cu) {
                                C19796612cu c19796612cu = (C19796612cu) interfaceC19797112czLIZIZ8;
                                C19796612cu c19796612cu2 = (C19796612cu) interfaceC19797112czLIZIZ9;
                                boolean z = false;
                                while (true) {
                                    if (i < c19796612cu.LJIILIIL()) {
                                        if (z || interfaceC19797112czLIZIZ7.equals(c19795712cl.LIZIZ(c19796612cu.LIZJ(i)))) {
                                            InterfaceC19797112cz interfaceC19797112czLIZIZ10 = c19795712cl.LIZIZ(c19796612cu2.LIZJ(i));
                                            if (interfaceC19797112czLIZIZ10 instanceof C19797212d0) {
                                                if (!((C19797212d0) interfaceC19797112czLIZIZ10).LLILLJJLI.equals("break")) {
                                                    return interfaceC19797112czLIZIZ10;
                                                }
                                            } else {
                                                z = true;
                                            }
                                        }
                                        i++;
                                    } else if (c19796612cu.LJIILIIL() + 1 == c19796612cu2.LJIILIIL()) {
                                        InterfaceC19797112cz interfaceC19797112czLIZIZ11 = c19795712cl.LIZIZ(c19796612cu2.LIZJ(c19796612cu.LJIILIIL()));
                                        if (interfaceC19797112czLIZIZ11 instanceof C19797212d0) {
                                            String str3 = ((C19797212d0) interfaceC19797112czLIZIZ11).LLILLJJLI;
                                            if (str3.equals("return") || str3.equals("continue")) {
                                                return interfaceC19797112czLIZIZ11;
                                            }
                                        }
                                    }
                                }
                                return InterfaceC19797112cz.LJIILIIL;
                            }
                            throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                        }
                        throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        C19796312cr.LJFF(EnumC19798012d8.TERNARY, 3, list);
                        if (c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LIZLLL().booleanValue()) {
                            return c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        }
                        return c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 2));
                    default:
                        LIZIZ(str);
                        throw null;
                }
            }
        });
        LIZIZ(new AbstractC19798312dB() { // from class: X.12dA
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.AND);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.NOT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.OR);
            }

            @Override // X.AbstractC19798312dB
            public final InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                int i = C19799312dL.LIZ[C19796312cr.LIZIZ(str).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            C19796312cr.LJFF(EnumC19798012d8.OR, 2, list);
                            InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                            if (interfaceC19797112czLIZIZ.LIZLLL().booleanValue()) {
                                return interfaceC19797112czLIZIZ;
                            }
                            return c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        }
                        LIZIZ(str);
                        throw null;
                    }
                    C19796312cr.LJFF(EnumC19798012d8.NOT, 1, list);
                    return new C19798912dH(Boolean.valueOf(!c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LIZLLL().booleanValue()));
                }
                C19796312cr.LJFF(EnumC19798012d8.AND, 2, list);
                InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                if (!interfaceC19797112czLIZIZ2.LIZLLL().booleanValue()) {
                    return interfaceC19797112czLIZIZ2;
                }
                return c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
            }
        });
        LIZIZ(new AbstractC19798312dB() { // from class: X.12d5
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_IN);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_IN_CONST);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_IN_LET);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_LET);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_OF);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_OF_CONST);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.FOR_OF_LET);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.WHILE);
            }

            public static InterfaceC19797112cz LIZJ(InterfaceC19799912dR interfaceC19799912dR, Iterator<InterfaceC19797112cz> it2, InterfaceC19797112cz interfaceC19797112cz) {
                if (it2 != null) {
                    while (it2.hasNext()) {
                        InterfaceC19797112cz interfaceC19797112czLIZ = interfaceC19799912dR.LIZ(it2.next()).LIZ((C19796612cu) interfaceC19797112cz);
                        if (interfaceC19797112czLIZ instanceof C19797212d0) {
                            C19797212d0 c19797212d0 = (C19797212d0) interfaceC19797112czLIZ;
                            if ("break".equals(c19797212d0.LLILLJJLI)) {
                                return InterfaceC19797112cz.LJIILIIL;
                            }
                            if ("return".equals(c19797212d0.LLILLJJLI)) {
                                return c19797212d0;
                            }
                        }
                    }
                }
                return InterfaceC19797112cz.LJIILIIL;
            }

            public static InterfaceC19797112cz LIZLLL(InterfaceC19799912dR interfaceC19799912dR, InterfaceC19797112cz interfaceC19797112cz, InterfaceC19797112cz interfaceC19797112cz2) {
                if (interfaceC19797112cz instanceof Iterable) {
                    return LIZJ(interfaceC19799912dR, ((Iterable) interfaceC19797112cz).iterator(), interfaceC19797112cz2);
                }
                throw new IllegalArgumentException("Non-iterable type in for...of loop.");
            }

            /* JADX WARN: Removed duplicated region for block: B:77:0x0293  */
            /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
            @Override // X.AbstractC19798312dB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.InterfaceC19797112cz LIZ(java.lang.String r12, final X.C19795712cl r13, java.util.List<X.InterfaceC19797112cz> r14) {
                /*
                    Method dump skipped, instruction units count: 716
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19797712d5.LIZ(java.lang.String, X.12cl, java.util.List):X.12cz");
            }
        });
        LIZIZ(new AbstractC19798312dB() { // from class: X.12d7
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.ADD);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.DIVIDE);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.MODULUS);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.MULTIPLY);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.NEGATE);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.POST_DECREMENT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.POST_INCREMENT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.PRE_DECREMENT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.PRE_INCREMENT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.SUBTRACT);
            }

            @Override // X.AbstractC19798312dB
            public final InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                switch (C19798712dF.LIZ[C19796312cr.LIZIZ(str).ordinal()]) {
                    case 1:
                        C19796312cr.LJFF(EnumC19798012d8.ADD, 2, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        if (!(interfaceC19797112czLIZIZ instanceof InterfaceC19797012cy) && !(interfaceC19797112czLIZIZ instanceof C19797512d3) && !(interfaceC19797112czLIZIZ2 instanceof InterfaceC19797012cy) && !(interfaceC19797112czLIZIZ2 instanceof C19797512d3)) {
                            return new C19816212g4(Double.valueOf(interfaceC19797112czLIZIZ.LJ().doubleValue() + interfaceC19797112czLIZIZ2.LJ().doubleValue()));
                        }
                        String strLJFF = interfaceC19797112czLIZIZ.LJFF();
                        String strLJFF2 = interfaceC19797112czLIZIZ2.LJFF();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(strLJFF);
                        sbLIZ.append(strLJFF2);
                        return new C19797512d3(C2188811AlT.LIZIZ(sbLIZ));
                    case 2:
                        C19796312cr.LJFF(EnumC19798012d8.DIVIDE, 2, list);
                        return new C19816212g4(Double.valueOf(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue() / c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue()));
                    case 3:
                        C19796312cr.LJFF(EnumC19798012d8.MODULUS, 2, list);
                        return new C19816212g4(Double.valueOf(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue() % c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue()));
                    case 4:
                        C19796312cr.LJFF(EnumC19798012d8.MULTIPLY, 2, list);
                        return new C19816212g4(Double.valueOf(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue() * c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue()));
                    case 5:
                        C19796312cr.LJFF(EnumC19798012d8.NEGATE, 1, list);
                        return new C19816212g4(Double.valueOf(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue() * (-1.0d)));
                    case 6:
                    case 7:
                        C19796312cr.LJ(2, str, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ3 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        return interfaceC19797112czLIZIZ3;
                    case 8:
                    case BdTuring.TYPE_ECAF /* 9 */:
                        C19796312cr.LJ(1, str, list);
                        return c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        C19796312cr.LJFF(EnumC19798012d8.SUBTRACT, 2, list);
                        return new C19816212g4(Double.valueOf(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0)).LJ().doubleValue() + new C19816212g4(Double.valueOf(c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1)).LJ().doubleValue() * (-1.0d))).LL.doubleValue()));
                    default:
                        LIZIZ(str);
                        throw null;
                }
            }
        });
        LIZIZ(new AbstractC19798312dB() { // from class: X.12d2
            {
                ((ArrayList) this.LIZ).add(EnumC19798012d8.ASSIGN);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.CONST);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.CREATE_ARRAY);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.CREATE_OBJECT);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.EXPRESSION_LIST);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.GET);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.GET_INDEX);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.GET_PROPERTY);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.NULL);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.SET_PROPERTY);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.TYPEOF);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.UNDEFINED);
                ((ArrayList) this.LIZ).add(EnumC19798012d8.VAR);
            }

            @Override // X.AbstractC19798312dB
            public final InterfaceC19797112cz LIZ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
                String str2;
                int i = 0;
                switch (C19798612dE.LIZ[C19796312cr.LIZIZ(str).ordinal()]) {
                    case 1:
                        C19796312cr.LJFF(EnumC19798012d8.ASSIGN, 2, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        if (interfaceC19797112czLIZIZ instanceof C19797512d3) {
                            if (c19795712cl.LJFF(interfaceC19797112czLIZIZ.LJFF())) {
                                InterfaceC19797112cz interfaceC19797112czLIZIZ2 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                                c19795712cl.LJI(interfaceC19797112czLIZIZ.LJFF(), interfaceC19797112czLIZIZ2);
                                return interfaceC19797112czLIZIZ2;
                            }
                            throw new IllegalArgumentException(C786410Ut5.j4("Attempting to assign undefined value %s", new Object[]{interfaceC19797112czLIZIZ.LJFF()}));
                        }
                        throw new IllegalArgumentException(C786410Ut5.j4("Expected string for assign var. got %s", new Object[]{interfaceC19797112czLIZIZ.getClass().getCanonicalName()}));
                    case 2:
                        C19796312cr.LJIIJ(EnumC19798012d8.CONST, 2, list);
                        ArrayList arrayList = (ArrayList) list;
                        if (arrayList.size() % 2 == 0) {
                            for (int i2 = 0; i2 < arrayList.size() - 1; i2 += 2) {
                                InterfaceC19797112cz interfaceC19797112czLIZIZ3 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList, i2));
                                if (interfaceC19797112czLIZIZ3 instanceof C19797512d3) {
                                    String strLJFF = interfaceC19797112czLIZIZ3.LJFF();
                                    c19795712cl.LJ(strLJFF, c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList, i2 + 1)));
                                    ((HashMap) c19795712cl.LIZLLL).put(strLJFF, Boolean.TRUE);
                                } else {
                                    throw new IllegalArgumentException(C786410Ut5.j4("Expected string for const name. got %s", new Object[]{interfaceC19797112czLIZIZ3.getClass().getCanonicalName()}));
                                }
                            }
                            return InterfaceC19797112cz.LJIILIIL;
                        }
                        throw new IllegalArgumentException(C786410Ut5.j4("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList.size())}));
                    case 3:
                        ArrayList arrayList2 = (ArrayList) list;
                        if (arrayList2.isEmpty()) {
                            return new C19796612cu();
                        }
                        C19796612cu c19796612cu = new C19796612cu();
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            InterfaceC19797112cz interfaceC19797112czLIZIZ4 = c19795712cl.LIZIZ((InterfaceC19797112cz) it2.next());
                            if (!(interfaceC19797112czLIZIZ4 instanceof C19797212d0)) {
                                c19796612cu.LJIJ(i, interfaceC19797112czLIZIZ4);
                                i++;
                            } else {
                                throw new IllegalStateException("Failed to evaluate array element");
                            }
                        }
                        return c19796612cu;
                    case 4:
                        ArrayList arrayList3 = (ArrayList) list;
                        if (arrayList3.isEmpty()) {
                            return new C19796012co();
                        }
                        if (arrayList3.size() % 2 == 0) {
                            C19796012co c19796012co = new C19796012co();
                            while (i < arrayList3.size() - 1) {
                                InterfaceC19797112cz interfaceC19797112czLIZIZ5 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList3, i));
                                InterfaceC19797112cz interfaceC19797112czLIZIZ6 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList3, i + 1));
                                if (!(interfaceC19797112czLIZIZ5 instanceof C19797212d0) && !(interfaceC19797112czLIZIZ6 instanceof C19797212d0)) {
                                    c19796012co.LJIIJJI(interfaceC19797112czLIZIZ5.LJFF(), interfaceC19797112czLIZIZ6);
                                    i += 2;
                                } else {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                            }
                            return c19796012co;
                        }
                        throw new IllegalArgumentException(C786410Ut5.j4("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(arrayList3.size())}));
                    case 5:
                        C19796312cr.LJIIJ(EnumC19798012d8.EXPRESSION_LIST, 1, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ7 = InterfaceC19797112cz.LJIILIIL;
                        while (true) {
                            ArrayList arrayList4 = (ArrayList) list;
                            if (i < arrayList4.size()) {
                                interfaceC19797112czLIZIZ7 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(arrayList4, i));
                                if (!(interfaceC19797112czLIZIZ7 instanceof C19797212d0)) {
                                    i++;
                                } else {
                                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                                }
                            } else {
                                return interfaceC19797112czLIZIZ7;
                            }
                        }
                        break;
                    case 6:
                        C19796312cr.LJFF(EnumC19798012d8.GET, 1, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ8 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        if (interfaceC19797112czLIZIZ8 instanceof C19797512d3) {
                            return c19795712cl.LIZJ(interfaceC19797112czLIZIZ8.LJFF());
                        }
                        throw new IllegalArgumentException(C786410Ut5.j4("Expected string for get var. got %s", new Object[]{interfaceC19797112czLIZIZ8.getClass().getCanonicalName()}));
                    case 7:
                    case 8:
                        C19796312cr.LJFF(EnumC19798012d8.GET_PROPERTY, 2, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ9 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ10 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        if ((interfaceC19797112czLIZIZ9 instanceof C19796612cu) && C19796312cr.LJIIJJI(interfaceC19797112czLIZIZ10)) {
                            return ((C19796612cu) interfaceC19797112czLIZIZ9).LIZJ(interfaceC19797112czLIZIZ10.LJ().intValue());
                        }
                        if (interfaceC19797112czLIZIZ9 instanceof InterfaceC19797012cy) {
                            return ((InterfaceC19797012cy) interfaceC19797112czLIZIZ9).LJIIIIZZ(interfaceC19797112czLIZIZ10.LJFF());
                        }
                        if (interfaceC19797112czLIZIZ9 instanceof C19797512d3) {
                            if ("length".equals(interfaceC19797112czLIZIZ10.LJFF())) {
                                return new C19816212g4(Double.valueOf(interfaceC19797112czLIZIZ9.LJFF().length()));
                            }
                            if (C19796312cr.LJIIJJI(interfaceC19797112czLIZIZ10) && interfaceC19797112czLIZIZ10.LJ().doubleValue() < interfaceC19797112czLIZIZ9.LJFF().length()) {
                                return new C19797512d3(String.valueOf(interfaceC19797112czLIZIZ9.LJFF().charAt(interfaceC19797112czLIZIZ10.LJ().intValue())));
                            }
                        }
                        return InterfaceC19797112cz.LJIILIIL;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        C19796312cr.LJFF(EnumC19798012d8.NULL, 0, list);
                        return InterfaceC19797112cz.LJIILJJIL;
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                        C19796312cr.LJFF(EnumC19798012d8.SET_PROPERTY, 3, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ11 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ12 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 1));
                        InterfaceC19797112cz interfaceC19797112czLIZIZ13 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 2));
                        if (interfaceC19797112czLIZIZ11 != InterfaceC19797112cz.LJIILIIL && interfaceC19797112czLIZIZ11 != InterfaceC19797112cz.LJIILJJIL) {
                            if ((interfaceC19797112czLIZIZ11 instanceof C19796612cu) && (interfaceC19797112czLIZIZ12 instanceof C19816212g4)) {
                                ((C19796612cu) interfaceC19797112czLIZIZ11).LJIJ(interfaceC19797112czLIZIZ12.LJ().intValue(), interfaceC19797112czLIZIZ13);
                            } else if (interfaceC19797112czLIZIZ11 instanceof InterfaceC19797012cy) {
                                ((InterfaceC19797012cy) interfaceC19797112czLIZIZ11).LJIIJJI(interfaceC19797112czLIZIZ12.LJFF(), interfaceC19797112czLIZIZ13);
                                return interfaceC19797112czLIZIZ13;
                            }
                            return interfaceC19797112czLIZIZ13;
                        }
                        throw new IllegalStateException(C786410Ut5.j4("Can't set property %s of %s", new Object[]{interfaceC19797112czLIZIZ12.LJFF(), interfaceC19797112czLIZIZ11.LJFF()}));
                    case BdTuring.TYPE_EMAIL /* 11 */:
                        C19796312cr.LJFF(EnumC19798012d8.TYPEOF, 1, list);
                        InterfaceC19797112cz interfaceC19797112czLIZIZ14 = c19795712cl.LIZIZ((InterfaceC19797112cz) ListProtector.get(list, 0));
                        if (interfaceC19797112czLIZIZ14 instanceof C19796212cq) {
                            str2 = "undefined";
                        } else if (interfaceC19797112czLIZIZ14 instanceof C19798912dH) {
                            str2 = "boolean";
                        } else if (interfaceC19797112czLIZIZ14 instanceof C19816212g4) {
                            str2 = "number";
                        } else if (interfaceC19797112czLIZIZ14 instanceof C19797512d3) {
                            str2 = "string";
                        } else if (interfaceC19797112czLIZIZ14 instanceof C19795612ck) {
                            str2 = "function";
                        } else if (!(interfaceC19797112czLIZIZ14 instanceof C19798412dC) && !(interfaceC19797112czLIZIZ14 instanceof C19797212d0)) {
                            str2 = "object";
                        } else {
                            throw new IllegalArgumentException(C786410Ut5.j4("Unsupported value type %s in typeof", new Object[]{interfaceC19797112czLIZIZ14}));
                        }
                        return new C19797512d3(str2);
                    case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                        C19796312cr.LJFF(EnumC19798012d8.UNDEFINED, 0, list);
                        return InterfaceC19797112cz.LJIILIIL;
                    case BdTuring.TYPE_SMS_VOICE /* 13 */:
                        C19796312cr.LJIIJ(EnumC19798012d8.VAR, 1, list);
                        Iterator it3 = ((ArrayList) list).iterator();
                        while (it3.hasNext()) {
                            InterfaceC19797112cz interfaceC19797112czLIZIZ15 = c19795712cl.LIZIZ((InterfaceC19797112cz) it3.next());
                            if (interfaceC19797112czLIZIZ15 instanceof C19797512d3) {
                                c19795712cl.LJ(interfaceC19797112czLIZIZ15.LJFF(), InterfaceC19797112cz.LJIILIIL);
                            } else {
                                throw new IllegalArgumentException(C786410Ut5.j4("Expected string for var name. got %s", new Object[]{interfaceC19797112czLIZIZ15.getClass().getCanonicalName()}));
                            }
                        }
                        return InterfaceC19797112cz.LJIILIIL;
                    default:
                        LIZIZ(str);
                        throw null;
                }
            }
        });
    }

    public final void LIZIZ(AbstractC19798312dB abstractC19798312dB) {
        Iterator it2 = ((ArrayList) abstractC19798312dB.LIZ).iterator();
        while (it2.hasNext()) {
            ((HashMap) this.LIZ).put(((EnumC19798012d8) it2.next()).toString(), abstractC19798312dB);
        }
    }

    public final InterfaceC19797112cz LIZ(C19795712cl c19795712cl, InterfaceC19797112cz interfaceC19797112cz) {
        AbstractC19798312dB abstractC19798312dB;
        C19796312cr.LJI(c19795712cl);
        if (interfaceC19797112cz instanceof C19798412dC) {
            C19798412dC c19798412dC = (C19798412dC) interfaceC19797112cz;
            ArrayList<InterfaceC19797112cz> arrayList = c19798412dC.LLILLJJLI;
            String str = c19798412dC.LL;
            if (((HashMap) this.LIZ).containsKey(str)) {
                abstractC19798312dB = (AbstractC19798312dB) ((HashMap) this.LIZ).get(str);
            } else {
                abstractC19798312dB = this.LIZIZ;
            }
            return abstractC19798312dB.LIZ(str, c19795712cl, arrayList);
        }
        return interfaceC19797112cz;
    }
}
