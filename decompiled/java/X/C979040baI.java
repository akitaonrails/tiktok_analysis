package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0baI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C979040baI {
    public int LIZ = 1;
    public String LIZIZ = "";
    public String LIZJ = "";
    public boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C979040baI)) {
            return false;
        }
        C979040baI c979040baI = (C979040baI) obj;
        return this.LIZ == c979040baI.LIZ && Intrinsics.LJFF(this.LIZIZ, c979040baI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c979040baI.LIZJ) && this.LIZLLL == c979040baI.LIZLLL;
    }
}
