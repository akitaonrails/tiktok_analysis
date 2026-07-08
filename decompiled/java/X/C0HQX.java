package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HQX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQX implements InterfaceC1891350zJl {
    public final int LL;
    public final long LLILLJJLI;
    public final InterfaceC332260D0u<String> LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HQX)) {
            return false;
        }
        C0HQX c0hqx = (C0HQX) obj;
        return this.LL == c0hqx.LL && this.LLILLJJLI == c0hqx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0hqx.LLILLL) && this.LLILZ == c0hqx.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + C786410Ut5.Y2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResultItem(index=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isGenerateMore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C0HQX) {
            C0HQX c0hqx = (C0HQX) interfaceC1891350zJl;
            if (this.LLILLJJLI == c0hqx.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c0hqx.LLILLL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return areContentsTheSame(interfaceC1891350zJl);
    }

    public C0HQX(int i, long j, C2252321DDq c2252321DDq, boolean z) {
        this.LL = i;
        this.LLILLJJLI = j;
        this.LLILLL = c2252321DDq;
        this.LLILZ = z;
    }
}
