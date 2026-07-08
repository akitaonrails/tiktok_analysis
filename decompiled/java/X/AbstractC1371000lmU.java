package X;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0lmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1371000lmU extends AbstractC1376120luk {
    public final InterfaceC1369790lkX LL;

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public boolean LIZJ() {
        return this.LL.LIZJ();
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final float LJJL() {
        return this.LL.LJJL();
    }

    @Override // X.InterfaceC1369790lkX
    public final String key() {
        return this.LL.key();
    }

    @Override // X.InterfaceC1369790lkX
    public final String label() {
        return this.LL.label();
    }

    public AbstractC1371000lmU(InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LL = interfaceC1369790lkX;
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final boolean LJIIZILJ(Context context) {
        return this.LL.LJIIZILJ(context);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
        return this.LL.LJIILLIIL(context, abstractC1375550ltp);
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final void LJIJI(C424540Gkm c424540Gkm, boolean z) {
        this.LL.LJIJI(c424540Gkm, z);
    }

    @Override // X.InterfaceC1369790lkX
    public final Drawable LJJII(Context context, boolean z) {
        return this.LL.LJJII(context, z);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
        return this.LL.LJIIL(c1371420lnA, context, c0m7y);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
        return this.LL.LJIJ(c1374270lrl, context, c0m7y);
    }

    @Override // X.AbstractC1376120luk, X.InterfaceC1369790lkX
    public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
        return this.LL.LJJIFFI(c1371430lnB, context, c0m7y);
    }

    @Override // X.InterfaceC1369790lkX
    public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
        return this.LL.LJJJIL(c1375540lto, context, c0m7y);
    }
}
