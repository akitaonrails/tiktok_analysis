package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.16Fb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20743316Fb extends C21410318qb implements InterfaceC1090410eTv {
    public C1090400eTu LLIZ;
    public int LLIZLLLIL;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLIZLLLIL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLIZ == null) {
            this.LLIZ = new C1090400eTu();
        }
        return this.LLIZ;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C20743316Fb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C20743316Fb(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
