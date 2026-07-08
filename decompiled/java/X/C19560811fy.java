package X;

import android.graphics.Bitmap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19560811fy {
    public final InterfaceC1447630nm5 LIZ;
    public C11SU<Pair<Integer, Bitmap>> LIZIZ = C11SU.LJLLLLLL();
    public boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final C01GW LJFF;

    public final C11SU LIZ() {
        if (!this.LIZJ) {
            ((C11NZ) this.LJFF.getValue()).LIZIZ(this.LIZIZ);
            this.LIZJ = true;
        }
        return this.LIZIZ;
    }

    public final void LIZIZ() {
        this.LIZ.reset();
        this.LIZJ = false;
        this.LIZIZ = C11SU.LJLLLLLL();
    }

    public C19560811fy(InterfaceC1447630nm5 interfaceC1447630nm5, int i, int i2, int i3) {
        this.LIZ = interfaceC1447630nm5;
        this.LIZLLL = i3;
        this.LJ = i;
        this.LJFF = C452501pT.LIZIZ(new C19560911fz(this, i, i2, i3));
    }
}
