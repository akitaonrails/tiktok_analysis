package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0Pis, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652680Pis extends AbstractC653010PjP {
    public final InterfaceC648350Pbt LIZLLL;
    public final View LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(442));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(441));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS554S0100000_10(this, 990));

    @Override // X.InterfaceC653060PjU
    public final void LIZ() {
    }

    @Override // X.AbstractC653010PjP
    public final int LIZIZ() {
        return ((Number) this.LJII.getValue()).intValue();
    }

    @Override // X.AbstractC653010PjP
    public final Rect LIZJ() {
        this.LJ.getLocationOnScreen((int[]) this.LJI.getValue());
        ((Rect) this.LJFF.getValue()).set(((int[]) this.LJI.getValue())[0], ((int[]) this.LJI.getValue())[1], ((int[]) this.LJI.getValue())[0] + this.LJ.getWidth(), ((int[]) this.LJI.getValue())[1] + this.LJ.getHeight());
        return (Rect) this.LJFF.getValue();
    }

    public C652680Pis(InterfaceC648350Pbt interfaceC648350Pbt, View view) {
        this.LIZLLL = interfaceC648350Pbt;
        this.LJ = view;
    }
}
