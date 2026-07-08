package X;

import android.graphics.Typeface;
import com.bytedance.ies.xelement.input.LynxBaseInputView;
import com.lynx.base.log.LynxLog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.18nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21393618nu implements InterfaceC1301080jxi {
    public final WeakReference<LynxBaseInputView> LIZ;
    public final int LIZIZ;

    public C21393618nu(LynxBaseInputView lynxBaseInputView, int i) {
        this.LIZ = new WeakReference<>(lynxBaseInputView);
        this.LIZIZ = i;
    }

    @Override // X.InterfaceC1301080jxi
    public final void LIZIZ(Typeface typeface, int i) {
        LynxBaseInputView lynxBaseInputView = this.LIZ.get();
        if (lynxBaseInputView == null) {
            return;
        }
        LynxLog.i("LynxBaseInputView", "font-face is loaded successfully");
        int i2 = this.LIZIZ;
        if (i2 == 0) {
            C21397018oS c21397018oS = lynxBaseInputView.LL;
            if (c21397018oS == null) {
                c21397018oS = null;
            }
            c21397018oS.setTypeface(Typeface.create(typeface, i));
            return;
        }
        if (i2 != 1) {
            return;
        }
        lynxBaseInputView.LJJJJI();
    }
}
