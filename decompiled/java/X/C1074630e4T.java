package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e4T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074630e4T {
    public final C19EG LIZ;
    public final EnumC1074240e3q LIZIZ;
    public final C1074520e4I LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final Integer LJIIJ;
    public final Integer LJIIJJI;
    public final boolean LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final C1722300uv6 LJIILL;
    public final C1722300uv6 LJIILLIIL;
    public final ConcurrentHashMap<Pair<String, String>, Boolean> LJIIZILJ;

    public C1074630e4T() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074630e4T)) {
            return false;
        }
        C1074630e4T c1074630e4T = (C1074630e4T) obj;
        return Intrinsics.LJFF(this.LIZ, c1074630e4T.LIZ) && this.LIZIZ == c1074630e4T.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1074630e4T.LIZJ) && this.LIZLLL == c1074630e4T.LIZLLL && this.LJ == c1074630e4T.LJ && this.LJFF == c1074630e4T.LJFF && this.LJI == c1074630e4T.LJI && this.LJII == c1074630e4T.LJII && this.LJIIIIZZ == c1074630e4T.LJIIIIZZ && this.LJIIIZ == c1074630e4T.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1074630e4T.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1074630e4T.LJIIJJI) && this.LJIIL == c1074630e4T.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1074630e4T.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1074630e4T.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1074630e4T.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1074630e4T.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1074630e4T.LJIIZILJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        Integer num = this.LJIIJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJIIJJI;
        int iHashCode3 = (((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31;
        String str = this.LJIILIIL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIILJJIL;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C1722300uv6 c1722300uv6 = this.LJIILL;
        int iHashCode6 = (iHashCode5 + (c1722300uv6 == null ? 0 : c1722300uv6.hashCode())) * 31;
        C1722300uv6 c1722300uv62 = this.LJIILLIIL;
        return ((iHashCode6 + (c1722300uv62 != null ? c1722300uv62.hashCode() : 0)) * 31) + this.LJIIZILJ.hashCode();
    }

    public final String toString() {
        return "Config(context=" + this.LIZ + ", authApiScene=" + this.LIZIZ + ", trackInfo=" + this.LIZJ + ", useCache=" + this.LIZLLL + ", enableRefresh=" + this.LJ + ", sortRegisterUser=" + this.LJFF + ", shouldToppingIndexSection=" + this.LJI + ", shouldShowIndexView=" + this.LJII + ", shouldShowRegisterChunk=" + this.LJIIIIZZ + ", shouldShowUnregisterChunk=" + this.LJIIIZ + ", registerChunkTitle=" + this.LJIIJ + ", unregisterChunkTitle=" + this.LJIIJJI + ", isShowStatus=" + this.LJIIL + ", inviteUrl=" + this.LJIILIIL + ", inviteDesc=" + this.LJIILJJIL + ", emptyStatus=" + this.LJIILL + ", errorStatus=" + this.LJIILLIIL + ", shouldShowFollowsYouLabelMap=" + this.LJIIZILJ + ')';
    }

    public C1074630e4T(C19EG c19eg, EnumC1074240e3q enumC1074240e3q, C1074520e4I c1074520e4I, boolean z, boolean z2, boolean z3, boolean z4, Integer num, Integer num2, boolean z5, String str, String str2, int i) {
        boolean z6;
        boolean z7;
        ConcurrentHashMap<Pair<String, String>, Boolean> concurrentHashMap;
        boolean z8 = z;
        C1074520e4I c1074520e4I2 = c1074520e4I;
        boolean z9 = z3;
        boolean z10 = z2;
        Integer num3 = num;
        boolean z11 = z4;
        String str3 = str2;
        Integer num4 = num2;
        EnumC1074240e3q enumC1074240e3q2 = (i & 2) != 0 ? EnumC1074240e3q.UNKNOWN : enumC1074240e3q;
        c1074520e4I2 = (i & 4) != 0 ? new C1074520e4I(null, null, 31) : c1074520e4I2;
        if ((i & 8) != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if ((i & 16) != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        boolean z12 = (i & 32) != 0;
        z8 = (i & 64) != 0 ? true : z8;
        z10 = (i & 128) != 0 ? true : z10;
        z9 = (i & 256) != 0 ? true : z9;
        z11 = (i & 512) != 0 ? true : z11;
        num3 = (i & 1024) != 0 ? 2131834643 : num3;
        num4 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 2131834641 : num4;
        boolean z13 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z5 : true;
        String str4 = (i & 8192) == 0 ? str : null;
        str3 = (i & 16384) != 0 ? null : str3;
        if ((i & 131072) != 0) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = null;
        }
        this.LIZ = c19eg;
        this.LIZIZ = enumC1074240e3q2;
        this.LIZJ = c1074520e4I2;
        this.LIZLLL = z6;
        this.LJ = z7;
        this.LJFF = z12;
        this.LJI = z8;
        this.LJII = z10;
        this.LJIIIIZZ = z9;
        this.LJIIIZ = z11;
        this.LJIIJ = num3;
        this.LJIIJJI = num4;
        this.LJIIL = z13;
        this.LJIILIIL = str4;
        this.LJIILJJIL = str3;
        this.LJIILL = null;
        this.LJIILLIIL = null;
        this.LJIIZILJ = concurrentHashMap;
    }
}
