package X;

import Y.AAListenerS171S0000000_27;
import Y.AAListenerS324S0100000_13;
import Y.ARunnableS127S0100000_27;
import Y.ARunnableS32S0201000_27;
import Y.AUListenerS256S0100000_6;
import Y.AsS53S0100000_27;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yXC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861240yXC {
    public ViewGroup LIZ;
    public RecyclerView LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public int LJFF;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public Function0<Unit> LJIIJ;
    public Function1<? super Integer, Message> LJIIJJI;
    public Function0<Boolean> LJIIL;
    public Rect LJIILIIL;
    public boolean LJIILJJIL;
    public long LJIILL;
    public long LJIJI;
    public boolean LJIJJ;
    public int LJI = 1;
    public int LJIILLIIL = -1;
    public final ViewOnLayoutChangeListenerC1864650ych LJIIZILJ = new ViewOnLayoutChangeListenerC1864650ych(this, 10);
    public final AsS53S0100000_27 LJIJ = new AsS53S0100000_27(this, 9);

    public final void LIZ() {
        LinearLayoutManager linearLayoutManager;
        AbstractC21673619ry adapter;
        AbstractC21673619ry adapter2;
        Message messageInvoke;
        boolean zLIZLLL;
        ViewGroup viewGroup;
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager) || (linearLayoutManager = (LinearLayoutManager) layoutManager) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int itemCount = adapter.getItemCount();
        if (itemCount == 0) {
            LIZIZ();
            return;
        }
        if (this.LJIILJJIL) {
            Function0<Boolean> function0 = this.LJIIL;
            if (function0 != null && !function0.invoke().booleanValue()) {
                LIZIZ();
                return;
            }
            RecyclerView recyclerView2 = this.LIZIZ;
            if (recyclerView2 != null && (adapter2 = recyclerView2.getAdapter()) != null) {
                int itemCount2 = adapter2.getItemCount();
                int i = this.LJI;
                if (itemCount2 > i) {
                    int i2 = (itemCount2 - 1) - i;
                    boolean z = this.LJIIIZ;
                    Function1<? super Integer, Message> function1 = this.LJIIJJI;
                    if (function1 != null) {
                        messageInvoke = function1.invoke(Integer.valueOf(i2));
                        if (messageInvoke != null && messageInvoke.isMultiAnswer) {
                            zLIZLLL = C1785140wYS.LIZJ(messageInvoke.selectedAnswerIndex, messageInvoke.uuid);
                        }
                        this.LJIIIZ = zLIZLLL;
                        if (z != zLIZLLL && z && !zLIZLLL && this.LJII && (viewGroup = this.LIZ) != null) {
                            HandlerHook.viewPostDelay(viewGroup, new ARunnableS127S0100000_27(this, 68), 1000L);
                        }
                    } else {
                        messageInvoke = null;
                    }
                    zLIZLLL = C1785140wYS.LIZLLL(messageInvoke != null ? messageInvoke.uuid : null);
                    this.LJIIIZ = zLIZLLL;
                    if (z != zLIZLLL) {
                        HandlerHook.viewPostDelay(viewGroup, new ARunnableS127S0100000_27(this, 68), 1000L);
                    }
                } else {
                    this.LJIIIZ = false;
                }
            }
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            int i3 = (itemCount - 1) - this.LJI;
            if (i3 < 0) {
                i3 = 0;
            }
            EnumC1861280yXG enumC1861280yXGLIZ = C1861260yXE.LIZ(recyclerView, this.LJIILIIL);
            boolean z2 = enumC1861280yXGLIZ == EnumC1861280yXG.FULLY_VISIBLE || enumC1861280yXGLIZ == EnumC1861280yXG.ABOVE_BOTTOM;
            boolean z3 = enumC1861280yXGLIZ == EnumC1861280yXG.PARTIAL_BOTTOM;
            int i4 = itemCount - this.LJI;
            if (i4 < 0) {
                i4 = 0;
            }
            int i5 = this.LJFF;
            boolean z4 = i5 != 0 && i4 > i5;
            this.LJFF = i4;
            boolean z5 = !z2 && iFindLastVisibleItemPosition == i3;
            if (this.LJII && !z2) {
                recyclerView.postOnAnimation(new ARunnableS32S0201000_27(itemCount, recyclerView, this, 6));
            }
            if (System.currentTimeMillis() < this.LJIILL) {
                return;
            }
            if (this.LJ) {
                LIZIZ();
                return;
            }
            boolean z6 = this.LIZLLL;
            if (z6 && this.LJIIIIZZ < 0 && iFindLastVisibleItemPosition < i3) {
                LIZLLL();
                return;
            }
            if (z4 && !z2 && !this.LJII && !this.LJIIIZ) {
                LIZLLL();
                return;
            }
            boolean z7 = this.LJIIIZ;
            if (z7 && z5 && !this.LJII) {
                LIZLLL();
                return;
            }
            if (z6 && this.LJIIIIZZ < 0 && z3 && !this.LJII) {
                LIZLLL();
                return;
            }
            if (z2) {
                LIZIZ();
                return;
            }
            if (this.LJII || z7) {
                if (this.LIZJ) {
                    LIZIZ();
                }
            } else {
                if (z6 || i4 <= 0) {
                    return;
                }
                LIZLLL();
            }
        }
    }

    public final void LIZIZ() {
        if (this.LIZJ) {
            this.LIZJ = false;
            ViewGroup viewGroup = this.LIZ;
            if (viewGroup != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(viewGroup, 130));
                valueAnimatorOfFloat.addListener(new AAListenerS171S0000000_27(1));
                valueAnimatorOfFloat.addListener(new AAListenerS324S0100000_13(viewGroup, 7));
                valueAnimatorOfFloat.start();
            }
        }
    }

    public final void LIZLLL() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(300L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(viewGroup, 131));
            valueAnimatorOfFloat.addListener(new AAListenerS171S0000000_27(2));
            valueAnimatorOfFloat.start();
        }
    }

    public final void LIZJ(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = jCurrentTimeMillis - this.LJIJI;
        if (j2 >= j) {
            this.LJIJI = jCurrentTimeMillis;
            if (this.LJIILJJIL) {
                LIZ();
                return;
            }
            return;
        }
        if (this.LJIJJ) {
            return;
        }
        this.LJIJJ = true;
        long j3 = j - j2;
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup == null) {
            return;
        }
        HandlerHook.viewPostDelay(viewGroup, new ARunnableS127S0100000_27(this, 66), j3);
    }
}
