package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pe1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C649670Pe1 implements Serializable {
    public static final int $stable = 0;
    public static final C649690Pe3 Companion = new Object() { // from class: X.0Pe3
    };
    public final C649680Pe2 icon;
    public final String pageSchema;
    public final String tabKey;
    public final String tabTitle;

    public final C649670Pe1 copy(String str, String str2, String str3, C649680Pe2 c649680Pe2) {
        return new C649670Pe1(str, str2, str3, c649680Pe2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C649670Pe1)) {
            return false;
        }
        C649670Pe1 c649670Pe1 = (C649670Pe1) obj;
        return Intrinsics.LJFF(this.tabKey, c649670Pe1.tabKey) && Intrinsics.LJFF(this.tabTitle, c649670Pe1.tabTitle) && Intrinsics.LJFF(this.pageSchema, c649670Pe1.pageSchema) && Intrinsics.LJFF(this.icon, c649670Pe1.icon);
    }

    public int hashCode() {
        int iHashCode = ((this.tabKey.hashCode() * 31) + this.tabTitle.hashCode()) * 31;
        String str = this.pageSchema;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C649680Pe2 c649680Pe2 = this.icon;
        return iHashCode2 + (c649680Pe2 != null ? c649680Pe2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPlaceSubTabConfig(tabKey=");
        sbLIZ.append(this.tabKey);
        sbLIZ.append(", tabTitle=");
        sbLIZ.append(this.tabTitle);
        sbLIZ.append(", pageSchema=");
        sbLIZ.append(this.pageSchema);
        sbLIZ.append(", icon=");
        sbLIZ.append(this.icon);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C649670Pe1(String str, String str2, String str3, C649680Pe2 c649680Pe2) {
        this.tabKey = str;
        this.tabTitle = str2;
        this.pageSchema = str3;
        this.icon = c649680Pe2;
    }
}
