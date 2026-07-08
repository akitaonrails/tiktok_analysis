package X;

import com.lynx.tasm.behavior.ui.LynxBaseUI;

/* JADX INFO: renamed from: X.0kKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1315320kKg extends C1315350kKj {
    public float LIZJ;
    public final float LIZLLL;
    public final String LJ;
    public final LynxBaseUI LJFF;

    @Override // X.C1315350kKj, X.InterfaceC1315360kKk
    public final float LIZIZ() {
        return -(this.LIZLLL + this.LIZJ);
    }

    @Override // X.C1315350kKj, X.InterfaceC1315360kKk
    public final float LIZJ() {
        return this.LIZIZ - (this.LIZLLL + this.LIZJ);
    }

    public C1315320kKg(int i, int i2, int i3, String str, LynxBaseUI lynxBaseUI) {
        super(i, i2);
        this.LJ = str;
        this.LIZLLL = i3;
        this.LJFF = lynxBaseUI;
    }
}
