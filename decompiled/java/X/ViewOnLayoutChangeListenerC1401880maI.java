package X;

import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.title.assem.TitlePanelSheetAssem;
import com.ss.android.ugc.aweme.feed.title.vm.TitlePanelRootVM;
import com.ss.android.ugc.aweme.music.v2.assem.MusicShareToEditAssem;
import kotlin.Unit;
import kotlin.jvm.internal.AwS34S0001000_21;

/* JADX INFO: renamed from: X.0maI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class ViewOnLayoutChangeListenerC1401880maI implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1401880maI(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1401880maI viewOnLayoutChangeListenerC1401880maI, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int i9 = i4 - i2;
        if (i9 != i8 - i6) {
            TitlePanelRootVM titlePanelRootVMGo = ((TitlePanelSheetAssem) viewOnLayoutChangeListenerC1401880maI.l0).Go();
            if (titlePanelRootVMGo.getState().LLILLL != i9) {
                titlePanelRootVMGo.setState(new AwS34S0001000_21(i9, 12));
            }
            int paddingBottom = ((C1354270lLV) viewOnLayoutChangeListenerC1401880maI.l1).getPaddingBottom();
            int height2 = 0;
            if (((View) viewOnLayoutChangeListenerC1401880maI.l2).getVisibility() == 0) {
                height2 = ((View) viewOnLayoutChangeListenerC1401880maI.l2).getHeight();
            }
            if (paddingBottom != height2) {
                C0H1U.LJII(height2, (C1354270lLV) viewOnLayoutChangeListenerC1401880maI.l1);
                ((C1354270lLV) viewOnLayoutChangeListenerC1401880maI.l1).requestLayout();
            }
            FrameLayout frameLayout = (FrameLayout) viewOnLayoutChangeListenerC1401880maI.l3;
            if (frameLayout != null && frameLayout.getLayoutParams().height == 0 && ((FrameLayout) viewOnLayoutChangeListenerC1401880maI.l3).getLayoutParams().height != (height = ((C1354270lLV) viewOnLayoutChangeListenerC1401880maI.l1).getHeight() - height2)) {
                ((FrameLayout) viewOnLayoutChangeListenerC1401880maI.l3).getLayoutParams().height = height;
                if (((FrameLayout) viewOnLayoutChangeListenerC1401880maI.l3).getVisibility() != 8) {
                    ((FrameLayout) viewOnLayoutChangeListenerC1401880maI.l3).requestLayout();
                }
            }
        }
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1401880maI viewOnLayoutChangeListenerC1401880maI, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if ((((MusicShareToEditAssem) viewOnLayoutChangeListenerC1401880maI.l0).op().getState().LLILZIL == 0 || i3 - i != i7 - i5) && view != null) {
            MusicShareToEditAssem musicShareToEditAssem = (MusicShareToEditAssem) viewOnLayoutChangeListenerC1401880maI.l0;
            C0GTR c0gtr = (C0GTR) viewOnLayoutChangeListenerC1401880maI.l1;
            TuxTextView tuxTextView = (TuxTextView) viewOnLayoutChangeListenerC1401880maI.l2;
            TuxIconView tuxIconView = (TuxIconView) viewOnLayoutChangeListenerC1401880maI.l3;
            try {
                if (C1400510mY5.LIZ()) {
                    musicShareToEditAssem.lp(view, c0gtr, tuxTextView);
                } else {
                    musicShareToEditAssem.lp(view, tuxIconView, tuxTextView);
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
