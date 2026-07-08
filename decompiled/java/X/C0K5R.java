package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K5R, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K5R extends C0KVE {
    public final C05YD<AbstractC511920K5u> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0K5R) && Intrinsics.LJFF(this.LIZLLL, ((C0K5R) obj).LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscriptionStatusStateFlow(subscriptionStatusStateFlow=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K5R(InterfaceC332260D0u interfaceC332260D0u) {
        super(interfaceC332260D0u);
        this.LIZLLL = interfaceC332260D0u;
    }
}
