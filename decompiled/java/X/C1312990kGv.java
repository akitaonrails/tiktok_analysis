package X;

import android.view.View;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.view.AndroidView;

/* JADX INFO: renamed from: X.0kGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1312990kGv {
    public final InterfaceC1313020kGy LIZ;
    public boolean LIZIZ = true;
    public boolean LIZJ;
    public final double LIZLLL;
    public final int LJ;
    public final double LJFF;

    public final int LIZ(View view) {
        double left;
        int i;
        if (view instanceof AndroidView) {
            AndroidView androidView = (AndroidView) view;
            if (androidView.getDrawChildHook() instanceof LynxBaseUI) {
                LynxBaseUI lynxBaseUI = (LynxBaseUI) androidView.getDrawChildHook();
                if (this.LIZIZ) {
                    left = ((double) lynxBaseUI.getTop()) - (((double) (((C1313000kGw) this.LIZ).LIZ.mView.getHeight() - lynxBaseUI.getHeight())) * this.LIZLLL);
                    i = this.LJ;
                } else {
                    left = ((double) lynxBaseUI.getLeft()) - (((double) (((C1313000kGw) this.LIZ).LIZ.mView.getWidth() - lynxBaseUI.getWidth())) * this.LIZLLL);
                    i = this.LJ;
                }
                return (int) (left + ((double) i));
            }
        }
        throw new RuntimeException("A list-item is not an AndroidView, some thing went wrong");
    }

    public C1312990kGv(double d, int i, double d2, C1313000kGw c1313000kGw) {
        this.LIZLLL = -1.0d;
        this.LIZLLL = d;
        this.LJ = i;
        this.LJFF = d2;
        this.LIZ = c1313000kGw;
    }
}
