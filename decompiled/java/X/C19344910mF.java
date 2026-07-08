package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10mF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19344910mF extends C19344410mA {
    public final EnumC1990607qy LJJIIZ;
    public final int LJJIIZI;
    public C186X LJJIJ;
    public final boolean LJJIJIIJI;
    public final boolean LJJIJIIJIL;

    @Override // X.C19344810mE, X.C19345310mJ, X.C186V
    public final EnumC1990607qy LIZIZ() {
        return this.LJJIIZ;
    }

    @Override // X.C19344810mE, X.C19345310mJ, X.C186V
    public final int LIZLLL() {
        return this.LJJIIZI;
    }

    @Override // X.C19345310mJ, X.C186V
    public final boolean LJFF() {
        return this.LJJIJIIJI;
    }

    @Override // X.C19344810mE, X.C19345310mJ, X.C186V
    public final C186X LJIILL() {
        return this.LJJIJ;
    }

    @Override // X.C19345310mJ, X.C186V
    public final boolean LJIIZILJ() {
        return this.LJJIJIIJIL;
    }

    @Override // X.C19344810mE, X.C19345310mJ, X.C186V
    public final void LJIJ(C186X c186x) {
        this.LJJIJ = c186x;
    }

    public C19344910mF(C19345010mG c19345010mG, boolean z, int i) {
        EnumC1990607qy enumC1990607qy;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            enumC1990607qy = EnumC1990607qy.V3;
        } else {
            enumC1990607qy = null;
        }
        if ((i & 2) != 0) {
            i2 = R.attr.a04;
        } else {
            i2 = 0;
        }
        C19344510mB c19344510mB = (i & 4) != 0 ? new C19344510mB(0, 255) : c19345010mG;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = (i & 16) != 0 ? false : z;
        this.LJJIIZ = enumC1990607qy;
        this.LJJIIZI = i2;
        this.LJJIJ = c19344510mB;
        this.LJJIJIIJI = z2;
        this.LJJIJIIJIL = z;
    }
}
