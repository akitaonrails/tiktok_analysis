package X;

import android.os.Parcelable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0Vyp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC815450Vyp {
    public final C830490Whz<String, Method> LIZ;
    public final C830490Whz<String, Method> LIZIZ;
    public final C830490Whz<String, Class> LIZJ;

    public abstract C0W0H LIZ();

    public abstract boolean LJ();

    public abstract byte[] LJFF();

    public abstract CharSequence LJI();

    public abstract boolean LJII(int i);

    public abstract int LJIIIIZZ();

    public abstract <T extends Parcelable> T LJIIJ();

    public abstract String LJIIL();

    public abstract void LJIILJJIL(int i);

    public abstract void LJIILL(boolean z);

    public abstract void LJIILLIIL(byte[] bArr);

    public abstract void LJIIZILJ(CharSequence charSequence);

    public abstract void LJIJ(int i);

    public abstract void LJIJJ(Parcelable parcelable);

    public abstract void LJIJJLI(String str);

    public final <T extends InterfaceC815410Vyl> T LJIILIIL() throws Throwable {
        String strLJIIL = LJIIL();
        if (strLJIIL == null) {
            return null;
        }
        try {
            return (T) LIZJ(strLJIIL).invoke(null, LIZ());
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            TryCatchGuardChecker.doCheck(e4);
            if (e4.getCause() instanceof RuntimeException) {
                throw e4.getCause();
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Class LIZIZ(Class<? extends InterfaceC815410Vyl> cls) throws ClassNotFoundException {
        Class cls2 = this.LIZJ.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(C786410Ut5.j4("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
            this.LIZJ.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method LIZJ(String str) throws NoSuchMethodException {
        Method method = this.LIZ.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, AbstractC815450Vyp.class.getClassLoader()).getDeclaredMethod("read", AbstractC815450Vyp.class);
            this.LIZ.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method LIZLLL(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = this.LIZIZ.get(cls.getName());
        if (method == null) {
            Class clsLIZIZ = LIZIZ(cls);
            System.currentTimeMillis();
            Method declaredMethod = clsLIZIZ.getDeclaredMethod("write", cls, AbstractC815450Vyp.class);
            this.LIZIZ.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIL(InterfaceC815410Vyl interfaceC815410Vyl) throws Throwable {
        if (interfaceC815410Vyl == null) {
            LJIJJLI(null);
            return;
        }
        try {
            LJIJJLI(LIZIZ(interfaceC815410Vyl.getClass()).getName());
            C0W0H c0w0hLIZ = LIZ();
            try {
                LIZLLL(interfaceC815410Vyl.getClass()).invoke(null, interfaceC815410Vyl, c0w0hLIZ);
                c0w0hLIZ.LJJ();
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                TryCatchGuardChecker.doCheck(e3);
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                TryCatchGuardChecker.doCheck(e4);
                if (e4.getCause() instanceof RuntimeException) {
                    throw e4.getCause();
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            TryCatchGuardChecker.doCheck(e5);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC815410Vyl.getClass().getSimpleName());
            sbLIZ.append(" does not have a Parcelizer");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e5);
        }
    }

    public final int LJIIIZ(int i, int i2) {
        if (!LJII(i2)) {
            return i;
        }
        return LJIIIIZZ();
    }

    public final <T extends Parcelable> T LJIIJJI(T t, int i) {
        if (!LJII(i)) {
            return t;
        }
        return (T) LJIIJ();
    }

    public final void LJIJI(int i, int i2) {
        LJIILJJIL(i2);
        LJIJ(i);
    }

    public AbstractC815450Vyp(C830490Whz<String, Method> c830490Whz, C830490Whz<String, Method> c830490Whz2, C830490Whz<String, Class> c830490Whz3) {
        this.LIZ = c830490Whz;
        this.LIZIZ = c830490Whz2;
        this.LIZJ = c830490Whz3;
    }
}
