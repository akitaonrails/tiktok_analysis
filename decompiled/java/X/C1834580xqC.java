package X;

import com.bytedance.android.livesdk.replay.proto.PublishPageParams;
import com.bytedance.android.livesdk.replay.proto.TextStickerConfig;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xqC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1834580xqC implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final long LLJIJIL;
    public final float LLJILJIL;
    public final int LLJILJILJ;
    public final PublishPageParams LLJILLL;
    public final String LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public final int LLJJIJI;
    public final String LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final long LLJJJ;
    public final boolean LLJJJIL;
    public final int LLJJJJ;
    public final boolean LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final long LLJLIL;
    public final long LLJLILLLLZIIL;
    public final String LLJLL;
    public long LLJLLIL;
    public final String LLJLLL;
    public boolean LLJZ;
    public TextStickerConfig LLJZIJLIL;
    public double LLL;
    public double LLLF;
    public final boolean LLLFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1834580xqC)) {
            return false;
        }
        C1834580xqC c1834580xqC = (C1834580xqC) obj;
        return this.LL == c1834580xqC.LL && Intrinsics.LJFF(this.LLILLJJLI, c1834580xqC.LLILLJJLI) && this.LLILLL == c1834580xqC.LLILLL && this.LLILZ == c1834580xqC.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1834580xqC.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1834580xqC.LLILZLL) && this.LLIZ == c1834580xqC.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1834580xqC.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1834580xqC.LLJ) && Intrinsics.LJFF(this.LLJI, c1834580xqC.LLJI) && this.LLJIJIL == c1834580xqC.LLJIJIL && Float.compare(this.LLJILJIL, c1834580xqC.LLJILJIL) == 0 && this.LLJILJILJ == c1834580xqC.LLJILJILJ && Intrinsics.LJFF(this.LLJILLL, c1834580xqC.LLJILLL) && Intrinsics.LJFF(this.LLJJ, c1834580xqC.LLJJ) && this.LLJJI == c1834580xqC.LLJJI && this.LLJJIII == c1834580xqC.LLJJIII && this.LLJJIJI == c1834580xqC.LLJJIJI && Intrinsics.LJFF(this.LLJJIJIIJIL, c1834580xqC.LLJJIJIIJIL) && this.LLJJIJIL == c1834580xqC.LLJJIJIL && this.LLJJJ == c1834580xqC.LLJJJ && this.LLJJJIL == c1834580xqC.LLJJJIL && this.LLJJJJ == c1834580xqC.LLJJJJ && this.LLJJJJJIL == c1834580xqC.LLJJJJJIL && Intrinsics.LJFF(this.LLJJJJLIIL, c1834580xqC.LLJJJJLIIL) && this.LLJJL == c1834580xqC.LLJJL && this.LLJJLIIIJLLLLLLLZ == c1834580xqC.LLJJLIIIJLLLLLLLZ && this.LLJL == c1834580xqC.LLJL && this.LLJLIL == c1834580xqC.LLJLIL && this.LLJLILLLLZIIL == c1834580xqC.LLJLILLLLZIIL && Intrinsics.LJFF(this.LLJLL, c1834580xqC.LLJLL) && this.LLJLLIL == c1834580xqC.LLJLLIL && Intrinsics.LJFF(this.LLJLLL, c1834580xqC.LLJLLL) && this.LLJZ == c1834580xqC.LLJZ && Intrinsics.LJFF(this.LLJZIJLIL, c1834580xqC.LLJZIJLIL) && Double.compare(this.LLL, c1834580xqC.LLL) == 0 && Double.compare(this.LLLF, c1834580xqC.LLLF) == 0 && this.LLLFF == c1834580xqC.LLLFF;
    }

    public final String toString() {
        return "LiveHighlightVideoItem(type=" + this.LL + ", roomId=" + this.LLILLJJLI + ", needShare=" + this.LLILLL + ", fragmentId=" + this.LLILZ + ", coverUrl=" + this.LLILZIL + ", title=" + this.LLILZLL + ", videoStatus=" + this.LLIZ + ", playUrl=" + this.LLIZLLLIL + ", downloadUrl=" + this.LLJ + ", messageContentPb=" + this.LLJI + ", replayRelativeTime=" + this.LLJIJIL + ", duration=" + this.LLJILJIL + ", fragmentTypeNew=" + this.LLJILJILJ + ", publishPageParams=" + this.LLJILLL + ", businessExtra=" + this.LLJJ + ", isPosted=" + this.LLJJI + ", postStatus=" + this.LLJJIII + ", videoSize=" + this.LLJJIJI + ", shareScene=" + this.LLJJIJIIJIL + ", userType=" + this.LLJJIJIL + ", createTime=" + this.LLJJJ + ", roomRevertSwitchOpen=" + this.LLJJJIL + ", revertStatus=" + this.LLJJJJ + ", showRevertVideo=" + this.LLJJJJJIL + ", revivePlayUrl=" + this.LLJJJJLIIL + ", isQuickPost=" + this.LLJJL + ", successTipEnable=" + this.LLJJLIIIJLLLLLLLZ + ", failTipEnable=" + this.LLJL + ", videoWidth=" + this.LLJLIL + ", videoHeight=" + this.LLJLILLLLZIIL + ", vid=" + this.LLJLL + ", selectMusic=" + this.LLJLLIL + ", fileId=" + this.LLJLLL + ", textStickerVisible=" + this.LLJZ + ", textStickerConfig=" + this.LLJZIJLIL + ", captionCenterOffsetX=" + this.LLL + ", captionCenterOffsetY=" + this.LLLF + ", hasDetectedMusic=" + this.LLLFF + ')';
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Y2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31) + C786410Ut5.Y2(this.LLJIJIL)) * 31) + Float.floatToIntBits(this.LLJILJIL)) * 31) + this.LLJILJILJ) * 31;
        PublishPageParams publishPageParams = this.LLJILLL;
        int iHashCode2 = (((((((((((((((((((((((((((((((((((((((((iHashCode + (publishPageParams == null ? 0 : publishPageParams.hashCode())) * 31) + this.LLJJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + this.LLJJIII) * 31) + this.LLJJIJI) * 31) + this.LLJJIJIIJIL.hashCode()) * 31) + this.LLJJIJIL) * 31) + C786410Ut5.Y2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + this.LLJJJJ) * 31) + C786410Ut5.Z2(this.LLJJJJJIL)) * 31) + this.LLJJJJLIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJL)) * 31) + C786410Ut5.Z2(this.LLJJLIIIJLLLLLLLZ)) * 31) + C786410Ut5.Z2(this.LLJL)) * 31) + C786410Ut5.Y2(this.LLJLIL)) * 31) + C786410Ut5.Y2(this.LLJLILLLLZIIL)) * 31) + this.LLJLL.hashCode()) * 31) + C786410Ut5.Y2(this.LLJLLIL)) * 31) + this.LLJLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJZ)) * 31;
        TextStickerConfig textStickerConfig = this.LLJZIJLIL;
        return ((((((iHashCode2 + (textStickerConfig != null ? textStickerConfig.hashCode() : 0)) * 31) + C786410Ut5.X2(this.LLL)) * 31) + C786410Ut5.X2(this.LLLF)) * 31) + C786410Ut5.Z2(this.LLLFF);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834580xqC c1834580xqC;
        C1834580xqC c1834580xqC2;
        boolean z = interfaceC1891350zJl instanceof C1834580xqC;
        if (z && (c1834580xqC = (C1834580xqC) interfaceC1891350zJl) != null && this.LLJJI == c1834580xqC.LLJJI && z && (c1834580xqC2 = (C1834580xqC) interfaceC1891350zJl) != null && this.LLJJJJ == c1834580xqC2.LLJJJJ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834580xqC c1834580xqC;
        if (interfaceC1891350zJl instanceof C1834580xqC) {
            c1834580xqC = (C1834580xqC) interfaceC1891350zJl;
        } else {
            c1834580xqC = null;
        }
        if (c1834580xqC == null || this.LLILZ != c1834580xqC.LLILZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1834580xqC c1834580xqC;
        C1834580xqC c1834580xqC2;
        C1834580xqC c1834580xqC3;
        boolean z = interfaceC1891350zJl instanceof C1834580xqC;
        if (z && (c1834580xqC = (C1834580xqC) interfaceC1891350zJl) != null && this.LLIZ == c1834580xqC.LLIZ) {
            if (z && (c1834580xqC2 = (C1834580xqC) interfaceC1891350zJl) != null && this.LLJJI == c1834580xqC2.LLJJI) {
                if (z && (c1834580xqC3 = (C1834580xqC) interfaceC1891350zJl) != null && this.LLJJJJ == c1834580xqC3.LLJJJJ) {
                    return null;
                }
                return 4;
            }
            return 3;
        }
        return 2;
    }

    public static C1834580xqC LIZ(C1834580xqC c1834580xqC, int i, boolean z, String str, boolean z2, TextStickerConfig textStickerConfig, int i2, int i3) {
        int i4;
        String str2;
        boolean z3;
        long j;
        String str3;
        String str4;
        int i5;
        String str5;
        String str6;
        String str7;
        long j2;
        float f;
        int i6;
        PublishPageParams publishPageParams;
        String str8;
        boolean z4;
        int i7;
        int i8;
        String str9;
        int i9;
        long j3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        long j4;
        long j5;
        String str10;
        long j6;
        String str11;
        double d;
        double d2;
        boolean z9;
        TextStickerConfig textStickerConfig2 = textStickerConfig;
        boolean z10 = z2;
        String str12 = str;
        boolean z11 = z;
        int i10 = i;
        if ((i2 & 1) != 0) {
            i4 = c1834580xqC.LL;
        } else {
            i4 = 0;
        }
        if ((i2 & 2) != 0) {
            str2 = c1834580xqC.LLILLJJLI;
        } else {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            z3 = c1834580xqC.LLILLL;
        } else {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            j = c1834580xqC.LLILZ;
        } else {
            j = 0;
        }
        if ((i2 & 16) != 0) {
            str3 = c1834580xqC.LLILZIL;
        } else {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = c1834580xqC.LLILZLL;
        } else {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            i5 = c1834580xqC.LLIZ;
        } else {
            i5 = 0;
        }
        if ((i2 & 128) != 0) {
            str5 = c1834580xqC.LLIZLLLIL;
        } else {
            str5 = null;
        }
        if ((i2 & 256) != 0) {
            str6 = c1834580xqC.LLJ;
        } else {
            str6 = null;
        }
        if ((i2 & 512) != 0) {
            str7 = c1834580xqC.LLJI;
        } else {
            str7 = null;
        }
        if ((i2 & 1024) != 0) {
            j2 = c1834580xqC.LLJIJIL;
        } else {
            j2 = 0;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            f = c1834580xqC.LLJILJIL;
        } else {
            f = 0.0f;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            i6 = c1834580xqC.LLJILJILJ;
        } else {
            i6 = 0;
        }
        if ((i2 & 8192) != 0) {
            publishPageParams = c1834580xqC.LLJILLL;
        } else {
            publishPageParams = null;
        }
        if ((i2 & 16384) != 0) {
            str8 = c1834580xqC.LLJJ;
        } else {
            str8 = null;
        }
        if ((32768 & i2) != 0) {
            z4 = c1834580xqC.LLJJI;
        } else {
            z4 = false;
        }
        if ((65536 & i2) != 0) {
            i7 = c1834580xqC.LLJJIII;
        } else {
            i7 = 0;
        }
        if ((131072 & i2) != 0) {
            i8 = c1834580xqC.LLJJIJI;
        } else {
            i8 = 0;
        }
        if ((262144 & i2) != 0) {
            str9 = c1834580xqC.LLJJIJIIJIL;
        } else {
            str9 = null;
        }
        if ((524288 & i2) != 0) {
            i9 = c1834580xqC.LLJJIJIL;
        } else {
            i9 = 0;
        }
        if ((1048576 & i2) != 0) {
            j3 = c1834580xqC.LLJJJ;
        } else {
            j3 = 0;
        }
        if ((2097152 & i2) != 0) {
            z5 = c1834580xqC.LLJJJIL;
        } else {
            z5 = false;
        }
        if ((4194304 & i2) != 0) {
            i10 = c1834580xqC.LLJJJJ;
        }
        if ((8388608 & i2) != 0) {
            z11 = c1834580xqC.LLJJJJJIL;
        }
        if ((16777216 & i2) != 0) {
            str12 = c1834580xqC.LLJJJJLIIL;
        }
        if ((33554432 & i2) != 0) {
            z6 = c1834580xqC.LLJJL;
        } else {
            z6 = false;
        }
        if ((67108864 & i2) != 0) {
            z7 = c1834580xqC.LLJJLIIIJLLLLLLLZ;
        } else {
            z7 = false;
        }
        if ((134217728 & i2) != 0) {
            z8 = c1834580xqC.LLJL;
        } else {
            z8 = false;
        }
        if ((268435456 & i2) != 0) {
            j4 = c1834580xqC.LLJLIL;
        } else {
            j4 = 0;
        }
        if ((536870912 & i2) != 0) {
            j5 = c1834580xqC.LLJLILLLLZIIL;
        } else {
            j5 = 0;
        }
        if ((1073741824 & i2) != 0) {
            str10 = c1834580xqC.LLJLL;
        } else {
            str10 = null;
        }
        if ((i2 & Integer.MIN_VALUE) != 0) {
            j6 = c1834580xqC.LLJLLIL;
        } else {
            j6 = 0;
        }
        if ((i3 & 1) != 0) {
            str11 = c1834580xqC.LLJLLL;
        } else {
            str11 = null;
        }
        if ((i3 & 2) != 0) {
            z10 = c1834580xqC.LLJZ;
        }
        if ((i3 & 4) != 0) {
            textStickerConfig2 = c1834580xqC.LLJZIJLIL;
        }
        if ((i3 & 8) != 0) {
            d = c1834580xqC.LLL;
        } else {
            d = 0.0d;
        }
        if ((i3 & 16) != 0) {
            d2 = c1834580xqC.LLLF;
        } else {
            d2 = 0.0d;
        }
        if ((i3 & 32) != 0) {
            z9 = c1834580xqC.LLLFF;
        } else {
            z9 = false;
        }
        c1834580xqC.getClass();
        return new C1834580xqC(i4, str2, z3, j, str3, str4, i5, str5, str6, str7, j2, f, i6, publishPageParams, str8, z4, i7, i8, str9, i9, j3, z5, i10, z11, str12, z6, z7, z8, j4, j5, str10, j6, str11, z10, textStickerConfig2, d, d2, z9);
    }

    public /* synthetic */ C1834580xqC(int i, String str, boolean z, long j, String str2, String str3, int i2, String str4, String str5, String str6, long j2, float f, int i3, PublishPageParams publishPageParams, String str7, boolean z2, int i4, int i5, String str8, int i6, long j3, boolean z3, int i7, boolean z4, String str9, boolean z5, boolean z6, boolean z7, long j4, long j5, String str10, String str11, boolean z8, TextStickerConfig textStickerConfig, boolean z9, int i8) {
        this(i, str, z, j, str2, str3, i2, str4, str5, str6, j2, f, i3, publishPageParams, str7, z2, i4, i5, str8, i6, j3, z3, (i8 & 4194304) != 0 ? 0 : i7, (i8 & 8388608) != 0 ? false : z4, str9, z5, z6, z7, (i8 & 268435456) != 0 ? 0L : j4, (i8 & 536870912) != 0 ? 0L : j5, (i8 & 1073741824) != 0 ? "" : str10, 0L, str11, z8, textStickerConfig, 0.0d, 0.0d, z9);
    }

    public C1834580xqC(int i, String str, boolean z, long j, String str2, String str3, int i2, String str4, String str5, String str6, long j2, float f, int i3, PublishPageParams publishPageParams, String str7, boolean z2, int i4, int i5, String str8, int i6, long j3, boolean z3, int i7, boolean z4, String str9, boolean z5, boolean z6, boolean z7, long j4, long j5, String str10, long j6, String str11, boolean z8, TextStickerConfig textStickerConfig, double d, double d2, boolean z9) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = j;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = i2;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = str6;
        this.LLJIJIL = j2;
        this.LLJILJIL = f;
        this.LLJILJILJ = i3;
        this.LLJILLL = publishPageParams;
        this.LLJJ = str7;
        this.LLJJI = z2;
        this.LLJJIII = i4;
        this.LLJJIJI = i5;
        this.LLJJIJIIJIL = str8;
        this.LLJJIJIL = i6;
        this.LLJJJ = j3;
        this.LLJJJIL = z3;
        this.LLJJJJ = i7;
        this.LLJJJJJIL = z4;
        this.LLJJJJLIIL = str9;
        this.LLJJL = z5;
        this.LLJJLIIIJLLLLLLLZ = z6;
        this.LLJL = z7;
        this.LLJLIL = j4;
        this.LLJLILLLLZIIL = j5;
        this.LLJLL = str10;
        this.LLJLLIL = j6;
        this.LLJLLL = str11;
        this.LLJZ = z8;
        this.LLJZIJLIL = textStickerConfig;
        this.LLL = d;
        this.LLLF = d2;
        this.LLLFF = z9;
    }
}
