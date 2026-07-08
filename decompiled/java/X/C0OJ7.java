package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OJ7, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJ7 implements InterfaceC1891350zJl {
    public final String LL;
    public final CharSequence LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final Function1<Context, Unit> LLJ;
    public final C0OJ0 LLJI;
    public final boolean LLJIJIL;

    public C0OJ7() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OJ7)) {
            return false;
        }
        C0OJ7 c0oj7 = (C0OJ7) obj;
        return Intrinsics.LJFF(this.LL, c0oj7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0oj7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0oj7.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0oj7.LLILZ) && this.LLILZIL == c0oj7.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0oj7.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0oj7.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c0oj7.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c0oj7.LLJ) && Intrinsics.LJFF(this.LLJI, c0oj7.LLJI) && this.LLJIJIL == c0oj7.LLJIJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        CharSequence charSequence = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        Integer num = this.LLILZ;
        int iHashCode3 = (((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.LLILZIL) * 31;
        String str = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZLLLIL;
        int iHashCode6 = (((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.LLJ.hashCode()) * 31;
        C0OJ0 c0oj0 = this.LLJI;
        return ((iHashCode6 + (c0oj0 != null ? c0oj0.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        return "BulletinSettingDisclosureItem(title=" + this.LL + ", subtitle=" + ((Object) this.LLILLJJLI) + ", label=" + this.LLILLL + ", type=" + this.LLILZ + ", entranceId=" + this.LLILZIL + ", entranceKey=" + this.LLILZLL + ", bbId=" + this.LLIZ + ", mobIdentity=" + this.LLIZLLLIL + ", updateStatus=" + this.LLJ + ", uiConfig=" + this.LLJI + ", needHighlight=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0OJ7 c0oj7;
        if ((interfaceC1891350zJl instanceof C0OJ7) && (c0oj7 = (C0OJ7) interfaceC1891350zJl) != null) {
            return Intrinsics.LJFF(this.LLILZ, c0oj7.LLILZ);
        }
        return false;
    }

    public C0OJ7(String str, CharSequence charSequence, int i, String str2, String str3, String str4, Function1 function1, C0OJ0 c0oj0, int i2) {
        charSequence = (i2 & 2) != 0 ? null : charSequence;
        str2 = (i2 & 32) != 0 ? null : str2;
        str3 = (i2 & 64) != 0 ? null : str3;
        str4 = (i2 & 128) != 0 ? null : str4;
        c0oj0 = (i2 & 512) != 0 ? null : c0oj0;
        this.LL = str;
        this.LLILLJJLI = charSequence;
        this.LLILLL = "";
        this.LLILZ = null;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = function1;
        this.LLJI = c0oj0;
        this.LLJIJIL = false;
    }
}
