package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12yB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19928512yB {
    public static final Class<?> LIZ;
    public static final AbstractC19929412yK<?, ?> LIZIZ;
    public static final C19927812y4 LIZJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.12y4] */
    static {
        Class<?> cls;
        Class<?> cls2 = C19915512w5.LIZ;
        AbstractC19929412yK<?, ?> abstractC19929412yK = null;
        try {
            cls = Class.forName("com.google.protobuf.k0");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            cls = null;
        }
        LIZ = cls;
        try {
            Class<?> cls3 = C19915512w5.LIZ;
            try {
                Class<?> cls4 = Class.forName("com.google.protobuf.g3");
                if (cls4 != null) {
                    abstractC19929412yK = (AbstractC19929412yK) cls4.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
        LIZIZ = abstractC19929412yK;
        LIZJ = new AbstractC19929412yK<C19927712y3, C19927712y3>() { // from class: X.12y4
            @Override // X.AbstractC19929412yK
            public final boolean LJIILL(InterfaceC19929112yH interfaceC19929112yH) {
                return false;
            }

            @Override // X.AbstractC19929412yK
            public final C19927712y3 LJIIL() {
                return new C19927712y3();
            }

            @Override // X.AbstractC19929412yK
            public final C19927712y3 LJFF(Object obj) {
                AbstractC19924712xZ abstractC19924712xZ = (AbstractC19924712xZ) obj;
                C19927712y3 c19927712y3 = abstractC19924712xZ.unknownFields;
                if (c19927712y3 == C19927712y3.LJFF) {
                    C19927712y3 c19927712y32 = new C19927712y3();
                    abstractC19924712xZ.unknownFields = c19927712y32;
                    return c19927712y32;
                }
                return c19927712y3;
            }

            @Override // X.AbstractC19929412yK
            public final C19927712y3 LJI(Object obj) {
                return ((AbstractC19924712xZ) obj).unknownFields;
            }

            @Override // X.AbstractC19929412yK
            public final int LJII(C19927712y3 c19927712y3) {
                return c19927712y3.LIZJ();
            }

            @Override // X.AbstractC19929412yK
            public final int LJIIIIZZ(C19927712y3 c19927712y3) {
                C19927712y3 c19927712y32 = c19927712y3;
                int iLJIIL = c19927712y32.LIZLLL;
                if (iLJIIL == -1) {
                    iLJIIL = 0;
                    for (int i = 0; i < c19927712y32.LIZ; i++) {
                        iLJIIL += (AbstractC19928912yF.LJIIL(1) * 2) + AbstractC19928912yF.LJIIL(2) + AbstractC19928912yF.LJIILIIL(c19927712y32.LIZIZ[i] >>> 3) + AbstractC19928912yF.LIZJ(3, (AbstractC19922812xG) c19927712y32.LIZJ[i]);
                    }
                    c19927712y32.LIZLLL = iLJIIL;
                }
                return iLJIIL;
            }

            @Override // X.AbstractC19929412yK
            public final void LJIIIZ(Object obj) {
                C19927712y3 c19927712y3 = ((AbstractC19924712xZ) obj).unknownFields;
                if (c19927712y3.LJ) {
                    c19927712y3.LJ = false;
                }
            }

            @Override // X.AbstractC19929412yK
            public final C19927712y3 LJIILLIIL(C19927712y3 c19927712y3) {
                C19927712y3 c19927712y32 = c19927712y3;
                if (c19927712y32.LJ) {
                    c19927712y32.LJ = false;
                }
                return c19927712y32;
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
            @Override // X.AbstractC19929412yK
            public final C19927712y3 LJIIJ(C19927712y3 c19927712y3, C19927712y3 c19927712y32) {
                C19927712y3 c19927712y33 = c19927712y3;
                C19927712y3 c19927712y34 = c19927712y32;
                C19927712y3 c19927712y35 = C19927712y3.LJFF;
                if (!c19927712y35.equals(c19927712y34)) {
                    if (c19927712y35.equals(c19927712y33)) {
                        return C19927712y3.LJ(c19927712y33, c19927712y34);
                    }
                    c19927712y33.getClass();
                    if (c19927712y34.equals(c19927712y35)) {
                        return c19927712y33;
                    }
                    c19927712y33.LIZ();
                    int i = c19927712y33.LIZ + c19927712y34.LIZ;
                    c19927712y33.LIZIZ(i);
                    System.arraycopy(c19927712y34.LIZIZ, 0, c19927712y33.LIZIZ, c19927712y33.LIZ, c19927712y34.LIZ);
                    System.arraycopy(c19927712y34.LIZJ, 0, c19927712y33.LIZJ, c19927712y33.LIZ, c19927712y34.LIZ);
                    c19927712y33.LIZ = i;
                    return c19927712y33;
                }
                return c19927712y33;
            }

            @Override // X.AbstractC19929412yK
            public final void LJIILIIL(Object obj, C19927712y3 c19927712y3) {
                ((AbstractC19924712xZ) obj).unknownFields = c19927712y3;
            }

            @Override // X.AbstractC19929412yK
            public final void LJIILJJIL(Object obj, C19927712y3 c19927712y3) {
                ((AbstractC19924712xZ) obj).unknownFields = c19927712y3;
            }

            @Override // X.AbstractC19929412yK
            public final void LJIIZILJ(C19927712y3 c19927712y3, InterfaceC19361110or interfaceC19361110or) {
                C19927712y3 c19927712y32 = c19927712y3;
                c19927712y32.getClass();
                C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
                c19929012yG.getClass();
                if (EnumC19361010oq.ASCENDING == EnumC19361010oq.DESCENDING) {
                    int i = c19927712y32.LIZ;
                    while (true) {
                        i--;
                        if (i >= 0) {
                            c19929012yG.LJIILJJIL(c19927712y32.LIZIZ[i] >>> 3, c19927712y32.LIZJ[i]);
                        } else {
                            return;
                        }
                    }
                } else {
                    for (int i2 = 0; i2 < c19927712y32.LIZ; i2++) {
                        c19929012yG.LJIILJJIL(c19927712y32.LIZIZ[i2] >>> 3, c19927712y32.LIZJ[i2]);
                    }
                }
            }

            @Override // X.AbstractC19929412yK
            public final void LJIJ(C19927712y3 c19927712y3, InterfaceC19361110or interfaceC19361110or) {
                c19927712y3.LJI(interfaceC19361110or);
            }

            @Override // X.AbstractC19929412yK
            public final void LIZ(int i, int i2, Object obj) {
                ((C19927712y3) obj).LJFF((i << 3) | 5, Integer.valueOf(i2));
            }

            @Override // X.AbstractC19929412yK
            public final void LIZIZ(int i, long j, Object obj) {
                ((C19927712y3) obj).LJFF((i << 3) | 1, Long.valueOf(j));
            }

            @Override // X.AbstractC19929412yK
            public final void LIZJ(int i, Object obj, Object obj2) {
                ((C19927712y3) obj).LJFF((i << 3) | 3, obj2);
            }

            @Override // X.AbstractC19929412yK
            public final void LIZLLL(C19927712y3 c19927712y3, int i, AbstractC19922812xG abstractC19922812xG) {
                c19927712y3.LJFF((i << 3) | 2, abstractC19922812xG);
            }

            @Override // X.AbstractC19929412yK
            public final void LJ(int i, long j, Object obj) {
                ((C19927712y3) obj).LJFF(i << 3, Long.valueOf(j));
            }
        };
    }

    public static int LIZ(List<Integer> list) {
        int iLJIILJJIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19889012ro.getInt(i));
                i++;
            }
        } else {
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIILJJIL;
    }

    public static int LIZLLL(List<Integer> list) {
        int iLJIILJJIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19889012ro.getInt(i));
                i++;
            }
        } else {
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIILJJIL;
    }

    public static int LJ(List<Long> list) {
        int iLJIILJJIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19888812rm.getLong(i));
                i++;
            }
        } else {
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJIILJJIL;
    }

    public static int LJFF(List<Integer> list) {
        int iLJIIIZ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            iLJIIIZ = 0;
            while (i < size) {
                iLJIIIZ += AbstractC19928912yF.LJIIIZ(c19889012ro.getInt(i));
                i++;
            }
        } else {
            iLJIIIZ = 0;
            while (i < size) {
                iLJIIIZ += AbstractC19928912yF.LJIIIZ(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIIIZ;
    }

    public static int LJI(List<Long> list) {
        int iLJIIJ;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            iLJIIJ = 0;
            while (i < size) {
                iLJIIJ += AbstractC19928912yF.LJIIJ(c19888812rm.getLong(i));
                i++;
            }
        } else {
            iLJIIJ = 0;
            while (i < size) {
                iLJIIJ += AbstractC19928912yF.LJIIJ(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJIIJ;
    }

    public static int LJII(List<Integer> list) {
        int iLJIILIIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            iLJIILIIL = 0;
            while (i < size) {
                iLJIILIIL += AbstractC19928912yF.LJIILIIL(c19889012ro.getInt(i));
                i++;
            }
        } else {
            iLJIILIIL = 0;
            while (i < size) {
                iLJIILIIL += AbstractC19928912yF.LJIILIIL(((Integer) ListProtector.get(list, i)).intValue());
                i++;
            }
        }
        return iLJIILIIL;
    }

    public static int LJIIIIZZ(List<Long> list) {
        int iLJIILJJIL;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19888812rm.getLong(i));
                i++;
            }
        } else {
            iLJIILJJIL = 0;
            while (i < size) {
                iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(((Long) ListProtector.get(list, i)).longValue());
                i++;
            }
        }
        return iLJIILJJIL;
    }

    public static int LIZIZ(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC19928912yF.LJIIL(i) + 4);
    }

    public static int LIZJ(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC19928912yF.LJIIL(i) + 8);
    }

    public static boolean LJIIL(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj != null && obj.equals(obj2)) {
                return true;
            }
            return false;
        }
        return true;
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
    public static <T, FT extends InterfaceC19930212yS<FT>> void LJIIJJI(AbstractC19929512yL<FT> abstractC19929512yL, T t, T t2) {
        C19928612yC<T> c19928612yCLIZJ = abstractC19929512yL.LIZJ(t2);
        if (!c19928612yCLIZJ.LJIILL()) {
            C19928612yC<T> c19928612yCLIZLLL = abstractC19929512yL.LIZLLL(t);
            c19928612yCLIZLLL.getClass();
            int i = c19928612yCLIZJ.LIZ.LLILLJJLI;
            for (int i2 = 0; i2 < i; i2++) {
                c19928612yCLIZLLL.LJIJJLI(c19928612yCLIZJ.LIZ.LIZJ(i2));
            }
            Iterator<T> it2 = c19928612yCLIZJ.LIZ.LIZLLL().iterator();
            while (it2.hasNext()) {
                c19928612yCLIZLLL.LJIJJLI((Map.Entry) it2.next());
            }
        }
    }

    public static void LJIILL(int i, List<AbstractC19922812xG> list, InterfaceC19361110or interfaceC19361110or) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c19929012yG.LIZ.LJIJI(i, (AbstractC19922812xG) ListProtector.get(list, i2));
            }
        }
    }

    public static void LJJIIJZLJL(int i, List<String> list, InterfaceC19361110or interfaceC19361110or) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof InterfaceC19921312x1) {
                InterfaceC19921312x1 interfaceC19921312x1 = (InterfaceC19921312x1) list;
                while (i2 < list.size()) {
                    Object objLJJJLL = interfaceC19921312x1.LJJJLL(i2);
                    if (objLJJJLL instanceof String) {
                        c19929012yG.LIZ.LJJIJ(i, (String) objLJJJLL);
                    } else {
                        c19929012yG.LIZ.LJIJI(i, (AbstractC19922812xG) objLJJJLL);
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJJIJ(i, (String) ListProtector.get(list, i2));
                i2++;
            }
        }
    }

    public static void LJIILJJIL(int i, List<Boolean> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19888412ri) {
                C19888412ri c19888412ri = (C19888412ri) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19888412ri.LLILLL; i4++) {
                        c19888412ri.LJFF(i4);
                        Logger logger = AbstractC19928912yF.LIZIZ;
                        i3++;
                    }
                    c19929012yG.LIZ.LJJIJL(i3);
                    while (i2 < c19888412ri.LLILLL) {
                        AbstractC19928912yF abstractC19928912yF = c19929012yG.LIZ;
                        c19888412ri.LJFF(i2);
                        abstractC19928912yF.LJIILLIIL(c19888412ri.LLILLJJLI[i2] ? (byte) 1 : (byte) 0);
                        i2++;
                    }
                    return;
                }
                while (i2 < c19888412ri.LLILLL) {
                    AbstractC19928912yF abstractC19928912yF2 = c19929012yG.LIZ;
                    c19888412ri.LJFF(i2);
                    abstractC19928912yF2.LJIIZILJ(i, c19888412ri.LLILLJJLI[i2]);
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) ListProtector.get(list, i6)).booleanValue();
                    Logger logger2 = AbstractC19928912yF.LIZIZ;
                    i5++;
                }
                c19929012yG.LIZ.LJJIJL(i5);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJIILLIIL(((Boolean) ListProtector.get(list, i2)).booleanValue() ? (byte) 1 : (byte) 0);
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJIIZILJ(i, ((Boolean) ListProtector.get(list, i2)).booleanValue());
                i2++;
            }
        }
    }

    public static void LJIILLIIL(int i, List<Double> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19888612rk) {
                C19888612rk c19888612rk = (C19888612rk) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19888612rk.LLILLL; i4++) {
                        c19888612rk.LJFF(i4);
                        Logger logger = AbstractC19928912yF.LIZIZ;
                        i3 += 8;
                    }
                    c19929012yG.LIZ.LJJIJL(i3);
                    while (i2 < c19888612rk.LLILLL) {
                        AbstractC19928912yF abstractC19928912yF = c19929012yG.LIZ;
                        c19888612rk.LJFF(i2);
                        double d = c19888612rk.LLILLJJLI[i2];
                        abstractC19928912yF.getClass();
                        abstractC19928912yF.LJJI(Double.doubleToRawLongBits(d));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19888612rk.LLILLL) {
                    AbstractC19928912yF abstractC19928912yF2 = c19929012yG.LIZ;
                    c19888612rk.LJFF(i2);
                    double d2 = c19888612rk.LLILLJJLI[i2];
                    abstractC19928912yF2.getClass();
                    abstractC19928912yF2.LJJ(i, Double.doubleToRawLongBits(d2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Double) ListProtector.get(list, i6)).doubleValue();
                    Logger logger2 = AbstractC19928912yF.LIZIZ;
                    i5 += 8;
                }
                c19929012yG.LIZ.LJJIJL(i5);
                while (i2 < list.size()) {
                    AbstractC19928912yF abstractC19928912yF3 = c19929012yG.LIZ;
                    double dDoubleValue = ((Double) ListProtector.get(list, i2)).doubleValue();
                    abstractC19928912yF3.getClass();
                    abstractC19928912yF3.LJJI(Double.doubleToRawLongBits(dDoubleValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19928912yF abstractC19928912yF4 = c19929012yG.LIZ;
                double dDoubleValue2 = ((Double) ListProtector.get(list, i2)).doubleValue();
                abstractC19928912yF4.getClass();
                abstractC19928912yF4.LJJ(i, Double.doubleToRawLongBits(dDoubleValue2));
                i2++;
            }
        }
    }

    public static void LJIIZILJ(int i, List<Integer> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19889012ro) {
                C19889012ro c19889012ro = (C19889012ro) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int iLJIILJJIL = 0;
                    for (int i3 = 0; i3 < c19889012ro.LLILLL; i3++) {
                        iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19889012ro.getInt(i3));
                    }
                    c19929012yG.LIZ.LJJIJL(iLJIILJJIL);
                    while (i2 < c19889012ro.LLILLL) {
                        c19929012yG.LIZ.LJJIII(c19889012ro.getInt(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19889012ro.LLILLL) {
                    c19929012yG.LIZ.LJJII(i, c19889012ro.getInt(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int iLJIILJJIL2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIILJJIL2 += AbstractC19928912yF.LJIILJJIL(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c19929012yG.LIZ.LJJIJL(iLJIILJJIL2);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJJIII(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJJII(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJIJ(int i, List<Integer> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((C19929012yG) interfaceC19361110or).LJFF(i, z, list);
        }
    }

    public static void LJIJI(int i, List<Long> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((C19929012yG) interfaceC19361110or).LJII(i, z, list);
        }
    }

    public static void LJIJJ(int i, List<Float> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19888112rf) {
                C19888112rf c19888112rf = (C19888112rf) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19888112rf.LLILLL; i4++) {
                        c19888112rf.LJFF(i4);
                        Logger logger = AbstractC19928912yF.LIZIZ;
                        i3 += 4;
                    }
                    c19929012yG.LIZ.LJJIJL(i3);
                    while (i2 < c19888112rf.LLILLL) {
                        AbstractC19928912yF abstractC19928912yF = c19929012yG.LIZ;
                        c19888112rf.LJFF(i2);
                        float f = c19888112rf.LLILLJJLI[i2];
                        abstractC19928912yF.getClass();
                        abstractC19928912yF.LJIL(Float.floatToRawIntBits(f));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19888112rf.LLILLL) {
                    AbstractC19928912yF abstractC19928912yF2 = c19929012yG.LIZ;
                    c19888112rf.LJFF(i2);
                    float f2 = c19888112rf.LLILLJJLI[i2];
                    abstractC19928912yF2.getClass();
                    abstractC19928912yF2.LJIJJLI(i, Float.floatToRawIntBits(f2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Float) ListProtector.get(list, i6)).floatValue();
                    Logger logger2 = AbstractC19928912yF.LIZIZ;
                    i5 += 4;
                }
                c19929012yG.LIZ.LJJIJL(i5);
                while (i2 < list.size()) {
                    AbstractC19928912yF abstractC19928912yF3 = c19929012yG.LIZ;
                    float fFloatValue = ((Float) ListProtector.get(list, i2)).floatValue();
                    abstractC19928912yF3.getClass();
                    abstractC19928912yF3.LJIL(Float.floatToRawIntBits(fFloatValue));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19928912yF abstractC19928912yF4 = c19929012yG.LIZ;
                float fFloatValue2 = ((Float) ListProtector.get(list, i2)).floatValue();
                abstractC19928912yF4.getClass();
                abstractC19928912yF4.LJIJJLI(i, Float.floatToRawIntBits(fFloatValue2));
                i2++;
            }
        }
    }

    public static void LJIJJLI(int i, List<?> list, InterfaceC19361110or interfaceC19361110or, InterfaceC19924912xb<?> interfaceC19924912xb) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c19929012yG.LJIIIZ(i, interfaceC19924912xb, ListProtector.get(list, i2));
            }
        }
    }

    public static void LJIL(int i, List<Integer> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19889012ro) {
                C19889012ro c19889012ro = (C19889012ro) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int iLJIILJJIL = 0;
                    for (int i3 = 0; i3 < c19889012ro.LLILLL; i3++) {
                        iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19889012ro.getInt(i3));
                    }
                    c19929012yG.LIZ.LJJIJL(iLJIILJJIL);
                    while (i2 < c19889012ro.LLILLL) {
                        c19929012yG.LIZ.LJJIII(c19889012ro.getInt(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19889012ro.LLILLL) {
                    c19929012yG.LIZ.LJJII(i, c19889012ro.getInt(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int iLJIILJJIL2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIILJJIL2 += AbstractC19928912yF.LJIILJJIL(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c19929012yG.LIZ.LJJIJL(iLJIILJJIL2);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJJIII(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJJII(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJ(int i, List<Long> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            ((C19929012yG) interfaceC19361110or).LJIIL(i, z, list);
        }
    }

    public static void LJJI(int i, List<?> list, InterfaceC19361110or interfaceC19361110or, InterfaceC19924912xb<?> interfaceC19924912xb) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                c19929012yG.LJIILIIL(i, interfaceC19924912xb, ListProtector.get(list, i2));
            }
        }
    }

    public static void LJJIFFI(int i, List<Integer> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19889012ro) {
                C19889012ro c19889012ro = (C19889012ro) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19889012ro.LLILLL; i4++) {
                        c19889012ro.getInt(i4);
                        Logger logger = AbstractC19928912yF.LIZIZ;
                        i3 += 4;
                    }
                    c19929012yG.LIZ.LJJIJL(i3);
                    while (i2 < c19889012ro.LLILLL) {
                        c19929012yG.LIZ.LJIL(c19889012ro.getInt(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19889012ro.LLILLL) {
                    c19929012yG.LIZ.LJIJJLI(i, c19889012ro.getInt(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Integer) ListProtector.get(list, i6)).intValue();
                    Logger logger2 = AbstractC19928912yF.LIZIZ;
                    i5 += 4;
                }
                c19929012yG.LIZ.LJJIJL(i5);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJIL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJIJJLI(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJII(int i, List<Long> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19888812rm) {
                C19888812rm c19888812rm = (C19888812rm) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int i3 = 0;
                    for (int i4 = 0; i4 < c19888812rm.LLILLL; i4++) {
                        c19888812rm.getLong(i4);
                        Logger logger = AbstractC19928912yF.LIZIZ;
                        i3 += 8;
                    }
                    c19929012yG.LIZ.LJJIJL(i3);
                    while (i2 < c19888812rm.LLILLL) {
                        c19929012yG.LIZ.LJJI(c19888812rm.getLong(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19888812rm.LLILLL) {
                    c19929012yG.LIZ.LJJ(i, c19888812rm.getLong(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Long) ListProtector.get(list, i6)).longValue();
                    Logger logger2 = AbstractC19928912yF.LIZIZ;
                    i5 += 8;
                }
                c19929012yG.LIZ.LJJIJL(i5);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJJI(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJJ(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static void LJJIII(int i, List<Integer> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19889012ro) {
                C19889012ro c19889012ro = (C19889012ro) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int iLJIIIZ = 0;
                    for (int i3 = 0; i3 < c19889012ro.LLILLL; i3++) {
                        iLJIIIZ += AbstractC19928912yF.LJIIIZ(c19889012ro.getInt(i3));
                    }
                    c19929012yG.LIZ.LJJIJL(iLJIIIZ);
                    while (i2 < c19889012ro.LLILLL) {
                        AbstractC19928912yF abstractC19928912yF = c19929012yG.LIZ;
                        int i4 = c19889012ro.getInt(i2);
                        abstractC19928912yF.LJJIJL((i4 >> 31) ^ (i4 << 1));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19889012ro.LLILLL) {
                    AbstractC19928912yF abstractC19928912yF2 = c19929012yG.LIZ;
                    int i5 = c19889012ro.getInt(i2);
                    abstractC19928912yF2.LJJIJIL(i, (i5 >> 31) ^ (i5 << 1));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int iLJIIIZ2 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    iLJIIIZ2 += AbstractC19928912yF.LJIIIZ(((Integer) ListProtector.get(list, i6)).intValue());
                }
                c19929012yG.LIZ.LJJIJL(iLJIIIZ2);
                while (i2 < list.size()) {
                    AbstractC19928912yF abstractC19928912yF3 = c19929012yG.LIZ;
                    int iIntValue = ((Integer) ListProtector.get(list, i2)).intValue();
                    abstractC19928912yF3.LJJIJL((iIntValue >> 31) ^ (iIntValue << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19928912yF abstractC19928912yF4 = c19929012yG.LIZ;
                int iIntValue2 = ((Integer) ListProtector.get(list, i2)).intValue();
                abstractC19928912yF4.LJJIJIL(i, (iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i2++;
            }
        }
    }

    public static void LJJIIJ(int i, List<Long> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19888812rm) {
                C19888812rm c19888812rm = (C19888812rm) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int iLJIIJ = 0;
                    for (int i3 = 0; i3 < c19888812rm.LLILLL; i3++) {
                        iLJIIJ += AbstractC19928912yF.LJIIJ(c19888812rm.getLong(i3));
                    }
                    c19929012yG.LIZ.LJJIJL(iLJIIJ);
                    while (i2 < c19888812rm.LLILLL) {
                        AbstractC19928912yF abstractC19928912yF = c19929012yG.LIZ;
                        long j = c19888812rm.getLong(i2);
                        abstractC19928912yF.LJJIL((j >> 63) ^ (j << 1));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19888812rm.LLILLL) {
                    AbstractC19928912yF abstractC19928912yF2 = c19929012yG.LIZ;
                    long j2 = c19888812rm.getLong(i2);
                    abstractC19928912yF2.LJJIJLIJ(i, (j2 >> 63) ^ (j2 << 1));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int iLJIIJ2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIIJ2 += AbstractC19928912yF.LJIIJ(((Long) ListProtector.get(list, i4)).longValue());
                }
                c19929012yG.LIZ.LJJIJL(iLJIIJ2);
                while (i2 < list.size()) {
                    AbstractC19928912yF abstractC19928912yF3 = c19929012yG.LIZ;
                    long jLongValue = ((Long) ListProtector.get(list, i2)).longValue();
                    abstractC19928912yF3.LJJIL((jLongValue >> 63) ^ (jLongValue << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                AbstractC19928912yF abstractC19928912yF4 = c19929012yG.LIZ;
                long jLongValue2 = ((Long) ListProtector.get(list, i2)).longValue();
                abstractC19928912yF4.LJJIJLIJ(i, (jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i2++;
            }
        }
    }

    public static void LJJIIZ(int i, List<Integer> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19889012ro) {
                C19889012ro c19889012ro = (C19889012ro) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int iLJIILIIL = 0;
                    for (int i3 = 0; i3 < c19889012ro.LLILLL; i3++) {
                        iLJIILIIL += AbstractC19928912yF.LJIILIIL(c19889012ro.getInt(i3));
                    }
                    c19929012yG.LIZ.LJJIJL(iLJIILIIL);
                    while (i2 < c19889012ro.LLILLL) {
                        c19929012yG.LIZ.LJJIJL(c19889012ro.getInt(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19889012ro.LLILLL) {
                    c19929012yG.LIZ.LJJIJIL(i, c19889012ro.getInt(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int iLJIILIIL2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIILIIL2 += AbstractC19928912yF.LJIILIIL(((Integer) ListProtector.get(list, i4)).intValue());
                }
                c19929012yG.LIZ.LJJIJL(iLJIILIIL2);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJJIJL(((Integer) ListProtector.get(list, i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJJIJIL(i, ((Integer) ListProtector.get(list, i2)).intValue());
                i2++;
            }
        }
    }

    public static void LJJIIZI(int i, List<Long> list, InterfaceC19361110or interfaceC19361110or, boolean z) {
        if (list != null && !list.isEmpty()) {
            C19929012yG c19929012yG = (C19929012yG) interfaceC19361110or;
            c19929012yG.getClass();
            int i2 = 0;
            if (list instanceof C19888812rm) {
                C19888812rm c19888812rm = (C19888812rm) list;
                if (z) {
                    c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                    int iLJIILJJIL = 0;
                    for (int i3 = 0; i3 < c19888812rm.LLILLL; i3++) {
                        iLJIILJJIL += AbstractC19928912yF.LJIILJJIL(c19888812rm.getLong(i3));
                    }
                    c19929012yG.LIZ.LJJIJL(iLJIILJJIL);
                    while (i2 < c19888812rm.LLILLL) {
                        c19929012yG.LIZ.LJJIL(c19888812rm.getLong(i2));
                        i2++;
                    }
                    return;
                }
                while (i2 < c19888812rm.LLILLL) {
                    c19929012yG.LIZ.LJJIJLIJ(i, c19888812rm.getLong(i2));
                    i2++;
                }
                return;
            }
            if (z) {
                c19929012yG.LIZ.LJJIJIIJIL(i, 2);
                int iLJIILJJIL2 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    iLJIILJJIL2 += AbstractC19928912yF.LJIILJJIL(((Long) ListProtector.get(list, i4)).longValue());
                }
                c19929012yG.LIZ.LJJIJL(iLJIILJJIL2);
                while (i2 < list.size()) {
                    c19929012yG.LIZ.LJJIL(((Long) ListProtector.get(list, i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                c19929012yG.LIZ.LJJIJLIJ(i, ((Long) ListProtector.get(list, i2)).longValue());
                i2++;
            }
        }
    }

    public static <UT, UB> UB LJIILIIL(Object obj, int i, int i2, UB ub, AbstractC19929412yK<UT, UB> abstractC19929412yK) {
        if (ub == null) {
            ub = abstractC19929412yK.LJFF(obj);
        }
        abstractC19929412yK.LJ(i, i2, ub);
        return ub;
    }

    public static <UT, UB> UB LJIIIZ(Object obj, int i, List<Integer> list, InterfaceC19922212xA<?> interfaceC19922212xA, UB ub, AbstractC19929412yK<UT, UB> abstractC19929412yK) {
        if (interfaceC19922212xA == null) {
            return ub;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            int iIntValue = ((Integer) ListProtector.get(list, i3)).intValue();
            if (interfaceC19922212xA.LIZJ(iIntValue) != null) {
                if (i3 != i2) {
                    ListProtector.set(list, i2, Integer.valueOf(iIntValue));
                }
                i2++;
            } else {
                ub = (UB) LJIILIIL(obj, i, iIntValue, ub, abstractC19929412yK);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return ub;
    }

    public static <UT, UB> UB LJIIJ(Object obj, int i, List<Integer> list, InterfaceC19931212yc interfaceC19931212yc, UB ub, AbstractC19929412yK<UT, UB> abstractC19929412yK) {
        if (interfaceC19931212yc == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) ListProtector.get(list, i3)).intValue();
                if (interfaceC19931212yc.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        ListProtector.set(list, i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    ub = (UB) LJIILIIL(obj, i, iIntValue, ub, abstractC19929412yK);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue2 = it2.next().intValue();
                if (!interfaceC19931212yc.isInRange(iIntValue2)) {
                    ub = (UB) LJIILIIL(obj, i, iIntValue2, ub, abstractC19929412yK);
                    it2.remove();
                }
            }
        }
        return ub;
    }
}
