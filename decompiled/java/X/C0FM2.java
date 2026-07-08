package X;

import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FM2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FM2<T extends TextView> {
    public static final /* synthetic */ int LJFF = 0;
    public final TextView LIZ;
    public final C0FM0 LIZIZ;
    public final Function1<Float, Unit> LIZJ;
    public float LIZLLL;
    public final ViewOnLayoutChangeListenerC391530FWt LJ = new ViewOnLayoutChangeListenerC391530FWt(this, 15);

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

    public C0FM2(TextView textView, C0FM0 c0fm0, C0FM3 c0fm3) {
        this.LIZ = textView;
        this.LIZIZ = c0fm0;
        this.LIZJ = c0fm3;
    }
}
