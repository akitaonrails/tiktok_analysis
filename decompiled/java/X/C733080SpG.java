package X;

import android.graphics.drawable.Drawable;
import com.bytedance.tux.drawable.TuxIconDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733080SpG implements InterfaceC0148002o {
    public final Drawable LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final boolean LLIZ;

    public C733080SpG() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C733080SpG)) {
            return false;
        }
        C733080SpG c733080SpG = (C733080SpG) obj;
        return Intrinsics.LJFF(this.LL, c733080SpG.LL) && this.LLILLJJLI == c733080SpG.LLILLJJLI && this.LLILLL == c733080SpG.LLILLL && Intrinsics.LJFF(this.LLILZ, c733080SpG.LLILZ) && this.LLILZIL == c733080SpG.LLILZIL && this.LLILZLL == c733080SpG.LLILZLL && this.LLIZ == c733080SpG.LLIZ;
    }

    public final int hashCode() {
        Drawable drawable = this.LL;
        return ((((((((((((drawable == null ? 0 : drawable.hashCode()) * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL) * 31) + this.LLILZLL) * 31) + C786410Ut5.Z2(this.LLIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoCommentState(commentImageDrawable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", commentGiftVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", commentGiftAnimate=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", commentCountText=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", commentCountVisible=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", commentLayoutVisible=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", enableAdjustLayout=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C733080SpG(int i) {
        this(null, 8, false, "", 8, 0, true);
    }

    public C733080SpG(Drawable drawable, int i, boolean z, String str, int i2, int i3, boolean z2) {
        this.LL = drawable;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = i2;
        this.LLILZLL = i3;
        this.LLIZ = z2;
    }

    public static C733080SpG LIZ(C733080SpG c733080SpG, TuxIconDrawable tuxIconDrawable, int i, String str, int i2, int i3, boolean z, int i4) {
        boolean z2;
        boolean z3 = z;
        int i5 = i3;
        int i6 = i2;
        String str2 = str;
        int i7 = i;
        Drawable drawable = tuxIconDrawable;
        if ((i4 & 1) != 0) {
            drawable = c733080SpG.LL;
        }
        if ((i4 & 2) != 0) {
            i7 = c733080SpG.LLILLJJLI;
        }
        if ((i4 & 4) != 0) {
            z2 = c733080SpG.LLILLL;
        } else {
            z2 = false;
        }
        if ((i4 & 8) != 0) {
            str2 = c733080SpG.LLILZ;
        }
        if ((i4 & 16) != 0) {
            i6 = c733080SpG.LLILZIL;
        }
        if ((i4 & 32) != 0) {
            i5 = c733080SpG.LLILZLL;
        }
        if ((i4 & 64) != 0) {
            z3 = c733080SpG.LLIZ;
        }
        c733080SpG.getClass();
        return new C733080SpG(drawable, i7, z2, str2, i6, i5, z3);
    }
}
