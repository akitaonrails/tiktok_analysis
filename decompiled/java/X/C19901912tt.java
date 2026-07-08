package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19901912tt {
    public static final C19905012uO LIZ = new AbstractC19905112uP<C19902412ty, C19902412ty>() { // from class: X.12uO
    };

    public static int LJ(List<Integer> list) {
        int iLJIIJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886412rO) {
            C19886412rO c19886412rO = (C19886412rO) list;
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886412rO.LIZJ(i));
                i++;
            }
        } else {
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIIJJI;
    }

    public static int LJIIIIZZ(List<Integer> list) {
        int iLJIIJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886412rO) {
            C19886412rO c19886412rO = (C19886412rO) list;
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886412rO.LIZJ(i));
                i++;
            }
        } else {
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIIJJI;
    }

    public static int LJIIJ(List<Long> list) {
        int iLJIIJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886512rP) {
            C19886512rP c19886512rP = (C19886512rP) list;
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886512rP.LJ(i));
                i++;
            }
        } else {
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJIIJJI;
    }

    public static int LJIIL(List<Integer> list) {
        int iLJIILLIIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886412rO) {
            C19886412rO c19886412rO = (C19886412rO) list;
            iLJIILLIIL = 0;
            while (i < size) {
                int iLIZJ = c19886412rO.LIZJ(i);
                iLJIILLIIL += AbstractC19901712tr.LJIILLIIL((iLIZJ >> 31) ^ (iLIZJ << 1));
                i++;
            }
        } else {
            iLJIILLIIL = 0;
            while (i < size) {
                int iIntValue = ((Integer) ListProtector.get(list, i)).intValue();
                iLJIILLIIL += AbstractC19901712tr.LJIILLIIL((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iLJIILLIIL;
    }

    public static int LJIILJJIL(List<Long> list) {
        int iLJIIJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886512rP) {
            C19886512rP c19886512rP = (C19886512rP) list;
            iLJIIJJI = 0;
            while (i < size) {
                long jLJ = c19886512rP.LJ(i);
                iLJIIJJI += AbstractC19901712tr.LJIIJJI((jLJ >> 63) ^ (jLJ << 1));
                i++;
            }
        } else {
            iLJIIJJI = 0;
            while (i < size) {
                long jLongValue = ((Long) ListProtector.get(list, i)).longValue();
                iLJIIJJI += AbstractC19901712tr.LJIIJJI((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
        }
        return iLJIIJJI;
    }

    public static int LJIILLIIL(List<Integer> list) {
        int iLJIILLIIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886412rO) {
            C19886412rO c19886412rO = (C19886412rO) list;
            iLJIILLIIL = 0;
            while (i < size) {
                iLJIILLIIL += AbstractC19901712tr.LJIILLIIL(c19886412rO.LIZJ(i));
                i++;
            }
        } else {
            iLJIILLIIL = 0;
            while (i < size) {
                iLJIILLIIL += AbstractC19901712tr.LJIILLIIL(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIILLIIL;
    }

    public static int LJIJ(List<Long> list) {
        int iLJIIJJI;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19886512rP) {
            C19886512rP c19886512rP = (C19886512rP) list;
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886512rP.LJ(i));
                i++;
            }
        } else {
            iLJIIJJI = 0;
            while (i < size) {
                iLJIIJJI += AbstractC19901712tr.LJIIJJI(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJIIJJI;
    }

    public static boolean LIZLLL(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static <T, FT extends InterfaceC19902712u1<FT>> void LIZIZ(AbstractC19904112uF<FT> abstractC19904112uF, T t, T t2) {
        abstractC19904112uF.getClass();
        C19902112tv<C19902912u3> c19902112tv = ((AbstractC19900212tc) t2).zzc;
        if (!c19902112tv.LIZ.isEmpty()) {
            C19902112tv<C19902912u3> c19902112tvLJJI = ((AbstractC19900212tc) t).LJJI();
            c19902112tvLJJI.getClass();
            for (int i = 0; i < c19902112tv.LIZ.LIZLLL(); i++) {
                c19902112tvLJJI.LJI(c19902112tv.LIZ.LJ(i));
            }
            Iterator<T> it2 = c19902112tv.LIZ.LJFF().iterator();
            while (it2.hasNext()) {
                c19902112tvLJJI.LJI((Map.Entry) it2.next());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static <T, UT, UB> void LIZJ(AbstractC19905112uP<UT, UB> abstractC19905112uP, T t, T t2) {
        abstractC19905112uP.getClass();
        AbstractC19899612tW abstractC19899612tW = (AbstractC19899612tW) t;
        C19902412ty c19902412ty = abstractC19899612tW.zzb;
        C19902412ty c19902412ty2 = ((AbstractC19899612tW) t2).zzb;
        C19902412ty c19902412ty3 = C19902412ty.LJFF;
        if (!c19902412ty3.equals(c19902412ty2)) {
            if (c19902412ty3.equals(c19902412ty)) {
                int i = c19902412ty.LIZ + c19902412ty2.LIZ;
                int[] iArrCopyOf = Arrays.copyOf(c19902412ty.LIZIZ, i);
                System.arraycopy(c19902412ty2.LIZIZ, 0, iArrCopyOf, c19902412ty.LIZ, c19902412ty2.LIZ);
                Object[] objArrCopyOf = Arrays.copyOf(c19902412ty.LIZJ, i);
                System.arraycopy(c19902412ty2.LIZJ, 0, objArrCopyOf, c19902412ty.LIZ, c19902412ty2.LIZ);
                c19902412ty = new C19902412ty(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                c19902412ty.getClass();
                if (!c19902412ty2.equals(c19902412ty3)) {
                    if (c19902412ty.LJ) {
                        int i2 = c19902412ty.LIZ + c19902412ty2.LIZ;
                        c19902412ty.LIZIZ(i2);
                        System.arraycopy(c19902412ty2.LIZIZ, 0, c19902412ty.LIZIZ, c19902412ty.LIZ, c19902412ty2.LIZ);
                        System.arraycopy(c19902412ty2.LIZJ, 0, c19902412ty.LIZJ, c19902412ty.LIZ, c19902412ty2.LIZ);
                        c19902412ty.LIZ = i2;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        abstractC19899612tW.zzb = c19902412ty;
    }

    public static void LIZ(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886712rR) {
                C19886712rR c19886712rR = (C19886712rR) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19886712rR.LLILLL; i4++) {
                        c19886712rR.LJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3++;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19886712rR.LLILLL) {
                        AbstractC19901712tr abstractC19901712tr = c19901812ts.LIZ;
                        c19886712rR.LJ(i2);
                        abstractC19901712tr.LJ(c19886712rR.LLILLJJLI[i2] ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886712rR.LLILLL) {
                    AbstractC19901712tr abstractC19901712tr2 = c19901812ts.LIZ;
                    c19886712rR.LJ(i2);
                    abstractC19901712tr2.LJII(i, c19886712rR.LLILLJJLI[i2]);
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) ListProtector.get(list, i6)).booleanValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5++;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJ(((Boolean) ListProtector.get(list, i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJII(i, ((Boolean) ListProtector.get(list, i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void LJFF(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886912rT) {
                C19886912rT c19886912rT = (C19886912rT) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19886912rT.LLILLL; i4++) {
                        c19886912rT.LJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3 += 8;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19886912rT.LLILLL) {
                        AbstractC19901712tr abstractC19901712tr = c19901812ts.LIZ;
                        c19886912rT.LJ(i2);
                        double d = c19886912rT.LLILLJJLI[i2];
                        abstractC19901712tr.getClass();
                        abstractC19901712tr.LJIILL(Double.doubleToRawLongBits(d));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886912rT.LLILLL) {
                    AbstractC19901712tr abstractC19901712tr2 = c19901812ts.LIZ;
                    c19886912rT.LJ(i2);
                    double d2 = c19886912rT.LLILLJJLI[i2];
                    abstractC19901712tr2.getClass();
                    abstractC19901712tr2.LJIILJJIL(i, Double.doubleToRawLongBits(d2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) ListProtector.get(list, i6)).doubleValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5 += 8;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    AbstractC19901712tr abstractC19901712tr3 = c19901812ts.LIZ;
                    double dDoubleValue = ((Double) ListProtector.get(list, i2)).doubleValue();
                    abstractC19901712tr3.getClass();
                    abstractC19901712tr3.LJIILL(Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19901712tr abstractC19901712tr4 = c19901812ts.LIZ;
                double dDoubleValue2 = ((Double) ListProtector.get(list, i2)).doubleValue();
                abstractC19901712tr4.getClass();
                abstractC19901712tr4.LJIILJJIL(i, Double.doubleToRawLongBits(dDoubleValue2));
                i2++;
            }
        }
    }

    public static void LJI(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886412rO) {
                C19886412rO c19886412rO = (C19886412rO) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIIJJI = 0;
                    for (int i3 = 0; i3 < c19886412rO.LLILLL; i3++) {
                        iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886412rO.LIZJ(i3));
                    }
                    c19901812ts.LIZ.LJJI(iLJIIJJI);
                    while (i2 < c19886412rO.LLILLL) {
                        c19901812ts.LIZ.LJIL(c19886412rO.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886412rO.LLILLL) {
                    c19901812ts.LIZ.LJIJI(i, c19886412rO.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIIJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIIJJI2 += AbstractC19901712tr.LJIIJJI(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c19901812ts.LIZ.LJJI(iLJIIJJI2);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIJI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJII(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886412rO) {
                C19886412rO c19886412rO = (C19886412rO) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19886412rO.LLILLL; i4++) {
                        c19886412rO.LIZJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3 += 4;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19886412rO.LLILLL) {
                        c19901812ts.LIZ.LJIJ(c19886412rO.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886412rO.LLILLL) {
                    c19901812ts.LIZ.LJIIZILJ(i, c19886412rO.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) ListProtector.get(list, i6)).intValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5 += 4;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIIZILJ(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIIIZ(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886512rP) {
                C19886512rP c19886512rP = (C19886512rP) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19886512rP.LLILLL; i4++) {
                        c19886512rP.LJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3 += 8;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19886512rP.LLILLL) {
                        c19901812ts.LIZ.LJIILL(c19886512rP.LJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886512rP.LLILLL) {
                    c19901812ts.LIZ.LJIILJJIL(i, c19886512rP.LJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) ListProtector.get(list, i6)).longValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5 += 8;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIILL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIILJJIL(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIIJJI(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19887012rU) {
                C19887012rU c19887012rU = (C19887012rU) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19887012rU.LLILLL; i4++) {
                        c19887012rU.LJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3 += 4;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19887012rU.LLILLL) {
                        AbstractC19901712tr abstractC19901712tr = c19901812ts.LIZ;
                        c19887012rU.LJ(i2);
                        float f = c19887012rU.LLILLJJLI[i2];
                        abstractC19901712tr.getClass();
                        abstractC19901712tr.LJIJ(Float.floatToRawIntBits(f));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19887012rU.LLILLL) {
                    AbstractC19901712tr abstractC19901712tr2 = c19901812ts.LIZ;
                    c19887012rU.LJ(i2);
                    float f2 = c19887012rU.LLILLJJLI[i2];
                    abstractC19901712tr2.getClass();
                    abstractC19901712tr2.LJIIZILJ(i, Float.floatToRawIntBits(f2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) ListProtector.get(list, i6)).floatValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5 += 4;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    AbstractC19901712tr abstractC19901712tr3 = c19901812ts.LIZ;
                    float fFloatValue = ((Float) ListProtector.get(list, i2)).floatValue();
                    abstractC19901712tr3.getClass();
                    abstractC19901712tr3.LJIJ(Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19901712tr abstractC19901712tr4 = c19901812ts.LIZ;
                float fFloatValue2 = ((Float) ListProtector.get(list, i2)).floatValue();
                abstractC19901712tr4.getClass();
                abstractC19901712tr4.LJIIZILJ(i, Float.floatToRawIntBits(fFloatValue2));
                i2++;
            }
        }
    }

    public static void LJIILIIL(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886412rO) {
                C19886412rO c19886412rO = (C19886412rO) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIIJJI = 0;
                    for (int i3 = 0; i3 < c19886412rO.LLILLL; i3++) {
                        iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886412rO.LIZJ(i3));
                    }
                    c19901812ts.LIZ.LJJI(iLJIIJJI);
                    while (i2 < c19886412rO.LLILLL) {
                        c19901812ts.LIZ.LJIL(c19886412rO.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886412rO.LLILLL) {
                    c19901812ts.LIZ.LJIJI(i, c19886412rO.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIIJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIIJJI2 += AbstractC19901712tr.LJIIJJI(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c19901812ts.LIZ.LJJI(iLJIIJJI2);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIJI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIILL(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886512rP) {
                C19886512rP c19886512rP = (C19886512rP) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIIJJI = 0;
                    for (int i3 = 0; i3 < c19886512rP.LLILLL; i3++) {
                        iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886512rP.LJ(i3));
                    }
                    c19901812ts.LIZ.LJJI(iLJIIJJI);
                    while (i2 < c19886512rP.LLILLL) {
                        c19901812ts.LIZ.LJIJJLI(c19886512rP.LJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886512rP.LLILLL) {
                    c19901812ts.LIZ.LJIJJ(i, c19886512rP.LJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIIJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIIJJI2 += AbstractC19901712tr.LJIIJJI(((Long) ListProtector.get(list, i4)).longValue());
                }
                c19901812ts.LIZ.LJJI(iLJIIJJI2);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIJJLI(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIJJ(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIIZILJ(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886412rO) {
                C19886412rO c19886412rO = (C19886412rO) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19886412rO.LLILLL; i4++) {
                        c19886412rO.LIZJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3 += 4;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19886412rO.LLILLL) {
                        c19901812ts.LIZ.LJIJ(c19886412rO.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886412rO.LLILLL) {
                    c19901812ts.LIZ.LJIIZILJ(i, c19886412rO.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) ListProtector.get(list, i6)).intValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5 += 4;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIJ(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIIZILJ(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIJI(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886512rP) {
                C19886512rP c19886512rP = (C19886512rP) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19886512rP.LLILLL; i4++) {
                        c19886512rP.LJ(i4);
                        Logger logger = AbstractC19901712tr.LIZIZ;
                        i3 += 8;
                    }
                    c19901812ts.LIZ.LJJI(i3);
                    while (i2 < c19886512rP.LLILLL) {
                        c19901812ts.LIZ.LJIILL(c19886512rP.LJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886512rP.LLILLL) {
                    c19901812ts.LIZ.LJIILJJIL(i, c19886512rP.LJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) ListProtector.get(list, i6)).longValue();
                    Logger logger2 = AbstractC19901712tr.LIZIZ;
                    i5 += 8;
                }
                c19901812ts.LIZ.LJJI(i5);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIILL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIILJJIL(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJIJJ(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886412rO) {
                C19886412rO c19886412rO = (C19886412rO) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIILLIIL = 0;
                    for (int i3 = 0; i3 < c19886412rO.LLILLL; i3++) {
                        int iLIZJ = c19886412rO.LIZJ(i3);
                        iLJIILLIIL += AbstractC19901712tr.LJIILLIIL((iLIZJ >> 31) ^ (iLIZJ << 1));
                    }
                    c19901812ts.LIZ.LJJI(iLJIILLIIL);
                    while (i2 < c19886412rO.LLILLL) {
                        AbstractC19901712tr abstractC19901712tr = c19901812ts.LIZ;
                        int iLIZJ2 = c19886412rO.LIZJ(i2);
                        abstractC19901712tr.LJJI((iLIZJ2 >> 31) ^ (iLIZJ2 << 1));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886412rO.LLILLL) {
                    AbstractC19901712tr abstractC19901712tr2 = c19901812ts.LIZ;
                    int iLIZJ3 = c19886412rO.LIZJ(i2);
                    abstractC19901712tr2.LJJIFFI(i, (iLIZJ3 >> 31) ^ (iLIZJ3 << 1));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIILLIIL2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int iIntValue = ((Integer) ListProtector.get(list, i4)).intValue();
                    iLJIILLIIL2 += AbstractC19901712tr.LJIILLIIL((iIntValue >> 31) ^ (iIntValue << 1));
                }
                c19901812ts.LIZ.LJJI(iLJIILLIIL2);
                while (i2 < list.size()) {
                    AbstractC19901712tr abstractC19901712tr3 = c19901812ts.LIZ;
                    int iIntValue2 = ((Integer) ListProtector.get(list, i2)).intValue();
                    abstractC19901712tr3.LJJI((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19901712tr abstractC19901712tr4 = c19901812ts.LIZ;
                int iIntValue3 = ((Integer) ListProtector.get(list, i2)).intValue();
                abstractC19901712tr4.LJJIFFI(i, (iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i2++;
            }
        }
    }

    public static void LJIJJLI(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886512rP) {
                C19886512rP c19886512rP = (C19886512rP) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIIJJI = 0;
                    for (int i3 = 0; i3 < c19886512rP.LLILLL; i3++) {
                        long jLJ = c19886512rP.LJ(i3);
                        iLJIIJJI += AbstractC19901712tr.LJIIJJI((jLJ >> 63) ^ (jLJ << 1));
                    }
                    c19901812ts.LIZ.LJJI(iLJIIJJI);
                    while (i2 < c19886512rP.LLILLL) {
                        AbstractC19901712tr abstractC19901712tr = c19901812ts.LIZ;
                        long jLJ2 = c19886512rP.LJ(i2);
                        abstractC19901712tr.LJIJJLI((jLJ2 >> 63) ^ (jLJ2 << 1));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886512rP.LLILLL) {
                    AbstractC19901712tr abstractC19901712tr2 = c19901812ts.LIZ;
                    long jLJ3 = c19886512rP.LJ(i2);
                    abstractC19901712tr2.LJIJJ(i, (jLJ3 >> 63) ^ (jLJ3 << 1));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIIJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long jLongValue = ((Long) ListProtector.get(list, i4)).longValue();
                    iLJIIJJI2 += AbstractC19901712tr.LJIIJJI((jLongValue >> 63) ^ (jLongValue << 1));
                }
                c19901812ts.LIZ.LJJI(iLJIIJJI2);
                while (i2 < list.size()) {
                    AbstractC19901712tr abstractC19901712tr3 = c19901812ts.LIZ;
                    long jLongValue2 = ((Long) ListProtector.get(list, i2)).longValue();
                    abstractC19901712tr3.LJIJJLI((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19901712tr abstractC19901712tr4 = c19901812ts.LIZ;
                long jLongValue3 = ((Long) ListProtector.get(list, i2)).longValue();
                abstractC19901712tr4.LJIJJ(i, (jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i2++;
            }
        }
    }

    public static void LJIL(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886412rO) {
                C19886412rO c19886412rO = (C19886412rO) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIILLIIL = 0;
                    for (int i3 = 0; i3 < c19886412rO.LLILLL; i3++) {
                        iLJIILLIIL += AbstractC19901712tr.LJIILLIIL(c19886412rO.LIZJ(i3));
                    }
                    c19901812ts.LIZ.LJJI(iLJIILLIIL);
                    while (i2 < c19886412rO.LLILLL) {
                        c19901812ts.LIZ.LJJI(c19886412rO.LIZJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886412rO.LLILLL) {
                    c19901812ts.LIZ.LJJIFFI(i, c19886412rO.LIZJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIILLIIL2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIILLIIL2 += AbstractC19901712tr.LJIILLIIL(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c19901812ts.LIZ.LJJI(iLJIILLIIL2);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJJI(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJJIFFI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJ(int i, List list, C19901812ts c19901812ts, boolean z) {
        if (list != null && !list.isEmpty()) {
            c19901812ts.getClass();
            int i2 = 0;
            if (list instanceof C19886512rP) {
                C19886512rP c19886512rP = (C19886512rP) list;
                if (z) {
                    c19901812ts.LIZ.LJJ(i, 2);
                    int iLJIIJJI = 0;
                    for (int i3 = 0; i3 < c19886512rP.LLILLL; i3++) {
                        iLJIIJJI += AbstractC19901712tr.LJIIJJI(c19886512rP.LJ(i3));
                    }
                    c19901812ts.LIZ.LJJI(iLJIIJJI);
                    while (i2 < c19886512rP.LLILLL) {
                        c19901812ts.LIZ.LJIJJLI(c19886512rP.LJ(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19886512rP.LLILLL) {
                    c19901812ts.LIZ.LJIJJ(i, c19886512rP.LJ(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19901812ts.LIZ.LJJ(i, 2);
                int iLJIIJJI2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIIJJI2 += AbstractC19901712tr.LJIIJJI(((Long) ListProtector.get(list, i4)).longValue());
                }
                c19901812ts.LIZ.LJJI(iLJIIJJI2);
                while (i2 < list.size()) {
                    c19901812ts.LIZ.LJIJJLI(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19901812ts.LIZ.LJIJJ(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }
}
