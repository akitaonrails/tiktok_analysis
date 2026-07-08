package X;

import Y.ACListenerS120S0200000_17;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115430f8H extends AbstractC1115470f8L {
    public final TextView LL;
    public InterfaceC1115480f8M LLILLJJLI;

    public C1115430f8H(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.unicode_emoji);
    }

    @Override // X.AbstractC1115470f8L
    public final void L5(C1115340f88 c1115340f88) {
        this.LLILLJJLI = c1115340f88;
    }

    @Override // X.AbstractC1115470f8L
    public final void I5(C1115500f8O c1115500f8O, int i) {
        if (!C2093608Ic.LJ(c1115500f8O.previewEmoji)) {
            this.LL.setText(c1115500f8O.previewEmoji);
        }
        C786410Ut5.I7(new ACListenerS120S0200000_17(c1115500f8O, this, 29), this.itemView);
    }
}
