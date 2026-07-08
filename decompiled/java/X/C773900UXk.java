package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.0UXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773900UXk extends C21532619Oq {
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public final List<C773920UXm> LLJJJJLIIL;
    public View LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public Function1<? super Boolean, Unit> LLJLIL;

    public final int getCollapsableRowCountThreshold() {
        return this.LLJL;
    }

    public final Function1<Boolean, Unit> getOnDisplayStateResolved$liveroomfunction_impl_release() {
        return this.LLJLIL;
    }

    public final void setAllFunctions$liveroomfunction_impl_release(List<C773920UXm> list) {
        ((ArrayList) this.LLJJJJLIIL).clear();
        ((ArrayList) this.LLJJJJLIIL).addAll(list);
        requestLayout();
    }

    public final void setBottomCollapseView$liveroomfunction_impl_release(View view) {
        this.LLJJJJJIL = true;
        this.LLJJLIIIJLLLLLLLZ = view;
    }

    public final void setCollapsable$liveroomfunction_impl_release(boolean z) {
        if (this.LLJJJJ != z) {
            this.LLJJJJ = z;
            requestLayout();
        }
    }

    public final void setCollapsableRowCountThreshold(int i) {
        this.LLJL = i;
    }

    public final void setCollapseView$liveroomfunction_impl_release(View view) {
        this.LLJJJJJIL = false;
        this.LLJJL = view;
    }

    public final void setCollapseViewAdaptivelyLayout$liveroomfunction_impl_release(boolean z) {
        if (this.LLJJJ != z) {
            this.LLJJJ = z;
            requestLayout();
        }
    }

    public final void setCollapsed$liveroomfunction_impl_release(boolean z) {
        if (this.LLJJJIL != z) {
            this.LLJJJIL = z;
            requestLayout();
        }
    }

    public final void setItemHeight$liveroomfunction_impl_release(int i) {
        if (this.LLJJIJIIJIL != i) {
            this.LLJJIJIIJIL = i;
            requestLayout();
        }
    }

    public final void setItemWidth$liveroomfunction_impl_release(int i) {
        if (this.LLJJIJI != i) {
            this.LLJJIJI = i;
            requestLayout();
        }
    }

    public final void setLineSpacing$liveroomfunction_impl_release(int i) {
        if (this.LLJJIJIL != i) {
            this.LLJJIJIL = i;
            requestLayout();
        }
    }

    public final void setOnDisplayStateResolved$liveroomfunction_impl_release(Function1<? super Boolean, Unit> function1) {
        this.LLJLIL = function1;
    }

    public C773900UXk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setShowDividerVertical(2);
        setShowDividerHorizontal(2);
        this.LLJJIJI = context.getResources().getDimensionPixelSize(R.dimen.ar9);
        this.LLJJIJIIJIL = -2;
        this.LLJJJIL = true;
        this.LLJJJJ = true;
        this.LLJJJJLIIL = new ArrayList();
        this.LLJL = 2;
        this.LLJLIL = AFwS231S0000000_3.get$arr$(239);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0132  */
    @Override // X.C21532619Oq, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773900UXk.onMeasure(int, int):void");
    }
}
