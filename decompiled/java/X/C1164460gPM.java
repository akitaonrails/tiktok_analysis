package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164460gPM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1164460gPM() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164460gPM)) {
            return false;
        }
        C1164460gPM c1164460gPM = (C1164460gPM) obj;
        return Intrinsics.LJFF(this.LIZ, c1164460gPM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1164460gPM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1164460gPM.LIZJ);
    }

    public C1164460gPM(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
