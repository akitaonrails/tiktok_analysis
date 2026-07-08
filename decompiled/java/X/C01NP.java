package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01NP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01NP {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(ImageView imageView, Bitmap bitmap, Function1<? super Bitmap, Unit> function1) {
        if (!C01NR.LIZ()) {
            function1.invoke(null);
            return;
        }
        C01NQ c01nq = new C01NQ(System.currentTimeMillis(), function1);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C318301Lh(imageView, bitmap, c01nq, null), 3);
    }
}
