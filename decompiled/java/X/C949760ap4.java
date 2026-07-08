package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.settings.MultiGuestApplyRouteSimplifySetting;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ap4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949760ap4 extends AbstractC926260aDA {
    public final long LIZ;
    public final long LIZIZ;
    public final C926050aCp LIZJ;
    public final boolean LIZLLL;
    public final Integer LJ;
    public final Integer LJFF;
    public final boolean LJI;
    public final int LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;
    public final String LJIILIIL;
    public final long LJIILJJIL;
    public final boolean LJIILL;
    public final C949780ap6 LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C949760ap4)) {
            return false;
        }
        C949760ap4 c949760ap4 = (C949760ap4) obj;
        return this.LIZ == c949760ap4.LIZ && this.LIZIZ == c949760ap4.LIZIZ && Intrinsics.LJFF(this.LIZJ, c949760ap4.LIZJ) && this.LIZLLL == c949760ap4.LIZLLL && Intrinsics.LJFF(this.LJ, c949760ap4.LJ) && Intrinsics.LJFF(this.LJFF, c949760ap4.LJFF) && this.LJI == c949760ap4.LJI && this.LJII == c949760ap4.LJII && this.LJIIIIZZ == c949760ap4.LJIIIIZZ && this.LJIIIZ == c949760ap4.LJIIIZ && this.LJIIJ == c949760ap4.LJIIJ && this.LJIIJJI == c949760ap4.LJIIJJI && this.LJIIL == c949760ap4.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c949760ap4.LJIILIIL) && this.LJIILJJIL == c949760ap4.LJIILJJIL && this.LJIILL == c949760ap4.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c949760ap4.LJIILLIIL);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31;
        C926050aCp c926050aCp = this.LIZJ;
        int iHashCode = (((iY2 + (c926050aCp == null ? 0 : c926050aCp.hashCode())) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJFF;
        int iHashCode3 = (((((((((((((((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + this.LJII) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + this.LJIIJ) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL) * 31;
        String str = this.LJIILIIL;
        return ((((((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + this.LJIILLIIL.hashCode();
    }

    public final String toString() {
        return "AgreeLinkMic(linkType=" + this.LIZ + ", anchorId=" + this.LIZIZ + ", enterCtx=" + this.LIZJ + ", useApplyDirectUpAbility=" + this.LIZLLL + ", shareRevenueSetting=" + this.LJ + ", shareRevenueSettingRatio=" + this.LJFF + ", followAnchor=" + this.LJI + ", inviterRole=" + this.LJII + ", inviterUserId=" + this.LJIIIIZZ + ", strategy=" + this.LJIIIZ + ", position=" + this.LJIIJ + ", applyingGuide=" + this.LJIIJJI + ", source=" + this.LJIIL + ", originRequestParam=" + this.LJIILIIL + ", joinGameSessionId=" + this.LJIILJJIL + ", lineupResumeLink=" + this.LJIILL + ", legacyHints=" + this.LJIILLIIL + ')';
    }

    public C949760ap4(long j, long j2, C926050aCp c926050aCp, Integer num, Integer num2, boolean z, int i, long j3, int i2, boolean z2, int i3, String str, long j4, boolean z3, C949780ap6 c949780ap6, int i4) {
        boolean zEnable;
        Integer num3 = num;
        C949780ap6 c949780ap62 = c949780ap6;
        long j5 = j4;
        String str2 = str;
        int i5 = i3;
        boolean z4 = z2;
        long j6 = j3;
        int i6 = i;
        boolean z5 = z;
        int i7 = i2;
        boolean z6 = z3;
        Integer num4 = num2;
        if ((i4 & 8) != 0) {
            zEnable = MultiGuestApplyRouteSimplifySetting.INSTANCE.enable();
        } else {
            zEnable = false;
        }
        num3 = (i4 & 16) != 0 ? null : num3;
        num4 = (i4 & 32) != 0 ? null : num4;
        z5 = (i4 & 64) != 0 ? false : z5;
        i6 = (i4 & 128) != 0 ? 0 : i6;
        j6 = (i4 & 256) != 0 ? 0L : j6;
        i7 = (i4 & 1024) != 0 ? -1 : i7;
        z4 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? false : z4;
        i5 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 2 : i5;
        str2 = (i4 & 8192) != 0 ? null : str2;
        j5 = (i4 & 16384) != 0 ? 0L : j5;
        z6 = (32768 & i4) != 0 ? false : z6;
        c949780ap62 = (i4 & 65536) != 0 ? new C949780ap6(null, false, null, false, false, 31) : c949780ap62;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c926050aCp;
        this.LIZLLL = zEnable;
        this.LJ = num3;
        this.LJFF = num4;
        this.LJI = z5;
        this.LJII = i6;
        this.LJIIIIZZ = j6;
        this.LJIIIZ = 0;
        this.LJIIJ = i7;
        this.LJIIJJI = z4;
        this.LJIIL = i5;
        this.LJIILIIL = str2;
        this.LJIILJJIL = j5;
        this.LJIILL = z6;
        this.LJIILLIIL = c949780ap62;
    }
}
