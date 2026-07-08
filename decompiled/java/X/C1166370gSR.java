package X;

import com.ss.android.ugc.aweme.ecommerce.showcase.mix.MultiTabContentChunkData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopHeaderChunkData;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.ShopTabBarChunkData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gSR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1166370gSR implements InterfaceC0148002o {
    public final EnumC1166380gSS LL;
    public final ShopTabBarChunkData LLILLJJLI;
    public final ShopHeaderChunkData LLILLL;
    public final MultiTabContentChunkData LLILZ;

    public C1166370gSR() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1166370gSR)) {
            return false;
        }
        C1166370gSR c1166370gSR = (C1166370gSR) obj;
        return this.LL == c1166370gSR.LL && Intrinsics.LJFF(this.LLILLJJLI, c1166370gSR.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1166370gSR.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1166370gSR.LLILZ);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        ShopTabBarChunkData shopTabBarChunkData = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (shopTabBarChunkData == null ? 0 : shopTabBarChunkData.hashCode())) * 31;
        ShopHeaderChunkData shopHeaderChunkData = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (shopHeaderChunkData == null ? 0 : shopHeaderChunkData.hashCode())) * 31;
        MultiTabContentChunkData multiTabContentChunkData = this.LLILZ;
        return iHashCode3 + (multiTabContentChunkData != null ? multiTabContentChunkData.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoreMixState(pageStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tabBarChunkData=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", headerChunkData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", tabContentData=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1166370gSR(int i) {
        this(EnumC1166380gSS.WHOLE_PAGE_LOADING, null, null, null);
    }

    public C1166370gSR(EnumC1166380gSS enumC1166380gSS, ShopTabBarChunkData shopTabBarChunkData, ShopHeaderChunkData shopHeaderChunkData, MultiTabContentChunkData multiTabContentChunkData) {
        this.LL = enumC1166380gSS;
        this.LLILLJJLI = shopTabBarChunkData;
        this.LLILLL = shopHeaderChunkData;
        this.LLILZ = multiTabContentChunkData;
    }

    public static C1166370gSR LIZ(C1166370gSR c1166370gSR, EnumC1166380gSS enumC1166380gSS, ShopTabBarChunkData shopTabBarChunkData, ShopHeaderChunkData shopHeaderChunkData, MultiTabContentChunkData multiTabContentChunkData, int i) {
        if ((i & 1) != 0) {
            enumC1166380gSS = c1166370gSR.LL;
        }
        if ((i & 2) != 0) {
            shopTabBarChunkData = c1166370gSR.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            shopHeaderChunkData = c1166370gSR.LLILLL;
        }
        if ((i & 8) != 0) {
            multiTabContentChunkData = c1166370gSR.LLILZ;
        }
        c1166370gSR.getClass();
        return new C1166370gSR(enumC1166380gSS, shopTabBarChunkData, shopHeaderChunkData, multiTabContentChunkData);
    }
}
