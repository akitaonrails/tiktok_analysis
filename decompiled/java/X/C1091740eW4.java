package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0eW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1091740eW4 extends LinearLayout implements InterfaceC1090410eTv, InterfaceC519340KYi {
    public C1090400eTu LL;
    public C1091750eW5 LLILLJJLI;
    public int LLILLL;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLILLL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LL == null) {
            this.LL = new C1090400eTu();
        }
        return this.LL;
    }

    public C1091750eW5 getWindowFocusAwareHelper() {
        if (this.LLILLJJLI == null) {
            this.LLILLJJLI = new C1091750eW5();
        }
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLILLL;
    }

    public C1091740eW4(Context context) {
        super(context);
    }

    @Override // X.InterfaceC519340KYi
    public final void LIZ(InterfaceC519350KYj interfaceC519350KYj) {
        getWindowFocusAwareHelper().LIZ(interfaceC519350KYj);
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
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C1091750eW5 c1091750eW5 = this.LLILLJJLI;
        if (c1091750eW5 != null && (!c1091750eW5.LL.isEmpty())) {
            Iterator<InterfaceC519350KYj> it2 = c1091750eW5.LL.iterator();
            while (it2.hasNext()) {
                it2.next().onWindowFocusChanged(z);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C1091740eW4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1091740eW4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
