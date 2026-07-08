package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488530JDv implements InterfaceC1891350zJl {
    public final InterfaceC489200JGk LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final int LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C488530JDv)) {
            return false;
        }
        C488530JDv c488530JDv = (C488530JDv) obj;
        return Intrinsics.LJFF(this.LL, c488530JDv.LL) && this.LLILLJJLI == c488530JDv.LLILLJJLI && this.LLILLL == c488530JDv.LLILLL && this.LLILZ == c488530JDv.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CourseVideoListItem(video=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isLastVideoItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isFirstVideoItem=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", contentHashSnapshot=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return ((((527 + this.LLILZ) * 31) + (this.LLILLJJLI ? 1 : 0)) * 31) + (this.LLILLL ? 1 : 0);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C488530JDv c488530JDv;
        if (interfaceC1891350zJl instanceof C488530JDv) {
            c488530JDv = (C488530JDv) interfaceC1891350zJl;
        } else {
            c488530JDv = null;
        }
        if (c488530JDv == null || this.LLILZ != c488530JDv.LLILZ || this.LLILLJJLI != c488530JDv.LLILLJJLI || this.LLILLL != c488530JDv.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C488530JDv c488530JDv;
        InterfaceC489200JGk interfaceC489200JGk;
        if ((interfaceC1891350zJl instanceof C488530JDv) && (c488530JDv = (C488530JDv) interfaceC1891350zJl) != null && (interfaceC489200JGk = c488530JDv.LL) != null) {
            return this.LL.LJIIJJI(interfaceC489200JGk);
        }
        return false;
    }

    public C488530JDv(InterfaceC489200JGk interfaceC489200JGk, boolean z, boolean z2) {
        int iLIZ = interfaceC489200JGk.LIZ();
        this.LL = interfaceC489200JGk;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = iLIZ;
    }
}
