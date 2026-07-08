package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteriaCollection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i5F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228870i5F implements InterfaceC0148002o {
    public final String LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final String LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final int LLIZ;
    public final GroupAccessCriteriaCollection LLIZLLLIL;
    public final String LLJ;
    public final C291001Au<Boolean> LLJI;
    public final CharSequence LLJIJIL;
    public final CharSequence LLJILJIL;
    public final boolean LLJILJILJ;
    public final C291001Au<String> LLJILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1228870i5F)) {
            return false;
        }
        C1228870i5F c1228870i5F = (C1228870i5F) obj;
        return Intrinsics.LJFF(this.LL, c1228870i5F.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1228870i5F.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1228870i5F.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1228870i5F.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1228870i5F.LLILZIL) && this.LLILZLL == c1228870i5F.LLILZLL && this.LLIZ == c1228870i5F.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1228870i5F.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1228870i5F.LLJ) && Intrinsics.LJFF(this.LLJI, c1228870i5F.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1228870i5F.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1228870i5F.LLJILJIL) && this.LLJILJILJ == c1228870i5F.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1228870i5F.LLJILLL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ) * 31;
        GroupAccessCriteriaCollection groupAccessCriteriaCollection = this.LLIZLLLIL;
        return ((((((((((((iHashCode + (groupAccessCriteriaCollection == null ? 0 : groupAccessCriteriaCollection.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + this.LLJILLL.hashCode();
    }

    public final String toString() {
        return "PublicGroupCreationVMState(groupName=" + this.LL + ", groupNameEmptyErrorEvent=" + this.LLILLJJLI + ", groupDescription=" + this.LLILLL + ", groupDescriptionEmptyErrorEvent=" + this.LLILZ + ", groupJoinQuestion=" + this.LLILZIL + ", showOnProfile=" + this.LLILZLL + ", curBusinessType=" + this.LLIZ + ", curAccessCriteriaCollection=" + this.LLIZLLLIL + ", whoCanJoinTextStr=" + this.LLJ + ", accessCriteriaEmptyErrorEvent=" + this.LLJI + ", title=" + ((Object) this.LLJIJIL) + ", subTitle=" + ((Object) this.LLJILJIL) + ", isButtonLoading=" + this.LLJILJILJ + ", toastEvent=" + this.LLJILLL + ')';
    }

    public static C1228870i5F LIZ(C1228870i5F c1228870i5F, String str, C291001Au c291001Au, String str2, C291001Au c291001Au2, String str3, boolean z, int i, GroupAccessCriteriaCollection groupAccessCriteriaCollection, String str4, C291001Au c291001Au3, boolean z2, int i2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        C291001Au c291001Au4 = c291001Au3;
        String str5 = str4;
        GroupAccessCriteriaCollection groupAccessCriteriaCollection2 = groupAccessCriteriaCollection;
        int i3 = i;
        boolean z3 = z2;
        boolean z4 = z;
        String str6 = str3;
        C291001Au c291001Au5 = c291001Au2;
        String str7 = str2;
        C291001Au c291001Au6 = c291001Au;
        String str8 = str;
        if ((i2 & 1) != 0) {
            str8 = c1228870i5F.LL;
        }
        if ((i2 & 2) != 0) {
            c291001Au6 = c1228870i5F.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            str7 = c1228870i5F.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au5 = c1228870i5F.LLILZ;
        }
        if ((i2 & 16) != 0) {
            str6 = c1228870i5F.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z4 = c1228870i5F.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            i3 = c1228870i5F.LLIZ;
        }
        if ((i2 & 128) != 0) {
            groupAccessCriteriaCollection2 = c1228870i5F.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            str5 = c1228870i5F.LLJ;
        }
        if ((i2 & 512) != 0) {
            c291001Au4 = c1228870i5F.LLJI;
        }
        C291001Au<String> c291001Au7 = null;
        if ((i2 & 1024) != 0) {
            charSequence = c1228870i5F.LLJIJIL;
        } else {
            charSequence = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            charSequence2 = c1228870i5F.LLJILJIL;
        } else {
            charSequence2 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z3 = c1228870i5F.LLJILJILJ;
        }
        if ((i2 & 8192) != 0) {
            c291001Au7 = c1228870i5F.LLJILLL;
        }
        c1228870i5F.getClass();
        return new C1228870i5F(str8, c291001Au6, str7, c291001Au5, str6, z4, i3, groupAccessCriteriaCollection2, str5, c291001Au4, charSequence, charSequence2, z3, c291001Au7);
    }

    public C1228870i5F(String str, C291001Au<Boolean> c291001Au, String str2, C291001Au<Boolean> c291001Au2, String str3, boolean z, int i, GroupAccessCriteriaCollection groupAccessCriteriaCollection, String str4, C291001Au<Boolean> c291001Au3, CharSequence charSequence, CharSequence charSequence2, boolean z2, C291001Au<String> c291001Au4) {
        this.LL = str;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = str2;
        this.LLILZ = c291001Au2;
        this.LLILZIL = str3;
        this.LLILZLL = z;
        this.LLIZ = i;
        this.LLIZLLLIL = groupAccessCriteriaCollection;
        this.LLJ = str4;
        this.LLJI = c291001Au3;
        this.LLJIJIL = charSequence;
        this.LLJILJIL = charSequence2;
        this.LLJILJILJ = z2;
        this.LLJILLL = c291001Au4;
    }
}
