package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C731530Sml implements InterfaceC0148002o {
    public final C731910SnN LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<String> LLILLL;
    public final C291001Au<String> LLILZ;
    public final C291001Au<Unit> LLILZIL;
    public final C291001Au<Unit> LLILZLL;
    public final C291001Au<Unit> LLIZ;

    public C731530Sml() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C731530Sml)) {
            return false;
        }
        C731530Sml c731530Sml = (C731530Sml) obj;
        return Intrinsics.LJFF(this.LL, c731530Sml.LL) && Intrinsics.LJFF(this.LLILLJJLI, c731530Sml.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c731530Sml.LLILLL) && Intrinsics.LJFF(this.LLILZ, c731530Sml.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c731530Sml.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c731530Sml.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c731530Sml.LLIZ);
    }

    public final int hashCode() {
        C731910SnN c731910SnN = this.LL;
        int iHashCode = (c731910SnN == null ? 0 : c731910SnN.hashCode()) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<String> c291001Au2 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<String> c291001Au3 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<Unit> c291001Au5 = this.LLILZLL;
        int iHashCode6 = (iHashCode5 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Unit> c291001Au6 = this.LLIZ;
        return iHashCode6 + (c291001Au6 != null ? c291001Au6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoFavoriteState(displayState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showClickAnim=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showErrToast=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showCollectionManageToast=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showCollectionRevisitToast=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showTooltipGuide=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", showCollectionInviteIntro=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C731530Sml(C731910SnN c731910SnN, int i) {
        this((i & 1) != 0 ? null : c731910SnN, null, null, null, null, null, null);
    }

    public C731530Sml(C731910SnN c731910SnN, C291001Au<Boolean> c291001Au, C291001Au<String> c291001Au2, C291001Au<String> c291001Au3, C291001Au<Unit> c291001Au4, C291001Au<Unit> c291001Au5, C291001Au<Unit> c291001Au6) {
        this.LL = c731910SnN;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
        this.LLILZ = c291001Au3;
        this.LLILZIL = c291001Au4;
        this.LLILZLL = c291001Au5;
        this.LLIZ = c291001Au6;
    }

    public static C731530Sml LIZ(C731530Sml c731530Sml, C731910SnN c731910SnN, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, int i) {
        C291001Au c291001Au7 = c291001Au6;
        C291001Au c291001Au8 = c291001Au5;
        C291001Au c291001Au9 = c291001Au4;
        C291001Au c291001Au10 = c291001Au3;
        C291001Au c291001Au11 = c291001Au2;
        C291001Au c291001Au12 = c291001Au;
        C731910SnN c731910SnN2 = c731910SnN;
        if ((i & 1) != 0) {
            c731910SnN2 = c731530Sml.LL;
        }
        if ((i & 2) != 0) {
            c291001Au12 = c731530Sml.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au11 = c731530Sml.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au10 = c731530Sml.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au9 = c731530Sml.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au8 = c731530Sml.LLILZLL;
        }
        if ((i & 64) != 0) {
            c291001Au7 = c731530Sml.LLIZ;
        }
        c731530Sml.getClass();
        return new C731530Sml(c731910SnN2, c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8, c291001Au7);
    }
}
