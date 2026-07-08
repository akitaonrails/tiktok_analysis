package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0xUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1821310xUn extends AbstractC1821320xUo {
    public final Playbook LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1821310xUn) && Intrinsics.LJFF(this.LIZ, ((C1821310xUn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloseSheetStackAndOpenPlaybook(playbook=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1821310xUn(Playbook playbook) {
        this.LIZ = playbook;
    }
}
