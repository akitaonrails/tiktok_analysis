package X;

import android.view.View;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: renamed from: X.0OVG, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVG implements InterfaceC619970OTj {
    public final /* synthetic */ BaseBulletinBarAssem LIZ;

    @Override // X.InterfaceC619970OTj
    public final boolean isAvailable() {
        TuxNavBar tuxNavBar;
        if (!C0OMB.LIZ() || !this.LIZ.No().To()) {
            return false;
        }
        C0OP4.LIZ.getClass();
        return (!(C0OP4.LIZ().getBoolean("has_show_chat_bubble_tooltip", false) ^ true) || (tuxNavBar = this.LIZ.LLJIJIL) == null || tuxNavBar.LJII("bulletin_see_more_bar") == null) ? false : true;
    }

    public C0OVG(BaseBulletinBarAssem baseBulletinBarAssem) {
        this.LIZ = baseBulletinBarAssem;
    }

    @Override // X.InterfaceC619970OTj
    public final void q0(Function0<Unit> function0) {
        View viewLJII;
        TuxNavBar tuxNavBar = this.LIZ.LLJIJIL;
        if (tuxNavBar != null && (viewLJII = tuxNavBar.LJII("bulletin_see_more_bar")) != null) {
            String string = viewLJII.getContext().getString(2131827991);
            C450720Hlu c450720Hlu = new C450720Hlu(viewLJII.getContext());
            c450720Hlu.LLILZ = string;
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = viewLJII;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c1391600mJi.LJIIL = true;
            c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
            c450720Hlu.LLILLJJLI.LJFF = -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            c450720Hlu.LJ(AFwS195S0000000_9.get$arr$(679));
            c450720Hlu.LIZJ(new AwS588S0100000_9(function0, (Function0<Unit>) 689));
            c450720Hlu.LLILLJJLI.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            c450720Hlu.LIZIZ().show();
            return;
        }
        function0.invoke();
    }
}
