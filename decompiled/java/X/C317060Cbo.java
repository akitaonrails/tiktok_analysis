package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317060Cbo implements InterfaceC1891350zJl {
    public final C20611415l2 LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCaptionSearchMentionItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        if (!C0BVD.LIZ()) {
            return super.hashCode();
        }
        int iHashCode = this.LL.LIZ.hashCode() * 31;
        C317510CcX c317510CcX = this.LL.LJIJJ;
        return iHashCode + (c317510CcX != null ? c317510CcX.hashCode() : 0);
    }

    public C317060Cbo(C20611415l2 c20611415l2) {
        this.LL = c20611415l2;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (!C0BVD.LIZ()) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C317060Cbo.class, cls)) {
            return false;
        }
        C317060Cbo c317060Cbo = (C317060Cbo) obj;
        if (Intrinsics.LJFF(this.LL.LIZ, c317060Cbo.LL.LIZ) && Intrinsics.LJFF(this.LL.LJIJJ, c317060Cbo.LL.LJIJJ)) {
            return true;
        }
        return false;
    }
}
