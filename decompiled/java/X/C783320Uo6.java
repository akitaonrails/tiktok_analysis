package X;

import Y.AcS495S0100000_12;
import com.bytedance.android.live.design.app.LiveDialog;

/* JADX INFO: renamed from: X.0Uo6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783320Uo6 extends AbstractC936750aU5 {
    public static final /* synthetic */ int LIZJ = 0;
    public final C783330Uo7 LIZIZ;

    @Override // X.AbstractC936750aU5, X.InterfaceC943940afg
    public final String tag() {
        return "MultiCoHostNonFriendCohostDialog";
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ.LIZ);
        c782110Um9.LJIIZILJ(2131851771);
        c782110Um9.LJII(2131851765);
        C773780UWy c773780UWy = new C773780UWy();
        C782200UmI c782200UmI = new C782200UmI();
        c782200UmI.LIZ(2131851763, this.LIZIZ.LIZ);
        c782200UmI.LIZJ = new AcS495S0100000_12(this, 83);
        c773780UWy.LIZ(new C0UQJ(c782200UmI));
        C782210UmJ c782210UmJ = new C782210UmJ();
        c782210UmJ.LIZ(2131843580, this.LIZIZ.LIZ);
        c782210UmJ.LIZJ = new AcS495S0100000_12(this, 84);
        c773780UWy.LIZ(new C0UQI(c782210UmJ));
        c782110Um9.LIZLLL(new C773790UWz(c773780UWy));
        c782110Um9.LJIILLIIL = false;
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LIZ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public C783320Uo6(C783330Uo7 c783330Uo7) {
        this.LIZIZ = c783330Uo7;
    }
}
