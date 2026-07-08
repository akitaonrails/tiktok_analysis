package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20355614ks {
    public final EnumC19367810pw LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final EnumC952890au7 LIZLLL;
    public final InterfaceC20423114vl LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20355614ks)) {
            return false;
        }
        C20355614ks c20355614ks = (C20355614ks) obj;
        return this.LIZ == c20355614ks.LIZ && this.LIZIZ == c20355614ks.LIZIZ && Intrinsics.LJFF(this.LIZJ, c20355614ks.LIZJ) && this.LIZLLL == c20355614ks.LIZLLL && Intrinsics.LJFF(this.LJ, c20355614ks.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        InterfaceC20423114vl interfaceC20423114vl = this.LJ;
        return iHashCode + (interfaceC20423114vl == null ? 0 : interfaceC20423114vl.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextHeaderEditorParams(editorModeType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSupportMultipleLang=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaNodeId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", editorPageListener=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C20355614ks(EnumC19367810pw enumC19367810pw, boolean z, String str, EnumC952890au7 enumC952890au7, InterfaceC20423114vl interfaceC20423114vl) {
        this.LIZ = enumC19367810pw;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = enumC952890au7;
        this.LJ = interfaceC20423114vl;
    }
}
