package X;

import com.ss.android.ugc.aweme.editpost.ClientText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5R, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S5R implements C164G {
    public final ClientText LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    @Override // X.C164G
    public final boolean LIZ() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S5R)) {
            return false;
        }
        C0S5R c0s5r = (C0S5R) obj;
        return Intrinsics.LJFF(this.LIZ, c0s5r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0s5r.LIZIZ) && this.LIZJ == c0s5r.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0s5r.LIZLLL);
    }

    public final int hashCode() {
        ClientText clientText = this.LIZ;
        int iHashCode = (clientText == null ? 0 : clientText.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DescriptionData(translatedClientText=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", descriptionTranslation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", translated=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aid=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0S5R(ClientText clientText, String str, boolean z, String str2) {
        this.LIZ = clientText;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = str2;
    }
}
