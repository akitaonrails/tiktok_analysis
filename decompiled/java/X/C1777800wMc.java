package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777800wMc {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1777800wMc) && Intrinsics.LJFF(this.LIZ, ((C1777800wMc) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1777800wMc(String str) {
        this.LIZ = str;
    }
}
