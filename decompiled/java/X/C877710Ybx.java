package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Ybx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877710Ybx extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;
    public final C01GW LLJILJIL;

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        C866530Xz1 c866530Xz1 = this.LLILZLL;
        C914150Ztd c914150Ztd = new C914150Ztd(this, 14);
        c866530Xz1.getClass();
        if (C293390Bej.LIZ()) {
            C054G c054g = c866530Xz1.LJ;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ.LLIILII(), null, new C866100XyK(c914150Ztd, null, c866530Xz1), 2);
        } else {
            c866530Xz1.LJIJI().LLD(c914150Ztd);
        }
        AbstractC880120Yfq.LJFF(this, "unread", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        C878950Ydx c878950Ydx;
        if (!C19212010Ec.LIZJ.LIZLLL()) {
            return true;
        }
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        FilterTabType filterTabType = null;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            filterTabType = c878950Ydx.LLILLL;
        }
        return filterTabType == FilterTabType.SPAM || this.LLJIJIL || ((Boolean) this.LLJILJIL.getValue()).booleanValue() || AbstractC880120Yfq.LJII(this.LLILZ);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C877710Ybx(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        boolean z;
        super(activity, c879540Yeu, c878950Ydx);
        this.LLJ = 2131830290;
        this.LLJI = R.raw.icon_message_unread;
        C0Y8T c0y8t = this.LLILZ;
        if (c0y8t != null && c0y8t.getUnreadCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LLJIJIL = z;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1479));
    }
}
