package X;

import com.ss.android.ugc.aweme.templateselect.Template;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0teg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673680teg implements InterfaceC1673720tek {
    public final InterfaceC1665500tRU<Template> LIZ;
    public final String LIZIZ;
    public final InterfaceC1673730tel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673680teg)) {
            return false;
        }
        C1673680teg c1673680teg = (C1673680teg) obj;
        return Intrinsics.LJFF(this.LIZ, c1673680teg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1673680teg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1673680teg.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loaded(templates=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedEffectId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", customButton=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1673680teg(InterfaceC1665500tRU<Template> interfaceC1665500tRU, String str, InterfaceC1673730tel interfaceC1673730tel) {
        this.LIZ = interfaceC1665500tRU;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1673730tel;
    }
}
