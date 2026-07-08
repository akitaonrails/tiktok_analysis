package X;

import android.view.View;

/* JADX INFO: renamed from: X.06Uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1617406Uy extends AbstractC1397560mTK {
    public final View LIZLLL;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        return this.LIZLLL;
    }

    public C1617406Uy(View view) {
        super(view.getContext());
        this.LIZLLL = view;
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZJ(CharSequence charSequence) {
        throw new C1284660jXE("custom caption do not support set title/message");
    }

    @Override // X.AbstractC1397560mTK
    public final void LIZLLL(CharSequence charSequence) {
        throw new C1284660jXE("custom caption do not support set title/message");
    }
}
