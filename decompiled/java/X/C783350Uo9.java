package X;

import Y.AcS495S0100000_12;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS139S0201000_15;

/* JADX INFO: renamed from: X.0Uo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C783350Uo9 extends AbstractC936750aU5 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Context LIZIZ;
    public final Function0<Unit> LIZJ;

    @Override // X.AbstractC936750aU5, X.InterfaceC943940afg
    public final String tag() {
        return "MultiCoHostLiveVisibilityDialog";
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ);
        c782110Um9.LJIIZILJ(2131851770);
        c782110Um9.LJII(2131851767);
        C773780UWy c773780UWy = new C773780UWy();
        C782200UmI c782200UmI = new C782200UmI();
        c782200UmI.LIZ(2131842050, this.LIZIZ);
        c782200UmI.LIZJ = new AcS495S0100000_12(this, 82);
        c773780UWy.LIZ(new C0UQJ(c782200UmI));
        c782110Um9.LIZLLL(new C773790UWz(c773780UWy));
        c782110Um9.LJIILLIIL = false;
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LIZ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public C783350Uo9(C19EG c19eg, AwS139S0201000_15 awS139S0201000_15) {
        this.LIZIZ = c19eg;
        this.LIZJ = awS139S0201000_15;
    }
}
