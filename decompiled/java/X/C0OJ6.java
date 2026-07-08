package X;

import android.view.View;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJ6 implements InterfaceC1891350zJl {
    public final String LL;
    public final CharSequence LLILLJJLI;
    public final Integer LLILLL;
    public final C0OJ9 LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final Function2<Boolean, View, Unit> LLJ;
    public final C0OJ0 LLJI;
    public final boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final Integer LLJILJILJ;

    public C0OJ6() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OJ6)) {
            return false;
        }
        C0OJ6 c0oj6 = (C0OJ6) obj;
        return Intrinsics.LJFF(this.LL, c0oj6.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0oj6.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0oj6.LLILLL) && this.LLILZ == c0oj6.LLILZ && this.LLILZIL == c0oj6.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0oj6.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0oj6.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0oj6.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0oj6.LLJ) && Intrinsics.LJFF(this.LLJI, c0oj6.LLJI) && this.LLJIJIL == c0oj6.LLJIJIL && this.LLJILJIL == c0oj6.LLJILJIL && Intrinsics.LJFF(this.LLJILJILJ, c0oj6.LLJILJILJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        CharSequence charSequence = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31;
        String str = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        C0OJ0 c0oj0 = this.LLJI;
        int iHashCode7 = (((((iHashCode6 + (c0oj0 == null ? 0 : c0oj0.hashCode())) * 31) + C786410Ut5.Z2(this.LLJIJIL)) * 31) + C786410Ut5.Z2(this.LLJILJIL)) * 31;
        Integer num2 = this.LLJILJILJ;
        return iHashCode7 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinFunctionChildSwitchItem(title=" + this.LL + ", subtitle=" + ((Object) this.LLILLJJLI) + ", type=" + this.LLILLL + ", status=" + this.LLILZ + ", entranceId=" + this.LLILZIL + ", entranceKey=" + this.LLILZLL + ", bbId=" + this.LLIZ + ", mobIdentity=" + this.LLIZLLLIL + ", updateStatus=" + this.LLJ + ", uiConfig=" + this.LLJI + ", needHighlight=" + this.LLJIJIL + ", enable=" + this.LLJILJIL + ", disableToastResId=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OJ6 c0oj6;
        if ((interfaceC1891350zJl instanceof C0OJ6) && (c0oj6 = (C0OJ6) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(this.LLILLL, c0oj6.LLILLL);
        }
        return false;
    }

    public C0OJ6(String str, CharSequence charSequence, Integer num, C0OJ9 c0oj9, int i, String str2, String str3, String str4, Function2 function2, C0OJ0 c0oj0, boolean z, boolean z2, Integer num2, int i2) {
        charSequence = (i2 & 2) != 0 ? null : charSequence;
        num = (i2 & 4) != 0 ? null : num;
        str2 = (i2 & 32) != 0 ? null : str2;
        str3 = (i2 & 64) != 0 ? null : str3;
        str4 = (i2 & 128) != 0 ? null : str4;
        c0oj0 = (i2 & 512) != 0 ? null : c0oj0;
        z = (i2 & 1024) != 0 ? false : z;
        z2 = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? true : z2;
        Integer num3 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? num2 : null;
        this.LL = str;
        this.LLILLJJLI = charSequence;
        this.LLILLL = num;
        this.LLILZ = c0oj9;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = function2;
        this.LLJI = c0oj0;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = num3;
    }
}
