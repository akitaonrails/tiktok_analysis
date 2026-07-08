package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05aD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1377105aD {
    public final Bitmap LIZ;
    public final C05ZL LIZIZ = C1691250u71.LIZ(1.0f);
    public final C05P0 LIZJ = C20028913Yh.LJI(new C1378605aS(0));
    public final C05P0 LIZLLL = C20028913Yh.LJI(new C1682900ttY(0));
    public final C05P0 LJ = C20028913Yh.LJI(C1683130ttv.LJ);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1377105aD) && Intrinsics.LJFF(this.LIZ, ((C1377105aD) obj).LIZ);
    }

    public final C1683130ttv LIZ() {
        return (C1683130ttv) this.LJ.getValue();
    }

    public final long LIZIZ() {
        return ((C1378605aS) this.LIZJ.getValue()).LIZ;
    }

    public final long LIZJ() {
        return ((C1682900ttY) this.LIZLLL.getValue()).LIZ;
    }

    public C1377105aD(Bitmap bitmap) {
        this.LIZ = bitmap;
    }
}
