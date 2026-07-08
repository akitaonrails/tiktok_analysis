package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g0A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1148840g0A implements InterfaceC111300bX {
    public final DataChannel LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final List<Long> LLILZLL;
    public final int LLIZ;
    public final EnumC1131030fXR LLIZLLLIL;

    public C1148840g0A() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148840g0A)) {
            return false;
        }
        C1148840g0A c1148840g0A = (C1148840g0A) obj;
        return Intrinsics.LJFF(this.LL, c1148840g0A.LL) && this.LLILLJJLI == c1148840g0A.LLILLJJLI && this.LLILLL == c1148840g0A.LLILLL && this.LLILZ == c1148840g0A.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1148840g0A.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1148840g0A.LLILZLL) && this.LLIZ == c1148840g0A.LLIZ && this.LLIZLLLIL == c1148840g0A.LLIZLLLIL;
    }

    public final int hashCode() {
        DataChannel dataChannel = this.LL;
        return ((((((((((((((dataChannel == null ? 0 : dataChannel.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ) * 31) + this.LLIZLLLIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftFavoriteHierarchyData(dataChannel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCPC=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasFrequentlyUsedGift=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hasFavoriteGift=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", originalFavoriteIdList=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", firstVisiblePosition=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", favoritePanelScope=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1148840g0A(DataChannel dataChannel, boolean z, boolean z2, boolean z3, String str, List list, EnumC1131030fXR enumC1131030fXR) {
        this.LL = dataChannel;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = str;
        this.LLILZLL = list;
        this.LLIZ = 0;
        this.LLIZLLLIL = enumC1131030fXR;
    }
}
