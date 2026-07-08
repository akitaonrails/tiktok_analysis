package X;

import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MOJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOJ implements C0MOK {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final C01GW LIZJ;

    public C0MOJ() {
        this(false, false, 3);
    }

    @Override // X.C0MOK
    public final C443120HZe<Integer, Integer, Integer> LIZ(Bitmap bitmap) {
        if (C0H1Y.LIZ(bitmap) && !this.LIZ) {
            return ((C0MOK) this.LIZJ.getValue()).LIZ(bitmap);
        }
        return new C443120HZe<>(-16777216, -16777216, -16777216);
    }

    @Override // X.C0MOK
    public final Pair<Integer, Integer> LIZIZ(Bitmap bitmap) {
        if (C0H1Y.LIZ(bitmap) && !this.LIZ) {
            return ((C0MOK) this.LIZJ.getValue()).LIZIZ(bitmap);
        }
        return new Pair<>(-16777216, -16777216);
    }

    public C0MOJ(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1062));
    }
}
