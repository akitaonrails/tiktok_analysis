package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q67, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q67 implements InterfaceC0148002o {
    public final EnumC664680Q5i LL;
    public final String LLILLJJLI;

    public C0Q67() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0Q67)) {
            return false;
        }
        C0Q67 c0q67 = (C0Q67) obj;
        return this.LL == c0q67.LL && Intrinsics.LJFF(this.LLILLJJLI, c0q67.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCLASubtitleViewState(switchIconState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subTitleContent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0Q67(int i) {
        this(EnumC664680Q5i.CLOSED, null);
    }

    public C0Q67(EnumC664680Q5i enumC664680Q5i, String str) {
        this.LL = enumC664680Q5i;
        this.LLILLJJLI = str;
    }
}
