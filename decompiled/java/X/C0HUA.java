package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HUA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUA implements InterfaceC1859540yUS {
    public final String LL;
    public final String LLILLJJLI = "";
    public final String LLILLL = "";

    @Override // X.InterfaceC1859540yUS
    public final Map<String, TakoPlaceholderSource> LJIIZILJ() {
        return null;
    }

    @Override // X.InterfaceC1859540yUS
    public final boolean LLIIJI() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HUA)) {
            return false;
        }
        C0HUA c0hua = (C0HUA) obj;
        return Intrinsics.LJFF(this.LL, c0hua.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hua.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hua.LLILLL);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMarkDownItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hint=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hintInText=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1859540yUS
    public final String LIZIZ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1859540yUS
    public final String LJIJJLI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1859540yUS
    public final String getText() {
        return this.LL;
    }

    public C0HUA(String str) {
        this.LL = str;
    }
}
