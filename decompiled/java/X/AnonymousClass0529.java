package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0529, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0529 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0529) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0529) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public AnonymousClass0529(String str) {
        this.LIZ = str;
    }
}
