package X;

import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightCommonItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578050rAR implements InterfaceC1891350zJl {
    public final SkylightCommonItem LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1578050rAR)) {
            return false;
        }
        C1578050rAR c1578050rAR = (C1578050rAR) obj;
        return Intrinsics.LJFF(this.LL, c1578050rAR.LL) && this.LLILLJJLI == c1578050rAR.LLILLJJLI && this.LLILLL == c1578050rAR.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DramaSkylightHistoryItem(skylightCommonItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalItems=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isDarkMode=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1578050rAR)) {
            return false;
        }
        C1578050rAR c1578050rAR = (C1578050rAR) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1578050rAR.LL) || this.LLILLJJLI != c1578050rAR.LLILLJJLI || this.LLILLL != c1578050rAR.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1578050rAR)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.collectionId, ((C1578050rAR) interfaceC1891350zJl).LL.collectionId);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C1578050rAR) {
            C1578050rAR c1578050rAR = (C1578050rAR) interfaceC1891350zJl;
            boolean z2 = false;
            if (this.LLILLL != c1578050rAR.LLILLL) {
                z = true;
            } else {
                z = false;
            }
            if (this.LLILLJJLI != c1578050rAR.LLILLJJLI) {
                z2 = true;
            }
            return new C1578090rAV(z, z2, !Intrinsics.LJFF(this.LL, c1578050rAR.LL));
        }
        return null;
    }

    public C1578050rAR(SkylightCommonItem skylightCommonItem, int i, boolean z) {
        this.LL = skylightCommonItem;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    public static C1578050rAR LIZ(C1578050rAR c1578050rAR, int i, boolean z, int i2) {
        SkylightCommonItem skylightCommonItem;
        if ((i2 & 1) != 0) {
            skylightCommonItem = c1578050rAR.LL;
        } else {
            skylightCommonItem = null;
        }
        if ((i2 & 2) != 0) {
            i = c1578050rAR.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z = c1578050rAR.LLILLL;
        }
        c1578050rAR.getClass();
        return new C1578050rAR(skylightCommonItem, i, z);
    }
}
