package X;

import Y.ARunnableS81S0200000_12;
import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0TTK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("creation_photoMode_templates_limited")
public final class C0TTK extends AbstractC20660115st<Dialog> {
    public final BPEAHandler LL;
    public Dialog LLILLJJLI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public C0TTK(InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LL = bPEAHandler;
        C786410Ut5.LJLIIL(500L, bPEAHandler, new ARunnableS81S0200000_12(interfaceC20658015sY, this, 144));
    }

    public final Dialog LJIIL(Context context) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131829973);
        C985403tE.LIZ(c1397580mTM, AFwS245S0000000_12.get$arr$(231));
        Dialog dialogLJ = new C1397510mTF(c1397580mTM).LJ();
        this.LLILLJJLI = dialogLJ;
        return dialogLJ;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        this.LL.removeCallbacksAndMessages(null);
        Dialog dialog = this.LLILLJJLI;
        if (dialog == null) {
            return LJIIL(c688120Qyw.LIZ);
        }
        return dialog;
    }
}
