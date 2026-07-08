package X;

import X.AbstractC19899612tW;
import X.AbstractC19899712tX;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.12tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19899612tW<MessageType extends AbstractC19899612tW<MessageType, BuilderType>, BuilderType extends AbstractC19899712tX<MessageType, BuilderType>> extends AbstractC19899312tT<MessageType, BuilderType> {
    public static Map<Object, AbstractC19899612tW<?, ?>> zzc = new ConcurrentHashMap();
    public int zzd = -1;
    public C19902412ty zzb = C19902412ty.LJFF;

    @Override // X.InterfaceC19901112tl
    public final int LIZIZ() {
        return LJFF(null);
    }

    @Override // X.InterfaceC19901112tl
    public final /* synthetic */ AbstractC19899712tX LIZJ() {
        return (AbstractC19899712tX) LJIILL(5);
    }

    @Override // X.InterfaceC19901112tl
    public final /* synthetic */ AbstractC19899712tX LIZLLL() {
        AbstractC19899712tX abstractC19899712tX = (AbstractC19899712tX) LJIILL(5);
        abstractC19899712tX.LJFF(this);
        return abstractC19899712tX;
    }

    @Override // X.InterfaceC19900412te
    public final /* synthetic */ AbstractC19899612tW LJII() {
        return (AbstractC19899612tW) LJIILL(6);
    }

    @Override // X.InterfaceC19900412te
    public final boolean LJIIIIZZ() {
        return LJIJ(this, true);
    }

    public abstract Object LJIILL(int i);

    public final <MessageType extends AbstractC19899612tW<MessageType, BuilderType>, BuilderType extends AbstractC19899712tX<MessageType, BuilderType>> BuilderType LJIJI() {
        return (BuilderType) LJIILL(5);
    }

    public final BuilderType LJIJJ() {
        BuilderType buildertype = (BuilderType) LJIILL(5);
        buildertype.LJFF(this);
        return buildertype;
    }

    @Override // X.AbstractC19899312tT
    public final int LJIIIZ() {
        return this.zzd & Integer.MAX_VALUE;
    }

    public final void LJIJJLI() {
        C19902512tz c19902512tz = C19902512tz.LIZJ;
        c19902512tz.getClass();
        c19902512tz.LIZ(getClass()).LIZIZ(this);
        LJIL();
    }

    public final void LJIL() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean LJJ() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (LJJ()) {
            C19902512tz c19902512tz = C19902512tz.LIZJ;
            c19902512tz.getClass();
            return c19902512tz.LIZ(getClass()).LIZJ(this);
        }
        if (this.zza == 0) {
            C19902512tz c19902512tz2 = C19902512tz.LIZJ;
            c19902512tz2.getClass();
            this.zza = c19902512tz2.LIZ(getClass()).LIZJ(this);
        }
        return this.zza;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = C19900312td.LIZ;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C19900312td.LIZ(this, sb, 0);
        return sb.toString();
    }

    public static <T extends AbstractC19899612tW<?, ?>> T LJIIL(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
                if (t == null) {
                    t = (T) ((AbstractC19899612tW) C19906212ua.LIZIZ(cls)).LJIILL(6);
                    if (t != null) {
                        zzc.put(cls, t);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return t;
    }

    public static <E> InterfaceC19875012pY<E> LJIILIIL(InterfaceC19875012pY<E> interfaceC19875012pY) {
        int i;
        int size = interfaceC19875012pY.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size << 1;
        }
        return interfaceC19875012pY.LJII(i);
    }

    public static C19886512rP LJIILJJIL(InterfaceC19785612b8 interfaceC19785612b8) {
        int i;
        C19886512rP c19886512rP = (C19886512rP) interfaceC19785612b8;
        int i2 = c19886512rP.LLILLL;
        if (i2 == 0) {
            i = 10;
        } else {
            i = i2 << 1;
            if (i < i2) {
                throw new IllegalArgumentException();
            }
        }
        return new C19886512rP(c19886512rP.LLILLL, true, Arrays.copyOf(c19886512rP.LLILLJJLI, i));
    }

    @Override // X.InterfaceC19901112tl
    public final void LJ(AbstractC19901712tr abstractC19901712tr) {
        C19902512tz c19902512tz = C19902512tz.LIZJ;
        c19902512tz.getClass();
        InterfaceC19900112tb interfaceC19900112tbLIZ = c19902512tz.LIZ(getClass());
        C19901812ts c19901812ts = abstractC19901712tr.LIZ;
        if (c19901812ts == null) {
            c19901812ts = new C19901812ts(abstractC19901712tr);
        }
        interfaceC19900112tbLIZ.LIZLLL(this, c19901812ts);
    }

    @Override // X.AbstractC19899312tT
    public final int LJFF(InterfaceC19900112tb interfaceC19900112tb) {
        int iLIZ;
        int iLIZ2;
        if (LJJ()) {
            if (interfaceC19900112tb == null) {
                C19902512tz c19902512tz = C19902512tz.LIZJ;
                c19902512tz.getClass();
                iLIZ2 = c19902512tz.LIZ(getClass()).LIZ(this);
            } else {
                iLIZ2 = interfaceC19900112tb.LIZ(this);
            }
            if (iLIZ2 >= 0) {
                return iLIZ2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iLIZ2);
        }
        if (LJIIIZ() != Integer.MAX_VALUE) {
            return LJIIIZ();
        }
        if (interfaceC19900112tb == null) {
            C19902512tz c19902512tz2 = C19902512tz.LIZJ;
            c19902512tz2.getClass();
            iLIZ = c19902512tz2.LIZ(getClass()).LIZ(this);
        } else {
            iLIZ = interfaceC19900112tb.LIZ(this);
        }
        LJIIJJI(iLIZ);
        return iLIZ;
    }

    @Override // X.AbstractC19899312tT
    public final void LJIIJJI(int i) {
        if (i >= 0) {
            this.zzd = (i & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C19902512tz c19902512tz = C19902512tz.LIZJ;
        c19902512tz.getClass();
        return c19902512tz.LIZ(getClass()).LJII(this, obj);
    }

    public static <T extends AbstractC19899612tW<?, ?>> void LJIIZILJ(Class<T> cls, T t) {
        t.LJIL();
        zzc.put(cls, t);
    }

    public static final <T extends AbstractC19899612tW<T, ?>> boolean LJIJ(T t, boolean z) {
        byte bByteValue = ((Byte) t.LJIILL(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C19902512tz c19902512tz = C19902512tz.LIZJ;
        c19902512tz.getClass();
        boolean zLJ = c19902512tz.LIZ(t.getClass()).LJ(t);
        if (z) {
            t.LJIILL(2);
        }
        return zLJ;
    }

    public static Object LJIILLIIL(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGz/D+qAVxNrfF00hvBxN69", new String[]{"016a9"}));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }
}
