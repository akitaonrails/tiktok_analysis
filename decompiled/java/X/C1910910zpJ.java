package X;

import Y.ARunnableS97S0200000_28;
import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zpJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("creation_photoMode_templates_applyTitle")
public final class C1910910zpJ extends AbstractC20660115st<Dialog> {
    public final Function0<Unit> LL;
    public final BPEAHandler LLILLJJLI;
    public Dialog LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public final Dialog LJIIL(Context context) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131829970);
        C985403tE.LIZ(c1397580mTM, new AwS607S0100000_28(this, 351));
        Dialog dialogLJ = new C1397510mTF(c1397580mTM).LJ();
        this.LLILLL = dialogLJ;
        return dialogLJ;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        this.LLILLJJLI.removeCallbacksAndMessages(null);
        Dialog dialog = this.LLILLL;
        if (dialog == null) {
            return LJIIL(c688120Qyw.LIZ);
        }
        return dialog;
    }

    public C1910910zpJ(InterfaceC20658015sY interfaceC20658015sY, AwS423S0200000_22 awS423S0200000_22) {
        super(interfaceC20658015sY);
        this.LL = awS423S0200000_22;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LLILLJJLI = bPEAHandler;
        C786410Ut5.LJLIIL(500L, bPEAHandler, new ARunnableS97S0200000_28(this, interfaceC20658015sY, 38));
    }
}
