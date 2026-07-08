package X;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1177730gkl implements Serializable, InterfaceC2753014t {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final List<String> LLILZ;
    public final String LLILZIL;

    public C1177730gkl() {
        this(null, null, null, null, "PoiRevisitDataParams");
    }

    @InterfaceC1294060jmO
    public static /* synthetic */ void getSourceId$annotations() {
    }

    public final C1177730gkl copy(String str, String str2, String str3, List<String> list, String str4) {
        return new C1177730gkl(str, str2, str3, list, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1177730gkl)) {
            return false;
        }
        C1177730gkl c1177730gkl = (C1177730gkl) obj;
        return Intrinsics.LJFF(this.LL, c1177730gkl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1177730gkl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1177730gkl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1177730gkl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1177730gkl.LLILZIL);
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.LLILZ;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.LLILZIL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitDataParams(collectionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", collectionName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", collectionType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", collectPoiIdList=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<String> getCollectPoiIdList() {
        return this.LLILZ;
    }

    public final String getCollectionId() {
        return this.LL;
    }

    public final String getCollectionName() {
        return this.LLILLJJLI;
    }

    public final String getCollectionType() {
        return this.LLILLL;
    }

    public String getSourceId() {
        return this.LLILZIL;
    }

    public C1177730gkl(String str, String str2, String str3, List<String> list, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = list;
        this.LLILZIL = str4;
    }
}
