package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.Callback;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0kQh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class RunnableC1319050kQh implements Runnable {
    public final WeakReference<RecyclerView> LL;
    public int LLILLL;
    public String LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLJI = true;
    public final C1319170kQt LLJIJIL = new C0KFD() { // from class: X.0kQt
        @Override // X.InterfaceC21676019sM
        public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
            this.LL.LLJ = false;
            return false;
        }
    };
    public Callback LLILLJJLI = null;
    public C1318540kPs LLIZLLLIL = null;
    public boolean LLJ = false;

    public final void LIZ() {
        int iMin;
        char c;
        int paddingLeft;
        int width;
        int paddingRight;
        RecyclerView recyclerView = this.LL.get();
        if (recyclerView == null || recyclerView.getLayoutManager() == null || recyclerView.getChildCount() == 0) {
            LIZIZ();
            return;
        }
        if (!this.LLJ) {
            this.LLILLJJLI.invoke(0);
            LIZIZ();
            return;
        }
        int iMin2 = Math.min(this.LLILLL, recyclerView.getLayoutManager().getItemCount() - 1);
        this.LLILLL = iMin2;
        this.LLILLL = Math.max(iMin2, 0);
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                int childCount2 = recyclerView.getChildCount();
                this.LLILZLL = layoutManager.getItemCount();
                this.LLIZ = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount2) {
                        break;
                    }
                    C1318540kPs c1318540kPs = (C1318540kPs) recyclerView.getChildAt(i2);
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) c1318540kPs.getLayoutParams()).getViewLayoutPosition();
                    this.LLIZ = Math.max(viewLayoutPosition, this.LLIZ);
                    this.LLILZLL = Math.min(viewLayoutPosition, this.LLILZLL);
                    if (viewLayoutPosition == this.LLILLL) {
                        this.LLIZLLLIL = c1318540kPs;
                        break;
                    }
                    i2++;
                }
                if (this.LLIZLLLIL != null) {
                    RecyclerView.LayoutManager layoutManager2 = recyclerView.getLayoutManager();
                    int decoratedTop = this.LLJI ? layoutManager2.getDecoratedTop(this.LLIZLLLIL) : layoutManager2.getDecoratedLeft(this.LLIZLLLIL);
                    int decoratedMeasuredHeight = this.LLJI ? layoutManager2.getDecoratedMeasuredHeight(this.LLIZLLLIL) : layoutManager2.getDecoratedMeasuredWidth(this.LLIZLLLIL);
                    int height = this.LLJI ? layoutManager2.getHeight() : layoutManager2.getWidth();
                    int paddingTop = this.LLJI ? layoutManager2.getPaddingTop() : layoutManager2.getPaddingLeft();
                    int paddingBottom = (height - paddingTop) - (this.LLJI ? layoutManager2.getPaddingBottom() : layoutManager2.getPaddingRight());
                    int i3 = decoratedTop - (TextUtils.equals(this.LLILZ, "middle") ? (this.LLILZIL + paddingTop) + ((paddingBottom - decoratedMeasuredHeight) / 2) : TextUtils.equals(this.LLILZ, "bottom") ? ((this.LLILZIL + paddingTop) + paddingBottom) - decoratedMeasuredHeight : this.LLILZIL + paddingTop);
                    if (i3 == 0) {
                        this.LLILLJJLI.invoke(0);
                    } else {
                        iMin = Math.min(Math.max(Math.abs(i3) / 3, 1), C1319070kQj.LIZJ);
                        if (i3 <= 0) {
                            iMin = -iMin;
                        }
                        if ((this.LLJI ? this.LLIZLLLIL.getHeight() : this.LLIZLLLIL.getWidth()) == 0 && iMin == 1) {
                            this.LLILLJJLI.invoke(0);
                        }
                    }
                    LIZIZ();
                    return;
                }
                int i4 = this.LLILZLL;
                int i5 = this.LLILLL;
                int i6 = i4 > i5 ? -1 : 1;
                int i7 = this.LLIZ;
                int i8 = (i7 - i4) + 1;
                int i9 = i6 == -1 ? i4 - i5 : i5 - i7;
                int height2 = this.LLJI ? recyclerView.getHeight() : recyclerView.getWidth();
                int i10 = (i9 * height2) / i8;
                if (i9 <= 30 || i10 <= height2 * 10) {
                    iMin = Math.min(height2, C1319070kQj.LIZJ * i9) * i6;
                } else {
                    int i11 = this.LLILZLL;
                    int i12 = this.LLILLL;
                    if (i11 <= i12) {
                        i11 = this.LLIZ;
                    }
                    recyclerView.scrollToPosition(((i11 - i12) / 2) + i12);
                }
                boolean z = this.LLJI;
                if (iMin != 0) {
                    byte b = iMin > 0 ? (byte) 1 : (byte) -1;
                    RecyclerView.LayoutManager layoutManager3 = recyclerView.getLayoutManager();
                    int childCount3 = recyclerView.getChildCount();
                    boolean z2 = recyclerView.findViewHolderForLayoutPosition(0) != null;
                    boolean z3 = recyclerView.findViewHolderForLayoutPosition(layoutManager3.getItemCount() - 1) != null;
                    if ((z2 && -1 == b) || (z3 && 1 == b)) {
                        int iMin3 = Integer.MAX_VALUE;
                        int iMax = Integer.MIN_VALUE;
                        for (int i13 = 0; i13 < childCount3; i13++) {
                            View childAt = recyclerView.getChildAt(i13);
                            iMin3 = z ? Math.min(layoutManager3.getDecoratedTop(childAt), iMin3) : Math.min(layoutManager3.getDecoratedLeft(childAt), iMin3);
                            iMax = z ? Math.max(layoutManager3.getDecoratedBottom(childAt), iMax) : Math.max(layoutManager3.getDecoratedRight(childAt), iMax);
                        }
                        if (z) {
                            paddingLeft = layoutManager3.getPaddingTop();
                            width = layoutManager3.getHeight();
                            paddingRight = layoutManager3.getPaddingBottom();
                        } else {
                            paddingLeft = layoutManager3.getPaddingLeft();
                            width = layoutManager3.getWidth();
                            paddingRight = layoutManager3.getPaddingRight();
                        }
                        c = (!(z2 && -1 == b) ? z3 && 1 == b && iMax <= width - paddingRight : iMin3 >= paddingLeft) ? (char) 0 : (char) 0;
                    }
                    if (z) {
                        recyclerView.scrollBy(0, iMin);
                    } else {
                        recyclerView.scrollBy(iMin, 0);
                    }
                }
                Callback callback = this.LLILLJJLI;
                Object[] objArr = new Object[2];
                objArr[c] = 4;
                objArr[1] = "can not scroll when come to border";
                callback.invoke(objArr);
                LIZIZ();
                return;
            }
            C1318540kPs c1318540kPs2 = (C1318540kPs) recyclerView.getChildAt(i);
            if (c1318540kPs2.LL != 3 && ((C1318570kPv) recyclerView.getChildViewHolder(c1318540kPs2)).LL.LLILLJJLI != null) {
                break;
            } else {
                i++;
            }
        }
        HandlerHook.viewPost(recyclerView, this);
    }

    public final void LIZIZ() {
        LynxLog.i("UIList", "ListScroller stop");
        RecyclerView recyclerView = this.LL.get();
        this.LLJ = false;
        if (recyclerView != null) {
            recyclerView.removeOnItemTouchListener(this.LLJIJIL);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ListScroller$SmoothScroller@2f9e.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ListScroller$SmoothScroller@2f9e.run");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0kQt] */
    public RunnableC1319050kQh(RecyclerView recyclerView) {
        this.LL = new WeakReference<>(recyclerView);
    }
}
