package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LwO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559140LwO {
    public final String LIZ;
    public final EnumC559120LwM LIZIZ;
    public final int LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C559140LwO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C559140LwO)) {
            return false;
        }
        C559140LwO c559140LwO = (C559140LwO) obj;
        return Intrinsics.LJFF(this.LIZ, c559140LwO.LIZ) && this.LIZIZ == c559140LwO.LIZIZ && this.LIZJ == c559140LwO.LIZJ && Intrinsics.LJFF(this.LIZLLL, c559140LwO.LIZLLL) && Intrinsics.LJFF(this.LJ, c559140LwO.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateAutoCutAIState(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadingTitle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", loadingSubtitle=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C559140LwO(int i) {
        this("", EnumC559120LwM.LOADING, 0, "", "");
    }

    public C559140LwO(String str, EnumC559120LwM enumC559120LwM, int i, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = enumC559120LwM;
        this.LIZJ = i;
        this.LIZLLL = str2;
        this.LJ = str3;
    }

    public static C559140LwO LIZ(C559140LwO c559140LwO, String str, EnumC559120LwM enumC559120LwM, int i, String str2, String str3, int i2) {
        String str4 = str3;
        String str5 = str2;
        int i3 = i;
        EnumC559120LwM enumC559120LwM2 = enumC559120LwM;
        String str6 = str;
        if ((i2 & 1) != 0) {
            str6 = c559140LwO.LIZ;
        }
        if ((i2 & 2) != 0) {
            enumC559120LwM2 = c559140LwO.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            i3 = c559140LwO.LIZJ;
        }
        if ((i2 & 8) != 0) {
            str5 = c559140LwO.LIZLLL;
        }
        if ((i2 & 16) != 0) {
            str4 = c559140LwO.LJ;
        }
        c559140LwO.getClass();
        return new C559140LwO(str6, enumC559120LwM2, i3, str5, str4);
    }
}
