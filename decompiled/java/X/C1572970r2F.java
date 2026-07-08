package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.series.feed.seriescenter.SeriesCenterFragment;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0r2F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572970r2F implements InterfaceC1574020r3w {
    public final Fragment LIZ;
    public final String LIZIZ = UUID.randomUUID().toString();
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1822));

    @Override // X.InterfaceC1574020r3w
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1574020r3w
    public final void onCreate() {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(MiniDramaPagePerformanceMonitor.LIZ(EnumC1573550r3B.SERIES_CENTER));
        Fragment fragment = this.LIZ;
        C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), (C1559190qg1) this.LIZJ.getValue(), C1559190qg1.class, "source_default_key");
        C723850SaN.LIZ(fragment, false, null, new AwS390S0200000_24(fragment, this, 99), 3);
    }

    @Override // X.InterfaceC1574020r3w
    public final void LIZ() {
        C1574860r5I.LIZ();
    }

    public C1572970r2F(SeriesCenterFragment seriesCenterFragment) {
        this.LIZ = seriesCenterFragment;
    }

    @Override // X.InterfaceC1574020r3w
    public final View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MiniDramaPagePerformanceMonitor.LIZJ(EnumC1573550r3B.SERIES_CENTER).LJIIL();
        return C786410Ut5.Td(layoutInflater, R.layout.f53, viewGroup, false);
    }

    @Override // X.InterfaceC1574020r3w
    public final void onViewCreated(View view, Bundle bundle) {
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.odi);
        if (tuxNavBar != null) {
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
            c1251150ifB.LIZLLL = true;
            c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1823));
            tuxNavBar.LIZIZ(c1251150ifB);
            tuxNavBar.LJIIZILJ(false);
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = view.getResources().getString(2131839419);
            tuxNavBar.LJIJJ(c1250250idj);
        }
    }
}
