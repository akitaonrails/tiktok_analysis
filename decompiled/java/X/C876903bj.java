package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoOption;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoPanel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876903bj implements InterfaceC111300bX {
    public final IdentityInfoPanel LL;
    public final InterfaceC20236714Gf<IdentityInfoOption> LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Boolean LLILZLL;
    public final Map<String, Object> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876903bj)) {
            return false;
        }
        C876903bj c876903bj = (C876903bj) obj;
        return Intrinsics.LJFF(this.LL, c876903bj.LL) && Intrinsics.LJFF(this.LLILLJJLI, c876903bj.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c876903bj.LLILLL) && Intrinsics.LJFF(this.LLILZ, c876903bj.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c876903bj.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c876903bj.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c876903bj.LLIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        InterfaceC20236714Gf<IdentityInfoOption> interfaceC20236714Gf = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (interfaceC20236714Gf == null ? 0 : interfaceC20236714Gf.hashCode())) * 31;
        String str = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Map<String, Object> map = this.LLIZ;
        return iHashCode6 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdentityData(identityInfoPanel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", continuation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", fillType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", invalidHint=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", triggerEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", hasAddress=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C876903bj(IdentityInfoPanel identityInfoPanel, C2252611DEt c2252611DEt, String str, String str2, String str3, Boolean bool, Map map) {
        this.LL = identityInfoPanel;
        this.LLILLJJLI = c2252611DEt;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = bool;
        this.LLIZ = map;
    }
}
