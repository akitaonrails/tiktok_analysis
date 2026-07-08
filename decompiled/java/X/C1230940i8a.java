package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230940i8a implements InterfaceC1891350zJl {
    public final String LL;
    public final long LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final String LLILZLL;
    public final int LLIZ;
    public final String LLIZLLLIL;
    public final int LLJ;
    public final boolean LLJI;
    public final int LLJIJIL;
    public final Map<String, String> LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230940i8a)) {
            return false;
        }
        C1230940i8a c1230940i8a = (C1230940i8a) obj;
        return Intrinsics.LJFF(this.LL, c1230940i8a.LL) && this.LLILLJJLI == c1230940i8a.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1230940i8a.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1230940i8a.LLILZ) && this.LLILZIL == c1230940i8a.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1230940i8a.LLILZLL) && this.LLIZ == c1230940i8a.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1230940i8a.LLIZLLLIL) && this.LLJ == c1230940i8a.LLJ && this.LLJI == c1230940i8a.LLJI && this.LLJIJIL == c1230940i8a.LLJIJIL && Intrinsics.LJFF(this.LLJILJIL, c1230940i8a.LLJILJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.LL.hashCode() * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ) * 31) + C786410Ut5.Z2(this.LLJI)) * 31) + this.LLJIJIL) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "FanGroupItem(conversationId=" + this.LL + ", convShortId=" + this.LLILLJJLI + ", groupName=" + this.LLILLL + ", groupAvatar=" + this.LLILZ + ", groupMemberCount=" + this.LLILZIL + ", groupDesc=" + this.LLILZLL + ", groupStatus=" + this.LLIZ + ", thresholdMsg=" + this.LLIZLLLIL + ", businessType=" + this.LLJ + ", enableClickToSelect=" + this.LLJI + ", pageStyle=" + this.LLJIJIL + ", eventExtra=" + this.LLJILJIL + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1230940i8a)) {
            return false;
        }
        C1230940i8a c1230940i8a = (C1230940i8a) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1230940i8a.LL) || !Intrinsics.LJFF(this.LLILLL, c1230940i8a.LLILLL) || !Intrinsics.LJFF(this.LLILZ, c1230940i8a.LLILZ) || this.LLILZIL != c1230940i8a.LLILZIL || !Intrinsics.LJFF(this.LLILZLL, c1230940i8a.LLILZLL) || this.LLIZ != c1230940i8a.LLIZ || !Intrinsics.LJFF(this.LLIZLLLIL, c1230940i8a.LLIZLLLIL) || this.LLJ != c1230940i8a.LLJ || this.LLJI != c1230940i8a.LLJI) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1230940i8a) || this.LLILLJJLI != ((C1230940i8a) interfaceC1891350zJl).LLILLJJLI) {
            return false;
        }
        return true;
    }

    public C1230940i8a(String str, long j, String str2, String str3, int i, String str4, int i2, String str5, int i3, boolean z, int i4, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = i;
        this.LLILZLL = str4;
        this.LLIZ = i2;
        this.LLIZLLLIL = str5;
        this.LLJ = i3;
        this.LLJI = z;
        this.LLJIJIL = i4;
        this.LLJILJIL = map;
    }
}
