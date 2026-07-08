package X;

import com.ss.android.ugc.aweme.im.strategy.businessconfig.TitleBarRightIconConf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZV9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZV9 implements InterfaceC0148002o {
    public final Boolean LL;
    public final TitleBarRightIconConf LLILLJJLI;

    public C0ZV9() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZV9)) {
            return false;
        }
        C0ZV9 c0zv9 = (C0ZV9) obj;
        return Intrinsics.LJFF(this.LL, c0zv9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zv9.LLILLJJLI);
    }

    public final int hashCode() {
        Boolean bool = this.LL;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        TitleBarRightIconConf titleBarRightIconConf = this.LLILLJJLI;
        return iHashCode + (titleBarRightIconConf != null ? titleBarRightIconConf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleTitleBarRightState(showStarred=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", placeHolderConf=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZV9(Boolean bool, TitleBarRightIconConf titleBarRightIconConf) {
        this.LL = bool;
        this.LLILLJJLI = titleBarRightIconConf;
    }

    public static C0ZV9 LIZ(C0ZV9 c0zv9, Boolean bool, TitleBarRightIconConf titleBarRightIconConf, int i) {
        if ((i & 1) != 0) {
            bool = c0zv9.LL;
        }
        if ((i & 2) != 0) {
            titleBarRightIconConf = c0zv9.LLILLJJLI;
        }
        c0zv9.getClass();
        return new C0ZV9(bool, titleBarRightIconConf);
    }
}
