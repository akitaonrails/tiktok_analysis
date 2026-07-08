package X;

import Y.ARunnableS130S0100000_30;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: renamed from: X.1Dh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2262481Dh0 {
    public final RecyclerView.ViewHolder LIZ;
    public final C2262511Dh3 LIZIZ;
    public final Function2<RecyclerView.ViewHolder, Integer, Unit> LIZJ;
    public final Function2<RecyclerView.ViewHolder, Integer, Unit> LIZLLL;
    public final Function1<RecyclerView.ViewHolder, View> LJ;
    public float LJFF;
    public float LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public final BPEAHandler LJIIL = new BPEAHandler(Looper.getMainLooper());
    public ARunnableS130S0100000_30 LJIILIIL = new ARunnableS130S0100000_30(this, 37);
    public ARunnableS130S0100000_30 LJIILJJIL = new ARunnableS130S0100000_30(this, 38);
    public View LJIILL;

    public final View LIZIZ() {
        View viewInvoke = this.LJIILL;
        if (viewInvoke == null) {
            if (this.LIZIZ.LJI || (viewInvoke = this.LJ.invoke(this.LIZ)) == null) {
                viewInvoke = this.LIZ.itemView;
            }
            this.LJIILL = viewInvoke;
        }
        return viewInvoke;
    }

    public final void LIZ() {
        BPEAHandler bPEAHandler;
        BPEAHandler bPEAHandler2;
        View viewLIZIZ = LIZIZ();
        viewLIZIZ.animate().cancel();
        viewLIZIZ.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.LIZIZ.LJFF).start();
        ARunnableS130S0100000_30 aRunnableS130S0100000_30 = this.LJIILIIL;
        if (aRunnableS130S0100000_30 != null && (bPEAHandler2 = this.LJIIL) != null) {
            bPEAHandler2.removeCallbacks(aRunnableS130S0100000_30);
        }
        ARunnableS130S0100000_30 aRunnableS130S0100000_302 = this.LJIILJJIL;
        if (aRunnableS130S0100000_302 != null && (bPEAHandler = this.LJIIL) != null) {
            bPEAHandler.removeCallbacks(aRunnableS130S0100000_302);
        }
        ViewParent parent = this.LIZ.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            recyclerView.requestDisallowInterceptTouchEvent(false);
        }
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
    }

    public C2262481Dh0(RecyclerView.ViewHolder viewHolder, C2262511Dh3 c2262511Dh3, AwS649S0100000_35 awS649S0100000_35, AwS649S0100000_35 awS649S0100000_352, AwS614S0100000_35 awS614S0100000_35) {
        View view;
        this.LIZ = viewHolder;
        this.LIZIZ = c2262511Dh3;
        this.LIZJ = awS649S0100000_35;
        this.LIZLLL = awS649S0100000_352;
        this.LJ = awS614S0100000_35;
        if (c2262511Dh3.LJI || (view = (View) awS614S0100000_35.invoke(viewHolder)) == null) {
            view = viewHolder.itemView;
        }
        this.LJIILL = view;
    }
}
