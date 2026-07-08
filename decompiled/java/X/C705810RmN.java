package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0RmN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705810RmN extends C705800RmM implements InterfaceC695290RPb {
    public final /* synthetic */ C705870RmT LLILZLL;

    @Override // X.InterfaceC695290RPb
    public void setOnPerfListener(InterfaceC705840RmQ interfaceC705840RmQ) {
        this.LLILZLL.setOnPerfListener(interfaceC705840RmQ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZLL.LIZIZ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZLL.LIZJ();
    }

    public C705810RmN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C705870RmT c705870RmT = new C705870RmT();
        this.LLILZLL = c705870RmT;
        if (C715260S3w.LIZIZ()) {
            c705870RmT.LL = this;
        }
    }
}
