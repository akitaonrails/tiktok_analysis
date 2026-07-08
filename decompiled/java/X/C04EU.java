package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04EU, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04EU {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C04EU)) {
            return false;
        }
        C04EU c04eu = (C04EU) obj;
        return Intrinsics.LJFF(this.LIZ, c04eu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c04eu.LIZIZ);
    }

    public C04EU(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
