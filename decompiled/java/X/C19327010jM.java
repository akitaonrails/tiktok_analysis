package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10jM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19327010jM extends FrameLayout {
    public final C1749280vcc LL;
    public String LLILLJJLI;

    public C19327010jM(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = "safe";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.drj, this, true);
        this.LL = (C1749280vcc) findViewById(R.id.ylz);
    }

    public final void setCurrentStatus$anchor_business_release(String str) {
        this.LLILLJJLI = str;
    }

    public final void setCurrentStatusView$anchor_business_release(InterfaceC19326810jK interfaceC19326810jK) {
        String str = this.LLILLJJLI;
        int iHashCode = str.hashCode();
        C1749280vcc c1749280vcc = null;
        if (iHashCode != -1684858151) {
            if (iHashCode != -1095865757) {
                if (iHashCode == 226612223 && str.equals("no_internet")) {
                    C1749280vcc c1749280vcc2 = this.LL;
                    if (c1749280vcc2 != null) {
                        c1749280vcc = c1749280vcc2;
                    }
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_large_refresh;
                    c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
                    c1722300uv6.LIZJ = 0;
                    c1722300uv6.LIZIZ = c419910GdJ;
                    c1722300uv6.LJI = C20642515q3.LJI(R.string.m25);
                    c1722300uv6.LJIIIIZZ = C20642515q3.LJI(R.string.jb4);
                    c1722300uv6.LJIIIZ = new AwS607S0100000_28(interfaceC19326810jK, 323);
                    c1749280vcc.setStatus(c1722300uv6);
                    return;
                }
                return;
            }
            if (!str.equals("not_secure")) {
                return;
            }
            C1749280vcc c1749280vcc3 = this.LL;
            if (c1749280vcc3 != null) {
                c1749280vcc = c1749280vcc3;
            }
            C1722300uv6 c1722300uv62 = new C1722300uv6();
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.music_landing_page_icon_unsafe_website;
            c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
            c1722300uv62.LIZJ = 0;
            c1722300uv62.LIZIZ = c419910GdJ2;
            c1722300uv62.LJI = C20642515q3.LJI(2131850235);
            c1722300uv62.LJIIIIZZ = C20642515q3.LJI(2131850234);
            c1722300uv62.LJIIIZ = new AwS607S0100000_28(interfaceC19326810jK, 321);
            c1749280vcc.setStatus(c1722300uv62);
            return;
        }
        if (!str.equals("protection")) {
            return;
        }
        C1749280vcc c1749280vcc4 = this.LL;
        if (c1749280vcc4 != null) {
            c1749280vcc = c1749280vcc4;
        }
        C1722300uv6 c1722300uv63 = new C1722300uv6();
        C419910GdJ c419910GdJ3 = new C419910GdJ();
        c419910GdJ3.LIZ = R.raw.icon_large_protection;
        c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
        c1722300uv63.LIZJ = 0;
        c1722300uv63.LIZIZ = c419910GdJ3;
        c1722300uv63.LJI = C20642515q3.LJI(2131850240);
        c1722300uv63.LJIIIIZZ = C20642515q3.LJI(2131850239);
        c1722300uv63.LJIIIZ = new AwS607S0100000_28(interfaceC19326810jK, 322);
        c1749280vcc.setStatus(c1722300uv63);
    }
}
