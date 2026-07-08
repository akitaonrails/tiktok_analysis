package X;

import Y.ARunnableS126S0100000_26;
import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0vw8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1761380vw8 extends C09AY implements Function0<C1761390vw9> {
    public final /* synthetic */ DialogC1761330vw3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1761380vw8(DialogC1761330vw3 dialogC1761330vw3) {
        super(0);
        this.LL = dialogC1761330vw3;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0vw9] */
    @Override // kotlin.jvm.functions.Function0
    public final C1761390vw9 invoke() {
        final DialogC1761330vw3 dialogC1761330vw3 = this.LL;
        return new Activity.ScreenCaptureCallback() { // from class: X.0vw9
            @Override // android.app.Activity.ScreenCaptureCallback
            public final void onScreenCaptured() {
                if (dialogC1761330vw3.LJJZ()) {
                    return;
                }
                DialogC1761330vw3 dialogC1761330vw32 = dialogC1761330vw3;
                if (dialogC1761330vw32.LLJJI) {
                    return;
                }
                InterfaceC1761410vwB interfaceC1761410vwB = dialogC1761330vw32.LLJILJIL;
                if (interfaceC1761410vwB != null) {
                    interfaceC1761410vwB.onScreenCaptured();
                }
                DialogC1761330vw3 dialogC1761330vw33 = dialogC1761330vw3;
                dialogC1761330vw33.LLJJI = true;
                C786410Ut5.LJLIIL(1000L, dialogC1761330vw33.LLJJ, new ARunnableS126S0100000_26(dialogC1761330vw33, 96));
            }
        };
    }
}
