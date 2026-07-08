package X;

import android.content.Context;
import android.util.DisplayMetrics;

/* JADX INFO: renamed from: X.0H4j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435110H4j extends C21674119s3 {
    public final InterfaceC435120H4k LJIILL;

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJ() {
        this.LJIILL.onStart();
    }

    @Override // X.C21674119s3, X.AbstractC21674019s2
    public final void LJFF() {
        super.LJFF();
        this.LJIILL.onStop();
    }

    @Override // X.C21674119s3
    public final float LJIIJJI(DisplayMetrics displayMetrics) {
        return (25.0f / displayMetrics.densityDpi) * 10;
    }

    public C435110H4j(Context context, InterfaceC435120H4k interfaceC435120H4k) {
        super(context);
        this.LJIILL = interfaceC435120H4k;
    }
}
