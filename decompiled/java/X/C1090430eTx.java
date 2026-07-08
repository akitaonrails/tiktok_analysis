package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0eTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090430eTx extends C1090450eTz implements InterfaceC1090410eTv {
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

    @Override // X.C1090450eTz, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C1090430eTx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
