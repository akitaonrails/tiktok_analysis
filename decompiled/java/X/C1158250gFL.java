package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158250gFL implements InterfaceC1891350zJl {
    public final long LL;
    public final boolean LLILLJJLI;
    public final long LLILLL;
    public final Aweme LLILZ;
    public final String LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158250gFL)) {
            return false;
        }
        C1158250gFL c1158250gFL = (C1158250gFL) obj;
        return this.LL == c1158250gFL.LL && this.LLILLJJLI == c1158250gFL.LLILLJJLI && this.LLILLL == c1158250gFL.LLILLL && Intrinsics.LJFF(this.LLILZ, c1158250gFL.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1158250gFL.LLILZIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerWhiteBoxCellData(coldStartViewCount=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isMilestoneView=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", viewerCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
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

    public C1158250gFL(long j, long j2, Aweme aweme, String str, boolean z) {
        this.LL = j;
        this.LLILLJJLI = z;
        this.LLILLL = j2;
        this.LLILZ = aweme;
        this.LLILZIL = str;
    }
}
