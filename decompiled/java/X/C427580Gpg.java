package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gpg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427580Gpg implements InterfaceC1891350zJl {
    public final String LL;
    public final CharSequence LLILLJJLI;
    public final String LLILLL;
    public final List<String> LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final boolean LLIZ;
    public final Function0<Unit> LLIZLLLIL;
    public final Function0<Unit> LLJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C427580Gpg)) {
            return false;
        }
        C427580Gpg c427580Gpg = (C427580Gpg) obj;
        return Intrinsics.LJFF(this.LL, c427580Gpg.LL) && Intrinsics.LJFF(this.LLILLJJLI, c427580Gpg.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c427580Gpg.LLILLL) && Intrinsics.LJFF(this.LLILZ, c427580Gpg.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c427580Gpg.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c427580Gpg.LLILZLL) && this.LLIZ == c427580Gpg.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c427580Gpg.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c427580Gpg.LLJ);
    }

    public final int hashCode() {
        return (((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiChatActionBarItemUI(promptId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", promptTitle=");
        sbLIZ.append((Object) this.LLILLJJLI);
        sbLIZ.append(", promptText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", promptUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", promptUri=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", promptIconUri=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", onFirstShow=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C427580Gpg)) {
            return false;
        }
        C427580Gpg c427580Gpg = (C427580Gpg) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LLILLJJLI, c427580Gpg.LLILLJJLI) || !Intrinsics.LJFF(this.LLILZ, c427580Gpg.LLILZ) || this.LLIZ != c427580Gpg.LLIZ) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C427580Gpg)) {
            return false;
        }
        return Intrinsics.LJFF(((C427580Gpg) interfaceC1891350zJl).LL, this.LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C427580Gpg)) {
            return Boolean.FALSE;
        }
        C427580Gpg c427580Gpg = (C427580Gpg) interfaceC1891350zJl;
        boolean z = true;
        boolean z2 = !Intrinsics.LJFF(this.LLILLJJLI, c427580Gpg.LLILLJJLI);
        boolean z3 = !Intrinsics.LJFF(this.LLILZ, c427580Gpg.LLILZ);
        if (this.LLIZ == c427580Gpg.LLIZ) {
            z = false;
        }
        return new C427560Gpe(z2, z3, z);
    }

    public C427580Gpg(String str, CharSequence charSequence, String str2, List<String> list, String str3, String str4, boolean z, Function0<Unit> function0, Function0<Unit> function02) {
        this.LL = str;
        this.LLILLJJLI = charSequence;
        this.LLILLL = str2;
        this.LLILZ = list;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
        this.LLIZ = z;
        this.LLIZLLLIL = function0;
        this.LLJ = function02;
    }
}
