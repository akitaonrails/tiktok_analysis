package X;

import Y.ACListenerS122S0200000_19;
import android.content.Context;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0ik6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("profile_edit_bottom_banner")
public final class C1254200ik6 extends AbstractC20660815t0 {
    public final Fragment LL;
    public final C20515215Pi LLILLJJLI;
    public final C1254180ik4 LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return true;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public final void LJIIL(String str) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("action", str);
        c0lab.LJ("scene_type", this.LLILZIL);
        if (this.LLILZLL) {
            c0lab.LJ("show_reason", "post");
        }
        C20684815ws.LJIILLIIL("profile_update_intro_banner_click", c0lab.LIZ);
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C419910GdJ c419910GdJ;
        Context context = this.LL.getContext();
        if (context == null || (c419910GdJ = (C419910GdJ) this.LLIZLLLIL.getValue()) == null) {
            return;
        }
        C20515215Pi c20515215Pi = this.LLILLJJLI;
        c20515215Pi.LJFF(c419910GdJ);
        String str = (String) this.LLJ.getValue();
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LJFF = str;
        c1057450dcl.LJIIJ = 0;
        String str2 = (String) this.LLJI.getValue();
        C1057450dcl c1057450dcl2 = c20515215Pi.LIZ;
        c1057450dcl2.LJI = str2;
        c1057450dcl2.LJIIJJI = new ACListenerS122S0200000_19(this, context, 67);
        c1057450dcl2.LJIILIIL = new ACListenerS122S0200000_19(this, context, 68);
        c20515215Pi.LIZ.LJIILJJIL = new AwS385S0200000_19(this, c20656615sK, 127);
        c20515215Pi.LJ();
    }

    public C1254200ik6(C0TGX c0tgx, Fragment fragment, C20515215Pi c20515215Pi, C1254180ik4 c1254180ik4, String str, String str2, boolean z) {
        super(c0tgx);
        this.LL = fragment;
        this.LLILLJJLI = c20515215Pi;
        this.LLILLL = c1254180ik4;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
        this.LLIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3182));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3186));
        this.LLJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3184));
        this.LLJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3183));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 3185));
    }
}
