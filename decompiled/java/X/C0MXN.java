package X;

import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.tools.chat.data.IcAigcCommonMessageCard;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MXN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXN implements C0MXT {
    public final C0IB0 LL;
    public final IcAigcCommonMessageCard LLILLJJLI = null;
    public final AIGCSocialModel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MXN)) {
            return false;
        }
        C0MXN c0mxn = (C0MXN) obj;
        return Intrinsics.LJFF(this.LL, c0mxn.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0mxn.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0mxn.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        IcAigcCommonMessageCard icAigcCommonMessageCard = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (icAigcCommonMessageCard == null ? 0 : icAigcCommonMessageCard.hashCode())) * 31;
        AIGCSocialModel aIGCSocialModel = this.LLILLL;
        return iHashCode2 + (aIGCSocialModel != null ? aIGCSocialModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AITheaterSocialFakeGeneratingPowerItem(skeletonLayoutData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", msgCard=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", socialModel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0MXT
    public final IcAigcCommonMessageCard LJJIII() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C0MXO.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        InterfaceC461380I7k interfaceC461380I7k;
        C869590Y9l c869590Y9l;
        String uuid = null;
        if ((interfaceC1891350zJl instanceof C0MXT) && (interfaceC461380I7k = (InterfaceC461380I7k) interfaceC1891350zJl) != null && (c869590Y9l = interfaceC461380I7k.LLILII().LIZ.LIZ) != null) {
            uuid = c869590Y9l.getUuid();
        }
        return Intrinsics.LJFF(uuid, LLILII().LIZ.LIZ.getUuid());
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        C461530I7z c461530I7zLIZJ = C0MXO.LIZJ(this, interfaceC1891350zJl);
        if (c461530I7zLIZJ == null) {
            c461530I7zLIZJ = new C461530I7z(C08CX.INSTANCE);
        }
        return C461530I7z.LIZIZ(c461530I7zLIZJ, null, null, 3);
    }

    public C0MXN(C0IB0 c0ib0, AIGCSocialModel aIGCSocialModel) {
        this.LL = c0ib0;
        this.LLILLL = aIGCSocialModel;
    }
}
