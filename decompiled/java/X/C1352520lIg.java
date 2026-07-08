package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352520lIg implements InterfaceC0148002o {
    public final EnumC1352510lIf LL;
    public final long LLILLJJLI;
    public final long LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final float[] LLIZ;
    public final float[] LLIZLLLIL;
    public final boolean LLJ;

    public C1352520lIg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1352520lIg)) {
            return false;
        }
        C1352520lIg c1352520lIg = (C1352520lIg) obj;
        return this.LL == c1352520lIg.LL && this.LLILLJJLI == c1352520lIg.LLILLJJLI && this.LLILLL == c1352520lIg.LLILLL && this.LLILZ == c1352520lIg.LLILZ && this.LLILZIL == c1352520lIg.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1352520lIg.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1352520lIg.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1352520lIg.LLIZLLLIL) && this.LLJ == c1352520lIg.LLJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        float[] fArr = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (fArr == null ? 0 : Arrays.hashCode(fArr))) * 31;
        float[] fArr2 = this.LLIZLLLIL;
        return ((iHashCode3 + (fArr2 != null ? Arrays.hashCode(fArr2) : 0)) * 31) + C786410Ut5.Z2(this.LLJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommentAudioRecordState(recordingState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", recordDurationMillis=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", maxDuration=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isCountdownActive=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", countdownSeconds=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", audioFilePath=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", waveformData=");
        sbLIZ.append(Arrays.toString(this.LLIZ));
        sbLIZ.append(", totalWaves=");
        sbLIZ.append(Arrays.toString(this.LLIZLLLIL));
        sbLIZ.append(", isPermissionGranted=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1352520lIg(int i) {
        this(EnumC1352510lIf.IDLE, 0L, 60000L, false, 0, null, null, null, false);
    }

    public C1352520lIg(EnumC1352510lIf enumC1352510lIf, long j, long j2, boolean z, int i, String str, float[] fArr, float[] fArr2, boolean z2) {
        this.LL = enumC1352510lIf;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = str;
        this.LLIZ = fArr;
        this.LLIZLLLIL = fArr2;
        this.LLJ = z2;
    }

    public static C1352520lIg LIZ(C1352520lIg c1352520lIg, EnumC1352510lIf enumC1352510lIf, long j, boolean z, int i, String str, float[] fArr, float[] fArr2, int i2) {
        long j2;
        boolean z2;
        String str2 = str;
        int i3 = i;
        boolean z3 = z;
        float[] fArr3 = fArr2;
        long j3 = j;
        float[] fArr4 = fArr;
        EnumC1352510lIf enumC1352510lIf2 = enumC1352510lIf;
        if ((i2 & 1) != 0) {
            enumC1352510lIf2 = c1352520lIg.LL;
        }
        if ((i2 & 2) != 0) {
            j3 = c1352520lIg.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            j2 = c1352520lIg.LLILLL;
        } else {
            j2 = 0;
        }
        if ((i2 & 8) != 0) {
            z3 = c1352520lIg.LLILZ;
        }
        if ((i2 & 16) != 0) {
            i3 = c1352520lIg.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            str2 = c1352520lIg.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            fArr4 = c1352520lIg.LLIZ;
        }
        if ((i2 & 128) != 0) {
            fArr3 = c1352520lIg.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            z2 = c1352520lIg.LLJ;
        } else {
            z2 = false;
        }
        c1352520lIg.getClass();
        return new C1352520lIg(enumC1352510lIf2, j3, j2, z3, i3, str2, fArr4, fArr3, z2);
    }
}
