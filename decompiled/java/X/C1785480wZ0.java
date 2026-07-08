package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wZ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785480wZ0 {
    public final List<C1779500wPM> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final String LJFF;
    public final int LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final EnumC1778940wOS LJIIJ;
    public final boolean LJIIJJI;
    public final String LJIIL;

    public C1785480wZ0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785480wZ0)) {
            return false;
        }
        C1785480wZ0 c1785480wZ0 = (C1785480wZ0) obj;
        return Intrinsics.LJFF(this.LIZ, c1785480wZ0.LIZ) && this.LIZIZ == c1785480wZ0.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1785480wZ0.LIZJ) && this.LIZLLL == c1785480wZ0.LIZLLL && this.LJ == c1785480wZ0.LJ && Intrinsics.LJFF(this.LJFF, c1785480wZ0.LJFF) && this.LJI == c1785480wZ0.LJI && this.LJII == c1785480wZ0.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c1785480wZ0.LJIIIIZZ) && this.LJIIIZ == c1785480wZ0.LJIIIZ && this.LJIIJ == c1785480wZ0.LJIIJ && this.LJIIJJI == c1785480wZ0.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1785480wZ0.LJIIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31;
        String str = this.LJFF;
        return ((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJI) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + this.LJIIJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL.hashCode();
    }

    public final String toString() {
        return "TopBarState(firstTabs=" + this.LIZ + ", selectedFirstIndex=" + this.LIZIZ + ", firstTitleText=" + this.LIZJ + ", isFirstTabBarVisible=" + this.LIZLLL + ", historyVisible=" + this.LJ + ", faqUrl=" + this.LJFF + ", historyIconAttr=" + this.LJI + ", showTopCountdown=" + this.LJII + ", topCountdownText=" + this.LJIIIIZZ + ", showDivider=" + this.LJIIIZ + ", mode=" + this.LJIIJ + ", historyTopBackVisible=" + this.LJIIJJI + ", historyTopTitle=" + this.LJIIL + ')';
    }

    public C1785480wZ0(int i) {
        this(C13BV.INSTANCE, 0, "", false, false, null, R.attr.enj, false, "", true, EnumC1778940wOS.CURRENT_PERIOD, false, "");
    }

    public C1785480wZ0(List<C1779500wPM> list, int i, String str, boolean z, boolean z2, String str2, int i2, boolean z3, String str3, boolean z4, EnumC1778940wOS enumC1778940wOS, boolean z5, String str4) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = str2;
        this.LJI = i2;
        this.LJII = z3;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = z4;
        this.LJIIJ = enumC1778940wOS;
        this.LJIIJJI = z5;
        this.LJIIL = str4;
    }

    public static C1785480wZ0 LIZ(C1785480wZ0 c1785480wZ0, List list, int i, String str, boolean z, boolean z2, String str2, int i2, boolean z3, String str3, boolean z4, EnumC1778940wOS enumC1778940wOS, boolean z5, String str4, int i3) {
        String str5 = str4;
        boolean z6 = z5;
        EnumC1778940wOS enumC1778940wOS2 = enumC1778940wOS;
        boolean z7 = z4;
        String str6 = str3;
        boolean z8 = z3;
        int i4 = i2;
        String str7 = str2;
        boolean z9 = z2;
        boolean z10 = z;
        String str8 = str;
        int i5 = i;
        List list2 = list;
        if ((i3 & 1) != 0) {
            list2 = c1785480wZ0.LIZ;
        }
        if ((i3 & 2) != 0) {
            i5 = c1785480wZ0.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            str8 = c1785480wZ0.LIZJ;
        }
        if ((i3 & 8) != 0) {
            z10 = c1785480wZ0.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            z9 = c1785480wZ0.LJ;
        }
        if ((i3 & 32) != 0) {
            str7 = c1785480wZ0.LJFF;
        }
        if ((i3 & 64) != 0) {
            i4 = c1785480wZ0.LJI;
        }
        if ((i3 & 128) != 0) {
            z8 = c1785480wZ0.LJII;
        }
        if ((i3 & 256) != 0) {
            str6 = c1785480wZ0.LJIIIIZZ;
        }
        if ((i3 & 512) != 0) {
            z7 = c1785480wZ0.LJIIIZ;
        }
        if ((i3 & 1024) != 0) {
            enumC1778940wOS2 = c1785480wZ0.LJIIJ;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c1785480wZ0.LJIIJJI;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str5 = c1785480wZ0.LJIIL;
        }
        c1785480wZ0.getClass();
        return new C1785480wZ0(list2, i5, str8, z10, z9, str7, i4, z8, str6, z7, enumC1778940wOS2, z6, str5);
    }
}
