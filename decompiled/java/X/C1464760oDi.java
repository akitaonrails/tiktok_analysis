package X;

import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464760oDi {
    public static final /* synthetic */ int LJI = 0;
    public final UsageStatus LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;
    public final int LJ;
    public final String LJFF;

    public C1464760oDi() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464760oDi)) {
            return false;
        }
        C1464760oDi c1464760oDi = (C1464760oDi) obj;
        return this.LIZ == c1464760oDi.LIZ && this.LIZIZ == c1464760oDi.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1464760oDi.LIZJ) && this.LIZLLL == c1464760oDi.LIZLLL && this.LJ == c1464760oDi.LJ && Intrinsics.LJFF(this.LJFF, c1464760oDi.LJFF);
    }

    public final boolean LIZ() {
        return this.LIZ == UsageStatus.LOADING;
    }

    public /* synthetic */ C1464760oDi(int i) {
        this(UsageStatus.NOT_APPLY, 0, "", 0L, 0, "");
    }

    public C1464760oDi(UsageStatus usageStatus, int i, String str, long j, int i2, String str2) {
        this.LIZ = usageStatus;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = j;
        this.LJ = i2;
        this.LJFF = str2;
    }
}
