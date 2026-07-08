package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14Gl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20237314Gl implements InterfaceC1891350zJl {
    public final String LL;
    public final TakoBotInfo LLILLJJLI;
    public final C20237414Gm LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20237314Gl)) {
            return false;
        }
        C20237314Gl c20237314Gl = (C20237314Gl) obj;
        return Intrinsics.LJFF(this.LL, c20237314Gl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c20237314Gl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c20237314Gl.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C20237414Gm c20237414Gm = this.LLILLL;
        return iHashCode + (c20237414Gm == null ? 0 : c20237414Gm.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BotCenterItem(category=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bot=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterBotCenterData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C20237314Gl) {
            C20237314Gl c20237314Gl = (C20237314Gl) interfaceC1891350zJl;
            if (Intrinsics.LJFF(c20237314Gl.LL, this.LL) && c20237314Gl.LLILLJJLI.botId == this.LLILLJJLI.botId) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C20237314Gl(String str, TakoBotInfo takoBotInfo, C20237414Gm c20237414Gm) {
        this.LL = str;
        this.LLILLJJLI = takoBotInfo;
        this.LLILLL = c20237414Gm;
    }
}
