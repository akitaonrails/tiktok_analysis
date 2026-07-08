package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.124n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C196967124n<T extends TextView> {
    public static final /* synthetic */ int LJFF = 0;
    public final T LIZ;
    public final C196966124m LIZIZ;
    public final Function1<Float, Unit> LIZJ;
    public float LIZLLL;
    public final C12YD LJ = new C12YD(this, 0);

    public float LIZJ() {
        return 20.0f;
    }

    public float LIZLLL() {
        return this.LIZ.getTextSize() / this.LIZ.getResources().getDisplayMetrics().scaledDensity;
    }

    public void LJ() {
        this.LIZ.addOnLayoutChangeListener(this.LJ);
        if (this.LIZ.isLaidOut()) {
            float fLIZLLL = LIZLLL() / LIZJ();
            if (fLIZLLL != this.LIZLLL) {
                this.LIZJ.invoke(Float.valueOf(fLIZLLL));
                this.LIZLLL = fLIZLLL;
            }
        }
    }

    public void LJFF() {
        this.LIZ.removeOnLayoutChangeListener(this.LJ);
    }

    public void LJI(float f) {
        this.LIZ.setTextSize(2, C814420VxA.LIZIZ(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C196967124n(TextView textView, C196966124m c196966124m, C389630FPl c389630FPl) {
        this.LIZ = textView;
        this.LIZIZ = c196966124m;
        this.LIZJ = c389630FPl;
    }
}
