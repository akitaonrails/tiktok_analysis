package X;

import kotlin.jvm.internal.AwS116S0201000_35;
import kotlin.jvm.internal.AwS244S0300000_35;
import kotlin.jvm.internal.AwS85S0210000_35;

/* JADX INFO: renamed from: X.1D85, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D85 implements InterfaceC1431080nLO {
    public final int LIZ;
    public boolean LIZIZ;
    public final /* synthetic */ C1D82 LIZJ;

    @Override // X.InterfaceC1431080nLO
    public final int LIZLLL() {
        return this.LIZ;
    }

    public C1D85(C1D82 c1d82) {
        this.LIZJ = c1d82;
        this.LIZ = c1d82.LJ;
    }

    @Override // X.InterfaceC1431080nLO
    public final void LIZIZ(Object obj) {
        if (this.LIZIZ) {
            return;
        }
        this.LIZIZ = true;
        this.LIZJ.LIZLLL().LIZIZ(obj);
    }

    @Override // X.InterfaceC1431080nLO
    public final void LIZ(Object obj, EnumC2251001D8o enumC2251001D8o) {
        C2250851D7z c2250851D7z = this.LIZJ.LIZ;
        c2250851D7z.LIZLLL.LJFF(new AwS244S0300000_35(this, obj, enumC2251001D8o, 0));
    }

    @Override // X.InterfaceC1431080nLO
    public final void LIZJ(Object obj, boolean z) {
        C2250851D7z c2250851D7z = this.LIZJ.LIZ;
        c2250851D7z.LIZLLL.LJFF(new AwS85S0210000_35(this, obj, z, 0));
    }

    @Override // X.InterfaceC1431080nLO
    public final void LJ(int i, Throwable th) {
        C2250851D7z c2250851D7z = this.LIZJ.LIZ;
        c2250851D7z.LIZLLL.LJFF(new AwS116S0201000_35(this, th, i, 0));
    }
}
