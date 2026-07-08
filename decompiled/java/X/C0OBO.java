package X;

import android.view.View;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OBO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC1294060jmO
public final class C0OBO implements InterfaceC2753014t, Serializable {
    public static final C0OBP Companion = new Object() { // from class: X.0OBP
    };
    public final String LL;
    public final String LLILLJJLI;
    public final Integer LLILLL;
    public final Boolean LLILZ;
    public final String LLILZIL;

    public final C0OBO copy(String str, String str2, Integer num, Boolean bool) {
        return new C0OBO(str, str2, num, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OBO)) {
            return false;
        }
        C0OBO c0obo = (C0OBO) obj;
        return Intrinsics.LJFF(this.LL, c0obo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0obo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0obo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0obo.LLILZ);
    }

    public int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.LLILZ;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchItemSource(implId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rankInList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isInMixSearch=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OBO() {
        this("", "", -1, Boolean.FALSE);
    }

    public final String getEnterFrom() {
        return this.LLILLJJLI;
    }

    public final String getImplId() {
        return this.LL;
    }

    public final Integer getRankInList() {
        return this.LLILLL;
    }

    public String getSourceId() {
        return this.LLILZIL;
    }

    public final Boolean isInMixSearch() {
        return this.LLILZ;
    }

    public static final C0OBO fetchOwnSource(View view) {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        Companion.getClass();
        if (view == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJ(view, null), "source_default_key", C0OBO.class, null)) == null) {
            return null;
        }
        return (C0OBO) interfaceC1555100qZQLIZIZ.getSource();
    }

    public static final void bindSource(View view, C0OBO c0obo) {
        Companion.getClass();
        if (view != null) {
            C1554960qZC.LIZ(C1558360qeg.LJ(view, null), c0obo, C0OBO.class, "source_default_key");
        }
    }

    public C0OBO(String str, String str2, Integer num, Boolean bool) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = num;
        this.LLILZ = bool;
        this.LLILZIL = UUID.randomUUID().toString();
    }
}
