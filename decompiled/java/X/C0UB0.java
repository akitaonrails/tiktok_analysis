package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UB0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0UB0 {
    public final ViewGroup LIZ;
    public final C766210U3v LIZIZ;
    public Integer LIZJ;
    public C0UBH LIZLLL;
    public boolean LJ;
    public final View LJFF;
    public final RunnableC781530UlD LJI;
    public final TextView LJII;
    public final View LJIIIIZZ;
    public final View LJIIIZ;
    public String LJIIJ;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public final void LIZLLL() {
        View viewFindViewById = this.LJIIIIZZ.findViewById(R.id.w4z);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(2000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new LinearInterpolator());
        viewFindViewById.startAnimation(rotateAnimation);
    }

    public final void LJ() {
        this.LJIIIIZZ.findViewById(R.id.w4z).clearAnimation();
    }

    public void LIZJ(C0UBH c0ubh, String str) {
        this.LIZLLL = c0ubh;
        this.LJIIJ = str;
        this.LIZIZ.LLILZIL = null;
    }

    public C0UB0(ViewGroup viewGroup, C766210U3v c766210U3v, GridLayoutManager gridLayoutManager) {
        this.LIZ = viewGroup;
        this.LIZIZ = c766210U3v;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gff, viewGroup, false);
        this.LJFF = viewTd;
        RunnableC781530UlD runnableC781530UlD = (RunnableC781530UlD) viewTd.findViewById(R.id.eux);
        this.LJI = runnableC781530UlD;
        this.LJII = (TextView) viewTd.findViewById(R.id.xmb);
        View viewFindViewById = viewTd.findViewById(R.id.nnp);
        this.LJIIIIZZ = viewFindViewById;
        View viewFindViewById2 = viewTd.findViewById(R.id.hc6);
        this.LJIIIZ = viewFindViewById2;
        this.LJIIJ = "";
        C500260Jjc.LLFFF(viewFindViewById);
        C500260Jjc.LJIILIIL(viewFindViewById2);
        LIZLLL();
        runnableC781530UlD.setLayoutManager(gridLayoutManager);
        c766210U3v.setHasStableIds(true);
        runnableC781530UlD.setAdapter(c766210U3v);
        runnableC781530UlD.setItemAnimator(null);
        runnableC781530UlD.setHasFixedSize(true);
        runnableC781530UlD.setItemViewCacheSize(10);
        C0U4C c0u4c = C0U4C.EFFECT_STICKER;
        int i = RunnableC781530UlD.LLIZLLLIL;
        RecyclerView.RecycledViewPool recycledViewPoolLJ = runnableC781530UlD.LJ(c0u4c, true, null);
        if (recycledViewPoolLJ != null) {
            recycledViewPoolLJ.setMaxRecycledViews(C0U9E.NORMAL.getValue(), 30);
        }
        runnableC781530UlD.addOnScrollListener(new C772770UTb(C1EOY.LIZ.LIZIZ("panel_effect_slide"), null));
        LIZLLL();
    }
}
