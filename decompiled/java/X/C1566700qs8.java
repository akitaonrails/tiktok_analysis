package X;

import androidx.lifecycle.Observer;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0qs8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1566700qs8 extends AbstractC1566470qrl<C1566640qs2> implements Observer<String> {
    @Override // X.InterfaceC1566430qrh
    public final void LIZ() {
        C0CNO.LIZ(C15O7.LJI, new AwS568S0100000_24(this, 1834));
    }

    @Override // X.InterfaceC1566430qrh
    public final void destroy() {
        this.LL.clear();
        C1570230qxp.LIZ.removeObserver(this);
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        LIZJ(new AbstractC1566610qrz(str) { // from class: X.0qs2
            public final String LIZLLL;
            public final InterfaceC1566600qry LJ;

            @Override // X.AbstractC1566610qrz
            public final InterfaceC1566600qry LIZ() {
                return this.LJ;
            }

            @Override // X.AbstractC1566610qrz
            public final String LIZIZ() {
                return this.LIZLLL;
            }

            {
                super(str, false, null);
                this.LIZLLL = str;
                this.LJ = null;
            }
        });
    }
}
