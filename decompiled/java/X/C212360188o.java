package X;

import Y.ALAdapterS2S0201000_32;
import Y.AUListenerS14S0202000_32;
import Y.AsS57S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM;
import java.util.ArrayDeque;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.188o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212360188o {
    public final View LIZ;
    public final RecyclerView LIZIZ;
    public final Function0<Map<String, String>> LIZJ;
    public final Function0<Map<String, String>> LIZLLL;
    public final Function0<String> LJ;
    public final Function1<Integer, Boolean> LJFF;
    public boolean LJI;
    public SearchRefreshPredictMobCanShowVM LJII;
    public boolean LJIIIZ;
    public Animator LJIIJ;
    public Integer LJIIJJI;
    public int LJIIL;
    public boolean LJIILJJIL;
    public Integer LJIILL;
    public int LJIILLIIL;
    public Function1<? super Float, Unit> LJIIZILJ;
    public Long LJIJ;
    public final AsS57S0100000_32 LJIJI;
    public long LJIIIIZZ = -1;
    public boolean LJIILIIL = true;

    public final void LJIIIZ() {
        LJII(0.0f);
        this.LJIIIIZZ = -1L;
        this.LJI = false;
        this.LJIIIZ = false;
        this.LJIIJJI = null;
        this.LJIIL = 0;
        this.LJIILIIL = true;
        this.LJIILJJIL = false;
        this.LJIILL = null;
        this.LJIILLIIL = 0;
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener(this.LJIJI);
        }
        Animator animator = this.LJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        this.LJIJ = null;
    }

    public final int LIZLLL() {
        Integer num;
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView == null || (num = this.LJIILL) == null) {
            return 0;
        }
        int iIntValue = num.intValue();
        int i = this.LJIILLIIL;
        if (i <= 0) {
            return 0;
        }
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset() - iIntValue;
        if (iComputeVerticalScrollOffset < 0) {
            iComputeVerticalScrollOffset = 0;
        } else if (iComputeVerticalScrollOffset > i) {
            iComputeVerticalScrollOffset = i;
        }
        return C13LZ.LJ((int) ((iComputeVerticalScrollOffset / i) * 100.0f), 0, 100);
    }

    public final void LJI() {
        if (this.LJIIIIZZ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIIIZZ;
            if (jCurrentTimeMillis > 0) {
                SearchRefreshPredictMobCanShowVM searchRefreshPredictMobCanShowVM = this.LJII;
                if (searchRefreshPredictMobCanShowVM == null || searchRefreshPredictMobCanShowVM.a32()) {
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                    c2344009Gk.LJII(this.LIZJ.invoke());
                    c2344009Gk.LJII(this.LIZLLL.invoke());
                    c2344009Gk.LJIIIIZZ("is_page", this.LJI ? "1" : CardStruct.IStatusCode.DEFAULT);
                    C20684815ws.LJIILLIIL("search_card_stay_duration", c2344009Gk.LIZ);
                    this.LJIIIIZZ = -1L;
                }
            }
        }
    }

    public static long LIZIZ(int i) {
        int iLIZIZ = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(310));
        if (iLIZIZ < 0) {
            iLIZIZ = 0;
        }
        return (long) C13LZ.LIZLLL(((float) Math.sqrt(iLIZIZ)) * 11.96f, 150.0f, 500.0f);
    }

    public static void LJFF(C212359188n c212359188n) {
        c212359188n.requestLayout();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(c212359188n);
        while (!arrayDeque.isEmpty()) {
            View view = (View) arrayDeque.removeFirst();
            view.forceLayout();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    arrayDeque.add(viewGroup.getChildAt(i));
                }
            }
        }
    }

    public final void LIZJ(int i) {
        RecyclerView recyclerView = this.LIZIZ;
        if (recyclerView != null && this.LIZ.isAttachedToWindow() && i > 0) {
            Rect rect = new Rect();
            if (recyclerView.getGlobalVisibleRect(rect) && rect.height() > 0) {
                int[] iArr = new int[2];
                this.LIZ.getLocationInWindow(iArr);
                int i2 = rect.bottom - iArr[1];
                int i3 = 0;
                int iLJ = i - C13LZ.LJ(i2, 0, i);
                if (iLJ >= 0) {
                    i3 = iLJ;
                }
                this.LJIILL = Integer.valueOf(recyclerView.computeVerticalScrollOffset());
                this.LJIILLIIL = i3;
            }
        }
    }

    public final void LJII(float f) {
        Function1<? super Float, Unit> function1 = this.LJIIZILJ;
        if (function1 != null) {
            function1.invoke(Float.valueOf(C13LZ.LIZLLL(f, 0.0f, 1.0f)));
        }
    }

    public final void LJIIIIZZ(boolean z) {
        if (z) {
            this.LJIJ = Long.valueOf(System.currentTimeMillis());
            this.LJI = true;
            this.LJIIIIZZ = System.currentTimeMillis();
            this.LJIIIZ = false;
            this.LJIIJJI = null;
            this.LJIIL = 0;
            this.LJIILIIL = true;
            this.LJIILJJIL = false;
            this.LJIILL = null;
            this.LJIILLIIL = 0;
            RecyclerView recyclerView = this.LIZIZ;
            if (recyclerView != null) {
                recyclerView.addOnScrollListener(this.LJIJI);
                return;
            }
            return;
        }
        this.LJI = false;
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LJIIJJI = null;
        this.LJIIL = 0;
        this.LJIILIIL = true;
        this.LJIILJJIL = false;
        this.LJIILL = null;
        this.LJIILLIIL = 0;
        RecyclerView recyclerView2 = this.LIZIZ;
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.removeOnScrollListener(this.LJIJI);
    }

    public final void LJ(C212359188n c212359188n, int i) {
        int height;
        LJI();
        int i2 = 0;
        if (c212359188n.getHeight() > 0) {
            height = c212359188n.getHeight();
        } else {
            height = 0;
        }
        Animator animator = this.LJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i);
        int i3 = i - height;
        if (i3 >= 0) {
            i2 = i3;
        }
        valueAnimatorOfInt.setDuration((long) C13LZ.LIZLLL(((float) Math.sqrt(i2)) * 11.96f, 150.0f, 500.0f));
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJIILIIL());
        valueAnimatorOfInt.addUpdateListener(new AUListenerS14S0202000_32(height, c212359188n, i, this, 0));
        valueAnimatorOfInt.addListener(new ALAdapterS2S0201000_32(this, c212359188n, i, 1));
        valueAnimatorOfInt.start();
        this.LJIIJ = valueAnimatorOfInt;
    }

    public final int LIZ(int i, View view, boolean z) {
        RecyclerView recyclerView;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(((Number) C18153079b.LIZ.getValue()).intValue())));
        if (iLIZIZ < 0) {
            iLIZIZ = 0;
        }
        if (!(view instanceof ViewGroup) || view == null || !this.LIZ.isAttachedToWindow() || view.getHeight() <= 0 || (recyclerView = this.LIZIZ) == null || (viewHolderFindContainingViewHolder = recyclerView.findContainingViewHolder(this.LIZ)) == null || viewHolderFindContainingViewHolder.getBindingAdapterPosition() == -1) {
            return 0;
        }
        if (z && recyclerView.computeVerticalScrollOffset() <= 0) {
            return 0;
        }
        int[] iArr = new int[2];
        recyclerView.getLocationInWindow(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.LIZ.getLocationInWindow(iArr2);
        return (iArr2[1] + i) - ((i2 + recyclerView.getPaddingTop()) + iLIZIZ);
    }

    public C212360188o(View view, RecyclerView recyclerView, Function0 function0, Function0 function02, Function0 function03, Function1 function1) {
        this.LIZ = view;
        this.LIZIZ = recyclerView;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = function03;
        this.LJFF = function1;
        if (view.isAttachedToWindow()) {
            this.LJII = C0P72.LIZ(C946803n0.LIZ(view));
        } else {
            view.addOnAttachStateChangeListener(new C19LT(view, this, 2));
        }
        this.LJIJI = new AsS57S0100000_32(this, 7);
    }
}
