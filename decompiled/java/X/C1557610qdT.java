package X;

import com.ss.android.ugc.trill.feedback.api.FaqSubCategoryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557610qdT implements InterfaceC0148002o {
    public final String LL;
    public final List<FaqSubCategoryItem> LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;

    public C1557610qdT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557610qdT)) {
            return false;
        }
        C1557610qdT c1557610qdT = (C1557610qdT) obj;
        return Intrinsics.LJFF(this.LL, c1557610qdT.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1557610qdT.LLILLJJLI) && this.LLILLL == c1557610qdT.LLILLL && this.LLILZ == c1557610qdT.LLILZ;
    }

    public final int hashCode() {
        String str = this.LL;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FaqDetailVMState(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", loginState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1557610qdT(int i) {
        this(0, "", new ArrayList(), ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin());
    }

    public C1557610qdT(int i, String str, List list, boolean z) {
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    public static C1557610qdT LIZ(C1557610qdT c1557610qdT, String str, List list, int i, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            str = c1557610qdT.LL;
        }
        if ((i2 & 2) != 0) {
            list = c1557610qdT.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i = c1557610qdT.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z = c1557610qdT.LLILZ;
        }
        c1557610qdT.getClass();
        return new C1557610qdT(i, str, list, z);
    }
}
