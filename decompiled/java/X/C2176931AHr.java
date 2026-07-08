package X;

import com.bytedance.android.livesdk.viewer_picks.model.ViewerPicksInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AHr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2176931AHr implements InterfaceC0148002o {
    public final EnumC2176951AHt LL;
    public final ViewerPicksInfo LLILLJJLI;
    public final Long LLILLL;
    public final EnumC2176961AHu LLILZ;

    public C2176931AHr() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2176931AHr)) {
            return false;
        }
        C2176931AHr c2176931AHr = (C2176931AHr) obj;
        return this.LL == c2176931AHr.LL && Intrinsics.LJFF(this.LLILLJJLI, c2176931AHr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c2176931AHr.LLILLL) && this.LLILZ == c2176931AHr.LLILZ;
    }

    public final int hashCode() {
        EnumC2176951AHt enumC2176951AHt = this.LL;
        int iHashCode = (enumC2176951AHt == null ? 0 : enumC2176951AHt.hashCode()) * 31;
        ViewerPicksInfo viewerPicksInfo = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (viewerPicksInfo == null ? 0 : viewerPicksInfo.hashCode())) * 31;
        Long l = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        EnumC2176961AHu enumC2176961AHu = this.LLILZ;
        return iHashCode3 + (enumC2176961AHu != null ? enumC2176961AHu.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ViewerWishesState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", info=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", countdownSec=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", boardType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C2176931AHr LIZ(C2176931AHr c2176931AHr, EnumC2176951AHt enumC2176951AHt, ViewerPicksInfo viewerPicksInfo) {
        Long l = c2176931AHr.LLILLL;
        EnumC2176961AHu enumC2176961AHu = c2176931AHr.LLILZ;
        c2176931AHr.getClass();
        return new C2176931AHr(enumC2176951AHt, viewerPicksInfo, l, enumC2176961AHu);
    }

    public C2176931AHr(EnumC2176951AHt enumC2176951AHt, ViewerPicksInfo viewerPicksInfo, Long l, EnumC2176961AHu enumC2176961AHu) {
        this.LL = enumC2176951AHt;
        this.LLILLJJLI = viewerPicksInfo;
        this.LLILLL = l;
        this.LLILZ = enumC2176961AHu;
    }
}
