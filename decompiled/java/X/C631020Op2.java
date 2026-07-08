package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.music.model.ArtistHonorLabel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Op2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631020Op2 implements InterfaceC1891350zJl {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final UrlModel LLILZ;
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public final Integer LLJ;
    public final boolean LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final Integer LLJILJILJ;
    public final Boolean LLJILLL;
    public final String LLJJ;
    public final C630990Ooz LLJJI;
    public final ArtistHonorLabel LLJJIII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C631020Op2)) {
            return false;
        }
        C631020Op2 c631020Op2 = (C631020Op2) obj;
        return Intrinsics.LJFF(this.LL, c631020Op2.LL) && Intrinsics.LJFF(this.LLILLJJLI, c631020Op2.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c631020Op2.LLILLL) && Intrinsics.LJFF(this.LLILZ, c631020Op2.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c631020Op2.LLILZIL) && this.LLILZLL == c631020Op2.LLILZLL && Intrinsics.LJFF(this.LLIZ, c631020Op2.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c631020Op2.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c631020Op2.LLJ) && this.LLJI == c631020Op2.LLJI && this.LLJIJIL == c631020Op2.LLJIJIL && this.LLJILJIL == c631020Op2.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c631020Op2.LLJILJILJ) && Intrinsics.LJFF(this.LLJILLL, c631020Op2.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c631020Op2.LLJJ) && Intrinsics.LJFF(this.LLJJI, c631020Op2.LLJJI) && this.LLJJIII == c631020Op2.LLJJIII;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UrlModel urlModel = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str4 = this.LLILZIL;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        String str5 = this.LLIZ;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LLJ;
        int iHashCode8 = (((((((iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31;
        Integer num3 = this.LLJILJILJ;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.LLJILLL;
        int iHashCode10 = (((iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLJJ.hashCode()) * 31;
        C630990Ooz c630990Ooz = this.LLJJI;
        int iHashCode11 = (iHashCode10 + (c630990Ooz == null ? 0 : c630990Ooz.hashCode())) * 31;
        ArtistHonorLabel artistHonorLabel = this.LLJJIII;
        return iHashCode11 + (artistHonorLabel != null ? artistHonorLabel.hashCode() : 0);
    }

    public final String toString() {
        return "ArtistProfileMusicOwnerItem(awemeId=" + this.LL + ", uid=" + this.LLILLJJLI + ", secUid=" + this.LLILLL + ", avatar=" + this.LLILZ + ", nickName=" + this.LLILZIL + ", verified=" + this.LLILZLL + ", userName=" + this.LLIZ + ", followStatus=" + this.LLIZLLLIL + ", followerStatus=" + this.LLJ + ", isPrivateAccount=" + this.LLJI + ", isBlock=" + this.LLJIJIL + ", isBlocked=" + this.LLJILJIL + ", status=" + this.LLJILJILJ + ", showFollowBtn=" + this.LLJILLL + ", type=" + this.LLJJ + ", extra=" + this.LLJJI + ", artistType=" + this.LLJJIII + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C631020Op2) {
            C631020Op2 c631020Op2 = (C631020Op2) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c631020Op2.LLIZLLLIL, this.LLIZLLLIL) && Intrinsics.LJFF(c631020Op2.LLJ, this.LLJ) && c631020Op2.LLJI == this.LLJI && c631020Op2.LLJIJIL == this.LLJIJIL && c631020Op2.LLJILJIL == this.LLJILJIL && Intrinsics.LJFF(c631020Op2.LLJILJILJ, this.LLJILJILJ) && Intrinsics.LJFF(c631020Op2.LLJILLL, this.LLJILLL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C631020Op2) {
            C631020Op2 c631020Op2 = (C631020Op2) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c631020Op2.LL, this.LL) && Intrinsics.LJFF(c631020Op2.LLILLJJLI, this.LLILLJJLI) && Intrinsics.LJFF(c631020Op2.LLILLL, this.LLILLL) && c631020Op2.LLJJIII == this.LLJJIII) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public static C631020Op2 LIZ(C631020Op2 c631020Op2, Integer num, Integer num2, boolean z, boolean z2, int i) {
        String str;
        String str2;
        String str3;
        UrlModel urlModel;
        String str4;
        boolean z3;
        String str5;
        boolean z4;
        Integer num3;
        Boolean bool;
        String str6;
        C630990Ooz c630990Ooz;
        boolean z5 = z;
        boolean z6 = z2;
        Integer num4 = num2;
        Integer num5 = num;
        ArtistHonorLabel artistHonorLabel = null;
        if ((i & 1) != 0) {
            str = c631020Op2.LL;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = c631020Op2.LLILLJJLI;
        } else {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = c631020Op2.LLILLL;
        } else {
            str3 = null;
        }
        if ((i & 8) != 0) {
            urlModel = c631020Op2.LLILZ;
        } else {
            urlModel = null;
        }
        if ((i & 16) != 0) {
            str4 = c631020Op2.LLILZIL;
        } else {
            str4 = null;
        }
        if ((i & 32) != 0) {
            z3 = c631020Op2.LLILZLL;
        } else {
            z3 = false;
        }
        if ((i & 64) != 0) {
            str5 = c631020Op2.LLIZ;
        } else {
            str5 = null;
        }
        if ((i & 128) != 0) {
            num5 = c631020Op2.LLIZLLLIL;
        }
        if ((i & 256) != 0) {
            num4 = c631020Op2.LLJ;
        }
        if ((i & 512) != 0) {
            z4 = c631020Op2.LLJI;
        } else {
            z4 = false;
        }
        if ((i & 1024) != 0) {
            z5 = c631020Op2.LLJIJIL;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = c631020Op2.LLJILJIL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            num3 = c631020Op2.LLJILJILJ;
        } else {
            num3 = null;
        }
        if ((i & 8192) != 0) {
            bool = c631020Op2.LLJILLL;
        } else {
            bool = null;
        }
        if ((i & 16384) != 0) {
            str6 = c631020Op2.LLJJ;
        } else {
            str6 = null;
        }
        if ((32768 & i) != 0) {
            c630990Ooz = c631020Op2.LLJJI;
        } else {
            c630990Ooz = null;
        }
        if ((i & 65536) != 0) {
            artistHonorLabel = c631020Op2.LLJJIII;
        }
        c631020Op2.getClass();
        return new C631020Op2(str, str2, str3, urlModel, str4, z3, str5, num5, num4, z4, z5, z6, num3, bool, str6, c630990Ooz, artistHonorLabel);
    }

    public C631020Op2(String str, String str2, String str3, UrlModel urlModel, String str4, boolean z, String str5, Integer num, Integer num2, boolean z2, boolean z3, boolean z4, Integer num3, Boolean bool, String str6, C630990Ooz c630990Ooz, ArtistHonorLabel artistHonorLabel) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = urlModel;
        this.LLILZIL = str4;
        this.LLILZLL = z;
        this.LLIZ = str5;
        this.LLIZLLLIL = num;
        this.LLJ = num2;
        this.LLJI = z2;
        this.LLJIJIL = z3;
        this.LLJILJIL = z4;
        this.LLJILJILJ = num3;
        this.LLJILLL = bool;
        this.LLJJ = str6;
        this.LLJJI = c630990Ooz;
        this.LLJJIII = artistHonorLabel;
    }
}
