package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0get, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174090get implements Serializable {
    public final boolean canShowInScreen;
    public final String instanceId;
    public final boolean isNeedAnchored;
    public final int onScreenIndex;
    public String tabMark;
    public String tabName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174090get)) {
            return false;
        }
        C1174090get c1174090get = (C1174090get) obj;
        return Intrinsics.LJFF(this.instanceId, c1174090get.instanceId) && Intrinsics.LJFF(this.tabName, c1174090get.tabName) && Intrinsics.LJFF(this.tabMark, c1174090get.tabMark) && this.isNeedAnchored == c1174090get.isNeedAnchored && this.canShowInScreen == c1174090get.canShowInScreen && this.onScreenIndex == c1174090get.onScreenIndex;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigationComponentInfo(instanceId=");
        sbLIZ.append(this.instanceId);
        sbLIZ.append(", tabName=");
        sbLIZ.append(this.tabName);
        sbLIZ.append(", tabMark=");
        sbLIZ.append(this.tabMark);
        sbLIZ.append(", isNeedAnchored=");
        sbLIZ.append(this.isNeedAnchored);
        sbLIZ.append(", canShowInScreen=");
        sbLIZ.append(this.canShowInScreen);
        sbLIZ.append(", onScreenIndex=");
        sbLIZ.append(this.onScreenIndex);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean isNeedAnchored() {
        return this.isNeedAnchored;
    }

    public final void setTabMark(String str) {
        this.tabMark = str;
    }

    public final void setTabName(String str) {
        this.tabName = str;
    }

    public C1174090get(String str, String str2, String str3, boolean z, boolean z2, int i) {
        this.instanceId = str;
        this.tabName = str2;
        this.tabMark = str3;
        this.isNeedAnchored = z;
        this.canShowInScreen = z2;
        this.onScreenIndex = i;
    }
}
