package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.19Lp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21524719Lp implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onCanceled$0(C21524719Lp c21524719Lp) {
    }

    public static final void onProgress$0(C21524719Lp c21524719Lp, float f) {
    }

    public static final void onProgress$1(C21524719Lp c21524719Lp, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
        }
    }

    public static final void onCanceled$1(C21524719Lp c21524719Lp) {
        C18QT c18qt = (C18QT) c21524719Lp.l2;
        int i = c18qt.LLJL + 1;
        c18qt.LLJL = i;
        if (i >= c18qt.LLJJLIIIJLLLLLLLZ) {
            c18qt.LJJJLZIJ();
        }
    }

    public static final void LIZ$0(C21524719Lp c21524719Lp, Bitmap bitmap) {
        Drawable bitmapDrawable;
        if (bitmap == null) {
            c21524719Lp.onFailed(null);
            return;
        }
        if (((C18QW) c21524719Lp.l0).LIZLLL == null) {
            bitmapDrawable = new BitmapDrawable(((C18QW) c21524719Lp.l0).LIZ.getResources(), bitmap);
        } else {
            C1331470kkj c1331470kkj = new C1331470kkj(((C18QW) c21524719Lp.l0).LIZ.getResources(), bitmap, null);
            c1331470kkj.setRadius(((C18QW) c21524719Lp.l0).LIZLLL.floatValue());
            bitmapDrawable = c1331470kkj;
        }
        ((LevelListDrawable) c21524719Lp.l1).addLevel(1, 1, bitmapDrawable);
        int height = bitmap.getHeight();
        int i = ((C18QW) c21524719Lp.l0).LIZJ;
        if (height > i) {
            height = i;
        }
        ((LevelListDrawable) c21524719Lp.l1).setBounds(0, 0, C814420VxA.LIZIZ((height / bitmap.getHeight()) * bitmap.getWidth()), height);
        ((LevelListDrawable) c21524719Lp.l1).setLevel(1);
        C18QS c18qs = (C18QS) c21524719Lp.l2;
        try {
            Method declaredMethod = TextView.class.getDeclaredMethod("nullLayouts", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(c18qs, new Object[0]);
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        ((C18QW) c21524719Lp.l0).LIZIZ.requestLayout();
    }

    public static final void LIZ$1(C21524719Lp c21524719Lp, Bitmap bitmap) {
        Drawable bitmapDrawable;
        if (bitmap == null) {
            c21524719Lp.onFailed(null);
            return;
        }
        if (((C18QV) c21524719Lp.l0).LIZLLL == null) {
            bitmapDrawable = new BitmapDrawable(((C18QV) c21524719Lp.l0).LIZ.getResources(), bitmap);
        } else {
            C1331470kkj c1331470kkj = new C1331470kkj(((C18QV) c21524719Lp.l0).LIZ.getResources(), bitmap, null);
            c1331470kkj.setRadius(((C18QV) c21524719Lp.l0).LIZLLL.floatValue());
            bitmapDrawable = c1331470kkj;
        }
        ((LevelListDrawable) c21524719Lp.l1).addLevel(1, 1, bitmapDrawable);
        int height = bitmap.getHeight();
        int i = ((C18QV) c21524719Lp.l0).LIZJ;
        if (height > i) {
            height = i;
        }
        ((LevelListDrawable) c21524719Lp.l1).setBounds(0, 0, C814420VxA.LIZIZ((height / bitmap.getHeight()) * bitmap.getWidth()), height);
        ((LevelListDrawable) c21524719Lp.l1).setLevel(1);
        ((C18QV) c21524719Lp.l0).LIZIZ.requestLayout();
        C18QT c18qt = (C18QT) c21524719Lp.l2;
        int i2 = c18qt.LLJL + 1;
        c18qt.LLJL = i2;
        if (i2 >= c18qt.LLJJLIIIJLLLLLLLZ) {
            C18QX c18qx = ((C18QV) c21524719Lp.l0).LJ;
            if (c18qx != null) {
                c18qx.onSuccess();
            }
            ((C18QT) c21524719Lp.l2).LJJJLZIJ();
        }
    }

    public static final void onFailed$0(C21524719Lp c21524719Lp, Throwable th) {
        C18QX c18qx = ((C18QW) c21524719Lp.l0).LJ;
        if (c18qx != null) {
            c18qx.onFail();
        }
    }

    public static final void onFailed$1(C21524719Lp c21524719Lp, Throwable th) {
        C18QX c18qx = ((C18QV) c21524719Lp.l0).LJ;
        if (c18qx != null) {
            c18qx.onFail();
        }
        C18QT c18qt = (C18QT) c21524719Lp.l2;
        int i = c18qt.LLJL + 1;
        c18qt.LLJL = i;
        if (i >= c18qt.LLJJLIIIJLLLLLLLZ) {
            c18qt.LJJJLZIJ();
        }
    }

    public C21524719Lp(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
