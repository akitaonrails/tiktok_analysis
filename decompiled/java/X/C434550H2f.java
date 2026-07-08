package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434550H2f implements InterfaceC434580H2i {
    public final C434640H2o LL;
    public final int LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C434550H2f)) {
            return false;
        }
        C434550H2f c434550H2f = (C434550H2f) obj;
        return Intrinsics.LJFF(this.LL, c434550H2f.LL) && this.LLILLJJLI == c434550H2f.LLILLJJLI && this.LLILLL == c434550H2f.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferenceMoreRenderItem(referenceRenderData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC434580H2i
    public final int getIndex() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC434580H2i
    public final int getItemCount() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C434550H2f(C434640H2o c434640H2o, int i, int i2) {
        this.LL = c434640H2o;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }
}
