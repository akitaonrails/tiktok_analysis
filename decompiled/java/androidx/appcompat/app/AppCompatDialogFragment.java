package androidx.appcompat.app;

import X.C1389600mGU;
import X.C19GU;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class AppCompatDialogFragment extends GlobalHookDialogFragment {
    public static final String _pnsPageId = "KSsoOyA6LD1iKD8jKyohOS4nZiQ8OWESHELIOSODUPJiIjKTEIIC4/JyIKOy40JSAiPQ==";

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        C19GU c19gu = new C19GU(getContext(), getTheme());
        Window window = c19gu.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(c19gu);
        return c19gu;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C19GU) {
            C19GU c19gu = (C19GU) dialog;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            c19gu.LJJLL(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
