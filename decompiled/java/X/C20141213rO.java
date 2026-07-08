package X;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.13rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20141213rO extends C20141113rN {
    public final Class<?> LJFF;
    public final Constructor<?> LJI;
    public final Method LJII;
    public final Method LJIIIIZZ;
    public final Method LJIIIZ;
    public final Method LJIIJ;
    public final Method LJIIJJI;

    private Object LJIIL() {
        try {
            return this.LJI.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C20141213rO() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method methodLJIILIIL;
        Method methodLJIILJJIL;
        Method method2;
        Method methodLJIILL;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            methodLJIILIIL = LJIILIIL(cls);
            methodLJIILJJIL = LJIILJJIL(cls);
            method2 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            methodLJIILL = LJIILL(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            cls = null;
            method = null;
            constructor = null;
            methodLJIILIIL = null;
            methodLJIILJJIL = null;
            method2 = null;
            methodLJIILL = null;
        }
        this.LJFF = cls;
        this.LJI = constructor;
        this.LJII = methodLJIILIIL;
        this.LJIIIIZZ = methodLJIILJJIL;
        this.LJIIIZ = method2;
        this.LJIIJ = method;
        this.LJIIJJI = methodLJIILL;
    }

    public static Method LJIILIIL(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method LJIILJJIL(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public final void LJIIIIZZ(Object obj) {
        try {
            this.LJIIJ.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public Typeface LJIIJ(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.LJFF, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.LJIIJJI.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final boolean LJIIJJI(Object obj) {
        try {
            return ((Boolean) this.LJIIIZ.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public Method LJIILL(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // X.C20141113rN, X.C20141413rQ
    public final Typeface LIZIZ(Context context, C20139813rA[] c20139813rAArr, int i) {
        boolean z;
        Typeface typefaceLJIIJ;
        boolean zBooleanValue;
        if (c20139813rAArr.length < 1) {
            return null;
        }
        if (this.LJII != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C20139813rA c20139813rALJFF = LJFF(i, c20139813rAArr);
            try {
                ParcelFileDescriptor parcelFileDescriptorL4 = C786410Ut5.l4(context.getContentResolver(), c20139813rALJFF.LIZ);
                if (parcelFileDescriptorL4 == null) {
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorL4.getFileDescriptor()).setWeight(c20139813rALJFF.LIZJ).setItalic(c20139813rALJFF.LIZLLL).build();
                    parcelFileDescriptorL4.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        HashMap map = new HashMap();
        for (C20139813rA c20139813rA : c20139813rAArr) {
            if (c20139813rA.LJ == 0) {
                Uri uri = c20139813rA.LIZ;
                if (!map.containsKey(uri)) {
                    map.put(uri, C0W49.LJ(context, uri));
                }
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        Object objLJIIL = LJIIL();
        if (objLJIIL == null) {
            return null;
        }
        boolean z2 = false;
        for (C20139813rA c20139813rA2 : c20139813rAArr) {
            Object obj = mapUnmodifiableMap.get(c20139813rA2.LIZ);
            if (obj != null) {
                try {
                    zBooleanValue = ((Boolean) this.LJIIIIZZ.invoke(objLJIIL, obj, Integer.valueOf(c20139813rA2.LIZIZ), null, Integer.valueOf(c20139813rA2.LIZJ), Integer.valueOf(c20139813rA2.LIZLLL ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    zBooleanValue = false;
                }
                if (!zBooleanValue) {
                    LJIIIIZZ(objLJIIL);
                    return null;
                }
                z2 = true;
            }
        }
        if (!z2) {
            LJIIIIZZ(objLJIIL);
            return null;
        }
        if (!LJIIJJI(objLJIIL) || (typefaceLJIIJ = LJIIJ(objLJIIL)) == null) {
            return null;
        }
        return Typeface.create(typefaceLJIIJ, i);
    }

    @Override // X.C20141113rN, X.C20141413rQ
    public final Typeface LIZ(Context context, C20141813rU c20141813rU, Resources resources, int i) {
        if (this.LJII != null) {
            Object objLJIIL = LJIIL();
            if (objLJIIL == null) {
                return null;
            }
            for (C20141613rS c20141613rS : c20141813rU.LIZ) {
                if (!LJIIIZ(context, objLJIIL, c20141613rS.LIZ, c20141613rS.LJ, c20141613rS.LIZIZ, c20141613rS.LIZJ ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c20141613rS.LIZLLL))) {
                    LJIIIIZZ(objLJIIL);
                    return null;
                }
            }
            if (!LJIIJJI(objLJIIL)) {
                return null;
            }
            return LJIIJ(objLJIIL);
        }
        return super.LIZ(context, c20141813rU, resources, i);
    }

    @Override // X.C20141413rQ
    public final Typeface LIZLLL(Context context, Resources resources, int i, String str, int i2) {
        if (this.LJII != null) {
            Object objLJIIL = LJIIL();
            if (objLJIIL == null) {
                return null;
            }
            if (!LJIIIZ(context, objLJIIL, str, 0, -1, -1, null)) {
                LJIIIIZZ(objLJIIL);
                return null;
            }
            if (!LJIIJJI(objLJIIL)) {
                return null;
            }
            return LJIIJ(objLJIIL);
        }
        return super.LIZLLL(context, resources, i, str, i2);
    }

    public final boolean LJIIIZ(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.LJII.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
