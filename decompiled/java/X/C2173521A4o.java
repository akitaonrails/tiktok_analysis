package X;

import android.content.Context;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.1A4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2173521A4o extends FrameLayout {
    public final C1749280vcc LL;
    public String LLILLJJLI;

    public C2173521A4o(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = "safe";
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f0x, this, true);
        this.LL = (C1749280vcc) findViewById(R.id.ylz);
    }

    public final void setCurrentStatus$search_release(String str) {
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setCurrentStatusView$search_release(InterfaceC2173531A4p interfaceC2173531A4p) {
        String str = this.LLILLJJLI;
        C1749280vcc c1749280vcc = null;
        switch (str.hashCode()) {
            case -1684858151:
                if (str.equals("protection")) {
                    C1749280vcc c1749280vcc2 = this.LL;
                    if (c1749280vcc2 != null) {
                        c1749280vcc = c1749280vcc2;
                    }
                    C1722300uv6 c1722300uv6 = new C1722300uv6();
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_large_protection;
                    c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
                    c1722300uv6.LIZJ = 0;
                    c1722300uv6.LIZIZ = c419910GdJ;
                    c1722300uv6.LJI = C20642515q3.LJI(2131847178);
                    c1722300uv6.LJIIIIZZ = C20642515q3.LJI(2131847177);
                    c1722300uv6.LJIIIZ = new AwS612S0100000_33(interfaceC2173531A4p, 144);
                    c1749280vcc.setStatus(c1722300uv6);
                }
                break;
            case -1380616235:
                if (str.equals("broken")) {
                    C1749280vcc c1749280vcc3 = this.LL;
                    if (c1749280vcc3 != null) {
                        c1749280vcc = c1749280vcc3;
                    }
                    C1722300uv6 c1722300uv62 = new C1722300uv6();
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_large_no_access;
                    c419910GdJ2.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
                    c1722300uv62.LIZJ = 0;
                    c1722300uv62.LIZIZ = c419910GdJ2;
                    c1722300uv62.LJI = C20642515q3.LJI(2131847171);
                    c1722300uv62.LJIIIIZZ = C20642515q3.LJI(2131847170);
                    c1722300uv62.LJIIIZ = new AwS612S0100000_33(interfaceC2173531A4p, 145);
                    c1749280vcc.setStatus(c1722300uv62);
                }
                break;
            case -1095865757:
                if (str.equals("not_secure")) {
                    C1749280vcc c1749280vcc4 = this.LL;
                    if (c1749280vcc4 != null) {
                        c1749280vcc = c1749280vcc4;
                    }
                    C1722300uv6 c1722300uv63 = new C1722300uv6();
                    C419910GdJ c419910GdJ3 = new C419910GdJ();
                    c419910GdJ3.LIZ = R.raw.search_landing_page_icon_unsafe_website;
                    c419910GdJ3.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
                    c1722300uv63.LIZJ = 0;
                    c1722300uv63.LIZIZ = c419910GdJ3;
                    c1722300uv63.LJI = C20642515q3.LJI(2131847176);
                    c1722300uv63.LJIIIIZZ = C20642515q3.LJI(2131847175);
                    c1722300uv63.LJIIIZ = new AwS612S0100000_33(interfaceC2173531A4p, 143);
                    c1749280vcc.setStatus(c1722300uv63);
                }
                break;
            case 226612223:
                if (str.equals("no_internet")) {
                    C1749280vcc c1749280vcc5 = this.LL;
                    if (c1749280vcc5 != null) {
                        c1749280vcc = c1749280vcc5;
                    }
                    C1722300uv6 c1722300uv64 = new C1722300uv6();
                    C419910GdJ c419910GdJ4 = new C419910GdJ();
                    c419910GdJ4.LIZ = R.raw.icon_large_refresh;
                    c419910GdJ4.LIZLLL = C1308910kAL.LIZJ(R.attr.a1p, getContext());
                    c1722300uv64.LIZJ = 0;
                    c1722300uv64.LIZIZ = c419910GdJ4;
                    c1722300uv64.LJI = C20642515q3.LJI(2131847167);
                    c1722300uv64.LJIIIIZZ = C20642515q3.LJI(2131847166);
                    c1722300uv64.LJIIIZ = new AwS612S0100000_33(interfaceC2173531A4p, 146);
                    c1749280vcc.setStatus(c1722300uv64);
                }
                break;
        }
    }
}
