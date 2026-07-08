package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JSh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492290JSh extends C21287018Se {
    public final C05YD<AbstractC509530JyZ> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C492290JSh) && Intrinsics.LJFF(this.LIZLLL, ((C492290JSh) obj).LIZLLL);
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

    public final AbstractC509530JyZ LIZJ() {
        return this.LIZLLL.getValue();
    }

    public C492290JSh(AnonymousClass0951 anonymousClass0951) {
        super(anonymousClass0951);
        this.LIZLLL = anonymousClass0951;
    }
}
