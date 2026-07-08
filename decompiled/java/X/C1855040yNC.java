package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoEditAskInfo;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoReferenceAskInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyleItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yNC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1855040yNC implements InterfaceC0148002o {
    public final C291001Au<EnumC1855060yNE> LL;
    public final C1854150yLl LLILLJJLI;
    public final TakoEditAskInfo LLILLL;
    public final TakoReferenceAskInfo LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final List<BaseImage> LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final boolean LLJI;
    public final List<C1854470yMH> LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;
    public final ConvertStyleItem LLJILLL;
    public final EnumC1854550yMP LLJJ;
    public final boolean LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;

    public C1855040yNC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1855040yNC)) {
            return false;
        }
        C1855040yNC c1855040yNC = (C1855040yNC) obj;
        return Intrinsics.LJFF(this.LL, c1855040yNC.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1855040yNC.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1855040yNC.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1855040yNC.LLILZ) && this.LLILZIL == c1855040yNC.LLILZIL && this.LLILZLL == c1855040yNC.LLILZLL && Intrinsics.LJFF(this.LLIZ, c1855040yNC.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1855040yNC.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1855040yNC.LLJ) && this.LLJI == c1855040yNC.LLJI && Intrinsics.LJFF(this.LLJIJIL, c1855040yNC.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1855040yNC.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1855040yNC.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c1855040yNC.LLJILLL) && this.LLJJ == c1855040yNC.LLJJ && this.LLJJI == c1855040yNC.LLJJI && this.LLJJIII == c1855040yNC.LLJJIII && this.LLJJIJI == c1855040yNC.LLJJIJI;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C1854150yLl c1854150yLl = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c1854150yLl == null ? 0 : c1854150yLl.hashCode())) * 31;
        TakoEditAskInfo takoEditAskInfo = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (takoEditAskInfo == null ? 0 : takoEditAskInfo.hashCode())) * 31;
        TakoReferenceAskInfo takoReferenceAskInfo = this.LLILZ;
        int iHashCode4 = (((((((iHashCode3 + (takoReferenceAskInfo == null ? 0 : takoReferenceAskInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + this.LLIZ.hashCode()) * 31;
        String str = this.LLIZLLLIL;
        int iHashCode5 = (((((iHashCode4 + (str == null ? 0 : str.hashCode())) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJI)) * 31;
        List<C1854470yMH> list = this.LLJIJIL;
        int iHashCode6 = (((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.LLJILJIL.hashCode()) * 31;
        String str2 = this.LLJILJILJ;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ConvertStyleItem convertStyleItem = this.LLJILLL;
        int iHashCode8 = (iHashCode7 + (convertStyleItem == null ? 0 : convertStyleItem.hashCode())) * 31;
        EnumC1854550yMP enumC1854550yMP = this.LLJJ;
        return ((((((iHashCode8 + (enumC1854550yMP != null ? enumC1854550yMP.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI);
    }

    public final String toString() {
        return "BottomInputState(applyViewStateEvent=" + this.LL + ", activeSubModeItem=" + this.LLILLJJLI + ", editAskInfo=" + this.LLILLL + ", referenceAskInfo=" + this.LLILZ + ", addTextFromVoice=" + this.LLILZIL + ", isVoiceTalkV2=" + this.LLILZLL + ", displayPhotoSnapshot=" + this.LLIZ + ", displayPhotoScene=" + this.LLIZLLLIL + ", interactionType=" + this.LLJ + ", isStop=" + this.LLJI + ", actionBarSugListData=" + this.LLJIJIL + ", inputText=" + this.LLJILJIL + ", inputHint=" + this.LLJILJILJ + ", selectedStyleSubSkill=" + this.LLJILLL + ", selectedSkillLabel=" + this.LLJJ + ", askStatus=" + this.LLJJI + ", editTextHasFocus=" + this.LLJJIII + ", isLayoutActive=" + this.LLJJIJI + ')';
    }

    public C1855040yNC(int i) {
        this(new C291001Au(EnumC1855060yNE.EMPTY), null, null, null, false, false, C13BV.INSTANCE, null, "manual_input", false, null, "", null, null, null, true, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1855040yNC(C291001Au<? extends EnumC1855060yNE> c291001Au, C1854150yLl c1854150yLl, TakoEditAskInfo takoEditAskInfo, TakoReferenceAskInfo takoReferenceAskInfo, boolean z, boolean z2, List<BaseImage> list, String str, String str2, boolean z3, List<C1854470yMH> list2, String str3, String str4, ConvertStyleItem convertStyleItem, EnumC1854550yMP enumC1854550yMP, boolean z4, boolean z5, boolean z6) {
        this.LL = c291001Au;
        this.LLILLJJLI = c1854150yLl;
        this.LLILLL = takoEditAskInfo;
        this.LLILZ = takoReferenceAskInfo;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = list;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = z3;
        this.LLJIJIL = list2;
        this.LLJILJIL = str3;
        this.LLJILJILJ = str4;
        this.LLJILLL = convertStyleItem;
        this.LLJJ = enumC1854550yMP;
        this.LLJJI = z4;
        this.LLJJIII = z5;
        this.LLJJIJI = z6;
    }

    public static C1855040yNC LIZ(C1855040yNC c1855040yNC, C291001Au c291001Au, C1854150yLl c1854150yLl, TakoEditAskInfo takoEditAskInfo, TakoReferenceAskInfo takoReferenceAskInfo, boolean z, boolean z2, List list, String str, String str2, boolean z3, List list2, String str3, String str4, ConvertStyleItem convertStyleItem, EnumC1854550yMP enumC1854550yMP, boolean z4, boolean z5, boolean z6, int i) {
        boolean z7 = z6;
        boolean z8 = z5;
        String str5 = str4;
        String str6 = str3;
        List list3 = list2;
        boolean z9 = z3;
        String str7 = str2;
        boolean z10 = z4;
        String str8 = str;
        List list4 = list;
        boolean z11 = z2;
        boolean z12 = z;
        EnumC1854550yMP enumC1854550yMP2 = enumC1854550yMP;
        TakoReferenceAskInfo takoReferenceAskInfo2 = takoReferenceAskInfo;
        TakoEditAskInfo takoEditAskInfo2 = takoEditAskInfo;
        C1854150yLl c1854150yLl2 = c1854150yLl;
        ConvertStyleItem convertStyleItem2 = convertStyleItem;
        C291001Au c291001Au2 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au2 = c1855040yNC.LL;
        }
        if ((i & 2) != 0) {
            c1854150yLl2 = c1855040yNC.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            takoEditAskInfo2 = c1855040yNC.LLILLL;
        }
        if ((i & 8) != 0) {
            takoReferenceAskInfo2 = c1855040yNC.LLILZ;
        }
        if ((i & 16) != 0) {
            z12 = c1855040yNC.LLILZIL;
        }
        if ((i & 32) != 0) {
            z11 = c1855040yNC.LLILZLL;
        }
        if ((i & 64) != 0) {
            list4 = c1855040yNC.LLIZ;
        }
        if ((i & 128) != 0) {
            str8 = c1855040yNC.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            str7 = c1855040yNC.LLJ;
        }
        if ((i & 512) != 0) {
            z9 = c1855040yNC.LLJI;
        }
        if ((i & 1024) != 0) {
            list3 = c1855040yNC.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = c1855040yNC.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str5 = c1855040yNC.LLJILJILJ;
        }
        if ((i & 8192) != 0) {
            convertStyleItem2 = c1855040yNC.LLJILLL;
        }
        if ((i & 16384) != 0) {
            enumC1854550yMP2 = c1855040yNC.LLJJ;
        }
        if ((32768 & i) != 0) {
            z10 = c1855040yNC.LLJJI;
        }
        if ((65536 & i) != 0) {
            z8 = c1855040yNC.LLJJIII;
        }
        if ((i & 131072) != 0) {
            z7 = c1855040yNC.LLJJIJI;
        }
        c1855040yNC.getClass();
        TakoReferenceAskInfo takoReferenceAskInfo3 = takoReferenceAskInfo2;
        boolean z13 = z12;
        return new C1855040yNC(c291001Au2, c1854150yLl2, takoEditAskInfo2, takoReferenceAskInfo3, z13, z11, list4, str8, str7, z9, list3, str6, str5, convertStyleItem2, enumC1854550yMP2, z10, z8, z7);
    }
}
