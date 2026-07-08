package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Dc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C806603Dc {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C806603Dc) && Intrinsics.LJFF(this.LIZ, ((C806603Dc) obj).LIZ);
    }

    public C806603Dc(String str) {
        this.LIZ = str;
    }
}
