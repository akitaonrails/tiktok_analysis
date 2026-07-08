package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424250GkJ extends AbstractC424240GkI {
    public final boolean LL;
    public final String LLILLJJLI;
    public final List<String> LLILLL;
    public final Function1<String, Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C424250GkJ)) {
            return false;
        }
        C424250GkJ c424250GkJ = (C424250GkJ) obj;
        return this.LL == c424250GkJ.LL && Intrinsics.LJFF(this.LLILLJJLI, c424250GkJ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c424250GkJ.LLILLL) && Intrinsics.LJFF(this.LLILZ, c424250GkJ.LLILZ);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SystemSmallEmojiItem(isRecentEmoji=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emojiString=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", emojiList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateModel=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C424250GkJ) && Intrinsics.LJFF(((C424250GkJ) interfaceC1891350zJl).LLILLJJLI, this.LLILLJJLI)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C424250GkJ) {
            C424250GkJ c424250GkJ = (C424250GkJ) interfaceC1891350zJl;
            if (c424250GkJ.LL == this.LL && Intrinsics.LJFF(c424250GkJ.LLILLL, this.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static C424250GkJ LIZ(C424250GkJ c424250GkJ, String str) {
        return new C424250GkJ(str, c424250GkJ.LLILLL, c424250GkJ.LLILZ, c424250GkJ.LL);
    }

    public C424250GkJ(String str, List list, Function1 function1, boolean z) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = function1;
    }
}
