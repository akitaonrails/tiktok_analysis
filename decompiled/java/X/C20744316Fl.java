package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20744316Fl extends C21412118qt implements InterfaceC1090410eTv {
    public C1090400eTu LLILZIL;
    public int LLILZLL;

    @Override // X.InterfaceC1090410eTv
    public final void LLJL() {
        this.LLILZLL++;
    }

    @Override // X.InterfaceC1090410eTv
    public C1090400eTu getCacheHelper() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new C1090400eTu();
        }
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1090410eTv
    public int getCallCount() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1090410eTv
    public final void LLZZ(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1090380eTs.LIZ(this, layoutParams);
    }

    public C20744316Fl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C20744316Fl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.c8l);
    }
}
