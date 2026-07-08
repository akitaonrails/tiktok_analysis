package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Etn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379170Etn {
    public final String LIZ;
    public final EnumC379190Etp LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C379170Etn)) {
            return false;
        }
        C379170Etn c379170Etn = (C379170Etn) obj;
        return Intrinsics.LJFF(this.LIZ, c379170Etn.LIZ) && this.LIZIZ == c379170Etn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c379170Etn.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCMedia(localPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mediaType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coverImagePath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String LIZIZ() {
        String str = this.LIZJ;
        return str == null ? this.LIZ : str;
    }

    public final boolean LIZJ() {
        return this.LIZIZ == EnumC379190Etp.VIDEO;
    }

    public static C379170Etn LIZ(C379170Etn c379170Etn, String str) {
        String str2 = c379170Etn.LIZ;
        EnumC379190Etp enumC379190Etp = c379170Etn.LIZIZ;
        c379170Etn.getClass();
        return new C379170Etn(str2, enumC379190Etp, str);
    }

    public C379170Etn(String str, EnumC379190Etp enumC379190Etp, String str2) {
        this.LIZ = str;
        this.LIZIZ = enumC379190Etp;
        this.LIZJ = str2;
    }
}
