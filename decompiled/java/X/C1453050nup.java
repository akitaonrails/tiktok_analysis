package X;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nup, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453050nup {
    public final boolean LIZIZ;
    public final int LIZLLL;
    public final Drawable LIZ = null;
    public final boolean LIZJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1453050nup)) {
            return false;
        }
        C1453050nup c1453050nup = (C1453050nup) obj;
        return Intrinsics.LJFF(this.LIZ, c1453050nup.LIZ) && this.LIZIZ == c1453050nup.LIZIZ && this.LIZJ == c1453050nup.LIZJ && this.LIZLLL == c1453050nup.LIZLLL;
    }

    public C1453050nup(boolean z, int i) {
        this.LIZIZ = z;
        this.LIZLLL = i;
    }
}
