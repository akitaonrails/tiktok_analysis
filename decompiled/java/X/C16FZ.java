package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.16FZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16FZ extends C1235900iGa implements InterfaceC1090410eTv {
    public int LLILLL;
    public C1090400eTu LLILZ;
    public int LLILZIL;

    public C16FZ() {
        throw null;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLILZIL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLILZ == null) {
            this.LLILZ = new C1090400eTu();
        }
        return this.LLILZ;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    @Override // X.C1235900iGa, android.view.View
    public void setVisibility(int i) {
        if (getContext() != null) {
            super.setVisibility(i);
            this.LLILLL = i;
        }
    }

    public C16FZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.LLLIZZ(this, getVisibility());
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view != this) {
            if (i != 0) {
                super.setVisibility(8);
            } else {
                super.setVisibility(this.LLILLL);
            }
        }
    }
}
