package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20237214Gk implements InterfaceC1891350zJl {
    public final TakoBotInfo LL;
    public final C20237414Gm LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20237214Gk)) {
            return false;
        }
        C20237214Gk c20237214Gk = (C20237214Gk) obj;
        return Intrinsics.LJFF(this.LL, c20237214Gk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20237214Gk.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C20237414Gm c20237414Gm = this.LLILLJJLI;
        return iHashCode + (c20237414Gm == null ? 0 : c20237414Gm.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecentlyAddItem(bot=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterBotCenterData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C20237214Gk) {
            C20237214Gk c20237214Gk = (C20237214Gk) interfaceC1891350zJl;
            TakoBotInfo takoBotInfo = c20237214Gk.LL;
            long j = takoBotInfo.botId;
            TakoBotInfo takoBotInfo2 = this.LL;
            if (j == takoBotInfo2.botId && Intrinsics.LJFF(takoBotInfo.botName, takoBotInfo2.botName) && Intrinsics.LJFF(c20237214Gk.LL.botAvatar, this.LL.botAvatar)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C20237214Gk) && ((C20237214Gk) interfaceC1891350zJl).LL.botId == this.LL.botId) {
            return true;
        }
        return false;
    }

    public C20237214Gk(TakoBotInfo takoBotInfo, C20237414Gm c20237414Gm) {
        this.LL = takoBotInfo;
        this.LLILLJJLI = c20237414Gm;
    }
}
