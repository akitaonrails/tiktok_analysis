package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iwl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262050iwl extends AbstractC1262180iwy {
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final boolean LLJILJIL;
    public final Integer LLJILJILJ;
    public final boolean LLJILLL;
    public final String LLJJ;

    public C1262050iwl() {
        this(0, 0, 0, 0, 0, 0, 0, 0, false, null, false, 8191);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1262050iwl)) {
            return false;
        }
        C1262050iwl c1262050iwl = (C1262050iwl) obj;
        return this.LLILLJJLI == c1262050iwl.LLILLJJLI && this.LLILLL == c1262050iwl.LLILLL && this.LLILZ == c1262050iwl.LLILZ && this.LLILZIL == c1262050iwl.LLILZIL && this.LLILZLL == c1262050iwl.LLILZLL && this.LLIZ == c1262050iwl.LLIZ && this.LLIZLLLIL == c1262050iwl.LLIZLLLIL && this.LLJ == c1262050iwl.LLJ && this.LLJI == c1262050iwl.LLJI && this.LLJIJIL == c1262050iwl.LLJIJIL && this.LLJILJIL == c1262050iwl.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c1262050iwl.LLJILJILJ) && this.LLJILLL == c1262050iwl.LLJILLL;
    }

    public final int hashCode() {
        int iZ2 = ((((((((((((((((((((this.LLILLJJLI * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL) * 31) + this.LLJ) * 31) + this.LLJI) * 31) + this.LLJIJIL) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31;
        Integer num = this.LLJILJILJ;
        return ((iZ2 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILLL);
    }

    public final String toString() {
        return "NormalTitle(textRes=" + this.LLILLJJLI + ", colorLight=" + this.LLILLL + ", tuxFont=" + this.LLILZ + ", colorDark=" + this.LLILZIL + ", paddingStart=" + this.LLILZLL + ", paddingBottom=" + this.LLIZ + ", paddingEnd=" + this.LLIZLLLIL + ", paddingTop=" + this.LLJ + ", infoIconSize=" + this.LLJI + ", infoIconMarginStart=" + this.LLJIJIL + ", useCustomInfoStyle=" + this.LLJILJIL + ", infoIconTintColor=" + this.LLJILJILJ + ", removeLayoutBg=" + this.LLJILLL + ')';
    }

    @Override // X.InterfaceC1262230ix3
    public final String getElementId() {
        return this.LLJJ;
    }

    public C1262050iwl(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, Integer num, boolean z2, int i9) {
        int iLIZIZ;
        i = (i9 & 1) != 0 ? 2131845822 : i;
        i2 = (i9 & 2) != 0 ? R.attr.a1k : i2;
        i3 = (i9 & 4) != 0 ? 62 : i3;
        i4 = (i9 & 8) != 0 ? R.attr.eh : i4;
        if ((i9 & 16) != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        } else {
            iLIZIZ = 0;
        }
        i5 = (i9 & 32) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) : i5;
        i6 = (i9 & 128) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : i6;
        i7 = (i9 & 256) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11)) : i7;
        i8 = (i9 & 512) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) : i8;
        z = (i9 & 1024) != 0 ? false : z;
        num = (i9 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num;
        z2 = (i9 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z2;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
        this.LLILZLL = iLIZIZ;
        this.LLIZ = i5;
        this.LLIZLLLIL = 0;
        this.LLJ = i6;
        this.LLJI = i7;
        this.LLJIJIL = i8;
        this.LLJILJIL = z;
        this.LLJILJILJ = num;
        this.LLJILLL = z2;
        this.LLJJ = "Normal_Title";
    }
}
