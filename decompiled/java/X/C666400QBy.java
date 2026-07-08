package X;

import com.ss.android.ugc.aweme.search.pages.result.nimble.ui.pages.image.model.ImageData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C666400QBy implements InterfaceC0148002o {
    public final List<ImageData> LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final EnumC666410QBz LLILZ;

    public C666400QBy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C666400QBy)) {
            return false;
        }
        C666400QBy c666400QBy = (C666400QBy) obj;
        return Intrinsics.LJFF(this.LL, c666400QBy.LL) && this.LLILLJJLI == c666400QBy.LLILLJJLI && this.LLILLL == c666400QBy.LLILLL && this.LLILZ == c666400QBy.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchImageLandingPageVMState(imageDataList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", totalImages=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hasLoadMore=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loadMoreState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C666400QBy(int i) {
        this(C13BV.INSTANCE, 0, false, EnumC666410QBz.LOADING);
    }

    public C666400QBy(List<ImageData> list, int i, boolean z, EnumC666410QBz enumC666410QBz) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = enumC666410QBz;
    }

    public static C666400QBy LIZ(C666400QBy c666400QBy, List list, int i, EnumC666410QBz enumC666410QBz, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            list = c666400QBy.LL;
        }
        if ((i2 & 2) != 0) {
            i = c666400QBy.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z = c666400QBy.LLILLL;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            enumC666410QBz = c666400QBy.LLILZ;
        }
        c666400QBy.getClass();
        return new C666400QBy(list, i, z, enumC666410QBz);
    }
}
