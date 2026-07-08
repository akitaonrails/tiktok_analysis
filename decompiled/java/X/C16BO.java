package X;

import Y.ARunnableS131S0100000_31;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16BO, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16BO extends AbstractC20485115Dt {
    public final /* synthetic */ LiveBottomSheetDialog LIZ;

    public C16BO(LiveBottomSheetDialog liveBottomSheetDialog) {
        this.LIZ = liveBottomSheetDialog;
    }

    @Override // X.AbstractC20485115Dt
    public final void LIZ(float f) {
        this.LIZ.LJLIIIL();
    }

    @Override // X.AbstractC20485115Dt
    public final void LIZIZ(int i) {
        if (i == 5) {
            if (this.LIZ.getWindow() != null) {
                this.LIZ.getWindow().setWindowAnimations(R.style.ax);
                HandlerHook.viewPost(this.LIZ.getWindow().getDecorView(), new ARunnableS131S0100000_31(this, 174));
            } else {
                this.LIZ.cancel();
            }
        }
    }
}
