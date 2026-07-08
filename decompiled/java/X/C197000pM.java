package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00pM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C197000pM {
    public static final Regex LJII = new Regex("output=\\[(.*?)]");
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final EnumC197200pO LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final boolean LJI = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C197000pM)) {
            return false;
        }
        C197000pM c197000pM = (C197000pM) obj;
        return Intrinsics.LJFF(this.LIZ, c197000pM.LIZ) && this.LIZIZ == c197000pM.LIZIZ && this.LIZJ == c197000pM.LIZJ && this.LIZLLL == c197000pM.LIZLLL && Intrinsics.LJFF(this.LJ, c197000pM.LJ) && Intrinsics.LJFF(this.LJFF, c197000pM.LJFF) && this.LJI == c197000pM.LJI;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FcpKmpCrossValidationRecord(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sequence=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mainDecisionType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onlineResultSummary=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", kmpResultSummary=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", isExpanded=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Set LIZ(String str) {
        MatchResult matchResultFind$default;
        List<String> listLIZ;
        String str2;
        String string;
        if (str == null || (matchResultFind$default = Regex.find$default(LJII, str, 0, 2, null)) == null || (listLIZ = matchResultFind$default.LIZ()) == null || (str2 = (String) C13LP.LJJJLZIJ(1, listLIZ)) == null || (string = a0.LJLIIIL(str2).toString()) == null) {
            return null;
        }
        if (string.length() == 0) {
            return C08CX.INSTANCE;
        }
        List listLJJLIIIJ = a0.LJJLIIIJ(string, new char[]{','}, false, 0, 6);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
        Iterator it2 = listLJJLIIIJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return C13LP.LLIIJI(arrayList2);
    }

    public C197000pM(String str, int i, long j, EnumC197200pO enumC197200pO, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = enumC197200pO;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
