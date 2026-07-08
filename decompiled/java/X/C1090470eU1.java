package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eU1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090470eU1 extends C1090460eU0 implements InterfaceC1090410eTv {
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
        super.callSuperSetLayoutParams(layoutParams);
    }

    @Override // X.C1090460eU0
    public final void callSuperSetLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C1090470eU1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
