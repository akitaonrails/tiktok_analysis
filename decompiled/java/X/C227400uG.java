package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C227400uG {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final String str, final String str2) {
        try {
            C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            c784440UpuLIZ.LIZIZ(new Object(str2, jCurrentTimeMillis, str) { // from class: X.00DH
                public final String LIZ;
                public final long LIZIZ;
                public final String LIZJ;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C00DH)) {
                        return false;
                    }
                    C00DH c00dh = (C00DH) obj;
                    return Intrinsics.LJFF(this.LIZ, c00dh.LIZ) && this.LIZIZ == c00dh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c00dh.LIZJ);
                }

                public final int hashCode() {
                    int iHashCode = ((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
                    String str3 = this.LIZJ;
                    return iHashCode + (str3 == null ? 0 : str3.hashCode());
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("StrategyDebugLogEvent(message=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(", timestamp=");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append(", tag=");
                    sbLIZ.append(this.LIZJ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LIZ = str2;
                    this.LIZIZ = jCurrentTimeMillis;
                    this.LIZJ = str;
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
