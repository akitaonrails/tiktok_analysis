package X;

import android.view.View;
import android.widget.Magnifier;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yVh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860310yVh extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1860270yVd LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860310yVh(C1860270yVd c1860270yVd) {
        super(0);
        this.LL = c1860270yVd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1860270yVd c1860270yVd = this.LL;
        View view = c1860270yVd.LIZ;
        if (view != null) {
            Magnifier.Builder builder = new Magnifier.Builder(view);
            C1860320yVi c1860320yVi = c1860270yVd.LIZIZ;
            Magnifier.Builder initialZoom = builder.setSize(c1860320yVi.LIZ, c1860320yVi.LIZIZ).setInitialZoom(c1860270yVd.LIZIZ.LIZJ);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.uk);
            c384050F3z.LIZJ = Float.valueOf(c1860270yVd.LIZIZ.LJFF);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d))));
            c384050F3z.LJFF = Integer.valueOf(c1860270yVd.LIZIZ.LIZLLL);
            c1860270yVd.LIZJ = initialZoom.setOverlay(c384050F3z.LIZ(view.getContext())).setElevation(c1860270yVd.LIZIZ.LJ).setCornerRadius(c1860270yVd.LIZIZ.LJFF).setClippingEnabled(c1860270yVd.LIZIZ.LJI).build();
        }
        return Unit.LIZ;
    }
}
