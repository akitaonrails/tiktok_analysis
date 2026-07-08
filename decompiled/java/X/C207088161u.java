package X;

import java.util.List;

/* JADX INFO: renamed from: X.161u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C207088161u {
    public final String LIZ;
    public final List<EnumC207101162h> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public EnumC207090161w LJIIJ;

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJI;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedbackInfo(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", translatedElementsList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", authorId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", groupId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", targetLanguage=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", descModel=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C207088161u() {
        this("", C13BV.INSTANCE, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C207088161u(String str, List<? extends EnumC207101162h> list, String str2, String str3, String str4, String str5, String str6) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = str6;
        this.LJIIJ = EnumC207090161w.NONE;
    }
}
