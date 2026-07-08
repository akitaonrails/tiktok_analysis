package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.060h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15377060h implements InterfaceC111300bX {
    public final C15380060k LL;

    public C15377060h() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15377060h) && Intrinsics.LJFF(this.LL, ((C15377060h) obj).LL);
    }

    public final int hashCode() {
        C15380060k c15380060k = this.LL;
        if (c15380060k == null) {
            return 0;
        }
        return c15380060k.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMAIBotCreationHierarchyData(etParam=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15377060h(C15380060k c15380060k) {
        this.LL = c15380060k;
    }
}
