package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mfJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1404990mfJ {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1404990mfJ)) {
            return false;
        }
        C1404990mfJ c1404990mfJ = (C1404990mfJ) obj;
        return Intrinsics.LJFF(this.LIZ, c1404990mfJ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1404990mfJ.LIZIZ);
    }

    public C1404990mfJ(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
