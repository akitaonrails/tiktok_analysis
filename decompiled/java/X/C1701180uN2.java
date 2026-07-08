package X;

import Y.ARunnableS1S0002000_26;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uN2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1701180uN2 {
    public static final C1701180uN2 LIZ = new C1701180uN2();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(324));
    public static volatile int LIZJ;
    public static volatile int LIZLLL;
    public static volatile boolean LJ;
    public static volatile boolean LJFF;
    public static volatile boolean LJI;

    public final void LIZ(View view) {
        if (LJI) {
            return;
        }
        synchronized (this) {
            try {
                if (LJI) {
                    return;
                }
                LJI = true;
                Object tag = view.getTag(R.id.xde);
                if (!(tag instanceof Boolean)) {
                    tag = null;
                }
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.LJFF(tag, bool)) {
                    return;
                }
                view.setTag(R.id.xde, bool);
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0uN3
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        int width = view2.getWidth();
                        int height = view2.getHeight();
                        if (width > 0 && height > 0) {
                            C1701180uN2.LIZ.LIZIZ(width, height);
                            view2.removeOnLayoutChangeListener(this);
                        }
                    }
                });
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(int i, int i2) {
        if (((Boolean) C0B1G.LIZ.getValue()).booleanValue() && i > 0 && i2 > 0) {
            if (LJFF && i <= LIZJ && i2 <= LIZLLL) {
                return;
            }
            int iMax = Math.max(LIZJ, i);
            int iMax2 = Math.max(LIZLLL, i2);
            LIZJ = iMax;
            LIZLLL = iMax2;
            if (!LJFF && !LJFF) {
                synchronized (this) {
                    try {
                        if (LJFF) {
                            return;
                        }
                        LJFF = true;
                        C823050WQl.LIZIZ().execute(new ARunnableS1S0002000_26(iMax, iMax2, 6));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }
}
