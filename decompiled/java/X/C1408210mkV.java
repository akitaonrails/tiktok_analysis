package X;

import Y.ARunnableS122S0100000_22;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;

/* JADX INFO: renamed from: X.0mkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1408210mkV {
    public final View LIZ;
    public final View LIZIZ;
    public final ViewGroup LIZJ;
    public final Context LIZLLL;
    public final float LJ;

    public final void LIZ() {
        this.LIZ.animate().translationX(C423170GiZ.LIZ(this.LIZLLL) ? this.LJ : -this.LJ).setDuration(300L).withEndAction(new ARunnableS122S0100000_22(this, 83));
        C786410Ut5.LJLLLLLL(0, this.LIZIZ);
        this.LIZIZ.animate().translationX(0.0f).setDuration(300L);
    }

    public final void LIZIZ() {
        this.LIZIZ.animate().translationX(C423170GiZ.LIZ(this.LIZLLL) ? -this.LJ : this.LJ).setDuration(300L).withEndAction(new ARunnableS122S0100000_22(this, 84));
        C786410Ut5.LJLLLLLL(0, this.LIZ);
        this.LIZ.animate().translationX(0.0f).setDuration(300L);
    }

    public C1408210mkV(View view, C1413230msb c1413230msb) {
        ViewGroup viewGroup;
        this.LIZ = view;
        this.LIZIZ = c1413230msb;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        this.LIZJ = viewGroup;
        Context context = view.getContext();
        this.LIZLLL = context;
        float screenWidth = ScreenUtils.getScreenWidth(context);
        this.LJ = screenWidth;
        if (viewGroup != null) {
            viewGroup.addView(c1413230msb);
        }
        C786410Ut5.Jc(c1413230msb, C423170GiZ.LIZ(context) ? -screenWidth : screenWidth);
    }
}
