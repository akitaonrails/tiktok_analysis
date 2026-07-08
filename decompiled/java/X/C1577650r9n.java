package X;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.series.feed.seriescenter.SeriesCenterFragment;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0r9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1577650r9n extends C1573000r2I {
    public final Fragment LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    public final float LIZLLL() {
        return ((Number) this.LJFF.getValue()).floatValue();
    }

    public final boolean LJ() {
        return ((Boolean) this.LJI.getValue()).booleanValue();
    }

    @Override // X.C1573000r2I, X.InterfaceC1574020r3w
    public final void onCreate() {
        Window window;
        View decorView;
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(MiniDramaPagePerformanceMonitor.LIZ(LIZJ()));
        Fragment fragment = this.LJ;
        C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), (C1561130qj9) this.LIZLLL.getValue(), C1561130qj9.class, "source_default_key");
        C723850SaN.LIZ(fragment, false, null, new AwS368S0200000_2(fragment, this, 138), 3);
        C19EG activity = this.LJ.getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setBackgroundColor(-16777216);
    }

    public C1577650r9n(SeriesCenterFragment seriesCenterFragment) {
        super(seriesCenterFragment);
        this.LJ = seriesCenterFragment;
        this.LJFF = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(438));
        this.LJI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1826));
    }

    public final void LJFF(boolean z) {
        Window window;
        View decorView;
        int i;
        Window window2;
        WindowInsetsController insetsController;
        if (Build.VERSION.SDK_INT >= 30) {
            C19EG activity = this.LJ.getActivity();
            if (activity != null && (window2 = activity.getWindow()) != null && (insetsController = window2.getInsetsController()) != null) {
                if (z) {
                    insetsController.setSystemBarsAppearance(8, 8);
                    return;
                } else {
                    insetsController.setSystemBarsAppearance(0, 8);
                    return;
                }
            }
            return;
        }
        C19EG activity2 = this.LJ.getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 8192;
        } else {
            i = systemUiVisibility & (-8193);
        }
        decorView.setSystemUiVisibility(i);
    }

    @Override // X.C1573000r2I, X.InterfaceC1574020r3w
    public final View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MiniDramaPagePerformanceMonitor.LIZJ(LIZJ()).LJIIL();
        return C786410Ut5.Td(layoutInflater, R.layout.f52, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    @Override // X.C1573000r2I, X.InterfaceC1574020r3w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1577650r9n.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
