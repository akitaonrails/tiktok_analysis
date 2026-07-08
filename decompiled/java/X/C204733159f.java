package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.159f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204733159f implements InterfaceC20477315At {
    public EnumC204738159k LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public String LJ;
    public final Integer LJFF;
    public final Float LJI;
    public final int LJII;
    public final User LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public Function0<Long> LJIILIIL;

    public C204733159f() {
        throw null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        Integer num = this.LJFF;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.LJI;
        int iHashCode3 = (((iHashCode2 + (f == null ? 0 : f.hashCode())) * 31) + this.LJII) * 31;
        User user = this.LJIIIIZZ;
        return ((((((((((iHashCode3 + (user != null ? user.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + this.LJIILIIL.hashCode();
    }

    public final String toString() {
        return "LabelGeniusConfigNew(labelType=" + this.LIZ + ", duration=" + this.LIZIZ + ", timeTextColor=" + this.LIZJ + ", countDownTimeTextColor=" + this.LIZLLL + ", boardTitle=" + this.LJ + ", boardTextColor=" + this.LJFF + ", boardTextSize=" + this.LJI + ", timeTextSize=" + this.LJII + ", showingUser=" + this.LJIIIIZZ + ", addTime=" + this.LJIIIZ + ", detached=" + this.LJIIJ + ", isVisible=" + this.LJIIJJI + ", isForceHideTime=" + this.LJIIL + ", passTimeInTimeMsAction=" + this.LJIILIIL + ')';
    }

    @Override // X.InterfaceC20477315At
    public final InterfaceC20477315At LIZJ() {
        EnumC204738159k enumC204738159k = this.LIZ;
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        String str = this.LJ;
        Float f = this.LJI;
        return new C204733159f(enumC204738159k, i, i2, str, this.LJFF, f, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, 8);
    }

    @Override // X.InterfaceC20477315At
    public final boolean LIZ() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC20477315At
    public final void LIZIZ(boolean z) {
        this.LJIIJ = z;
    }

    public final boolean equals(Object obj) {
        Long lValueOf;
        if (!(obj instanceof C204733159f)) {
            return false;
        }
        C204733159f c204733159f = (C204733159f) obj;
        if (this.LIZ != c204733159f.LIZ || this.LIZIZ != c204733159f.LIZIZ || this.LIZJ != c204733159f.LIZJ || !Intrinsics.LJFF(this.LJ, c204733159f.LJ) || this.LIZLLL != c204733159f.LIZLLL || !Intrinsics.LJFF(this.LJFF, c204733159f.LJFF) || !Intrinsics.LJ(this.LJI, c204733159f.LJI)) {
            return false;
        }
        User user = this.LJIIIIZZ;
        Long lValueOf2 = null;
        if (user != null) {
            lValueOf = Long.valueOf(user.getId());
        } else {
            lValueOf = null;
        }
        User user2 = c204733159f.LJIIIIZZ;
        if (user2 != null) {
            lValueOf2 = Long.valueOf(user2.getId());
        }
        if (!Intrinsics.LJFF(lValueOf, lValueOf2) || this.LJIIIZ != c204733159f.LJIIIZ || this.LJIIJJI != c204733159f.LJIIJJI || this.LJIIL != c204733159f.LJIIL) {
            return false;
        }
        return true;
    }

    public C204733159f(EnumC204738159k enumC204738159k, int i, int i2, String str, Integer num, Float f, int i3, User user, long j, boolean z, boolean z2, boolean z3, Function0 function0, int i4) {
        int iLJI;
        boolean z4 = z2;
        i = (i4 & 2) != 0 ? 0 : i;
        i2 = (i4 & 4) != 0 ? -1 : i2;
        if ((i4 & 8) != 0) {
            iLJI = C497740JfY.LJI(-16776961, AbstractC204737159j.LIZ);
        } else {
            iLJI = 0;
        }
        str = (i4 & 16) != 0 ? "" : str;
        num = (i4 & 32) != 0 ? null : num;
        f = (i4 & 64) != 0 ? null : f;
        User user2 = (i4 & 256) == 0 ? user : null;
        j = (i4 & 512) != 0 ? 0L : j;
        z4 = (i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z4;
        boolean z5 = (i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? z3 : false;
        this.LIZ = enumC204738159k;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = iLJI;
        this.LJ = str;
        this.LJFF = num;
        this.LJI = f;
        this.LJII = i3;
        this.LJIIIIZZ = user2;
        this.LJIIIZ = j;
        this.LJIIJ = z;
        this.LJIIJJI = z4;
        this.LJIIL = z5;
        this.LJIILIIL = function0;
    }
}
