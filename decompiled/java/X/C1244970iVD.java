package X;

import Y.ACListenerS154S0100000_19;
import androidx.fragment.app.Fragment;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iVD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1244970iVD extends C19292910dr {
    public final Keva LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final C419910GdJ LLIZLLLIL;

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        C419910GdJ c419910GdJ = this.LLIZLLLIL;
        return new C19319810iC(this.LLILZIL.getBoolean("keva_is_hdr_off", false), this.LLILZLL, new ACListenerS154S0100000_19(this, 315), false, null, null, c419910GdJ, this.LLIZ, false, false, false, null, 129784);
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public C1244970iVD(Fragment fragment) {
        super(null);
        Keva repo = Keva.getRepo("keva_a11y_settings_unit");
        this.LLILZIL = repo;
        this.LLILZLL = fragment.getString(2131823148);
        this.LLIZ = fragment.getString(2131823147);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c419910GdJ.LIZ = R.raw.icon_sun_fill;
        this.LLIZLLLIL = c419910GdJ;
        repo.storeBoolean("keva_has_show_a11y_hdr_switch", true);
    }
}
