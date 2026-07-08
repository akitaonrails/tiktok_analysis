package X;

import Y.ARunnableS129S0100000_29;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12Fa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19724012Fa {
    public static final C1957407lc LIZJ(View view) {
        return new C1957407lc(new C1420905hH(view, null));
    }

    public static final Bitmap LIZ(View view, Bitmap.Config config) {
        if (view.isLaidOut()) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), config);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.translate(-view.getScrollX(), -view.getScrollY());
            view.draw(canvas);
            return bitmapCreateBitmap;
        }
        throw new IllegalStateException("View needs to be laid out before calling drawToBitmap()");
    }

    public static final void LIZLLL(long j, View view, Function0 function0) {
        view.postOnAnimationDelayed(new ARunnableS129S0100000_29(function0, 216), j);
    }
}
