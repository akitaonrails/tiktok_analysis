package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.0DVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340160DVe extends AbstractC1391830mK5 {
    public final View LJ;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        frameLayout.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
        frameLayout.addView(this.LJ);
        return frameLayout;
    }

    public C340160DVe(Context context, View view) {
        super(context, 0);
        this.LJ = view;
    }
}
