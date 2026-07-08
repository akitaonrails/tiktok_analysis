package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eVz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1091690eVz extends RelativeLayout implements InterfaceC1090410eTv {
    public C1090400eTu LL;
    public int LLILLJJLI;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLILLJJLI++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LL == null) {
            this.LL = new C1090400eTu();
        }
        return this.LL;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            return super.dispatchApplyWindowInsets(windowInsets);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            String strLIZIZ = C2450809j0.LIZIZ(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current view ids: ");
            sbLIZ.append(strLIZIZ);
            e.addSuppressed(new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            throw e;
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C1091690eVz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
