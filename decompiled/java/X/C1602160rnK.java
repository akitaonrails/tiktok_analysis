package X;

import Y.ARunnableS90S0000000_11;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxet.ITracingService;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0rnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602160rnK {
    public static boolean LIZ;
    public static Field LIZLLL;
    public static Object LJ;
    public static WeakReference<Object> LJFF;
    public static final boolean LIZIZ = ((Boolean) C1836107Hb.LIZ.getValue()).booleanValue();
    public static final boolean LIZJ = ((Boolean) C269100Age.LIZ.getValue()).booleanValue();
    public static final long LJI = 16;
    public static long LJII = 0;

    public static void LIZ(boolean z) {
        if (z) {
            LIZ = true;
        } else if (((Boolean) C20701915zd.LIZJ.getValue()).booleanValue()) {
            C786410Ut5.LJLIIL(200L, C0CAU.LIZ, new ARunnableS90S0000000_11(5));
        } else {
            LIZ = false;
        }
    }

    public static void LIZJ(View view) {
        try {
            Field fieldLIZJ = C1959307lv.LIZJ(View.class, "mAttachInfo");
            fieldLIZJ.setAccessible(true);
            Object obj = fieldLIZJ.get(view);
            if (!((Boolean) C269080Agc.LIZ.getValue()).booleanValue()) {
                LJ = obj;
            } else {
                LJFF = new WeakReference<>(obj);
            }
            Field fieldLIZJ2 = C1959307lv.LIZJ(obj.getClass(), "mRecomputeGlobalAttributes");
            LIZLLL = fieldLIZJ2;
            fieldLIZJ2.setAccessible(true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LIZIZ(int i, int i2, Object obj) {
        Object obj2;
        if (obj instanceof View) {
            View view = (View) obj;
            if (i != i2) {
                C1848530yCh.LIZIZ.getClass();
                ITracingService iTracingServiceLIZ = C1845210y7L.LIZ();
                if (iTracingServiceLIZ != null) {
                    iTracingServiceLIZ.LJIIIIZZ(view);
                }
            }
        }
        if (!LIZ || !LIZIZ) {
            return;
        }
        if (LIZJ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - LJII < LJI) {
                return;
            } else {
                LJII = jCurrentTimeMillis;
            }
        }
        if (LIZLLL != null) {
            try {
                if (((Boolean) C269080Agc.LIZ.getValue()).booleanValue()) {
                    obj2 = LJFF.get();
                } else {
                    obj2 = LJ;
                }
                if (obj2 != null) {
                    LIZLLL.set(obj2, Boolean.FALSE);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }
}
