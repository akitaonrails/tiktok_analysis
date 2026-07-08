package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C929760aIo {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C929760aIo)) {
            return false;
        }
        C929760aIo c929760aIo = (C929760aIo) obj;
        return this.LIZ == c929760aIo.LIZ && Intrinsics.LJFF(this.LIZIZ, c929760aIo.LIZIZ) && this.LIZJ == c929760aIo.LIZJ && this.LIZLLL == c929760aIo.LIZLLL;
    }

    public C929760aIo(int i, String str, boolean z, boolean z2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
