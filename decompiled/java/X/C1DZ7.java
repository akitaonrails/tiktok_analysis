package X;

import android.animation.ArgbEvaluator;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.TypedValue;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.1DZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DZ7 {
    public static final C19PZ LIZ = new C19PZ();
    public static final ArgbEvaluator LIZIZ = new ArgbEvaluator();
    public static final int LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 2, Resources.getSystem().getDisplayMetrics()));

    public static C1DZA LIZIZ() {
        C1DZA c1dza = new C1DZA();
        C1DZG c1dzg = new C1DZG();
        c1dzg.LIZ = 51;
        c1dzg.LIZIZ = C1618190sDB.LIZIZ(R.color.cc);
        c1dza.LIZ = c1dzg;
        C1DZE c1dze = new C1DZE();
        c1dze.LJ = C1618190sDB.LIZIZ(R.color.cc);
        float f = 6;
        c1dze.LIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        c1dze.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        c1dze.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 3, Resources.getSystem().getDisplayMetrics()));
        c1dza.LIZLLL = c1dze;
        C1DZL c1dzl = new C1DZL();
        c1dzl.LIZIZ = C1618190sDB.LIZIZ(R.color.cc);
        c1dza.LIZIZ = c1dzl;
        c1dza.LJFF = LIZJ + C814420VxA.LIZIZ(TypedValue.applyDimension(1, 2, Resources.getSystem().getDisplayMetrics()));
        return c1dza;
    }

    public static C1DZA LIZJ() {
        C1DZA c1dza = new C1DZA();
        C1DZG c1dzg = new C1DZG();
        c1dzg.LIZ = 51;
        c1dzg.LIZIZ = -3684408;
        c1dzg.LIZJ = true;
        c1dza.LIZ = c1dzg;
        C1DZE c1dze = new C1DZE();
        c1dze.LJ = C1618190sDB.LIZIZ(R.color.cc);
        c1dze.LIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
        c1dze.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 16, Resources.getSystem().getDisplayMetrics()));
        c1dze.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, 4, Resources.getSystem().getDisplayMetrics()));
        c1dza.LIZLLL = c1dze;
        C1DZL c1dzl = new C1DZL();
        c1dzl.LIZ = 204;
        c1dzl.LIZIZ = C1618190sDB.LIZIZ(R.color.cc);
        c1dza.LIZIZ = c1dzl;
        c1dza.LJFF = LIZJ + C814420VxA.LIZIZ(TypedValue.applyDimension(1, 10, Resources.getSystem().getDisplayMetrics()));
        return c1dza;
    }

    public static C1DZA LIZLLL() {
        C1DZA c1dza = new C1DZA();
        C1DZG c1dzg = new C1DZG();
        c1dzg.LIZ = 20;
        c1dzg.LIZIZ = C1618190sDB.LIZIZ(R.color.cc);
        c1dza.LIZ = c1dzg;
        C1DZE c1dze = new C1DZE();
        c1dze.LJ = 0;
        float f = 0;
        c1dze.LIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        c1dze.LIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        c1dze.LIZJ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        c1dza.LIZLLL = c1dze;
        C1DZL c1dzl = new C1DZL();
        c1dzl.LIZ = 51;
        c1dzl.LIZIZ = C1618190sDB.LIZIZ(R.color.cc);
        c1dza.LIZIZ = c1dzl;
        c1dza.LJFF = LIZJ;
        return c1dza;
    }

    public static void LIZ(C1DZA c1dza) {
        C1DZG c1dzg = c1dza.LIZ;
        if (c1dzg.LIZ < 0) {
            c1dzg.LIZ = Color.alpha(c1dzg.LIZIZ);
        }
        C1DZL c1dzl = c1dza.LIZIZ;
        if (c1dzl.LIZ < 0) {
            c1dzl.LIZ = Color.alpha(c1dzl.LIZIZ);
        }
        C1DZM c1dzm = c1dza.LIZJ;
        if (c1dzm.LIZ < 0) {
            c1dzm.LIZ = Color.alpha(c1dzm.LIZIZ);
        }
        C1DZE c1dze = c1dza.LIZLLL;
        if (c1dze.LIZLLL < 0) {
            c1dze.LIZLLL = Color.alpha(c1dze.LJ);
        }
    }
}
