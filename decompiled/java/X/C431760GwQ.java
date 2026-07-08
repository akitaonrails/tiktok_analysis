package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0GwQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C431760GwQ extends C1860130yVP implements InterfaceC431780GwS, InterfaceC685560Quo {
    public final C1860030yVF<C431760GwQ> LLJJJJLIIL;
    public C21419118s1 LLJJL;

    @Override // X.C1860130yVP, X.C1860100yVM, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJJJJLIIL.LIZ();
    }

    @Override // X.InterfaceC431780GwS
    public C1860030yVF<C431760GwQ> getMDWithOriginSelectHelper() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC685560Quo
    public C21419118s1 getShortAnswerConfig() {
        return this.LLJJL;
    }

    public void setOpenOriginSelect(boolean z) {
        C1860030yVF<C431760GwQ> mDWithOriginSelectHelper = getMDWithOriginSelectHelper();
        mDWithOriginSelectHelper.LIZIZ = z;
        mDWithOriginSelectHelper.LIZ();
    }

    @Override // X.InterfaceC685560Quo
    public void setShortAnswerConfig(C21419118s1 c21419118s1) {
        this.LLJJL = c21419118s1;
    }

    public C431760GwQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLJJJJLIIL = new C1860030yVF<>(this);
    }
}
