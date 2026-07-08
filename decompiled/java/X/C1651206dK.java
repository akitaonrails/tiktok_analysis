package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06dK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1651206dK implements InterfaceC0148002o {
    public final boolean LL;
    public final GroupAccessCriteria LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final boolean LLIZLLLIL;
    public final boolean LLJ;
    public final int LLJI;
    public final String LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final C291001Au<Boolean> LLJJIJI;
    public final C291001Au<Boolean> LLJJIJIIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1651206dK)) {
            return false;
        }
        C1651206dK c1651206dK = (C1651206dK) obj;
        return this.LL == c1651206dK.LL && Intrinsics.LJFF(this.LLILLJJLI, c1651206dK.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1651206dK.LLILLL) && this.LLILZ == c1651206dK.LLILZ && this.LLILZIL == c1651206dK.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1651206dK.LLILZLL) && this.LLIZ == c1651206dK.LLIZ && this.LLIZLLLIL == c1651206dK.LLIZLLLIL && this.LLJ == c1651206dK.LLJ && this.LLJI == c1651206dK.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1651206dK.LLJIJIL) && this.LLJILJIL == c1651206dK.LLJILJIL && this.LLJILJILJ == c1651206dK.LLJILJILJ && this.LLJILLL == c1651206dK.LLJILLL && this.LLJJ == c1651206dK.LLJJ && this.LLJJI == c1651206dK.LLJJI && this.LLJJIII == c1651206dK.LLJJIII && Intrinsics.LJFF(this.LLJJIJI, c1651206dK.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c1651206dK.LLJJIJIIJIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        GroupAccessCriteria groupAccessCriteria = this.LLILLJJLI;
        return ((((((((((((((((((((((((((((((((((iZ2 + (groupAccessCriteria == null ? 0 : groupAccessCriteria.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + this.LLJI) * 31) + this.LLJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + this.LLJJIJI.hashCode()) * 31) + this.LLJJIJIIJIL.hashCode();
    }

    public final String toString() {
        return "ManageGroupState(showWhoCanJoin=" + this.LL + ", whoCanJoinSetting=" + this.LLILLJJLI + ", whoCanJoinDescription=" + this.LLILLL + ", showRequireApproval=" + this.LLILZ + ", requireApproval=" + this.LLILZIL + ", joinQuestion=" + this.LLILZLL + ", joinRequestSize=" + this.LLIZ + ", showAllowLinkInvite=" + this.LLIZLLLIL + ", allowLinkInviteStatus=" + this.LLJ + ", adminSize=" + this.LLJI + ", liveReminderKey=" + this.LLJIJIL + ", showLiveReminder=" + this.LLJILJIL + ", liveRemindStatus=" + this.LLJILJILJ + ", showHideMembers=" + this.LLJILLL + ", hideMembersStatus=" + this.LLJJ + ", showTransferOwner=" + this.LLJJI + ", showEndGroup=" + this.LLJJIII + ", quitManageGroupPageAndDetailPage=" + this.LLJJIJI + ", quitManageGroupPageAndChatPage=" + this.LLJJIJIIJIL + ')';
    }

    public static C1651206dK LIZ(C1651206dK c1651206dK, GroupAccessCriteria groupAccessCriteria, String str, boolean z, String str2, int i, boolean z2, int i2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, C291001Au c291001Au, C291001Au c291001Au2, int i3) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = z6;
        C291001Au c291001Au3 = c291001Au2;
        boolean z12 = z3;
        String str4 = str3;
        int i4 = i2;
        boolean z13 = z2;
        String str5 = str2;
        boolean z14 = z;
        boolean z15 = z5;
        C291001Au c291001Au4 = c291001Au;
        String str6 = str;
        int i5 = i;
        boolean z16 = z4;
        GroupAccessCriteria groupAccessCriteria2 = groupAccessCriteria;
        boolean z17 = false;
        if ((i3 & 1) != 0) {
            z7 = c1651206dK.LL;
        } else {
            z7 = false;
        }
        if ((i3 & 2) != 0) {
            groupAccessCriteria2 = c1651206dK.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            str6 = c1651206dK.LLILLL;
        }
        if ((i3 & 8) != 0) {
            z8 = c1651206dK.LLILZ;
        } else {
            z8 = false;
        }
        if ((i3 & 16) != 0) {
            z14 = c1651206dK.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            str5 = c1651206dK.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            i5 = c1651206dK.LLIZ;
        }
        if ((i3 & 128) != 0) {
            z9 = c1651206dK.LLIZLLLIL;
        } else {
            z9 = false;
        }
        if ((i3 & 256) != 0) {
            z13 = c1651206dK.LLJ;
        }
        if ((i3 & 512) != 0) {
            i4 = c1651206dK.LLJI;
        }
        if ((i3 & 1024) != 0) {
            str4 = c1651206dK.LLJIJIL;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z12 = c1651206dK.LLJILJIL;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z16 = c1651206dK.LLJILJILJ;
        }
        if ((i3 & 8192) != 0) {
            z15 = c1651206dK.LLJILLL;
        }
        if ((i3 & 16384) != 0) {
            z11 = c1651206dK.LLJJ;
        }
        if ((32768 & i3) != 0) {
            z10 = c1651206dK.LLJJI;
        } else {
            z10 = false;
        }
        if ((65536 & i3) != 0) {
            z17 = c1651206dK.LLJJIII;
        }
        if ((131072 & i3) != 0) {
            c291001Au4 = c1651206dK.LLJJIJI;
        }
        if ((i3 & 262144) != 0) {
            c291001Au3 = c1651206dK.LLJJIJIIJIL;
        }
        c1651206dK.getClass();
        int i6 = i5;
        return new C1651206dK(z7, groupAccessCriteria2, str6, z8, z14, str5, i6, z9, z13, i4, str4, z12, z16, z15, z11, z10, z17, c291001Au4, c291001Au3);
    }

    public C1651206dK(boolean z, GroupAccessCriteria groupAccessCriteria, String str, boolean z2, boolean z3, String str2, int i, boolean z4, boolean z5, int i2, String str3, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2) {
        this.LL = z;
        this.LLILLJJLI = groupAccessCriteria;
        this.LLILLL = str;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = str2;
        this.LLIZ = i;
        this.LLIZLLLIL = z4;
        this.LLJ = z5;
        this.LLJI = i2;
        this.LLJIJIL = str3;
        this.LLJILJIL = z6;
        this.LLJILJILJ = z7;
        this.LLJILLL = z8;
        this.LLJJ = z9;
        this.LLJJI = z10;
        this.LLJJIII = z11;
        this.LLJJIJI = c291001Au;
        this.LLJJIJIIJIL = c291001Au2;
    }
}
