package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.01kk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC423201kk extends AbstractDialogC972150bPB {
    public final boolean LLJI;
    public View LLJIJIL;

    public abstract void LJL();

    @Override // X.AbstractDialogC972150bPB, android.app.Dialog
    public void onCreate(Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        LJL();
        if (this.LLJI) {
            View view = this.LLJIJIL;
            if (view != null) {
                layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = (int) (((double) C497740JfY.LJIILLIIL()) * 0.6d);
                }
            } else {
                layoutParams = null;
            }
            View view2 = this.LLJIJIL;
            if (view2 != null) {
                C786410Ut5.W5(view2, layoutParams);
            }
        }
    }

    public AbstractDialogC423201kk(Context context, boolean z) {
        super(context);
        this.LLJI = z;
    }
}
