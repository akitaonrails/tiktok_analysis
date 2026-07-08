package X;

import X.AbstractC19907912ur;
import X.C19908012us;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.12ur, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19907912ur<MessageType extends AbstractC19907912ur<MessageType, BuilderType>, BuilderType extends C19908012us<MessageType, BuilderType>> extends AbstractC19900712th<MessageType, BuilderType> {
    public static final Map zzb = new ConcurrentHashMap();
    public int zzd = -1;
    public C19910312vF zzc = C19910312vF.LJFF;

    public final void LJFF() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final void LJII() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean LJIIIIZZ() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public abstract Object LJIIJ(int i);

    public final C19908012us LJIIJJI() {
        return (C19908012us) LJIIJ(5);
    }

    @Override // X.InterfaceC19900612tg
    public final /* synthetic */ AbstractC19907912ur LJIIL() {
        return (AbstractC19907912ur) LJIIJ(6);
    }

    public final C19908012us LJIILIIL() {
        C19908012us c19908012us = (C19908012us) LJIIJ(5);
        if (!c19908012us.LL.equals(this)) {
            if (!c19908012us.LLILLJJLI.LJIIIIZZ()) {
                c19908012us.LJ();
            }
            AbstractC19907912ur abstractC19907912ur = c19908012us.LLILLJJLI;
            C19908912v1.LIZJ.LIZ(abstractC19907912ur.getClass()).LIZLLL(abstractC19907912ur, this);
        }
        return c19908012us;
    }

    @Override // X.InterfaceC19900612tg
    public final boolean LJIILLIIL() {
        return LJIIIZ(this, true);
    }

    @Override // X.InterfaceC19911612vS
    public final /* synthetic */ C19908012us LJJLIIIIJ() {
        return (C19908012us) LJIIJ(5);
    }

    public final void LJ() {
        C19908912v1.LIZJ.LIZ(getClass()).LJFF(this);
        LJFF();
    }

    @Override // X.InterfaceC19911612vS
    public final int LJIILL() {
        int iLIZ;
        if (LJIIIIZZ()) {
            iLIZ = C19908912v1.LIZJ.LIZ(getClass()).LIZ(this);
            if (iLIZ < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + iLIZ);
            }
        } else {
            iLIZ = this.zzd & Integer.MAX_VALUE;
            if (iLIZ == Integer.MAX_VALUE) {
                int iLIZ2 = C19908912v1.LIZJ.LIZ(getClass()).LIZ(this);
                if (iLIZ2 >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | iLIZ2;
                    return iLIZ2;
                }
                throw new IllegalStateException("serialized size must be non-negative, was " + iLIZ2);
            }
        }
        return iLIZ;
    }

    public final int hashCode() {
        if (LJIIIIZZ()) {
            return C19908912v1.LIZJ.LIZ(getClass()).LIZJ(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iLIZJ = C19908912v1.LIZJ.LIZ(getClass()).LIZJ(this);
        this.zza = iLIZJ;
        return iLIZJ;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = C19900512tf.LIZ;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C19900512tf.LIZJ(this, sb, 0);
        return sb.toString();
    }

    public static AbstractC19907912ur LJIIZILJ(Class cls) {
        Map map = zzb;
        AbstractC19907912ur abstractC19907912ur = (AbstractC19907912ur) map.get(cls);
        if (abstractC19907912ur == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC19907912ur = (AbstractC19907912ur) map.get(cls);
                if (abstractC19907912ur == null) {
                    abstractC19907912ur = (AbstractC19907912ur) ((AbstractC19907912ur) C19907112uj.LJIIIIZZ(cls)).LJIIJ(6);
                    if (abstractC19907912ur != null) {
                        map.put(cls, abstractC19907912ur);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return abstractC19907912ur;
    }

    @Override // X.InterfaceC19911612vS
    public final void LIZ(AbstractC19910412vG abstractC19910412vG) {
        InterfaceC19908112ut interfaceC19908112utLIZ = C19908912v1.LIZJ.LIZ(getClass());
        C19909512v7 c19909512v7 = abstractC19910412vG.LIZ;
        if (c19909512v7 == null) {
            c19909512v7 = new C19909512v7(abstractC19910412vG);
        }
        interfaceC19908112utLIZ.LJI(this, c19909512v7);
    }

    @Override // X.AbstractC19900712th
    public final int LIZJ(InterfaceC19908112ut interfaceC19908112ut) {
        if (LJIIIIZZ()) {
            int iLIZ = interfaceC19908112ut.LIZ(this);
            if (iLIZ >= 0) {
                return iLIZ;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iLIZ);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i == Integer.MAX_VALUE) {
            int iLIZ2 = interfaceC19908112ut.LIZ(this);
            if (iLIZ2 >= 0) {
                this.zzd = (this.zzd & Integer.MIN_VALUE) | iLIZ2;
                return iLIZ2;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iLIZ2);
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C19908912v1.LIZJ.LIZ(getClass()).LIZIZ(this, obj);
    }

    public static void LJI(Class cls, AbstractC19907912ur abstractC19907912ur) {
        abstractC19907912ur.LJFF();
        zzb.put(cls, abstractC19907912ur);
    }

    public static final boolean LJIIIZ(AbstractC19907912ur abstractC19907912ur, boolean z) {
        byte bByteValue = ((Byte) abstractC19907912ur.LJIIJ(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zLJIIIIZZ = C19908912v1.LIZJ.LIZ(abstractC19907912ur.getClass()).LJIIIIZZ(abstractC19907912ur);
        if (z) {
            abstractC19907912ur.LJIIJ(2);
        }
        return zLJIIIIZZ;
    }

    public static AbstractC19907912ur LJIJ(AbstractC19907912ur abstractC19907912ur, byte[] bArr) throws Throwable {
        AbstractC19907912ur abstractC19907912ur2 = abstractC19907912ur;
        int length = bArr.length;
        C19908212uu c19908212uu = C19908212uu.LIZIZ;
        if (length == 0) {
            if (abstractC19907912ur2 != null) {
            }
            return abstractC19907912ur2;
        }
        abstractC19907912ur2 = (AbstractC19907912ur) abstractC19907912ur2.LJIIJ(4);
        try {
            InterfaceC19908112ut interfaceC19908112utLIZ = C19908912v1.LIZJ.LIZ(abstractC19907912ur2.getClass());
            interfaceC19908112utLIZ.LJII(abstractC19907912ur2, bArr, 0, length, new C19911712vT(c19908212uu));
            interfaceC19908112utLIZ.LJFF(abstractC19907912ur2);
        } catch (C19857612mk e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (C19901512tp e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw e2.zza();
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            if (e3.getCause() instanceof C19857612mk) {
                throw e3.getCause();
            }
            throw new C19857612mk(e3);
        } catch (IndexOutOfBoundsException e4) {
            TryCatchGuardChecker.doCheck(e4);
            throw new C19857612mk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (!LJIIIZ(abstractC19907912ur2, true)) {
            throw new C19901512tp(abstractC19907912ur2).zza();
        }
        return abstractC19907912ur2;
    }

    public static Object LJIJI(Object obj, Method method, Object... objArr) throws Throwable {
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgU1UM3QUBkgSxaWaaw9Bz14/yz1cEJOnFpNPfGu9T+gK0xBrPhzyFLk29WmiVyWD2E=", new String[]{"016a9"}));
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
