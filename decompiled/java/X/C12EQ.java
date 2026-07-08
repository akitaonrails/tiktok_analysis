package X;

import Y.ARunnableS98S0200000_29;
import android.app.Dialog;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.12EQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@InterfaceC20647615qs("creation_live_photo_preset_toast")
public final class C12EQ extends AbstractC20660115st<Dialog> {
    public final Function0<Unit> LL;
    public final BPEAHandler LLILLJJLI;
    public Dialog LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    public final Dialog LJIIL(Context context) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZ(2131821453);
        C985403tE.LIZ(c1397580mTM, new AwS608S0100000_29(this, 806));
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

    public C12EQ(ImageEditRootScene imageEditRootScene, AwS566S0100000_22 awS566S0100000_22) {
        super(imageEditRootScene);
        this.LL = awS566S0100000_22;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        this.LLILLJJLI = bPEAHandler;
        C786410Ut5.LJLIIL(500L, bPEAHandler, new ARunnableS98S0200000_29(this, imageEditRootScene, 73));
    }
}
