package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14s4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20400214s4 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20400214s4(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(1);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        if (bool.booleanValue()) {
            PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
            View view = playbookPolymerizationDialog.LLLIILIL;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, true);
            }
            View view2 = playbookPolymerizationDialog.LLLIILIL;
            ViewGroup.LayoutParams layoutParams4 = null;
            if (view2 != null) {
                layoutParams = view2.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams) != null) {
                layoutParams3.height = 0;
                layoutParams3.weight = 1.0f;
                View view3 = playbookPolymerizationDialog.LLLIILIL;
                if (view3 != null) {
                    C786410Ut5.W5(view3, layoutParams3);
                }
            }
            RecyclerView recyclerView = playbookPolymerizationDialog.LLLIIIL;
            if (recyclerView != null) {
                layoutParams4 = recyclerView.getLayoutParams();
            }
            if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                layoutParams2.height = -2;
                layoutParams2.weight = 0.0f;
                RecyclerView recyclerView2 = playbookPolymerizationDialog.LLLIIIL;
                if (recyclerView2 != null) {
                    C786410Ut5.p6(recyclerView2, layoutParams2);
                }
            }
        } else {
            View view4 = this.LL.LLLIILIL;
            if (view4 != null) {
                C500260Jjc.LJLJLJ(view4, false);
            }
        }
        return Unit.LIZ;
    }
}
