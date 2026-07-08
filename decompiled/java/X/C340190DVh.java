package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0DVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340190DVh extends AbstractC1391830mK5 {
    public final Drawable LJ;

    @Override // X.AbstractC1397490mTD
    public final View LIZIZ() {
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (C1397510mTF.LLJJIJIIJIL != 0) {
            frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        } else {
            frameLayout.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)));
        }
        C786410Ut5.a6(frameLayout, layoutParams);
        frameLayout.setBackground(new ColorDrawable(this.LIZLLL));
        ImageView imageView = new ImageView(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
        layoutParams2.gravity = 17;
        C786410Ut5.c6(imageView, layoutParams2);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setAdjustViewBounds(true);
        imageView.setImageDrawable(this.LJ);
        frameLayout.addView(imageView);
        return frameLayout;
    }

    public C340190DVh(int i, Context context, Drawable drawable) {
        super(context, i);
        this.LJ = drawable;
    }

    public C340190DVh(int i, int i2, Context context, Integer num) {
        super(context, i2);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = num;
        this.LJ = c419910GdJ.LIZ(context);
    }

    public /* synthetic */ C340190DVh(Context context, int i, Integer num, int i2) {
        this(i, 0, context, (i2 & 4) != 0 ? null : num);
    }
}
