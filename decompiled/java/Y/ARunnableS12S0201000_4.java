package Y;

import X.C0DGF;
import X.C0T8I;
import X.C19E3;
import X.C1C7U;
import X.C341380DZw;
import X.C426750GoL;
import X.C786410Ut5;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes5.dex */
public class ARunnableS12S0201000_4 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        View view = ((TuxActionSheet) this.l0).getView();
        LinearLayout linearLayout = view != null ? (LinearLayout) view.findViewById(R.id.a59) : null;
        if (linearLayout != null) {
            C341380DZw.LIZ.getClass();
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
            if (linearLayout.getChildCount() > 1) {
                C786410Ut5.LJJLJ(linearLayout.getChildCount() - 1, linearLayout);
                return;
            }
            return;
        }
        int i = this.i2;
        if (i > 0) {
            C341380DZw c341380DZw = C341380DZw.LIZ;
            TuxActionSheet tuxActionSheet = (TuxActionSheet) this.l0;
            View view2 = (View) this.l1;
            c341380DZw.getClass();
            HandlerHook.viewPost(view2, new ARunnableS12S0201000_4(i - 1, view2, tuxActionSheet, 0));
        }
    }

    public final void LIZ$1() {
        C0DGF c0dgf = (C0DGF) this.l0;
        RecyclerView recyclerView = (RecyclerView) this.l1;
        int i = this.i2;
        if (i < 0) {
            c0dgf.getClass();
            return;
        }
        if (i < c0dgf.getItemCount()) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager) || layoutManager == null) {
                return;
            }
            View viewFindViewByPosition = layoutManager.findViewByPosition(i);
            if (viewFindViewByPosition == null) {
                recyclerView.smoothScrollToPosition(i);
                return;
            }
            int left = ((viewFindViewByPosition.getLeft() + viewFindViewByPosition.getRight()) / 2) - (recyclerView.getWidth() / 2);
            if (Math.abs(left) > recyclerView.getWidth() / 6) {
                recyclerView.smoothScrollBy(left, 0);
            }
        }
    }

    public final void LIZ$2() {
        float width = ((C0T8I) this.l0).getWidth() + (((C0T8I) this.l0).getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r2).getMarginStart() : 0) + (((C0T8I) this.l0).getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r2).getMarginEnd() : 0);
        float marginStart = (((C0T8I) this.l0).getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r2).getMarginStart() : 0) + ((C0T8I) this.l0).getOffset();
        float f = 2;
        float width2 = ((View) this.l1).getWidth() / f;
        int i = this.i2;
        if (marginStart < width2 + i) {
            C426750GoL.LJIIIZ((View) this.l1, Integer.valueOf(i), null, null, null, false, 30);
            return;
        }
        if ((((C0T8I) this.l0).getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r3).getMarginStart() : 0) + ((C0T8I) this.l0).getOffset() + (((View) this.l1).getWidth() / f) + this.i2 > width) {
            C426750GoL.LJIIIZ((View) this.l1, Integer.valueOf((int) ((width - r7.getWidth()) - this.i2)), null, null, null, false, 30);
        } else {
            C426750GoL.LJIIIZ((View) this.l1, Integer.valueOf((int) (((((C0T8I) this.l0).getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) r1).getMarginStart() : 0) + ((C0T8I) this.l0).getOffset()) - (((View) this.l1).getWidth() / f))), null, null, null, false, 30);
        }
    }

    public static final void run$0(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SearchImageTop1ToolbarPanel@a02b.removeIconOnlyFooterWhenReady$1");
        try {
            aRunnableS12S0201000_4.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchImageTop1ToolbarPanel@a02b.removeIconOnlyFooterWhenReady$1");
    }

    public static final void run$1(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("IMEUtils@1b90.showIme$1");
        try {
            ((InputMethodManager) aRunnableS12S0201000_4.l0).showSoftInput((View) aRunnableS12S0201000_4.l1, aRunnableS12S0201000_4.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("IMEUtils@1b90.showIme$1");
    }

    public static final void run$2(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("TakoMixCardAnchorScroller@92d7.applyAnchorScroll$$inlined$doOnPreDraw$1");
        try {
            ((RecyclerView) aRunnableS12S0201000_4.l1).smoothScrollBy(0, aRunnableS12S0201000_4.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoMixCardAnchorScroller@92d7.applyAnchorScroll$$inlined$doOnPreDraw$1");
    }

    public static final void run$3(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("BaseColorSkuAdapter$ColorViewHolder@fcd.bind$1$1");
        try {
            aRunnableS12S0201000_4.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseColorSkuAdapter$ColorViewHolder@fcd.bind$1$1");
    }

    public static final void run$4(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("AdjustablePaddingTargetFooter@bbd.validateInner$3$1");
        try {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) aRunnableS12S0201000_4.l0;
            if (linearLayoutManager != null) {
                int i = aRunnableS12S0201000_4.i2;
                RecyclerView recyclerView = (RecyclerView) aRunnableS12S0201000_4.l1;
                if (linearLayoutManager.findLastCompletelyVisibleItemPosition() < i) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(i);
                    if (viewFindViewByPosition != null) {
                        int decoratedBottom = linearLayoutManager.getDecoratedBottom(viewFindViewByPosition) - (recyclerView.getHeight() - recyclerView.getPaddingBottom());
                        if (decoratedBottom > 0) {
                            recyclerView.smoothScrollBy(0, decoratedBottom);
                        }
                    } else {
                        recyclerView.smoothScrollBy(0, 100);
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AdjustablePaddingTargetFooter@bbd.validateInner$3$1");
    }

    public static final void run$5(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("SpecialCardPictureManager@8a59.setSafeMargin$1");
        try {
            aRunnableS12S0201000_4.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.setSafeMargin$1");
    }

    public static final void run$6(ARunnableS12S0201000_4 aRunnableS12S0201000_4) {
        boolean zLIZ;
        C1C7U.LIZ("EPAICreateSelectMaterialScene@65c4.setupGridBottomPadding$2$1");
        try {
            int height = aRunnableS12S0201000_4.i2 + ((View) aRunnableS12S0201000_4.l0).getHeight();
            if (((C19E3) aRunnableS12S0201000_4.l1).getPaddingBottom() != height) {
                C19E3 c19e3 = (C19E3) aRunnableS12S0201000_4.l1;
                c19e3.setPadding(c19e3.getPaddingLeft(), ((C19E3) aRunnableS12S0201000_4.l1).getPaddingTop(), ((C19E3) aRunnableS12S0201000_4.l1).getPaddingRight(), height);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EPAICreateSelectMaterialScene@65c4.setupGridBottomPadding$2$1");
    }

    public ARunnableS12S0201000_4(InputMethodManager inputMethodManager, View view, int i) {
        this.$t = i;
        this.l0 = inputMethodManager;
        this.l1 = view;
        this.i2 = 0;
    }

    public ARunnableS12S0201000_4(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.l1 = obj;
        this.i2 = i;
    }
}
