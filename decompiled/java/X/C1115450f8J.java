package X;

import Y.ACListenerS120S0200000_17;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f8J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1115450f8J extends AbstractC1115470f8L<C1115500f8O> {
    public InterfaceC1115480f8M LL;

    public C1115450f8J(View view) {
        super(view);
        view.findViewById(R.id.gzv);
    }

    @Override // X.AbstractC1115470f8L
    public final void L5(C1115340f88 c1115340f88) {
        this.LL = c1115340f88;
    }

    @Override // X.AbstractC1115470f8L
    public final void I5(C1115500f8O c1115500f8O, int i) {
        C786410Ut5.I7(new ACListenerS120S0200000_17(c1115500f8O, this, 26), this.itemView);
    }
}
