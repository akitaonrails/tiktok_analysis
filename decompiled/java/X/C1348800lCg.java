package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0lCg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348800lCg {
    public final View LIZ;
    public InterfaceC1349110lDB LIZIZ;

    public C1348800lCg(View view) {
        this.LIZ = view;
    }

    public final void LIZ(int i) {
        int iLIZ;
        C786410Ut5.LJLLLLLL(i, this.LIZ);
        InterfaceC1349110lDB interfaceC1349110lDB = this.LIZIZ;
        if (interfaceC1349110lDB != null) {
            KeyboardDialogFragment keyboardDialogFragment = ((C1348980lCy) interfaceC1349110lDB).LIZ;
            if (i == 0) {
                if (keyboardDialogFragment.LLLLLLLLLL && keyboardDialogFragment.LLLILZJ) {
                    if (keyboardDialogFragment.LLZL != null) {
                        LinearLayout linearLayout = keyboardDialogFragment.LLJJJJ;
                        if (keyboardDialogFragment.LLLLLLL) {
                            int iLIZJ = C1349270lDR.LJI;
                            if (iLIZJ <= 0) {
                                iLIZJ = C1349270lDR.LIZJ(true);
                            }
                            C1351950lHl.LJIJI(iLIZJ, linearLayout);
                            return;
                        }
                        Resources resources = linearLayout.getResources();
                        if (resources != null) {
                            iLIZ = (int) resources.getDimension(R.dimen.x2);
                        } else {
                            iLIZ = C1349270lDR.LIZ();
                        }
                        C1351950lHl.LJIJI(iLIZ, linearLayout);
                        return;
                    }
                    int i2 = keyboardDialogFragment.LLLLLLLLL;
                    if (i2 <= 0) {
                        return;
                    }
                    C1351950lHl.LJIJI(i2, keyboardDialogFragment.LLJJJJ);
                    return;
                }
                return;
            }
            keyboardDialogFragment.getClass();
        }
    }
}
