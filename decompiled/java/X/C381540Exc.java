package X;

import com.ss.android.ugc.gamora.genaifoundation.model.GenAITaskLogExtra;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Exc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C381540Exc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final int LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final int LJIIJJI;
    public final EnumC381960EyI LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final int LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final long LJIJJ;
    public final String LJIJJLI;
    public final long LJIL;
    public final GenAITaskLogExtra LJJ;
    public final String LJJI;
    public final C381550Exd LJJIFFI;
    public final int LJJII;
    public final String LJJIII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C381540Exc)) {
            return false;
        }
        C381540Exc c381540Exc = (C381540Exc) obj;
        return Intrinsics.LJFF(this.LIZ, c381540Exc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c381540Exc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c381540Exc.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c381540Exc.LIZLLL) && Intrinsics.LJFF(this.LJ, c381540Exc.LJ) && Intrinsics.LJFF(this.LJFF, c381540Exc.LJFF) && Intrinsics.LJFF(this.LJI, c381540Exc.LJI) && this.LJII == c381540Exc.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c381540Exc.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c381540Exc.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c381540Exc.LJIIJ) && this.LJIIJJI == c381540Exc.LJIIJJI && this.LJIIL == c381540Exc.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c381540Exc.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c381540Exc.LJIILJJIL) && this.LJIILL == c381540Exc.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c381540Exc.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c381540Exc.LJIIZILJ) && Intrinsics.LJFF(this.LJIJ, c381540Exc.LJIJ) && Intrinsics.LJFF(this.LJIJI, c381540Exc.LJIJI) && this.LJIJJ == c381540Exc.LJIJJ && Intrinsics.LJFF(this.LJIJJLI, c381540Exc.LJIJJLI) && this.LJIL == c381540Exc.LJIL && Intrinsics.LJFF(this.LJJ, c381540Exc.LJJ) && Intrinsics.LJFF(this.LJJI, c381540Exc.LJJI) && Intrinsics.LJFF(this.LJJIFFI, c381540Exc.LJJIFFI) && this.LJJII == c381540Exc.LJJII && Intrinsics.LJFF(this.LJJIII, c381540Exc.LJJIII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI) * 31;
        EnumC381960EyI enumC381960EyI = this.LJIIL;
        return ((((((((((((((((((((((((((((((iHashCode + (enumC381960EyI == null ? 0 : enumC381960EyI.hashCode())) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + this.LJIILL) * 31) + this.LJIILLIIL.hashCode()) * 31) + this.LJIIZILJ.hashCode()) * 31) + this.LJIJ.hashCode()) * 31) + this.LJIJI.hashCode()) * 31) + C786410Ut5.Y2(this.LJIJJ)) * 31) + this.LJIJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LJIL)) * 31) + this.LJJ.hashCode()) * 31) + this.LJJI.hashCode()) * 31) + this.LJJIFFI.hashCode()) * 31) + this.LJJII) * 31) + this.LJJIII.hashCode();
    }

    public final String toString() {
        return "GenAIAsyncTaskInfo(id=" + this.LIZ + ", name=" + this.LIZIZ + ", icon=" + this.LIZJ + ", type=" + this.LIZLLL + ", status=" + this.LJ + ", asyncStatus=" + this.LJFF + ", step=" + this.LJI + ", progress=" + this.LJII + ", childTaskId=" + this.LJIIIIZZ + ", parentTaskId=" + this.LJIIIZ + ", creationId=" + this.LJIIJ + ", creationVersion=" + this.LJIIJJI + ", source=" + this.LJIIL + ", param=" + this.LJIILIIL + ", prompt=" + this.LJIILJJIL + ", errorCode=" + this.LJIILL + ", errorMsg=" + this.LJIILLIIL + ", errorSource=" + this.LJIIZILJ + ", failReasonMsg=" + this.LJIJ + ", resourceId=" + this.LJIJI + ", createdAt=" + this.LJIJJ + ", serverTaskId=" + this.LJIJJLI + ", remainTime=" + this.LJIL + ", logExtra=" + this.LJJ + ", aiCreationId=" + this.LJJI + ", quotaResult=" + this.LJJIFFI + ", remainTimeStage=" + this.LJJII + ", inputCache=" + this.LJJIII + ')';
    }

    public C381540Exc() {
        this("", "", "", "", "", "", "", 0, "", "", "", 0, null, "", "", 0, "", "", "", "", 0L, "", -1L, new GenAITaskLogExtra(0L, "", null, null, false, false, "", 0, "", "", "", "", 0, "", "", "", 0L, null, false, C2097608Jq.LJ()), "", new C381550Exd(null, 0, 0, null, null, null, null, 127), 0, "");
    }

    public C381540Exc(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, String str9, String str10, int i2, EnumC381960EyI enumC381960EyI, String str11, String str12, int i3, String str13, String str14, String str15, String str16, long j, String str17, long j2, GenAITaskLogExtra genAITaskLogExtra, String str18, C381550Exd c381550Exd, int i4, String str19) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = str6;
        this.LJI = str7;
        this.LJII = i;
        this.LJIIIIZZ = str8;
        this.LJIIIZ = str9;
        this.LJIIJ = str10;
        this.LJIIJJI = i2;
        this.LJIIL = enumC381960EyI;
        this.LJIILIIL = str11;
        this.LJIILJJIL = str12;
        this.LJIILL = i3;
        this.LJIILLIIL = str13;
        this.LJIIZILJ = str14;
        this.LJIJ = str15;
        this.LJIJI = str16;
        this.LJIJJ = j;
        this.LJIJJLI = str17;
        this.LJIL = j2;
        this.LJJ = genAITaskLogExtra;
        this.LJJI = str18;
        this.LJJIFFI = c381550Exd;
        this.LJJII = i4;
        this.LJJIII = str19;
    }
}
