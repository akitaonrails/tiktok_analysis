package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427100Gou implements InterfaceC1891350zJl {
    public final String LL;
    public final List<String> LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C427100Gou)) {
            return false;
        }
        C427100Gou c427100Gou = (C427100Gou) obj;
        return Intrinsics.LJFF(this.LL, c427100Gou.LL) && Intrinsics.LJFF(this.LLILLJJLI, c427100Gou.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c427100Gou.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        List<String> list = this.LLILLJJLI;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSelectEmojiItem(emoji=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", emojiList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", groupName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C427100Gou(String str, List<String> list, String str2) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = str2;
    }
}
