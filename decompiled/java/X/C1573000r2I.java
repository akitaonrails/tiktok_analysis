package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.series.feed.seriescenter.SeriesCenterFragment;
import com.ss.android.ugc.aweme.service.MiniDramaHostService;
import com.ss.android.ugc.aweme.util.MiniDramaPagePerformanceMonitor;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1573000r2I implements InterfaceC1574020r3w {
    public final Fragment LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C01GW LIZLLL;

    @Override // X.InterfaceC1574020r3w
    public final void onDestroy() {
    }

    public final EnumC1573550r3B LIZJ() {
        return Intrinsics.LJFF(this.LIZIZ, "series_discover") ? EnumC1573550r3B.SERIES_DISCOVER : EnumC1573550r3B.SERIES_CENTER;
    }

    @Override // X.InterfaceC1574020r3w
    public void onCreate() {
        MiniDramaPagePerformanceMonitor.PagePerformanceEvent.LJIIJJI(MiniDramaPagePerformanceMonitor.LIZ(LIZJ()));
        Fragment fragment = this.LIZ;
        C1554960qZC.LIZ(C1558360qeg.LJFF(fragment, null), (C1561130qj9) this.LIZLLL.getValue(), C1561130qj9.class, "source_default_key");
        C723850SaN.LIZ(fragment, false, null, new AwS390S0200000_24(fragment, this, 100), 3);
    }

    @Override // X.InterfaceC1574020r3w
    public final void LIZ() {
        C1574860r5I.LIZ();
    }

    public C1573000r2I(SeriesCenterFragment seriesCenterFragment) {
        String stringExtra;
        Intent intent;
        this.LIZ = seriesCenterFragment;
        Bundle arguments = seriesCenterFragment.getArguments();
        if (arguments == null || (stringExtra = arguments.getString("enter_from")) == null) {
            C19EG activity = seriesCenterFragment.getActivity();
            if (activity != null && (intent = activity.getIntent()) != null) {
                try {
                    stringExtra = intent.getStringExtra("enter_from");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (stringExtra == null) {
                    stringExtra = "";
                }
            } else {
                stringExtra = "";
            }
        }
        this.LIZIZ = stringExtra;
        String value = LIZJ().getValue();
        String string = UUID.randomUUID().toString();
        C1573010r2J.LIZ.put(value, string);
        this.LIZJ = string == null ? UUID.randomUUID().toString() : string;
        this.LIZLLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1824));
    }

    @Override // X.InterfaceC1574020r3w
    public View LIZIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        MiniDramaPagePerformanceMonitor.LIZJ(LIZJ()).LJIIL();
        return C786410Ut5.Td(layoutInflater, R.layout.f51, viewGroup, false);
    }

    @Override // X.InterfaceC1574020r3w
    public void onViewCreated(View view, Bundle bundle) {
        Bundle arguments;
        Context context;
        String string;
        Integer numLIZJ;
        C1573020r2K.LIZ(C12ES.LJIIJJI(view.getContext()), view);
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.ur7);
        if (tuxNavBar != null) {
            Bundle arguments2 = this.LIZ.getArguments();
            if (arguments2 == null || arguments2.getBoolean("series_center_back_action", true)) {
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
                c1251150ifB.LIZLLL = true;
                c1251150ifB.LIZJ(new AwS568S0100000_24(this, 1825));
                tuxNavBar.LIZIZ(c1251150ifB);
            }
            tuxNavBar.LJIIZILJ(false);
            Bundle arguments3 = this.LIZ.getArguments();
            if ((arguments3 == null || (string = arguments3.getString("series_center_title")) == null) && ((context = tuxNavBar.getContext()) == null || (string = context.getString(2131836537)) == null)) {
                string = "";
            }
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = string;
            tuxNavBar.LJIJJ(c1250250idj);
            Context context2 = tuxNavBar.getContext();
            if (context2 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2)) != null) {
                tuxNavBar.setNavBackground(numLIZJ.intValue());
            }
        } else {
            tuxNavBar = null;
        }
        View viewFindViewById = view.findViewById(R.id.ur4);
        if (viewFindViewById != null && (arguments = this.LIZ.getArguments()) != null && arguments.getBoolean("series_center_enable_search_banner", false)) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            if (tuxNavBar != null) {
                C786410Ut5.LJLLLLLL(8, tuxNavBar);
            }
            C786410Ut5.I7(new AbstractViewOnClickListenerC1165700gRM() { // from class: X.0r3E
                @Override // X.AbstractViewOnClickListenerC1165700gRM
                public final void LIZ(View view2) {
                    Aweme awemeLJ;
                    if (view2 != null) {
                        MiniDramaHostService.LIZ.getClass();
                        MiniDramaHostService miniDramaHostServiceLIZ = C1573890r3j.LIZ();
                        if (miniDramaHostServiceLIZ != null) {
                            Context context3 = view2.getContext();
                            MiniDramaHostService miniDramaHostServiceLIZ2 = C1573890r3j.LIZ();
                            if (miniDramaHostServiceLIZ2 != null) {
                                awemeLJ = miniDramaHostServiceLIZ2.LJ();
                            } else {
                                awemeLJ = null;
                            }
                            miniDramaHostServiceLIZ.LIZJ(context3, awemeLJ);
                        }
                    }
                }
            }, viewFindViewById);
        }
    }
}
