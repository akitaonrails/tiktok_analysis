package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: renamed from: X.16Fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20743216Fa extends AppCompatTextView implements InterfaceC1090410eTv {
    public C1090400eTu LLIZLLLIL;
    public int LLJ;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLJ++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLIZLLLIL == null) {
            this.LLIZLLLIL = new C1090400eTu();
        }
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C20743216Fa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C20743216Fa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
