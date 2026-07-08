package X;

import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iXL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("lpp_move_tooltip")
public final class C1246290iXL extends C10GR {
    public final C19EG LL;
    public final View LLILLJJLI;
    public final String LLILLL;
    public C0P0T LLILZ;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 4000;
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return !((Keva) C1246300iXM.LIZ.getValue()).getBoolean(Intrinsics.LJFF(this.LLILLL, "homepage_hot") ? "share_tooltip_shown" : "share_tooltip_shown_others", false);
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        Context contextLIZ;
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (contextLIZ = C1388190mED.LIZ(activityLIZIZ)) == null) {
            contextLIZ = this.LL;
        }
        if (contextLIZ instanceof C19EG) {
            return new C688120Qyw(contextLIZ, (LifecycleOwner) contextLIZ, null);
        }
        return null;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        String str;
        C450720Hlu c450720Hlu = new C450720Hlu(c688120Qyw.LIZ);
        c450720Hlu.LLILLJJLI.LIZIZ = this.LLILLJJLI;
        c450720Hlu.LIZLLL();
        c450720Hlu.LLILLJJLI.LIZLLL = EnumC1235690iGF.START;
        c450720Hlu.LJIIJ(2131836853);
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LJII = 3000L;
        c1391600mJi.LJIJJ = true;
        c1391600mJi.LJIJJLI = false;
        c450720Hlu.LIZJ(new AwS598S0100000_19(c20656615sK, 884));
        c450720Hlu.LJIIIZ(true, new ACListenerS154S0100000_19(this, 299));
        C0P0T c0p0tLIZIZ = c450720Hlu.LIZIZ();
        this.LLILZ = c0p0tLIZIZ;
        c0p0tLIZIZ.show();
        if (Intrinsics.LJFF(this.LLILLL, "homepage_hot")) {
            str = "share_tooltip_shown";
        } else {
            str = "share_tooltip_shown_others";
        }
        ((Keva) C1246300iXM.LIZ.getValue()).storeBoolean(str, true);
    }

    public C1246290iXL(View view, C19EG c19eg, String str) {
        this.LL = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = str;
    }
}
