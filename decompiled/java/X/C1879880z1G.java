package X;

import com.bytedance.android.livesdk.game.model.BriefBenefitInfo;
import com.bytedance.android.livesdk.game.model.BriefGiftInfo;
import com.bytedance.android.livesdk.game.model.GameStationGameInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0z1G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1879880z1G implements InterfaceC1891350zJl {
    public final BriefBenefitInfo LL;
    public final GameStationGameInfo LLILLJJLI;
    public final InterfaceC1881340z3c LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1879880z1G)) {
            return false;
        }
        C1879880z1G c1879880z1G = (C1879880z1G) obj;
        return Intrinsics.LJFF(this.LL, c1879880z1G.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1879880z1G.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1879880z1G.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1879880z1G.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        GameStationGameInfo gameStationGameInfo = this.LLILLJJLI;
        return ((((iHashCode + (gameStationGameInfo == null ? 0 : gameStationGameInfo.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftItem(briefBenefitInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", gameInfo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mixPage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", containerId=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        if (!(interfaceC1891350zJl instanceof C1879880z1G)) {
            return false;
        }
        BriefGiftInfo briefGiftInfo = this.LL.briefGiftInfo;
        String str2 = null;
        if (briefGiftInfo != null) {
            str = briefGiftInfo.idStr;
        } else {
            str = null;
        }
        BriefGiftInfo briefGiftInfo2 = ((C1879880z1G) interfaceC1891350zJl).LL.briefGiftInfo;
        if (briefGiftInfo2 != null) {
            str2 = briefGiftInfo2.idStr;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (!(interfaceC1891350zJl instanceof C1879880z1G)) {
            return false;
        }
        BriefGiftInfo briefGiftInfo = this.LL.briefGiftInfo;
        String str6 = null;
        if (briefGiftInfo != null) {
            str = briefGiftInfo.idStr;
        } else {
            str = null;
        }
        C1879880z1G c1879880z1G = (C1879880z1G) interfaceC1891350zJl;
        BriefGiftInfo briefGiftInfo2 = c1879880z1G.LL.briefGiftInfo;
        if (briefGiftInfo2 != null) {
            str2 = briefGiftInfo2.idStr;
        } else {
            str2 = null;
        }
        if (!Intrinsics.LJFF(str, str2)) {
            return false;
        }
        BriefGiftInfo briefGiftInfo3 = this.LL.briefGiftInfo;
        if (briefGiftInfo3 != null) {
            str3 = briefGiftInfo3.iconUrl;
        } else {
            str3 = null;
        }
        BriefGiftInfo briefGiftInfo4 = c1879880z1G.LL.briefGiftInfo;
        if (briefGiftInfo4 != null) {
            str4 = briefGiftInfo4.name;
        } else {
            str4 = null;
        }
        if (!Intrinsics.LJFF(str3, str4)) {
            return false;
        }
        BriefGiftInfo briefGiftInfo5 = this.LL.briefGiftInfo;
        if (briefGiftInfo5 != null) {
            str5 = briefGiftInfo5.name;
        } else {
            str5 = null;
        }
        BriefGiftInfo briefGiftInfo6 = c1879880z1G.LL.briefGiftInfo;
        if (briefGiftInfo6 != null) {
            str6 = briefGiftInfo6.name;
        }
        if (!Intrinsics.LJFF(str5, str6) || !Intrinsics.LJFF(this.LL.taskTypeDesc, c1879880z1G.LL.taskTypeDesc)) {
            return false;
        }
        return true;
    }

    public C1879880z1G(BriefBenefitInfo briefBenefitInfo, GameStationGameInfo gameStationGameInfo, InterfaceC1881340z3c interfaceC1881340z3c, String str) {
        this.LL = briefBenefitInfo;
        this.LLILLJJLI = gameStationGameInfo;
        this.LLILLL = interfaceC1881340z3c;
        this.LLILZ = str;
    }
}
