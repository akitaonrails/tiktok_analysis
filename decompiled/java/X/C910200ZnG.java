package X;

/* JADX INFO: renamed from: X.0ZnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910200ZnG implements InterfaceC111300bX {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910200ZnG)) {
            return false;
        }
        C910200ZnG c910200ZnG = (C910200ZnG) obj;
        return this.LL == c910200ZnG.LL && this.LLILLJJLI == c910200ZnG.LLILLJJLI && this.LLILLL == c910200ZnG.LLILLL && this.LLILZ == c910200ZnG.LLILZ;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionBarDisplayHierarchyData(hideWithPanelDisplay=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hideWithLongPress=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hideWithChatNotice=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hideWithReplyContent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C910200ZnG(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
    }
}
