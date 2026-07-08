package X;

import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.18na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21391618na {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public ViewGroup LIZ;
    public final ImageView LIZIZ;
    public final boolean LIZJ;
    public float LIZLLL;
    public float LJ;
    public final float LJFF;
    public final float LJI;
    public Function1<? super Float, Pair<Float, Float>> LJII;

    public final void LIZIZ() {
        ViewGroup viewGroup;
        Unit unit;
        Unit unit2 = null;
        try {
            ViewGroupOverlay overlay = this.LIZ.getOverlay();
            if (overlay != null) {
                overlay.remove(this.LIZIZ);
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        try {
            ViewParent parent = this.LIZIZ.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(this.LIZIZ, viewGroup);
                unit2 = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public final void LIZ(float f) {
        float f2;
        float f3 = 1.0f;
        if (this.LIZJ) {
            f2 = 1.0f;
            f3 = 2.5f;
        } else {
            f2 = 2.5f;
        }
        float f4 = f2 + ((f3 - f2) * f);
        C786410Ut5.Qb(this.LIZIZ, f4);
        C786410Ut5.rc(this.LIZIZ, f4);
        C786410Ut5.Lc(this.LIZIZ, this.LIZLLL - this.LJFF);
        C786410Ut5.gd(this.LIZIZ, this.LJ - this.LJI);
    }

    public final void LIZJ(float f) {
        float f2;
        Pair<Float, Float> pairInvoke;
        Function1<? super Float, Pair<Float, Float>> function1 = this.LJII;
        if (function1 != null && (pairInvoke = function1.invoke(Float.valueOf(f))) != null) {
            float fFloatValue = pairInvoke.getFirst().floatValue();
            float fFloatValue2 = pairInvoke.getSecond().floatValue();
            this.LIZLLL = fFloatValue;
            this.LJ = fFloatValue2;
        }
        LIZ(f);
        ImageView imageView = this.LIZIZ;
        float f3 = 1.0f;
        if (this.LIZJ) {
            f2 = 1.0f;
            f3 = 0.0f;
        } else {
            f2 = 0.0f;
        }
        C786410Ut5.V4(imageView, f2 + ((f3 - f2) * f));
    }

    public C21391618na(ViewGroup viewGroup, ImageView imageView, boolean z, float f, float f2, float f3, float f4) {
        this.LIZ = viewGroup;
        this.LIZIZ = imageView;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = f3;
        this.LJI = f4;
    }
}
