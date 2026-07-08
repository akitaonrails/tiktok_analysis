package X;

import Y.AcS496S0100000_15;
import com.bytedance.android.live.design.app.LiveDialog;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0b91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C962130b91 extends AbstractC936750aU5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C962120b90 LIZIZ;

    static {
        new C962110b8z();
    }

    @Override // X.AbstractC936750aU5, X.InterfaceC943940afg
    public final String tag() {
        return "MultiCoHostPrivateAccountDialog";
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        C962120b90 c962120b90 = this.LIZIZ;
        boolean z = c962120b90.LIZIZ == EnumC960290b63.QUICK_PAIR_INFORMATIVE;
        C782110Um9 c782110Um9 = new C782110Um9(c962120b90.LIZ);
        c782110Um9.LJIIZILJ(this.LIZIZ.LIZIZ.getTitleResId());
        c782110Um9.LJII(this.LIZIZ.LIZIZ.getContentResId());
        c782110Um9.LJIILLIIL = false;
        if (z) {
            C773780UWy c773780UWy = new C773780UWy();
            C782200UmI c782200UmI = new C782200UmI();
            C962120b90 c962120b902 = this.LIZIZ;
            c782200UmI.LIZ(c962120b902.LIZIZ.getPositiveResId(), c962120b902.LIZ);
            c782200UmI.LIZJ = new AcS496S0100000_15(this, 71);
            c773780UWy.LIZ(new C0UQJ(c782200UmI));
            c782110Um9.LIZLLL(new C773790UWz(c773780UWy));
        } else {
            c782110Um9.LJFF(R.drawable.dpv);
            c782110Um9.LJIILIIL(this.LIZIZ.LIZIZ.getPositiveResId(), new AcS496S0100000_15(this, 72));
            c782110Um9.LJIIJ(2131842656, new AcS496S0100000_15(this, 73));
        }
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LIZ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public C962130b91(C962120b90 c962120b90) {
        this.LIZIZ = c962120b90;
    }
}
