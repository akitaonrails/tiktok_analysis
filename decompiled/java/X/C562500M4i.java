package X;

import Y.ACListenerS143S0100000_8;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0M4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562500M4i extends AbstractC562050M2p<C561950M2f> {
    public final InterfaceC562520M4k LL;
    public final C1390410mHn LLILLJJLI;
    public final TextView LLILLL;
    public final RelativeLayout LLILZ;

    public C562500M4i(View view, C0M1G c0m1g) {
        super(view);
        this.LL = c0m1g;
        this.LLILLJJLI = (C1390410mHn) view.findViewById(R.id.w2g);
        this.LLILLL = (TextView) view.findViewById(R.id.zvx);
        this.LLILZ = (RelativeLayout) view.findViewById(R.id.tom);
    }

    @Override // X.AbstractC562050M2p
    public final void I5(C561950M2f c561950M2f, int i) {
        if (!(c561950M2f instanceof C0M0T)) {
            return;
        }
        int i2 = ((C0M0T) c561950M2f).LJ;
        if (i2 != 0) {
            if (i2 == 1) {
                C786410Ut5.LLLZZIL(this.LLILLJJLI, 8);
                this.LLILLJJLI.LIZLLL();
                C786410Ut5.LLIL(this.LLILLL, 0);
            }
        } else {
            C786410Ut5.LLIL(this.LLILLL, 8);
            C786410Ut5.LLLZZIL(this.LLILLJJLI, 0);
            this.LLILLJJLI.LIZJ();
        }
        C786410Ut5.S7(this.LLILZ, new ACListenerS143S0100000_8(this, 115));
    }
}
