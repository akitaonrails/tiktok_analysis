package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JHt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489550JHt implements InterfaceC0148002o {
    public final AbstractC489130JGd LL;
    public final C291001Au<VideoPublishEditModel> LLILLJJLI;
    public final C2263161Di6 LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final EnumC489460JHk LLILZIL;

    public C489550JHt() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C489550JHt)) {
            return false;
        }
        C489550JHt c489550JHt = (C489550JHt) obj;
        return Intrinsics.LJFF(this.LL, c489550JHt.LL) && Intrinsics.LJFF(this.LLILLJJLI, c489550JHt.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c489550JHt.LLILLL) && Intrinsics.LJFF(this.LLILZ, c489550JHt.LLILZ) && this.LLILZIL == c489550JHt.LLILZIL;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        C2263161Di6 c2263161Di6 = this.LLILLL;
        return ((((iHashCode + (c2263161Di6 == null ? 0 : c2263161Di6.hashCode())) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoEditVMState(videoLoadStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", publishEditModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", editor=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", finishEdit=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", musicCheckStatus=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C489550JHt(int i) {
        this(C488560JDy.LIZ, new C291001Au(new VideoPublishEditModel()), null, new C291001Au(Boolean.FALSE), EnumC489460JHk.NOT_STARTED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C489550JHt(AbstractC489130JGd abstractC489130JGd, C291001Au<? extends VideoPublishEditModel> c291001Au, C2263161Di6 c2263161Di6, C291001Au<Boolean> c291001Au2, EnumC489460JHk enumC489460JHk) {
        this.LL = abstractC489130JGd;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c2263161Di6;
        this.LLILZ = c291001Au2;
        this.LLILZIL = enumC489460JHk;
    }

    public static C489550JHt LIZ(C489550JHt c489550JHt, AbstractC489130JGd abstractC489130JGd, C291001Au c291001Au, C2263161Di6 c2263161Di6, C291001Au c291001Au2, EnumC489460JHk enumC489460JHk, int i) {
        EnumC489460JHk enumC489460JHk2 = enumC489460JHk;
        C291001Au c291001Au3 = c291001Au2;
        C2263161Di6 c2263161Di62 = c2263161Di6;
        C291001Au c291001Au4 = c291001Au;
        AbstractC489130JGd abstractC489130JGd2 = abstractC489130JGd;
        if ((i & 1) != 0) {
            abstractC489130JGd2 = c489550JHt.LL;
        }
        if ((i & 2) != 0) {
            c291001Au4 = c489550JHt.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c2263161Di62 = c489550JHt.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au3 = c489550JHt.LLILZ;
        }
        if ((i & 16) != 0) {
            enumC489460JHk2 = c489550JHt.LLILZIL;
        }
        c489550JHt.getClass();
        return new C489550JHt(abstractC489130JGd2, c291001Au4, c2263161Di62, c291001Au3, enumC489460JHk2);
    }
}
