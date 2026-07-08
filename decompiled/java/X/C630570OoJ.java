package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OoJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C630570OoJ implements InterfaceC0148002o {
    public final List<String> LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public C630570OoJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C630570OoJ)) {
            return false;
        }
        C630570OoJ c630570OoJ = (C630570OoJ) obj;
        return Intrinsics.LJFF(this.LL, c630570OoJ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c630570OoJ.LLILLJJLI) && this.LLILLL == c630570OoJ.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryMusicCoverEntranceState(unReadStoryIdList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ringStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C630570OoJ(int i) {
        this(new ArrayList(), "", -1);
    }

    public C630570OoJ(List<String> list, String str, int i) {
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = i;
    }
}
