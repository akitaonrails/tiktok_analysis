package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tgU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674800tgU {
    public final C1668880tWw LIZ;
    public final int LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674800tgU)) {
            return false;
        }
        C1674800tgU c1674800tgU = (C1674800tgU) obj;
        return Intrinsics.LJFF(this.LIZ, c1674800tgU.LIZ) && this.LIZIZ == c1674800tgU.LIZIZ && Float.compare(this.LIZJ, c1674800tgU.LIZJ) == 0 && this.LIZLLL == c1674800tgU.LIZLLL;
    }

    public /* synthetic */ C1674800tgU(C1668880tWw c1668880tWw, int i) {
        this(c1668880tWw, i, 24.0f, 0);
    }

    public C1674800tgU(C1668880tWw c1668880tWw, int i, float f, int i2) {
        this.LIZ = c1668880tWw;
        this.LIZIZ = i;
        this.LIZJ = f;
        this.LIZLLL = i2;
    }
}
