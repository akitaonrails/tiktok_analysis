package X;

import android.graphics.SurfaceTexture;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oSL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473830oSL {
    public final int LIZ;
    public final int LIZIZ;
    public final SurfaceTexture LIZJ;

    public C1473830oSL() {
        this(null, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1473830oSL)) {
            return false;
        }
        C1473830oSL c1473830oSL = (C1473830oSL) obj;
        return this.LIZ == c1473830oSL.LIZ && this.LIZIZ == c1473830oSL.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1473830oSL.LIZJ);
    }

    public C1473830oSL(SurfaceTexture surfaceTexture, int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = surfaceTexture;
    }
}
