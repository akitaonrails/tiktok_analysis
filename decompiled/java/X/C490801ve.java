package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RandomMatchResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01ve, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C490801ve implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Object> LL;
    public final RandomMatchResult LLILLJJLI;
    public final String LLILLL;

    public C490801ve() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C490801ve)) {
            return false;
        }
        C490801ve c490801ve = (C490801ve) obj;
        return Intrinsics.LJFF(this.LL, c490801ve.LL) && Intrinsics.LJFF(this.LLILLJJLI, c490801ve.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c490801ve.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        RandomMatchResult randomMatchResult = this.LLILLJJLI;
        return ((iHashCode + (randomMatchResult == null ? 0 : randomMatchResult.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTopLiveRandomMatchState(matchState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", randomMatchResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C490801ve(Object obj) {
        this.LL = C491101vh.LIZ;
        this.LLILLJJLI = null;
        this.LLILLL = "";
    }
}
