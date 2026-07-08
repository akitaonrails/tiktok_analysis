package X;

import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.myna.render.render.widget.span.MynaTypefaceSpan;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21336218ee {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(204));

    public static final int LIZJ(boolean z, boolean z2) {
        return (z ? 1 : 0) | (z2 ? 2 : 0);
    }

    public static final void LIZ(TextPaint textPaint, boolean z, int i) {
        int style;
        float f;
        Typeface typefaceCreate;
        Typeface typeface = textPaint.getTypeface();
        if (typeface != null) {
            style = typeface.getStyle();
        } else {
            style = 0;
        }
        if (((~style) & i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        if (z && ((~style) & i & 1) != 0) {
            if (typeface == null) {
                typefaceCreate = Typeface.defaultFromStyle(i);
            } else {
                typefaceCreate = Typeface.create(typeface, i);
            }
            textPaint.setTypeface(typefaceCreate);
        }
    }

    public static final Typeface LJ(Typeface typeface, int i, int i2) {
        boolean z;
        int style = 0;
        if ((i2 & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        Typeface typefaceCreate = null;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                typefaceCreate = Typeface.create(typeface, i, z);
                return typefaceCreate;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                try {
                    typefaceCreate = Typeface.create(typefaceCreate, i2);
                    return typefaceCreate;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    return typefaceCreate;
                }
            }
        }
        if (typeface != null) {
            try {
                style = typeface.getStyle();
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C1325860kbg.LIZIZ(th3, AFwS223S0000000_32.get$arr$(205), C2097608Jq.LJ());
                return null;
            }
        }
        int i3 = style | i2;
        if (typeface == null) {
            return Typeface.defaultFromStyle(i3);
        }
        return Typeface.create(typeface, i3);
    }

    public static final MynaTypefaceSpan LIZIZ(int i, String str, String str2, String str3) {
        boolean z;
        boolean zLIZ = C21338418f0.LIZ(Integer.valueOf(i));
        if (str2 != null && "italic".equals(str2)) {
            z = true;
        } else {
            z = false;
        }
        return new MynaTypefaceSpan(str, LIZJ(zLIZ, z), i, str3);
    }

    public static final Typeface LIZLLL(int i, int i2, Typeface typeface, String str, String str2) {
        boolean z;
        Typeface typefaceLJI;
        if ((i2 & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (str2 != null && !a0.LJJJIL(str2)) {
            C1168270gVV.LIZ.getClass();
            InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(str);
            if (interfaceC1168310gVZ != null && (typefaceLJI = interfaceC1168310gVZ.LJI(i, str2, z)) != null) {
                return typefaceLJI;
            }
        }
        return LJ(typeface, i, i2);
    }
}
