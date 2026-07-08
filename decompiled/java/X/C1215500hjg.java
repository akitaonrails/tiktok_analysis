package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hjg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215500hjg implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final int LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final C291001Au<Boolean> LLJ;
    public final C1215680hjy LLJI;
    public final List<C1215670hjx> LLJIJIL;
    public final C291001Au<List<C1215670hjx>> LLJILJIL;

    public C1215500hjg() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215500hjg)) {
            return false;
        }
        C1215500hjg c1215500hjg = (C1215500hjg) obj;
        return Intrinsics.LJFF(this.LL, c1215500hjg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1215500hjg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1215500hjg.LLILLL) && this.LLILZ == c1215500hjg.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1215500hjg.LLILZIL) && this.LLILZLL == c1215500hjg.LLILZLL && this.LLIZ == c1215500hjg.LLIZ && this.LLIZLLLIL == c1215500hjg.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1215500hjg.LLJ) && Intrinsics.LJFF(this.LLJI, c1215500hjg.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1215500hjg.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1215500hjg.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31;
        C1215680hjy c1215680hjy = this.LLJI;
        return ((((iHashCode + (c1215680hjy == null ? 0 : c1215680hjy.hashCode())) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "EditProfileNamesState(currentUsername=" + this.LL + ", currentNickname=" + this.LLILLJJLI + ", currentPersonalLink=" + this.LLILLL + ", nicknameModifyTime=" + this.LLILZ + ", shouldShowUsernameFragment=" + this.LLILZIL + ", isUsernameIllegal=" + this.LLILZLL + ", isNicknameDefault=" + this.LLIZ + ", isNicknameInBoldFields=" + this.LLIZLLLIL + ", shouldShowNicknameFragment=" + this.LLJ + ", editSyncData=" + this.LLJI + ", nameSyncStatusList=" + this.LLJIJIL + ", shouldShowSyncToast=" + this.LLJILJIL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1215500hjg(int i) {
        Boolean bool = Boolean.FALSE;
        this("", "", "", 0, new C291001Au(bool), true, false, false, new C291001Au(bool), null, new ArrayList(), new C291001Au(new ArrayList()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1215500hjg(String str, String str2, String str3, int i, C291001Au<Boolean> c291001Au, boolean z, boolean z2, boolean z3, C291001Au<Boolean> c291001Au2, C1215680hjy c1215680hjy, List<C1215670hjx> list, C291001Au<? extends List<C1215670hjx>> c291001Au3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = c291001Au;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = c291001Au2;
        this.LLJI = c1215680hjy;
        this.LLJIJIL = list;
        this.LLJILJIL = c291001Au3;
    }

    public static C1215500hjg LIZ(C1215500hjg c1215500hjg, String str, String str2, String str3, int i, C291001Au c291001Au, boolean z, boolean z2, boolean z3, C291001Au c291001Au2, C1215680hjy c1215680hjy, List list, C291001Au c291001Au3, int i2) {
        C291001Au c291001Au4 = c291001Au3;
        List list2 = list;
        C1215680hjy c1215680hjy2 = c1215680hjy;
        C291001Au c291001Au5 = c291001Au2;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        C291001Au c291001Au6 = c291001Au;
        int i3 = i;
        String str4 = str3;
        String str5 = str2;
        String str6 = str;
        if ((i2 & 1) != 0) {
            str6 = c1215500hjg.LL;
        }
        if ((i2 & 2) != 0) {
            str5 = c1215500hjg.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str4 = c1215500hjg.LLILLL;
        }
        if ((i2 & 8) != 0) {
            i3 = c1215500hjg.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au6 = c1215500hjg.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z6 = c1215500hjg.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z5 = c1215500hjg.LLIZ;
        }
        if ((i2 & 128) != 0) {
            z4 = c1215500hjg.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c291001Au5 = c1215500hjg.LLJ;
        }
        if ((i2 & 512) != 0) {
            c1215680hjy2 = c1215500hjg.LLJI;
        }
        if ((i2 & 1024) != 0) {
            list2 = c1215500hjg.LLJIJIL;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            c291001Au4 = c1215500hjg.LLJILJIL;
        }
        c1215500hjg.getClass();
        return new C1215500hjg(str6, str5, str4, i3, c291001Au6, z6, z5, z4, c291001Au5, c1215680hjy2, list2, c291001Au4);
    }
}
