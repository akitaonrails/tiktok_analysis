package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0ixd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262590ixd {
    public EnumC1262370ixH LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public List<? extends EnumC1070410dxf> LJ;
    public String LJFF;
    public String LJI;
    public boolean LJII;
    public final EnumC1262560ixa LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public final boolean LJIIL;
    public EnumC1262560ixa LJIILIIL;
    public Boolean LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public PlaceUserInfo LJIIZILJ;
    public Integer LJIJ;
    public Set<String> LJIJI;
    public boolean LJIJJ;

    public C1262590ixd() {
        this(null, 2097151);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJI;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        EnumC1262560ixa enumC1262560ixa = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (enumC1262560ixa == null ? 0 : enumC1262560ixa.hashCode())) * 31;
        String str3 = this.LJIIIZ;
        int iHashCode5 = (((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        String str4 = this.LJIIJJI;
        int iHashCode6 = (((((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIL)) * 31) + this.LJIILIIL.hashCode()) * 31;
        Boolean bool = this.LJIILJJIL;
        int iHashCode7 = (((((iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LJIILL) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31;
        PlaceUserInfo placeUserInfo = this.LJIIZILJ;
        int iHashCode8 = (iHashCode7 + (placeUserInfo == null ? 0 : placeUserInfo.hashCode())) * 31;
        Integer num = this.LJIJ;
        return ((((iHashCode8 + (num != null ? num.hashCode() : 0)) * 31) + this.LJIJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJIJJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1262590ixd(EnumC1262370ixH enumC1262370ixH, int i) {
        int i2;
        int i3;
        int i4;
        C13BV c13bv;
        boolean z;
        boolean z2;
        EnumC1262560ixa enumC1262560ixa;
        Integer num;
        EnumC1262370ixH enumC1262370ixH2 = (i & 1) != 0 ? EnumC1262370ixH.AFTER_PERMISSION_POP_UP : enumC1262370ixH;
        if ((i & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = 0;
        }
        if ((i & 4) != 0) {
            i3 = 30;
        } else {
            i3 = 0;
        }
        if ((i & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = 0;
        }
        if ((i & 16) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8192) != 0) {
            enumC1262560ixa = EnumC1262560ixa.RECOMMEND_MORE;
        } else {
            enumC1262560ixa = null;
        }
        if ((262144 & i) != 0) {
            num = -1;
        } else {
            num = null;
        }
        this(enumC1262370ixH2, i2, i3, i4, c13bv, null, null, z, null, null, false, null, z2, enumC1262560ixa, null, 0, false, null, num, (i & 524288) != 0 ? new LinkedHashSet() : null, false);
    }

    public C1262590ixd(EnumC1262370ixH enumC1262370ixH, int i, int i2, int i3, List<? extends EnumC1070410dxf> list, String str, String str2, boolean z, EnumC1262560ixa enumC1262560ixa, String str3, boolean z2, String str4, boolean z3, EnumC1262560ixa enumC1262560ixa2, Boolean bool, int i4, boolean z4, PlaceUserInfo placeUserInfo, Integer num, Set<String> set, boolean z5) {
        this.LIZ = enumC1262370ixH;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = list;
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = z;
        this.LJIIIIZZ = enumC1262560ixa;
        this.LJIIIZ = str3;
        this.LJIIJ = z2;
        this.LJIIJJI = str4;
        this.LJIIL = z3;
        this.LJIILIIL = enumC1262560ixa2;
        this.LJIILJJIL = bool;
        this.LJIILL = i4;
        this.LJIILLIIL = z4;
        this.LJIIZILJ = placeUserInfo;
        this.LJIJ = num;
        this.LJIJI = set;
        this.LJIJJ = z5;
    }
}
