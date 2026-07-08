package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1744380vUi {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1744380vUi)) {
            return false;
        }
        C1744380vUi c1744380vUi = (C1744380vUi) obj;
        return Intrinsics.LJFF(this.LIZ, c1744380vUi.LIZ) && this.LIZIZ == c1744380vUi.LIZIZ;
    }

    public C1744380vUi(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
