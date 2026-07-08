package X;

import android.os.Build;
import android.view.View;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860270yVd {
    public final View LIZ;
    public final C1860320yVi LIZIZ;
    public Magnifier LIZJ;

    public C1860270yVd(View view, C1860320yVi c1860320yVi) {
        this.LIZ = view;
        this.LIZIZ = c1860320yVi;
        C1860310yVh c1860310yVh = new C1860310yVh(this);
        if (Build.VERSION.SDK_INT >= 29) {
            C13MK.LIZLLL(new AwS571S0100000_27(c1860310yVh, (Function0<Unit>) 1110));
        }
    }
}
