package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939680aYo {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C939680aYo)) {
            return false;
        }
        C939680aYo c939680aYo = (C939680aYo) obj;
        return this.LIZ == c939680aYo.LIZ && Intrinsics.LJFF(this.LIZIZ, c939680aYo.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c939680aYo.LIZJ);
    }

    public C939680aYo(long j, String str, String str2) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
