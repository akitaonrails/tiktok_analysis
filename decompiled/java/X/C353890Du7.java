package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Du7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C353890Du7 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final boolean LIZ;
    public final String LIZIZ;
    public final Integer LIZJ;

    static {
        new C353880Du6();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C353890Du7)) {
            return false;
        }
        C353890Du7 c353890Du7 = (C353890Du7) obj;
        return this.LIZ == c353890Du7.LIZ && Intrinsics.LJFF(this.LIZIZ, c353890Du7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c353890Du7.LIZJ);
    }

    public C353890Du7(Integer num, String str, boolean z) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = num;
    }
}
