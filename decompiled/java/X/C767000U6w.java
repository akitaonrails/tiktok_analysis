package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0U6w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767000U6w {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C767000U6w)) {
            return false;
        }
        C767000U6w c767000U6w = (C767000U6w) obj;
        return Intrinsics.LJFF(this.LIZ, c767000U6w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c767000U6w.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c767000U6w.LIZJ) && this.LIZLLL == c767000U6w.LIZLLL;
    }

    public C767000U6w(String str, String str2, String str3, int i) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C767000U6w(String str, String str2, String str3, int i, int i2) {
        int i3;
        str3 = (i & 4) != 0 ? "" : str3;
        if ((i & 8) != 0) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        this(str, str2, str3, i3);
    }
}
