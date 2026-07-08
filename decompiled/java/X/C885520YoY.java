package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YoY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C885520YoY extends AbstractC885540Yoa<C886420Yq0> {
    public final C886420Yq0 LL;
    public final Boolean LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C885520YoY)) {
            return false;
        }
        C885520YoY c885520YoY = (C885520YoY) obj;
        return Intrinsics.LJFF(this.LL, c885520YoY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c885520YoY.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Boolean bool = this.LLILLJJLI;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestChatListItem(vo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC885540Yoa
    public final /* bridge */ /* synthetic */ AbstractC885530YoZ LIZIZ() {
        return this.LL;
    }

    @Override // X.AbstractC885540Yoa
    public final Boolean LIZLLL() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC885540Yoa
    public final AbstractC885540Yoa<C886420Yq0> LIZ(Boolean bool) {
        return new C885520YoY(this.LL, bool);
    }

    @Override // X.AbstractC885540Yoa, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C885520YoY) {
            return Intrinsics.LJFF(this.LL.getKey(), ((C885520YoY) interfaceC1891350zJl).LL.getKey());
        }
        return false;
    }

    @Override // X.AbstractC885540Yoa, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        if (interfaceC1891350zJl instanceof C885520YoY) {
            C885520YoY c885520YoY = (C885520YoY) interfaceC1891350zJl;
            boolean z2 = !Intrinsics.LJFF(this.LLILLJJLI, c885520YoY.LLILLJJLI);
            boolean z3 = !Intrinsics.LJFF(this.LL.getAvatar(), c885520YoY.LL.getAvatar());
            boolean z4 = !Intrinsics.LJFF(this.LL.getNameStartAreaContent(), c885520YoY.LL.getNameStartAreaContent());
            boolean z5 = !Intrinsics.LJFF(this.LL.getName(), c885520YoY.LL.getName());
            boolean z6 = !Intrinsics.LJFF(this.LL.getChatStatus(), c885520YoY.LL.getChatStatus());
            boolean z7 = !Intrinsics.LJFF(this.LL.getPreviewContent(), c885520YoY.LL.getPreviewContent());
            boolean z8 = !Intrinsics.LJFF(this.LL.getTimestamp(), c885520YoY.LL.getTimestamp());
            boolean z9 = !Intrinsics.LJFF(this.LL.getChatLabels(), c885520YoY.LL.getChatLabels());
            if (Intrinsics.LJFF(this.LL.getUnreadState(), c885520YoY.LL.getUnreadState()) && Intrinsics.LJFF(this.LL.getChatStatus(), c885520YoY.LL.getChatStatus())) {
                z = false;
            } else {
                z = true;
            }
            return new C894440Z7a(z2, z3, z4, z5, z6, z7, z8, z9, z, !Intrinsics.LJFF(this.LL.getRelationLabel(), c885520YoY.LL.getRelationLabel()), !Intrinsics.LJFF(this.LL.getActivityStatusViewData(), c885520YoY.LL.getActivityStatusViewData()));
        }
        return null;
    }

    public C885520YoY(C886420Yq0 c886420Yq0, Boolean bool) {
        this.LL = c886420Yq0;
        this.LLILLJJLI = bool;
    }
}
