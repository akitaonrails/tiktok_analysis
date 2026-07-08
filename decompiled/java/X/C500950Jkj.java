package X;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jkj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500950Jkj implements InterfaceC1118490fDD {
    public final int LIZ;
    public boolean LIZIZ = true;

    @Override // X.InterfaceC1118490fDD
    public final void LIZLLL(Dialog dialog) {
    }

    @Override // X.InterfaceC1118490fDD
    public final int getLayoutId() {
        return this.LIZ;
    }

    public C500950Jkj(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC1118490fDD
    public final void LIZ(DialogFragment dialogFragment) {
        dialogFragment.setStyle(1, R.style.ahe);
    }

    @Override // X.InterfaceC1118490fDD
    public final void LIZIZ(Dialog dialog) {
        int i;
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.0f;
            float fLIZJ = C465640INu.LIZJ(C14KS.LJ(dialog.getContext()), window.getContext());
            if (fLIZJ <= 0.0f || fLIZJ > 375.0f) {
                fLIZJ = 375.0f;
            }
            attributes.width = (int) C497740JfY.LIZIZ(fLIZJ);
            attributes.height = -1;
            if (C497740JfY.LJJ()) {
                i = 3;
            } else {
                i = 5;
            }
            attributes.gravity = i;
            attributes.softInputMode = 0;
            window.setAttributes(attributes);
        }
    }

    @Override // X.InterfaceC1118490fDD
    public final void LIZJ(Dialog dialog) {
        dialog.setCanceledOnTouchOutside(this.LIZIZ);
    }

    @Override // X.InterfaceC1118490fDD
    public final void LJ(Dialog dialog) {
        dialog.requestWindowFeature(1);
    }
}
