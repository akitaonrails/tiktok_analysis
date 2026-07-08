package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191700h7I {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Function1<PoiReviewsApi.PoiReviewModel, Integer> LJ;
    public final boolean LJFF;
    public final Function0<String> LJI;
    public final Function0<String> LJII;
    public final Function1<PoiReviewsApi.PoiReviewModel, Integer> LJIIIIZZ;
    public final Function1<InterfaceC1191840h7W, InterfaceC665370Q7z> LJIIIZ;
    public final Function0<String> LJIIJ;
    public final boolean LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;

    public C1191700h7I() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191700h7I)) {
            return false;
        }
        C1191700h7I c1191700h7I = (C1191700h7I) obj;
        return this.LIZ == c1191700h7I.LIZ && this.LIZIZ == c1191700h7I.LIZIZ && this.LIZJ == c1191700h7I.LIZJ && this.LIZLLL == c1191700h7I.LIZLLL && Intrinsics.LJFF(this.LJ, c1191700h7I.LJ) && this.LJFF == c1191700h7I.LJFF && Intrinsics.LJFF(this.LJI, c1191700h7I.LJI) && Intrinsics.LJFF(this.LJII, c1191700h7I.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1191700h7I.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1191700h7I.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1191700h7I.LJIIJ) && this.LJIIJJI == c1191700h7I.LJIIJJI && this.LJIIL == c1191700h7I.LJIIL && this.LJIILIIL == c1191700h7I.LJIILIIL;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public final String toString() {
        return "LikeConfig(likeContainerId=" + this.LIZ + ", likeIconId=" + this.LIZIZ + ", likeCountId=" + this.LIZJ + ", animateIconId=" + this.LIZLLL + ", isTopProvider=" + this.LJ + ", useNewPosition=" + this.LJFF + ", enterMethodProvider=" + this.LJI + ", sectionProvider=" + this.LJII + ", reviewStatusProvider=" + this.LJIIIIZZ + ", vScopeProvider=" + this.LJIIIZ + ", loginEnterSourceProvider=" + this.LJIIJ + ", useCellUxOptColors=" + this.LJIIJJI + ", hideLikeCountWhenZero=" + this.LJIIL + ", forceThumbsUpIcon=" + this.LJIILIIL + ')';
    }

    public C1191700h7I(int i, int i2, int i3, Function1 function1, boolean z, AFwS206S0000000_18 aFwS206S0000000_18, AFwS256S0000000_18 aFwS256S0000000_18, AFwS256S0000000_18 aFwS256S0000000_182, AFwS206S0000000_18 aFwS206S0000000_182, boolean z2, boolean z3, int i4) {
        AFwS206S0000000_18 aFwS206S0000000_183;
        boolean z4;
        aFwS206S0000000_18 = (i4 & 64) != 0 ? AFwS206S0000000_18.get$arr$(728) : aFwS206S0000000_18;
        if ((i4 & 128) != 0) {
            aFwS206S0000000_183 = AFwS206S0000000_18.get$arr$(729);
        } else {
            aFwS206S0000000_183 = null;
        }
        aFwS256S0000000_18 = (i4 & 256) != 0 ? AFwS256S0000000_18.get$arr$(954) : aFwS256S0000000_18;
        aFwS256S0000000_182 = (i4 & 512) != 0 ? AFwS256S0000000_18.get$arr$(955) : aFwS256S0000000_182;
        aFwS206S0000000_182 = (i4 & 1024) != 0 ? AFwS206S0000000_18.get$arr$(730) : aFwS206S0000000_182;
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        z2 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2;
        boolean z5 = (i4 & 8192) == 0 ? z3 : false;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = R.id.mnv;
        this.LJ = function1;
        this.LJFF = z;
        this.LJI = aFwS206S0000000_18;
        this.LJII = aFwS206S0000000_183;
        this.LJIIIIZZ = aFwS256S0000000_18;
        this.LJIIIZ = aFwS256S0000000_182;
        this.LJIIJ = aFwS206S0000000_182;
        this.LJIIJJI = z4;
        this.LJIIL = z2;
        this.LJIILIIL = z5;
    }
}
