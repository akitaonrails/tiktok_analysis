package X;

import com.bytedance.touchpoint.api.model.ButtonContent;
import com.bytedance.touchpoint.api.model.GameplayCard;
import com.bytedance.touchpoint.api.model.SideBarButton;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1582460rHY implements InterfaceC1891350zJl {
    public final GameplayCard LL;
    public final Map<String, String> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1582460rHY)) {
            return false;
        }
        C1582460rHY c1582460rHY = (C1582460rHY) obj;
        return Intrinsics.LJFF(this.LL, c1582460rHY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1582460rHY.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameplayCardItem(gameplayCard=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", eventParams=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        ButtonContent buttonContent;
        ButtonContent buttonContent2;
        if (!(interfaceC1891350zJl instanceof C1582460rHY)) {
            return false;
        }
        C1582460rHY c1582460rHY = (C1582460rHY) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL.title, c1582460rHY.LL.title) || !Intrinsics.LJFF(this.LL.gameplayType, c1582460rHY.LL.gameplayType) || !Intrinsics.LJFF(this.LL.taskKey, c1582460rHY.LL.taskKey) || !Intrinsics.LJFF(this.LL.icon, c1582460rHY.LL.icon)) {
            return false;
        }
        SideBarButton sideBarButton = this.LL.button;
        String str4 = null;
        if (sideBarButton != null && (buttonContent2 = sideBarButton.content) != null) {
            str = buttonContent2.text;
        } else {
            str = null;
        }
        SideBarButton sideBarButton2 = c1582460rHY.LL.button;
        if (sideBarButton2 != null && (buttonContent = sideBarButton2.content) != null) {
            str2 = buttonContent.text;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        SideBarButton sideBarButton3 = this.LL.button;
        if (sideBarButton3 != null) {
            str3 = sideBarButton3.jumpLink;
        } else {
            str3 = null;
        }
        SideBarButton sideBarButton4 = c1582460rHY.LL.button;
        if (sideBarButton4 != null) {
            str4 = sideBarButton4.jumpLink;
        }
        if (!Intrinsics.LJFF(str3, str4) || !Intrinsics.LJFF(this.LL.description, c1582460rHY.LL.description)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1582460rHY)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.taskKey, ((C1582460rHY) interfaceC1891350zJl).LL.taskKey);
    }

    public C1582460rHY(GameplayCard gameplayCard, Map<String, String> map) {
        this.LL = gameplayCard;
        this.LLILLJJLI = map;
    }
}
