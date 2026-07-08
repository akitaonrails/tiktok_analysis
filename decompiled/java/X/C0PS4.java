package X;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PS4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@InterfaceC1294060jmO
public final class C0PS4 implements Serializable {
    public String blankPageEnterAction;
    public String blankPageEnterForm;
    public String blankPageEnterMethod;
    public final Map<String, String> extraTrackMap;
    public int lastShowingPageIndex;
    public String launchSchemaString;
    public int searchLastShowPageIndex;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PS4)) {
            return false;
        }
        C0PS4 c0ps4 = (C0PS4) obj;
        return this.lastShowingPageIndex == c0ps4.lastShowingPageIndex && this.searchLastShowPageIndex == c0ps4.searchLastShowPageIndex && Intrinsics.LJFF(this.launchSchemaString, c0ps4.launchSchemaString) && Intrinsics.LJFF(this.extraTrackMap, c0ps4.extraTrackMap) && Intrinsics.LJFF(this.blankPageEnterForm, c0ps4.blankPageEnterForm) && Intrinsics.LJFF(this.blankPageEnterMethod, c0ps4.blankPageEnterMethod) && Intrinsics.LJFF(this.blankPageEnterAction, c0ps4.blankPageEnterAction);
    }

    public int hashCode() {
        int iHashCode = ((((((this.lastShowingPageIndex * 31) + this.searchLastShowPageIndex) * 31) + this.launchSchemaString.hashCode()) * 31) + this.extraTrackMap.hashCode()) * 31;
        String str = this.blankPageEnterForm;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blankPageEnterMethod;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.blankPageEnterAction.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchGlobalData(lastShowingPageIndex=");
        sbLIZ.append(this.lastShowingPageIndex);
        sbLIZ.append(", searchLastShowPageIndex=");
        sbLIZ.append(this.searchLastShowPageIndex);
        sbLIZ.append(", launchSchemaString=");
        sbLIZ.append(this.launchSchemaString);
        sbLIZ.append(", extraTrackMap=");
        sbLIZ.append(this.extraTrackMap);
        sbLIZ.append(", blankPageEnterForm=");
        sbLIZ.append(this.blankPageEnterForm);
        sbLIZ.append(", blankPageEnterMethod=");
        sbLIZ.append(this.blankPageEnterMethod);
        sbLIZ.append(", blankPageEnterAction=");
        sbLIZ.append(this.blankPageEnterAction);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PS4() {
        this(-1, 0, "", new LinkedHashMap(), "", "", "");
    }

    public final void setBlankPageEnterAction(String str) {
        this.blankPageEnterAction = str;
    }

    public final void setBlankPageEnterForm(String str) {
        this.blankPageEnterForm = str;
    }

    public final void setBlankPageEnterMethod(String str) {
        this.blankPageEnterMethod = str;
    }

    public final void setLastShowingPageIndex(int i) {
        this.lastShowingPageIndex = i;
    }

    public final void setLaunchSchemaString(String str) {
        this.launchSchemaString = str;
    }

    public final void setSearchLastShowPageIndex(int i) {
        this.searchLastShowPageIndex = i;
    }

    public C0PS4(int i, int i2, String str, Map<String, String> map, String str2, String str3, String str4) {
        this.lastShowingPageIndex = i;
        this.searchLastShowPageIndex = i2;
        this.launchSchemaString = str;
        this.extraTrackMap = map;
        this.blankPageEnterForm = str2;
        this.blankPageEnterMethod = str3;
        this.blankPageEnterAction = str4;
    }
}
