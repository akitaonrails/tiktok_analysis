package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0mJP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1391410mJP extends AbstractC1391440mJS {
    public String LIZLLL;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        C0I7D c0i7d = new C0I7D(this.LIZ, null, 6, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C426750GoL.LJIIL(c0i7d, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), 16);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = Integer.valueOf(this.LIZIZ.LJJIFFI);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c0i7d.setBackground(c384050F3z.LIZ(c0i7d.getContext()));
        layoutParams.gravity = 17;
        c0i7d.setHint(this.LIZLLL);
        C786410Ut5.P6(c0i7d, layoutParams);
        return c0i7d;
    }

    public C1391410mJP(Context context) {
        super(context);
        this.LIZLLL = "";
    }

    @Override // X.AbstractC1397490mTD
    public final void LIZ(C1397510mTF c1397510mTF) {
        this.LIZJ = c1397510mTF;
    }
}
