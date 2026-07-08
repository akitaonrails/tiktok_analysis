package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.16Fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20744216Fk extends C21411718qp implements InterfaceC1090410eTv {
    public C1090400eTu LLLIIL;
    public int LLLIILIL;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLLIILIL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLLIIL == null) {
            this.LLLIIL = new C1090400eTu();
        }
        return this.LLLIIL;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLLIILIL;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C20744216Fk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C20744216Fk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
