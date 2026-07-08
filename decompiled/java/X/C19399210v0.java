package X;

import Y.ARunnableS34S0201000_29;
import Y.ARunnableS40S0101000_29;
import Y.AsS37S0200000_29;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.gamora.editor.audioservice.businessui.speechtosong.base.CenterSelectionLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.10v0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19399210v0 extends FrameLayout {
    public final RecyclerView LL;
    public final TextView LLILLJJLI;
    public final C19398610uu LLILLL;
    public InterfaceC19399010uy LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public List<C19398810uw> LLIZ;

    public final void setCenterSelectListener(InterfaceC19399010uy interfaceC19399010uy) {
        this.LLILZ = interfaceC19399010uy;
    }

    public final void setSelectionSilent(int i) {
        InterfaceC19399010uy interfaceC19399010uy = this.LLILZ;
        this.LLILZ = null;
        HandlerHook.viewPost(this.LL, new ARunnableS34S0201000_29(this, i, interfaceC19399010uy, 4));
    }

    public C19399210v0(Context context, AttributeSet attributeSet) {
        AbstractC21674919sB abstractC21674919sB;
        super(context, attributeSet, 0);
        this.LLILZIL = -1;
        this.LLILZLL = -1;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ru, this, true);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.wbe);
        this.LL = recyclerView;
        this.LLILLJJLI = (TextView) findViewById(R.id.wbd);
        AbstractC21673719rz itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.LJIJJ(0L);
            itemAnimator.LJIJJLI(0L);
            itemAnimator.LJIL(0L);
            itemAnimator.LJJ(0L);
        }
        AbstractC21673719rz itemAnimator2 = recyclerView.getItemAnimator();
        if ((itemAnimator2 instanceof AbstractC21674919sB) && (abstractC21674919sB = (AbstractC21674919sB) itemAnimator2) != null) {
            abstractC21674919sB.LLIZ = false;
        }
        recyclerView.setLayoutManager(new CenterSelectionLayoutManager(context));
        C19398610uu c19398610uu = new C19398610uu();
        this.LLILLL = c19398610uu;
        recyclerView.setAdapter(c19398610uu);
        final int iLIZ = C341940Daq.LIZ(16.0d);
        recyclerView.addItemDecoration(new C0DXR(iLIZ) { // from class: X.0DQ1
            public final int LL = 0;
            public final int LLILLJJLI = 0;
            public final int LLILLL;

            {
                this.LLILLL = iLIZ;
            }

            public static int LJ(RecyclerView recyclerView2, View view) {
                int measuredWidth;
                if (recyclerView2.getWidth() != 0) {
                    measuredWidth = recyclerView2.getWidth();
                } else {
                    measuredWidth = recyclerView2.getMeasuredWidth();
                }
                view.measure(0, 0);
                return (measuredWidth / 2) - (view.getMeasuredWidth() / 2);
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                int itemCount;
                int childAdapterPosition = recyclerView2.getChildAdapterPosition(view);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                AbstractC21673619ry adapter = recyclerView2.getAdapter();
                if (adapter != null) {
                    itemCount = adapter.getItemCount();
                } else {
                    itemCount = 0;
                }
                if (childAdapterPosition == 0) {
                    int iLJ = LJ(recyclerView2, view);
                    if (C444960Hcc.LIZIZ()) {
                        marginLayoutParams.setMargins(this.LLILLL, 0, this.LL + iLJ, 0);
                    } else {
                        marginLayoutParams.setMargins(this.LL + iLJ, 0, this.LLILLL, 0);
                    }
                } else if (childAdapterPosition == itemCount - 1) {
                    int iLJ2 = LJ(recyclerView2, view);
                    if (C444960Hcc.LIZIZ()) {
                        marginLayoutParams.setMargins(this.LLILLJJLI + iLJ2, 0, this.LLILLL, 0);
                    } else {
                        marginLayoutParams.setMargins(this.LLILLL, 0, this.LLILLJJLI + iLJ2, 0);
                    }
                } else {
                    view.measure(0, 0);
                    int i = this.LLILLL;
                    marginLayoutParams.setMargins(i, 0, i, 0);
                }
                C786410Ut5.W5(view, marginLayoutParams);
                super.LIZIZ(rect, view, recyclerView2, c21673919s1);
            }
        });
        C20635915oz c20635915oz = new C20635915oz() { // from class: X.15p1
            public final int LJFF = 0;
            public C21679619sw LJI;

            @Override // X.C20635915oz, X.AbstractC20634115oh
            public final View LJFF(RecyclerView.LayoutManager layoutManager) {
                int iAbs;
                if ((layoutManager instanceof LinearLayoutManager) && layoutManager.canScrollHorizontally()) {
                    int childCount = layoutManager.getChildCount();
                    View view = null;
                    if (childCount == 0) {
                        return null;
                    }
                    if (this.LJI == null) {
                        this.LJI = new C21679619sw(layoutManager);
                    }
                    C21679619sw c21679619sw = this.LJI;
                    if (c21679619sw == null) {
                        return null;
                    }
                    int iLJIIJ = c21679619sw.LJIIJ() + (c21679619sw.LJIIJJI() / 2);
                    int i = Integer.MAX_VALUE;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = layoutManager.getChildAt(i2);
                        if (childAt != null && (iAbs = Math.abs((childAt.getLeft() + ((childAt.getRight() - childAt.getLeft()) / 2)) - iLJIIJ)) < i) {
                            view = childAt;
                            i = iAbs;
                        }
                    }
                    return view;
                }
                return super.LJFF(layoutManager);
            }

            @Override // X.C20635915oz, X.AbstractC20634115oh
            public final int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
                int[] iArrLIZJ = super.LIZJ(layoutManager, view);
                int i = iArrLIZJ[0];
                if (i != 0) {
                    iArrLIZJ[0] = i + this.LJFF;
                }
                return iArrLIZJ;
            }
        };
        c20635915oz.LIZIZ(recyclerView);
        recyclerView.addOnScrollListener(new AsS37S0200000_29(c20635915oz, this, 2));
        c19398610uu.LL = new InterfaceC19399510v3() { // from class: X.10uz
            @Override // X.InterfaceC19399510v3
            public final void LIZ(int i) {
                C19399210v0 c19399210v0 = this.LIZ;
                HandlerHook.viewPost(c19399210v0.LL, new ARunnableS40S0101000_29(c19399210v0, i, 12));
            }
        };
    }
}
