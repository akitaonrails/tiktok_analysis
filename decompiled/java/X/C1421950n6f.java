package X;

import com.ss.android.ugc.aweme.im.common.model.IMFromMessageTips;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n6f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421950n6f implements InterfaceC1891350zJl {
    public final String LL;
    public final IMFromMessageTips LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Map<String, String> LLIZ;

    public C1421950n6f() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1421950n6f)) {
            return false;
        }
        C1421950n6f c1421950n6f = (C1421950n6f) obj;
        return Intrinsics.LJFF(this.LL, c1421950n6f.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1421950n6f.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1421950n6f.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1421950n6f.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1421950n6f.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1421950n6f.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1421950n6f.LLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        IMFromMessageTips iMFromMessageTips = this.LLILLJJLI;
        return ((((((((((iHashCode + (iMFromMessageTips == null ? 0 : iMFromMessageTips.hashCode())) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxRecommendGroupBannerItem(noticeCode=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", msgTips=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", schemaUrl=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", redId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", dismissListener=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", eventTrackingFieldsMap=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1421950n6f(AwS566S0100000_22 awS566S0100000_22, int i) {
        String str;
        String str2;
        String str3;
        Function0 function0 = awS566S0100000_22;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        if ((i & 8) != 0) {
            str3 = "";
        } else {
            str3 = null;
        }
        this(str, null, str2, str3, (i & 16) == 0 ? null : "", (i & 32) != 0 ? AFwS210S0000000_22.get$arr$(439) : function0, (i & 64) != 0 ? C2097608Jq.LJ() : null);
    }

    public C1421950n6f(String str, IMFromMessageTips iMFromMessageTips, String str2, String str3, String str4, Function0<Unit> function0, Map<String, String> map) {
        this.LL = str;
        this.LLILLJJLI = iMFromMessageTips;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = function0;
        this.LLIZ = map;
    }
}
