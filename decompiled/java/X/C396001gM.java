package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01gM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C396001gM<T> extends AbstractC401801hI<T> {
    public final String LIZ;
    public final List<T> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public C396001gM() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C396001gM)) {
            return false;
        }
        C396001gM c396001gM = (C396001gM) obj;
        return Intrinsics.LJFF(this.LIZ, c396001gM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c396001gM.LIZIZ) && this.LIZJ == c396001gM.LIZJ && this.LIZLLL == c396001gM.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CategoryEffectList(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFirstPanelUpdated=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isFromRemote=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C396001gM(String str, List list, boolean z, int i) {
        z = (i & 4) != 0 ? false : z;
        boolean z2 = (i & 8) != 0;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
