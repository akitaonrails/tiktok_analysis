package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.0yii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1868380yii implements InterfaceC951240arS<Object> {
    public final Playbook LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868380yii)) {
            return false;
        }
        C1868380yii c1868380yii = (C1868380yii) obj;
        return Intrinsics.LJFF(this.LIZ, c1868380yii.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1868380yii.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1868380yii.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookEditorHeaderItem(playbook=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", localCoverPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C1868380yii) {
            C1868380yii c1868380yii = (C1868380yii) obj;
            if (Intrinsics.LJFF(c1868380yii.LIZIZ, this.LIZIZ) && Intrinsics.LJFF(c1868380yii.LIZJ, this.LIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C1868380yii;
    }

    public C1868380yii(String str, String str2, Playbook playbook) {
        this.LIZ = playbook;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
