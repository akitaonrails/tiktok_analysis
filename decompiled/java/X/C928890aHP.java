package X;

import Y.ACListenerS150S0100000_15;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aHP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928890aHP extends AbstractC960470b6L<C928240aGM> {
    public InterfaceC929300aI4 LL;
    public final DataChannel LLILLJJLI;
    public final C16F5 LLILLL;

    @Override // X.AbstractC960470b6L
    public final void LLIILZL() {
        this.LL = null;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        int i2;
        C16F5 c16f5 = this.LLILLL;
        if (C494680Jac.LJIILIIL()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        C786410Ut5.LLJJJJ(c16f5, i2);
        C786410Ut5.l8(this.LLILLL, new ACListenerS150S0100000_15(this, 269));
    }

    public C928890aHP(View view, InterfaceC929300aI4 interfaceC929300aI4, DataChannel dataChannel) {
        super(view);
        this.LL = interfaceC929300aI4;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = (C16F5) view.findViewById(R.id.cra);
    }
}
