package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RrM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708900RrM {
    public final boolean LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C708900RrM)) {
            return false;
        }
        C708900RrM c708900RrM = (C708900RrM) obj;
        return this.LIZ == c708900RrM.LIZ && Intrinsics.LJFF(this.LIZIZ, c708900RrM.LIZIZ);
    }

    public C708900RrM(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
