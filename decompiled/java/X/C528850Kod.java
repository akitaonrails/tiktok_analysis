package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kod, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528850Kod {
    public final String LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C528850Kod)) {
            return false;
        }
        C528850Kod c528850Kod = (C528850Kod) obj;
        return Intrinsics.LJFF(this.LIZ, c528850Kod.LIZ) && Intrinsics.LJFF(this.LIZIZ, c528850Kod.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c528850Kod.LIZJ);
    }

    public C528850Kod(String str, String str2, Integer num) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = num;
    }
}
