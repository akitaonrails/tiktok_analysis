package X;

import android.view.View;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: renamed from: X.0Sf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC726740Sf2 {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    public abstract void LIZIZ(float f, float f2);

    public final float LIZ() {
        return ((Number) this.LJFF.getValue()).floatValue();
    }

    public AbstractC726740Sf2(View view, View view2, View view3) {
        float scaleX;
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZJ = view3;
        if (view != null) {
            scaleX = view.getScaleX();
        } else {
            scaleX = 1.0f;
        }
        this.LIZLLL = scaleX;
        this.LJ = view != null ? view.getScaleY() : 1.0f;
        this.LJFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1535));
        this.LJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1536));
    }
}
