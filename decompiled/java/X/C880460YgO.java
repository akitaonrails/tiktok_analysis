package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YgO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C880460YgO implements Serializable {
    public final String displayText;
    public final String mobValue;
    public final int priority;
    public final C0Z8G uiConfig;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C880460YgO)) {
            return false;
        }
        C880460YgO c880460YgO = (C880460YgO) obj;
        return Intrinsics.LJFF(this.displayText, c880460YgO.displayText) && Intrinsics.LJFF(this.mobValue, c880460YgO.mobValue) && this.priority == c880460YgO.priority && Intrinsics.LJFF(this.uiConfig, c880460YgO.uiConfig);
    }

    public int hashCode() {
        int iHashCode = ((((this.displayText.hashCode() * 31) + this.mobValue.hashCode()) * 31) + this.priority) * 31;
        C0Z8G c0z8g = this.uiConfig;
        return iHashCode + (c0z8g == null ? 0 : c0z8g.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatListDecorationChatLabel(displayText=");
        sbLIZ.append(this.displayText);
        sbLIZ.append(", mobValue=");
        sbLIZ.append(this.mobValue);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.priority);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.uiConfig);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C880460YgO(String str, String str2, int i, C0Z8G c0z8g) {
        this.displayText = str;
        this.mobValue = str2;
        this.priority = i;
        this.uiConfig = c0z8g;
    }
}
