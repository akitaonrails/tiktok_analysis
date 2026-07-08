package X;

import X.C1420790n4n;
import X.C21673919s1;
import X.C418440Gaw;
import X.C426750GoL;
import Y.AsS49S0100000_22;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.AutoCenterRecyclerView$CustomLinearLayoutManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0n4n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1420790n4n extends RecyclerView {
    public static final /* synthetic */ int LLILZLL = 0;
    public final AutoCenterRecyclerView$CustomLinearLayoutManager LL;
    public final C21679619sw LLILLJJLI;
    public final C1440440naU LLILLL;
    public final int LLILZ;
    public int LLILZIL;

    public final void setScrollListener(InterfaceC1420800n4o interfaceC1420800n4o) {
    }

    public final int getCenterX() {
        return this.LLILLJJLI.LJIIJ() + (this.LLILLJJLI.LJIIJJI() / 2);
    }

    public final int getOffsetStart() {
        return this.LLILZIL;
    }

    public final void setOffsetStart(int i) {
        this.LLILZIL = i;
        C426750GoL.LJIIL(this, Integer.valueOf((this.LLILZ / 2) - i), null, Integer.valueOf(this.LLILZ / 2), null, 26);
    }

    public C1420790n4n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager, com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.AutoCenterRecyclerView$CustomLinearLayoutManager] */
    public C1420790n4n(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C20635915oz c20635915oz = new C20635915oz();
        ?? r1 = new LinearLayoutManager(this, context) { // from class: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.AutoCenterRecyclerView$CustomLinearLayoutManager
            public final C1420790n4n LL;
            public final int LLILLJJLI;

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final void onLayoutCompleted(C21673919s1 c21673919s1) {
                View viewFindViewByPosition;
                int paddingLeft;
                int paddingRight;
                int paddingLeft2;
                int paddingRight2;
                super.onLayoutCompleted(c21673919s1);
                if (this.LL.getOffsetStart() == 0) {
                    return;
                }
                int marginEnd = 0;
                View viewFindViewByPosition2 = findViewByPosition(0);
                if (viewFindViewByPosition2 != null) {
                    int width = (this.LLILLJJLI / 2) - (viewFindViewByPosition2.getWidth() / 2);
                    ViewGroup.LayoutParams layoutParams = viewFindViewByPosition2.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                    }
                    int i2 = width - marginEnd;
                    C1420790n4n c1420790n4n = this.LL;
                    if (C426750GoL.LIZLLL(c1420790n4n.getContext())) {
                        paddingLeft2 = c1420790n4n.getPaddingRight();
                    } else {
                        paddingLeft2 = c1420790n4n.getPaddingLeft();
                    }
                    if (paddingLeft2 == i2 - this.LL.getOffsetStart()) {
                        C1420790n4n c1420790n4n2 = this.LL;
                        if (C426750GoL.LIZLLL(c1420790n4n2.getContext())) {
                            paddingRight2 = c1420790n4n2.getPaddingLeft();
                        } else {
                            paddingRight2 = c1420790n4n2.getPaddingRight();
                        }
                        if (paddingRight2 == i2) {
                            return;
                        }
                    }
                    C1420790n4n c1420790n4n3 = this.LL;
                    C426750GoL.LJIIL(c1420790n4n3, Integer.valueOf(i2 - c1420790n4n3.getOffsetStart()), null, Integer.valueOf(i2), null, 26);
                    return;
                }
                if (this.LL.getAdapter() != null && (viewFindViewByPosition = findViewByPosition(r0.getItemCount() - 1)) != null) {
                    int width2 = (this.LLILLJJLI / 2) - (viewFindViewByPosition.getWidth() / 2);
                    ViewGroup.LayoutParams layoutParams2 = viewFindViewByPosition.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
                    }
                    int i3 = width2 - marginEnd;
                    C1420790n4n c1420790n4n4 = this.LL;
                    if (C426750GoL.LIZLLL(c1420790n4n4.getContext())) {
                        paddingLeft = c1420790n4n4.getPaddingRight();
                    } else {
                        paddingLeft = c1420790n4n4.getPaddingLeft();
                    }
                    if (paddingLeft == i3 - this.LL.getOffsetStart()) {
                        C1420790n4n c1420790n4n5 = this.LL;
                        if (C426750GoL.LIZLLL(c1420790n4n5.getContext())) {
                            paddingRight = c1420790n4n5.getPaddingLeft();
                        } else {
                            paddingRight = c1420790n4n5.getPaddingRight();
                        }
                        if (paddingRight == i3) {
                            return;
                        }
                    }
                    C1420790n4n c1420790n4n6 = this.LL;
                    C426750GoL.LJIIL(c1420790n4n6, Integer.valueOf(i3 - c1420790n4n6.getOffsetStart()), null, Integer.valueOf(i3), null, 26);
                }
            }

            {
                super(context, 0, false);
                this.LL = this;
                this.LLILLJJLI = C418440Gaw.LIZLLL(context);
            }
        };
        this.LL = r1;
        this.LLILLJJLI = new C21679619sw(r1);
        this.LLILLL = new C1440440naU(context);
        this.LLILZ = C418440Gaw.LIZLLL(context);
        setLayoutManager(r1);
        try {
            c20635915oz.LIZIZ(this);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        addOnScrollListener(new AsS49S0100000_22(this, 1));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }
}
