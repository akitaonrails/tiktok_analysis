package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yNy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855520yNy implements InterfaceC1855530yNz {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final EnumC1991107r3 LIZLLL;
    public final Boolean LJ;
    public final String LJFF;
    public final List<BaseImage> LJI;
    public final String LJII;
    public final C1854790yMn LJIIIIZZ;
    public final String LJIIIZ;
    public final C1854150yLl LJIIJ;
    public C1861290yXH LJIIJJI;
    public final TakoReferenceAskInfo LJIIL;
    public final TakoEditAskInfo LJIILIIL;
    public final List<String> LJIILJJIL;
    public SubConversationConfig LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public boolean LJIJ;

    public C1855520yNy() {
        this(null, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, 524287);
    }

    @Override // X.InterfaceC1855530yNz
    public final void LIZ() {
        this.LJIJ = false;
    }

    @Override // X.InterfaceC1855530yNz
    public final void LIZLLL() {
        this.LJIIJJI = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1855520yNy)) {
            return false;
        }
        C1855520yNy c1855520yNy = (C1855520yNy) obj;
        return Intrinsics.LJFF(this.LIZ, c1855520yNy.LIZ) && this.LIZIZ == c1855520yNy.LIZIZ && this.LIZJ == c1855520yNy.LIZJ && this.LIZLLL == c1855520yNy.LIZLLL && Intrinsics.LJFF(this.LJ, c1855520yNy.LJ) && Intrinsics.LJFF(this.LJFF, c1855520yNy.LJFF) && Intrinsics.LJFF(this.LJI, c1855520yNy.LJI) && Intrinsics.LJFF(this.LJII, c1855520yNy.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1855520yNy.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1855520yNy.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1855520yNy.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1855520yNy.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1855520yNy.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1855520yNy.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1855520yNy.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1855520yNy.LJIILL) && this.LJIILLIIL == c1855520yNy.LJIILLIIL && this.LJIIZILJ == c1855520yNy.LJIIZILJ && this.LJIJ == c1855520yNy.LJIJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31;
        Boolean bool = this.LJ;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BaseImage> list = this.LJI;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.LJII;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C1854790yMn c1854790yMn = this.LJIIIIZZ;
        int iHashCode6 = (((iHashCode5 + (c1854790yMn == null ? 0 : c1854790yMn.hashCode())) * 31) + this.LJIIIZ.hashCode()) * 31;
        C1854150yLl c1854150yLl = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (c1854150yLl == null ? 0 : c1854150yLl.hashCode())) * 31;
        C1861290yXH c1861290yXH = this.LJIIJJI;
        int iHashCode8 = (iHashCode7 + (c1861290yXH == null ? 0 : c1861290yXH.hashCode())) * 31;
        TakoReferenceAskInfo takoReferenceAskInfo = this.LJIIL;
        int iHashCode9 = (iHashCode8 + (takoReferenceAskInfo == null ? 0 : takoReferenceAskInfo.hashCode())) * 31;
        TakoEditAskInfo takoEditAskInfo = this.LJIILIIL;
        int iHashCode10 = (iHashCode9 + (takoEditAskInfo == null ? 0 : takoEditAskInfo.hashCode())) * 31;
        List<String> list2 = this.LJIILJJIL;
        int iHashCode11 = (iHashCode10 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SubConversationConfig subConversationConfig = this.LJIILL;
        return ((((((iHashCode11 + (subConversationConfig != null ? subConversationConfig.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31) + C786410Ut5.Z2(this.LJIJ);
    }

    public final String toString() {
        return "TakoExitInfoForDuplicateEntry(processId=" + this.LIZ + ", exitTime=" + this.LIZIZ + ", messageRank=" + this.LIZJ + ", inputStatus=" + this.LIZLLL + ", isAddTextFromVoice=" + this.LJ + ", inputContent=" + this.LJFF + ", inputImageList=" + this.LJI + ", inputImageScene=" + this.LJII + ", inputSkillLabel=" + this.LJIIIIZZ + ", modeSource=" + this.LJIIIZ + ", subModeItem=" + this.LJIIJ + ", lastMessageLocation=" + this.LJIIJJI + ", referenceAskInfo=" + this.LJIIL + ", editAskInfo=" + this.LJIILIIL + ", expandedMessageUuidList=" + this.LJIILJJIL + ", lastConversationInfo=" + this.LJIILL + ", isValid=" + this.LJIILLIIL + ", switchedSubConversation=" + this.LJIIZILJ + ", isMiddlePage=" + this.LJIJ + ')';
    }

    @Override // X.InterfaceC1855530yNz
    public final SubConversationConfig LIZJ() {
        return this.LJIILL;
    }

    @Override // X.InterfaceC1855530yNz
    public final void LIZIZ(SubConversationConfig subConversationConfig) {
        this.LJIILL = subConversationConfig;
    }

    public C1855520yNy(String str, long j, int i, EnumC1991107r3 enumC1991107r3, Boolean bool, String str2, List list, String str3, C1854790yMn c1854790yMn, C1854150yLl c1854150yLl, C1861290yXH c1861290yXH, TakoReferenceAskInfo takoReferenceAskInfo, TakoEditAskInfo takoEditAskInfo, List list2, SubConversationConfig subConversationConfig, boolean z, boolean z2, boolean z3, int i2) {
        String str4;
        EnumC1991107r3 enumC1991107r32 = enumC1991107r3;
        int i3 = i;
        long j2 = j;
        Boolean bool2 = bool;
        TakoReferenceAskInfo takoReferenceAskInfo2 = takoReferenceAskInfo;
        C1861290yXH c1861290yXH2 = c1861290yXH;
        C1854150yLl c1854150yLl2 = c1854150yLl;
        C1854790yMn c1854790yMn2 = c1854790yMn;
        String str5 = str3;
        List list3 = list;
        String str6 = str2;
        boolean z4 = z3;
        boolean z5 = z2;
        TakoEditAskInfo takoEditAskInfo2 = takoEditAskInfo;
        boolean z6 = z;
        SubConversationConfig subConversationConfig2 = subConversationConfig;
        List list4 = list2;
        String str7 = (i2 & 1) != 0 ? null : str;
        j2 = (i2 & 2) != 0 ? 0L : j2;
        i3 = (i2 & 4) != 0 ? 0 : i3;
        enumC1991107r32 = (i2 & 8) != 0 ? EnumC1991107r3.DEFAULT : enumC1991107r32;
        bool2 = (i2 & 16) != 0 ? null : bool2;
        str6 = (i2 & 32) != 0 ? null : str6;
        list3 = (i2 & 64) != 0 ? null : list3;
        str5 = (i2 & 128) != 0 ? null : str5;
        c1854790yMn2 = (i2 & 256) != 0 ? null : c1854790yMn2;
        if ((i2 & 512) != 0) {
            str4 = "";
        } else {
            str4 = null;
        }
        c1854150yLl2 = (i2 & 1024) != 0 ? null : c1854150yLl2;
        c1861290yXH2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : c1861290yXH2;
        takoReferenceAskInfo2 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : takoReferenceAskInfo2;
        takoEditAskInfo2 = (i2 & 8192) != 0 ? null : takoEditAskInfo2;
        list4 = (i2 & 16384) != 0 ? null : list4;
        subConversationConfig2 = (32768 & i2) != 0 ? null : subConversationConfig2;
        z6 = (65536 & i2) != 0 ? false : z6;
        z5 = (131072 & i2) != 0 ? false : z5;
        z4 = (i2 & 262144) != 0 ? false : z4;
        this.LIZ = str7;
        this.LIZIZ = j2;
        this.LIZJ = i3;
        this.LIZLLL = enumC1991107r32;
        this.LJ = bool2;
        this.LJFF = str6;
        this.LJI = list3;
        this.LJII = str5;
        this.LJIIIIZZ = c1854790yMn2;
        this.LJIIIZ = str4;
        this.LJIIJ = c1854150yLl2;
        this.LJIIJJI = c1861290yXH2;
        this.LJIIL = takoReferenceAskInfo2;
        this.LJIILIIL = takoEditAskInfo2;
        this.LJIILJJIL = list4;
        this.LJIILL = subConversationConfig2;
        this.LJIILLIIL = z6;
        this.LJIIZILJ = z5;
        this.LJIJ = z4;
    }
}
