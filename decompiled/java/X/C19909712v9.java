package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.12v9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19909712v9 {
    public static final C19912412va LIZ = new AbstractC19912712vd() { // from class: X.12va
    };

    public static int LJI(List list) {
        int iLJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887712rb) {
            C19887712rb c19887712rb = (C19887712rb) list;
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(c19887712rb.LIZJ(i));
                i++;
            }
        } else {
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJJI;
    }

    public static int LJIIIZ(List list) {
        int iLJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887712rb) {
            C19887712rb c19887712rb = (C19887712rb) list;
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(c19887712rb.LIZJ(i));
                i++;
            }
        } else {
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJJI;
    }

    public static int LJIIJ(List list) {
        int iLJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887412rY) {
            C19887412rY c19887412rY = (C19887412rY) list;
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(c19887412rY.LIZJ(i));
                i++;
            }
        } else {
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJJI;
    }

    public static int LJIIL(List list) {
        int iLJJ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887712rb) {
            C19887712rb c19887712rb = (C19887712rb) list;
            iLJJ = 0;
            while (i < size) {
                int iLIZJ = c19887712rb.LIZJ(i);
                iLJJ += AbstractC19910412vG.LJJ((iLIZJ >> 31) ^ (iLIZJ + iLIZJ));
                i++;
            }
        } else {
            iLJJ = 0;
            while (i < size) {
                int iIntValue = ((Integer) ListProtector.get(list, i)).intValue();
                iLJJ += AbstractC19910412vG.LJJ((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iLJJ;
    }

    public static int LJIILIIL(List list) {
        int iLJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887412rY) {
            C19887412rY c19887412rY = (C19887412rY) list;
            iLJJI = 0;
            while (i < size) {
                long jLIZJ = c19887412rY.LIZJ(i);
                iLJJI += AbstractC19910412vG.LJJI((jLIZJ >> 63) ^ (jLIZJ + jLIZJ));
                i++;
            }
        } else {
            iLJJI = 0;
            while (i < size) {
                long jLongValue = ((Long) ListProtector.get(list, i)).longValue();
                iLJJI += AbstractC19910412vG.LJJI((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iLJJI;
    }

    public static int LJIILJJIL(List list) {
        int iLJJ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887712rb) {
            C19887712rb c19887712rb = (C19887712rb) list;
            iLJJ = 0;
            while (i < size) {
                iLJJ += AbstractC19910412vG.LJJ(c19887712rb.LIZJ(i));
                i++;
            }
        } else {
            iLJJ = 0;
            while (i < size) {
                iLJJ += AbstractC19910412vG.LJJ(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJJ;
    }

    public static int LJIILL(List list) {
        int iLJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19887412rY) {
            C19887412rY c19887412rY = (C19887412rY) list;
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(c19887412rY.LIZJ(i));
                i++;
            }
        } else {
            iLJJI = 0;
            while (i < size) {
                iLJJI += AbstractC19910412vG.LJJI(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJJI;
    }

    public static boolean LJFF(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int LJII(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC19910412vG.LJJ(i << 3) + 4);
    }

    public static int LJIIIIZZ(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC19910412vG.LJJ(i << 3) + 8);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJIILLIIL(Object obj, Object obj2) {
        AbstractC19907912ur abstractC19907912ur = (AbstractC19907912ur) obj;
        C19910312vF c19910312vF = abstractC19907912ur.zzc;
        C19910312vF c19910312vF2 = ((AbstractC19907912ur) obj2).zzc;
        C19910312vF c19910312vF3 = C19910312vF.LJFF;
        if (!c19910312vF3.equals(c19910312vF2)) {
            if (c19910312vF3.equals(c19910312vF)) {
                int i = c19910312vF.LIZ + c19910312vF2.LIZ;
                int[] iArrCopyOf = Arrays.copyOf(c19910312vF.LIZIZ, i);
                System.arraycopy(c19910312vF2.LIZIZ, 0, iArrCopyOf, c19910312vF.LIZ, c19910312vF2.LIZ);
                Object[] objArrCopyOf = Arrays.copyOf(c19910312vF.LIZJ, i);
                System.arraycopy(c19910312vF2.LIZJ, 0, objArrCopyOf, c19910312vF.LIZ, c19910312vF2.LIZ);
                c19910312vF = new C19910312vF(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c19910312vF.getClass();
                if (!c19910312vF2.equals(c19910312vF3)) {
                    if (c19910312vF.LJ) {
                        int i2 = c19910312vF.LIZ + c19910312vF2.LIZ;
                        c19910312vF.LJ(i2);
                        System.arraycopy(c19910312vF2.LIZIZ, 0, c19910312vF.LIZIZ, c19910312vF.LIZ, c19910312vF2.LIZ);
                        System.arraycopy(c19910312vF2.LIZJ, 0, c19910312vF.LIZJ, c19910312vF.LIZ, c19910312vF2.LIZ);
                        c19910312vF.LIZ = i2;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC19907912ur.zzc = c19910312vF;
    }

    public static int LJIIJJI(int i, InterfaceC19908112ut interfaceC19908112ut, Object obj) {
        int iLJJ;
        int iLIZJ;
        int iLJJ2;
        int i2 = i << 3;
        if (obj instanceof C19911112vN) {
            iLJJ = AbstractC19910412vG.LJJ(i2);
            iLIZJ = ((C19911112vN) obj).LIZ();
            iLJJ2 = AbstractC19910412vG.LJJ(iLIZJ);
        } else {
            iLJJ = AbstractC19910412vG.LJJ(i2);
            iLIZJ = ((AbstractC19900712th) obj).LIZJ(interfaceC19908112ut);
            iLJJ2 = AbstractC19910412vG.LJJ(iLIZJ);
        }
        return iLJJ + iLJJ2 + iLIZJ;
    }

    public static void LIZ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887412rY) {
                C19887412rY c19887412rY = (C19887412rY) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887412rY.LLILLL; i4++) {
                        c19887412rY.LIZJ(i4);
                        i3 += 8;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887412rY.LLILLL) {
                        abstractC19910412vG.LJIIJ(c19887412rY.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887412rY.LLILLL) {
                    c19909512v7.LIZ.LJIIIZ(i, c19887412rY.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) ListProtector.get(list, i6)).longValue();
                    i5 += 8;
                }
                abstractC19910412vG2.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIIJ(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIIIZ(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LIZIZ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887712rb) {
                C19887712rb c19887712rb = (C19887712rb) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJ = 0;
                    for (int i3 = 0; i3 < c19887712rb.LLILLL; i3++) {
                        int iLIZJ = c19887712rb.LIZJ(i3);
                        iLJJ += AbstractC19910412vG.LJJ((iLIZJ >> 31) ^ (iLIZJ + iLIZJ));
                    }
                    abstractC19910412vG.LJIJJ(iLJJ);
                    while (i2 < c19887712rb.LLILLL) {
                        int iLIZJ2 = c19887712rb.LIZJ(i2);
                        abstractC19910412vG.LJIJJ((iLIZJ2 >> 31) ^ (iLIZJ2 + iLIZJ2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887712rb.LLILLL) {
                    AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                    int iLIZJ3 = c19887712rb.LIZJ(i2);
                    abstractC19910412vG2.LJIJI(i, (iLIZJ3 >> 31) ^ (iLIZJ3 + iLIZJ3));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG3 = c19909512v7.LIZ;
                abstractC19910412vG3.LJIJ(i, 2);
                int iLJJ2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int iIntValue = ((Integer) ListProtector.get(list, i4)).intValue();
                    iLJJ2 += AbstractC19910412vG.LJJ((iIntValue >> 31) ^ (iIntValue + iIntValue));
                }
                abstractC19910412vG3.LJIJJ(iLJJ2);
                while (i2 < list.size()) {
                    int iIntValue2 = ((Integer) ListProtector.get(list, i2)).intValue();
                    abstractC19910412vG3.LJIJJ((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19910412vG abstractC19910412vG4 = c19909512v7.LIZ;
                int iIntValue3 = ((Integer) ListProtector.get(list, i2)).intValue();
                abstractC19910412vG4.LJIJI(i, (iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i2++;
            }
        }
    }

    public static void LIZJ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887412rY) {
                C19887412rY c19887412rY = (C19887412rY) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJI = 0;
                    for (int i3 = 0; i3 < c19887412rY.LLILLL; i3++) {
                        long jLIZJ = c19887412rY.LIZJ(i3);
                        iLJJI += AbstractC19910412vG.LJJI((jLIZJ >> 63) ^ (jLIZJ + jLIZJ));
                    }
                    abstractC19910412vG.LJIJJ(iLJJI);
                    while (i2 < c19887412rY.LLILLL) {
                        long jLIZJ2 = c19887412rY.LIZJ(i2);
                        abstractC19910412vG.LJIL((jLIZJ2 >> 63) ^ (jLIZJ2 + jLIZJ2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887412rY.LLILLL) {
                    AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                    long jLIZJ3 = c19887412rY.LIZJ(i2);
                    abstractC19910412vG2.LJIJJLI(i, (jLIZJ3 >> 63) ^ (jLIZJ3 + jLIZJ3));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG3 = c19909512v7.LIZ;
                abstractC19910412vG3.LJIJ(i, 2);
                int iLJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long jLongValue = ((Long) ListProtector.get(list, i4)).longValue();
                    iLJJI2 += AbstractC19910412vG.LJJI((jLongValue >> 63) ^ (jLongValue + jLongValue));
                }
                abstractC19910412vG3.LJIJJ(iLJJI2);
                while (i2 < list.size()) {
                    long jLongValue2 = ((Long) ListProtector.get(list, i2)).longValue();
                    abstractC19910412vG3.LJIL((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19910412vG abstractC19910412vG4 = c19909512v7.LIZ;
                long jLongValue3 = ((Long) ListProtector.get(list, i2)).longValue();
                abstractC19910412vG4.LJIJJLI(i, (jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i2++;
            }
        }
    }

    public static void LIZLLL(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887712rb) {
                C19887712rb c19887712rb = (C19887712rb) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJ = 0;
                    for (int i3 = 0; i3 < c19887712rb.LLILLL; i3++) {
                        iLJJ += AbstractC19910412vG.LJJ(c19887712rb.LIZJ(i3));
                    }
                    abstractC19910412vG.LJIJJ(iLJJ);
                    while (i2 < c19887712rb.LLILLL) {
                        abstractC19910412vG.LJIJJ(c19887712rb.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887712rb.LLILLL) {
                    c19909512v7.LIZ.LJIJI(i, c19887712rb.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int iLJJ2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJJ2 += AbstractC19910412vG.LJJ(((Integer) ListProtector.get(list, i4)).intValue());
                }
                abstractC19910412vG2.LJIJJ(iLJJ2);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIJJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIJI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887412rY) {
                C19887412rY c19887412rY = (C19887412rY) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJI = 0;
                    for (int i3 = 0; i3 < c19887412rY.LLILLL; i3++) {
                        iLJJI += AbstractC19910412vG.LJJI(c19887412rY.LIZJ(i3));
                    }
                    abstractC19910412vG.LJIJJ(iLJJI);
                    while (i2 < c19887412rY.LLILLL) {
                        abstractC19910412vG.LJIL(c19887412rY.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887412rY.LLILLL) {
                    c19909512v7.LIZ.LJIJJLI(i, c19887412rY.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int iLJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJJI2 += AbstractC19910412vG.LJJI(((Long) ListProtector.get(list, i4)).longValue());
                }
                abstractC19910412vG2.LJIJJ(iLJJI2);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIJJLI(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void LJIIZILJ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887312rX) {
                C19887312rX c19887312rX = (C19887312rX) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887312rX.LLILLL; i4++) {
                        c19887312rX.LJ(i4);
                        i3++;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887312rX.LLILLL) {
                        c19887312rX.LJ(i2);
                        abstractC19910412vG.LIZJ(c19887312rX.LLILLJJLI[i2] ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887312rX.LLILLL) {
                    AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                    c19887312rX.LJ(i2);
                    abstractC19910412vG2.LIZLLL(i, c19887312rX.LLILLJJLI[i2]);
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG3 = c19909512v7.LIZ;
                abstractC19910412vG3.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) ListProtector.get(list, i6)).booleanValue();
                    i5++;
                }
                abstractC19910412vG3.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG3.LIZJ(((Boolean) ListProtector.get(list, i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LIZLLL(i, ((Boolean) ListProtector.get(list, i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void LJIJ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887512rZ) {
                C19887512rZ c19887512rZ = (C19887512rZ) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887512rZ.LLILLL; i4++) {
                        c19887512rZ.LJ(i4);
                        i3 += 8;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887512rZ.LLILLL) {
                        c19887512rZ.LJ(i2);
                        abstractC19910412vG.LJIIJ(Double.doubleToRawLongBits(c19887512rZ.LLILLJJLI[i2]));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887512rZ.LLILLL) {
                    AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                    c19887512rZ.LJ(i2);
                    abstractC19910412vG2.LJIIIZ(i, Double.doubleToRawLongBits(c19887512rZ.LLILLJJLI[i2]));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG3 = c19909512v7.LIZ;
                abstractC19910412vG3.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) ListProtector.get(list, i6)).doubleValue();
                    i5 += 8;
                }
                abstractC19910412vG3.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG3.LJIIJ(Double.doubleToRawLongBits(((Double) ListProtector.get(list, i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIIIZ(i, Double.doubleToRawLongBits(((Double) ListProtector.get(list, i2)).doubleValue()));
                i2++;
            }
        }
    }

    public static void LJIJI(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887712rb) {
                C19887712rb c19887712rb = (C19887712rb) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJI = 0;
                    for (int i3 = 0; i3 < c19887712rb.LLILLL; i3++) {
                        iLJJI += AbstractC19910412vG.LJJI(c19887712rb.LIZJ(i3));
                    }
                    abstractC19910412vG.LJIJJ(iLJJI);
                    while (i2 < c19887712rb.LLILLL) {
                        abstractC19910412vG.LJIIL(c19887712rb.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887712rb.LLILLL) {
                    c19909512v7.LIZ.LJIIJJI(i, c19887712rb.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int iLJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJJI2 += AbstractC19910412vG.LJJI(((Integer) ListProtector.get(list, i4)).intValue());
                }
                abstractC19910412vG2.LJIJJ(iLJJI2);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIIL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIIJJI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIJJ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887712rb) {
                C19887712rb c19887712rb = (C19887712rb) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887712rb.LLILLL; i4++) {
                        c19887712rb.LIZJ(i4);
                        i3 += 4;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887712rb.LLILLL) {
                        abstractC19910412vG.LJIIIIZZ(c19887712rb.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887712rb.LLILLL) {
                    c19909512v7.LIZ.LJII(i, c19887712rb.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) ListProtector.get(list, i6)).intValue();
                    i5 += 4;
                }
                abstractC19910412vG2.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIIIIZZ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJII(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIJJLI(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887412rY) {
                C19887412rY c19887412rY = (C19887412rY) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887412rY.LLILLL; i4++) {
                        c19887412rY.LIZJ(i4);
                        i3 += 8;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887412rY.LLILLL) {
                        abstractC19910412vG.LJIIJ(c19887412rY.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887412rY.LLILLL) {
                    c19909512v7.LIZ.LJIIIZ(i, c19887412rY.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) ListProtector.get(list, i6)).longValue();
                    i5 += 8;
                }
                abstractC19910412vG2.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIIJ(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIIIZ(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIL(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887612ra) {
                C19887612ra c19887612ra = (C19887612ra) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887612ra.LLILLL; i4++) {
                        c19887612ra.LJ(i4);
                        i3 += 4;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887612ra.LLILLL) {
                        c19887612ra.LJ(i2);
                        abstractC19910412vG.LJIIIIZZ(Float.floatToRawIntBits(c19887612ra.LLILLJJLI[i2]));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887612ra.LLILLL) {
                    AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                    c19887612ra.LJ(i2);
                    abstractC19910412vG2.LJII(i, Float.floatToRawIntBits(c19887612ra.LLILLJJLI[i2]));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG3 = c19909512v7.LIZ;
                abstractC19910412vG3.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) ListProtector.get(list, i6)).floatValue();
                    i5 += 4;
                }
                abstractC19910412vG3.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG3.LJIIIIZZ(Float.floatToRawIntBits(((Float) ListProtector.get(list, i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJII(i, Float.floatToRawIntBits(((Float) ListProtector.get(list, i2)).floatValue()));
                i2++;
            }
        }
    }

    public static void LJJ(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887712rb) {
                C19887712rb c19887712rb = (C19887712rb) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJI = 0;
                    for (int i3 = 0; i3 < c19887712rb.LLILLL; i3++) {
                        iLJJI += AbstractC19910412vG.LJJI(c19887712rb.LIZJ(i3));
                    }
                    abstractC19910412vG.LJIJJ(iLJJI);
                    while (i2 < c19887712rb.LLILLL) {
                        abstractC19910412vG.LJIIL(c19887712rb.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887712rb.LLILLL) {
                    c19909512v7.LIZ.LJIIJJI(i, c19887712rb.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int iLJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJJI2 += AbstractC19910412vG.LJJI(((Integer) ListProtector.get(list, i4)).intValue());
                }
                abstractC19910412vG2.LJIJJ(iLJJI2);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIIL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIIJJI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJI(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887412rY) {
                C19887412rY c19887412rY = (C19887412rY) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int iLJJI = 0;
                    for (int i3 = 0; i3 < c19887412rY.LLILLL; i3++) {
                        iLJJI += AbstractC19910412vG.LJJI(c19887412rY.LIZJ(i3));
                    }
                    abstractC19910412vG.LJIJJ(iLJJI);
                    while (i2 < c19887412rY.LLILLL) {
                        abstractC19910412vG.LJIL(c19887412rY.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887412rY.LLILLL) {
                    c19909512v7.LIZ.LJIJJLI(i, c19887412rY.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int iLJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJJI2 += AbstractC19910412vG.LJJI(((Long) ListProtector.get(list, i4)).longValue());
                }
                abstractC19910412vG2.LJIJJ(iLJJI2);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJIJJLI(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJJIFFI(int i, List list, InterfaceC19908312uv interfaceC19908312uv, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19909512v7 c19909512v7 = (C19909512v7) interfaceC19908312uv;
            c19909512v7.getClass();
            int i2 = 0;
            if (list instanceof C19887712rb) {
                C19887712rb c19887712rb = (C19887712rb) list;
                if (z) {
                    AbstractC19910412vG abstractC19910412vG = c19909512v7.LIZ;
                    abstractC19910412vG.LJIJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887712rb.LLILLL; i4++) {
                        c19887712rb.LIZJ(i4);
                        i3 += 4;
                    }
                    abstractC19910412vG.LJIJJ(i3);
                    while (i2 < c19887712rb.LLILLL) {
                        abstractC19910412vG.LJIIIIZZ(c19887712rb.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887712rb.LLILLL) {
                    c19909512v7.LIZ.LJII(i, c19887712rb.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                AbstractC19910412vG abstractC19910412vG2 = c19909512v7.LIZ;
                abstractC19910412vG2.LJIJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) ListProtector.get(list, i6)).intValue();
                    i5 += 4;
                }
                abstractC19910412vG2.LJIJJ(i5);
                while (i2 < list.size()) {
                    abstractC19910412vG2.LJIIIIZZ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19909512v7.LIZ.LJII(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }
}
