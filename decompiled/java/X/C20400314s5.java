package X;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20400314s5 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20400314s5(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(1);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (bool.booleanValue()) {
            RecyclerView recyclerView = this.LL.LLLIIIL;
            if (recyclerView != null) {
                layoutParams3 = recyclerView.getLayoutParams();
            }
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams3) != null) {
                PlaybookPolymerizationDialog playbookPolymerizationDialog = this.LL;
                layoutParams2.height = -2;
                layoutParams2.weight = 0.0f;
                RecyclerView recyclerView2 = playbookPolymerizationDialog.LLLIIIL;
                if (recyclerView2 != null) {
                    C786410Ut5.p6(recyclerView2, layoutParams2);
                }
            }
        } else {
            RecyclerView recyclerView3 = this.LL.LLLIIIL;
            if (recyclerView3 != null) {
                layoutParams3 = recyclerView3.getLayoutParams();
            }
            if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
                PlaybookPolymerizationDialog playbookPolymerizationDialog2 = this.LL;
                layoutParams.height = 0;
                layoutParams.weight = 1.0f;
                RecyclerView recyclerView4 = playbookPolymerizationDialog2.LLLIIIL;
                if (recyclerView4 != null) {
                    C786410Ut5.p6(recyclerView4, layoutParams);
                }
            }
        }
        return Unit.LIZ;
    }
}
