package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Zd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C903890Zd5 {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C903890Zd5)) {
            return false;
        }
        C903890Zd5 c903890Zd5 = (C903890Zd5) obj;
        return Intrinsics.LJFF(this.LIZ, c903890Zd5.LIZ) && this.LIZIZ == c903890Zd5.LIZIZ;
    }

    public C903890Zd5(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
