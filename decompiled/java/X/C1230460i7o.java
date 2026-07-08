package X;

import com.ss.android.ugc.aweme.publicgroup.data.JoinApplyInfo;
import com.ss.android.ugc.aweme.publicgroup.data.PreviewEntryMeta;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i7o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230460i7o implements InterfaceC0148002o {
    public final C1229810i6l LL;
    public final int LLILLJJLI;
    public final C1230280i7W LLILLL;
    public final JoinApplyInfo LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final C291001Au<C343950De5> LLIZLLLIL;
    public final C291001Au<String> LLJ;
    public final C291001Au<Unit> LLJI;
    public final PreviewEntryMeta LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230460i7o)) {
            return false;
        }
        C1230460i7o c1230460i7o = (C1230460i7o) obj;
        return Intrinsics.LJFF(this.LL, c1230460i7o.LL) && this.LLILLJJLI == c1230460i7o.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1230460i7o.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1230460i7o.LLILZ) && this.LLILZIL == c1230460i7o.LLILZIL && this.LLILZLL == c1230460i7o.LLILZLL && this.LLIZ == c1230460i7o.LLIZ && Intrinsics.LJFF(this.LLIZLLLIL, c1230460i7o.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c1230460i7o.LLJ) && Intrinsics.LJFF(this.LLJI, c1230460i7o.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1230460i7o.LLJIJIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + this.LLJI.hashCode()) * 31;
        PreviewEntryMeta previewEntryMeta = this.LLJIJIL;
        return iHashCode + (previewEntryMeta == null ? 0 : previewEntryMeta.hashCode());
    }

    public final String toString() {
        return "GroupInvitationVMState(groupInfo=" + this.LL + ", userGroupStatus=" + this.LLILLJJLI + ", checkersPair=" + this.LLILLL + ", applyInfo=" + this.LLILZ + ", dialogLoading=" + this.LLILZIL + ", buttonLoading=" + this.LLILZLL + ", blockInteraction=" + this.LLIZ + ", close=" + this.LLIZLLLIL + ", toastEvent=" + this.LLJ + ", dismissKeyboardEvent=" + this.LLJI + ", previewEntryMeta=" + this.LLJIJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1230460i7o(C1229810i6l c1229810i6l, int i, C1230280i7W c1230280i7W, JoinApplyInfo joinApplyInfo, boolean z, boolean z2, boolean z3, C291001Au<? extends C343950De5> c291001Au, C291001Au<String> c291001Au2, C291001Au<Unit> c291001Au3, PreviewEntryMeta previewEntryMeta) {
        this.LL = c1229810i6l;
        this.LLILLJJLI = i;
        this.LLILLL = c1230280i7W;
        this.LLILZ = joinApplyInfo;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
        this.LLIZLLLIL = c291001Au;
        this.LLJ = c291001Au2;
        this.LLJI = c291001Au3;
        this.LLJIJIL = previewEntryMeta;
    }

    public static C1230460i7o LIZ(C1230460i7o c1230460i7o, C1229810i6l c1229810i6l, int i, C1230280i7W c1230280i7W, JoinApplyInfo joinApplyInfo, boolean z, boolean z2, boolean z3, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, PreviewEntryMeta previewEntryMeta, int i2) {
        PreviewEntryMeta previewEntryMeta2 = previewEntryMeta;
        C291001Au c291001Au4 = c291001Au3;
        C291001Au c291001Au5 = c291001Au2;
        C291001Au c291001Au6 = c291001Au;
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        JoinApplyInfo joinApplyInfo2 = joinApplyInfo;
        C1230280i7W c1230280i7W2 = c1230280i7W;
        int i3 = i;
        C1229810i6l c1229810i6l2 = c1229810i6l;
        if ((i2 & 1) != 0) {
            c1229810i6l2 = c1230460i7o.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c1230460i7o.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            c1230280i7W2 = c1230460i7o.LLILLL;
        }
        if ((i2 & 8) != 0) {
            joinApplyInfo2 = c1230460i7o.LLILZ;
        }
        if ((i2 & 16) != 0) {
            z6 = c1230460i7o.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            z5 = c1230460i7o.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            z4 = c1230460i7o.LLIZ;
        }
        if ((i2 & 128) != 0) {
            c291001Au6 = c1230460i7o.LLIZLLLIL;
        }
        if ((i2 & 256) != 0) {
            c291001Au5 = c1230460i7o.LLJ;
        }
        if ((i2 & 512) != 0) {
            c291001Au4 = c1230460i7o.LLJI;
        }
        if ((i2 & 1024) != 0) {
            previewEntryMeta2 = c1230460i7o.LLJIJIL;
        }
        c1230460i7o.getClass();
        return new C1230460i7o(c1229810i6l2, i3, c1230280i7W2, joinApplyInfo2, z6, z5, z4, c291001Au6, c291001Au5, c291001Au4, previewEntryMeta2);
    }
}
