package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.13rQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20141413rQ {
    public Typeface LIZ(Context context, C20141813rU c20141813rU, Resources resources, int i) {
        throw null;
    }

    public Typeface LIZIZ(Context context, C20139813rA[] c20139813rAArr, int i) {
        throw null;
    }

    public C20141413rQ() {
        new ConcurrentHashMap();
    }

    public Typeface LIZJ(Context context, InputStream inputStream) {
        File fileLIZLLL = C0W49.LIZLLL(context);
        try {
            if (fileLIZLLL == null) {
                return null;
            }
            try {
                if (!C0W49.LIZJ(fileLIZLLL, inputStream)) {
                    fileLIZLLL.delete();
                    return null;
                }
                Typeface typefaceX4 = C786410Ut5.x4(fileLIZLLL.getPath());
                fileLIZLLL.delete();
                return typefaceX4;
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

    public C20139813rA LJFF(int i, C20139813rA[] c20139813rAArr) {
        return (C20139813rA) LJ(c20139813rAArr, i, new InterfaceC20141513rR<C20139813rA>() { // from class: X.13rT
            @Override // X.InterfaceC20141513rR
            public final int LIZ(C20139813rA c20139813rA) {
                return c20139813rA.LIZJ;
            }

            @Override // X.InterfaceC20141513rR
            public final boolean LIZIZ(C20139813rA c20139813rA) {
                return c20139813rA.LIZLLL;
            }
        });
    }

    public static <T> T LJ(T[] tArr, int i, InterfaceC20141513rR<T> interfaceC20141513rR) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = OppoPermissionPopupMaskDelayExp.DEFAULT;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int iAbs = Math.abs(interfaceC20141513rR.LIZ(t2) - i2) * 2;
            if (interfaceC20141513rR.LIZIZ(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = iAbs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    public Typeface LIZLLL(Context context, Resources resources, int i, String str, int i2) {
        File fileLIZLLL = C0W49.LIZLLL(context);
        try {
            if (fileLIZLLL == null) {
                return null;
            }
            try {
                if (!C0W49.LIZIZ(fileLIZLLL, resources, i)) {
                    fileLIZLLL.delete();
                    return null;
                }
                Typeface typefaceX4 = C786410Ut5.x4(fileLIZLLL.getPath());
                fileLIZLLL.delete();
                return typefaceX4;
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
}
