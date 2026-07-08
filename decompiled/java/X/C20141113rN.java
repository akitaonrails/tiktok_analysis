package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.13rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20141113rN extends C20141413rQ {
    public static Class<?> LIZ;
    public static Constructor<?> LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static boolean LJ;

    public static void LJII() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (LJ) {
            return;
        }
        LJ = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        LIZIZ = constructor;
        LIZ = cls;
        LIZJ = method2;
        LIZLLL = method;
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.C20141413rQ
    public Typeface LIZIZ(Context context, C20139813rA[] c20139813rAArr, int i) {
        ParcelFileDescriptor parcelFileDescriptorL4;
        File file;
        String str;
        if (c20139813rAArr.length < 1) {
            return null;
        }
        try {
            parcelFileDescriptorL4 = C786410Ut5.l4(context.getContentResolver(), LJFF(i, c20139813rAArr).LIZ);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
        if (parcelFileDescriptorL4 == null) {
            return null;
        }
        try {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("/proc/self/fd/");
                sbLIZ.append(parcelFileDescriptorL4.getFd());
                str = Os.readlink(C2188811AlT.LIZIZ(sbLIZ));
            } catch (ErrnoException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                file = new File(str);
            } else {
                file = null;
            }
            if (file != null && file.canRead()) {
                Typeface typefaceW4 = C786410Ut5.w4(file);
                parcelFileDescriptorL4.close();
                return typefaceW4;
            }
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorL4.getFileDescriptor());
            try {
                Typeface typefaceLIZJ = LIZJ(context, fileInputStream);
                fileInputStream.close();
                parcelFileDescriptorL4.close();
                return typefaceLIZJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            try {
                parcelFileDescriptorL4.close();
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                th3.addSuppressed(th4);
            }
            throw th3;
        }
        TryCatchGuardChecker.doCheck(e);
        return null;
    }

    public static boolean LJI(String str, boolean z, int i, Object obj) {
        LJII();
        try {
            return ((Boolean) LIZJ.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    @Override // X.C20141413rQ
    public Typeface LIZ(Context context, C20141813rU c20141813rU, Resources resources, int i) {
        LJII();
        try {
            Object objNewInstance = LIZIZ.newInstance(new Object[0]);
            for (C20141613rS c20141613rS : c20141813rU.LIZ) {
                File fileLIZLLL = C0W49.LIZLLL(context);
                if (fileLIZLLL == null) {
                    return null;
                }
                try {
                    try {
                        if (C0W49.LIZIZ(fileLIZLLL, resources, c20141613rS.LJFF)) {
                            if (LJI(fileLIZLLL.getPath(), c20141613rS.LIZJ, c20141613rS.LIZIZ, objNewInstance)) {
                                fileLIZLLL.delete();
                            } else {
                                fileLIZLLL.delete();
                                return null;
                            }
                        } else {
                            fileLIZLLL.delete();
                            return null;
                        }
                    } catch (RuntimeException e) {
                        TryCatchGuardChecker.doCheck(e);
                        fileLIZLLL.delete();
                        return null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    fileLIZLLL.delete();
                    throw th;
                }
            }
            LJII();
            try {
                Object objNewInstance2 = Array.newInstance(LIZ, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) LIZLLL.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new RuntimeException(e3);
        }
    }
}
