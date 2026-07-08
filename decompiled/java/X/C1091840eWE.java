package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eWE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1091840eWE extends View implements InterfaceC1090410eTv {
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

    public C1091840eWE(Context context) {
        super(context);
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C1091840eWE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C1091840eWE(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public C1091840eWE(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
