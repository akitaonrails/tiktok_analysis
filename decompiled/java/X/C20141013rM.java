package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: renamed from: X.13rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20141013rM extends C20141413rQ {
    public static final Class<?> LIZ;
    public static final Constructor<?> LIZIZ;
    public static final Method LIZJ;
    public static final Method LIZLLL;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
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

    public static Typeface LJII(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(LIZ, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) LIZLLL.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.C20141413rQ
    public final Typeface LIZIZ(Context context, C20139813rA[] c20139813rAArr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = LIZIZ.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        C830530Wi3 c830530Wi3 = new C830530Wi3();
        for (C20139813rA c20139813rA : c20139813rAArr) {
            Uri uri = c20139813rA.LIZ;
            ByteBuffer byteBufferLJ = (ByteBuffer) c830530Wi3.get(uri);
            if (byteBufferLJ == null) {
                byteBufferLJ = C0W49.LJ(context, uri);
                c830530Wi3.put(uri, byteBufferLJ);
            }
            if (byteBufferLJ == null || !LJI(objNewInstance, byteBufferLJ, c20139813rA.LIZIZ, c20139813rA.LIZJ, c20139813rA.LIZLLL)) {
                return null;
            }
        }
        Typeface typefaceLJII = LJII(objNewInstance);
        if (typefaceLJII == null) {
            return null;
        }
        return Typeface.create(typefaceLJII, i);
    }

    @Override // X.C20141413rQ
    public final Typeface LIZ(Context context, C20141813rU c20141813rU, Resources resources, int i) {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = LIZIZ.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            objNewInstance = null;
        }
        if (objNewInstance == null) {
            return null;
        }
        for (C20141613rS c20141613rS : c20141813rU.LIZ) {
            int i2 = c20141613rS.LJFF;
            File fileLIZLLL = C0W49.LIZLLL(context);
            if (fileLIZLLL != null) {
                try {
                    if (C0W49.LIZIZ(fileLIZLLL, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(fileLIZLLL);
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            map = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            fileLIZLLL.delete();
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
                    } else {
                        fileLIZLLL.delete();
                        map = null;
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    fileLIZLLL.delete();
                    throw th3;
                }
            } else {
                map = null;
            }
            if (map == null || !LJI(objNewInstance, map, c20141613rS.LJ, c20141613rS.LIZIZ, c20141613rS.LIZJ)) {
                return null;
            }
        }
        return LJII(objNewInstance);
    }

    public static boolean LJI(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) LIZJ.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
