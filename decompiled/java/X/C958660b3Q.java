package X;

import Y.AcS496S0100000_15;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0b3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958660b3Q extends AbstractC936750aU5 {
    public static final /* synthetic */ int LJ = 0;
    public final Context LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;

    static {
        new C958650b3P();
    }

    @Override // X.AbstractC936750aU5, X.InterfaceC943940afg
    public final String tag() {
        return "MultiCoHostSubscribersOnlyLiveDialog";
    }

    @Override // X.InterfaceC943940afg
    public final void show() {
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZIZ);
        c782110Um9.LJIIZILJ(2131844206);
        c782110Um9.LJII(2131856673);
        c782110Um9.LJIILIIL(2131844204, new AcS496S0100000_15(this, 74));
        c782110Um9.LJIIJ(2131844203, new AcS496S0100000_15(this, 75));
        c782110Um9.LJIILLIIL = false;
        LiveDialog liveDialogLIZ = c782110Um9.LIZ();
        this.LIZ = liveDialogLIZ;
        C786410Ut5.B4(liveDialogLIZ);
    }

    public C958660b3Q(Context context, Function0 function0, Function0 function02) {
        this.LIZIZ = context;
        this.LIZJ = function0;
        this.LIZLLL = function02;
    }
}
