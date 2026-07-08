package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lYP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1362270lYP implements InterfaceC111300bX {
    public final SharePackage LL;
    public final String LLILLJJLI;
    public final List<InterfaceC1369790lkX> LLILLL;
    public final C1371590lnR LLILZ;
    public final InterfaceC1362600lYw LLILZIL;
    public final InterfaceC1362260lYO LLILZLL;
    public final Function0<ViewGroup> LLIZ;
    public final Function0<ViewGroup> LLIZLLLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1362270lYP)) {
            return false;
        }
        C1362270lYP c1362270lYP = (C1362270lYP) obj;
        return Intrinsics.LJFF(this.LL, c1362270lYP.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1362270lYP.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1362270lYP.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1362270lYP.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1362270lYP.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1362270lYP.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1362270lYP.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1362270lYP.LLIZLLLIL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31;
        C1371590lnR c1371590lnR = this.LLILZ;
        int iHashCode2 = (iHashCode + (c1371590lnR == null ? 0 : c1371590lnR.hashCode())) * 31;
        InterfaceC1362600lYw interfaceC1362600lYw = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (interfaceC1362600lYw == null ? 0 : interfaceC1362600lYw.hashCode())) * 31;
        InterfaceC1362260lYO interfaceC1362260lYO = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (interfaceC1362260lYO == null ? 0 : interfaceC1362260lYO.hashCode())) * 31;
        Function0<ViewGroup> function0 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<ViewGroup> function02 = this.LLIZLLLIL;
        return iHashCode5 + (function02 != null ? function02.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShareContactHierarchyData(sharePackage=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", channelList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sharePanelConfig=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", imShareCallback=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", panelLayoutCallback=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", headRootBuilder=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", operationRootBuilder=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362270lYP(SharePackage sharePackage, String str, List list, C1371590lnR c1371590lnR, InterfaceC1362900lZQ interfaceC1362900lZQ, C1362710lZ7 c1362710lZ7, AwS565S0100000_21 awS565S0100000_21, AwS565S0100000_21 awS565S0100000_212) {
        this.LL = sharePackage;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = c1371590lnR;
        this.LLILZIL = interfaceC1362900lZQ;
        this.LLILZLL = c1362710lZ7;
        this.LLIZ = awS565S0100000_21;
        this.LLIZLLLIL = awS565S0100000_212;
    }
}
