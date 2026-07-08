package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C732590SoT {
    public final Drawable LIZ;
    public final Drawable LIZIZ;
    public final ViewGroup.LayoutParams LIZJ;

    public C732590SoT() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C732590SoT)) {
            return false;
        }
        C732590SoT c732590SoT = (C732590SoT) obj;
        return Intrinsics.LJFF(this.LIZ, c732590SoT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c732590SoT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c732590SoT.LIZJ);
    }

    public C732590SoT(Drawable drawable, Drawable drawable2, ViewGroup.LayoutParams layoutParams) {
        this.LIZ = drawable;
        this.LIZIZ = drawable2;
        this.LIZJ = layoutParams;
    }

    public static C732590SoT LIZ(C732590SoT c732590SoT, Drawable drawable, Drawable drawable2, ViewGroup.LayoutParams layoutParams, int i) {
        if ((i & 1) != 0) {
            drawable = c732590SoT.LIZ;
        }
        if ((i & 2) != 0) {
            drawable2 = c732590SoT.LIZIZ;
        }
        if ((i & 4) != 0) {
            layoutParams = c732590SoT.LIZJ;
        }
        return new C732590SoT(drawable, drawable2, layoutParams);
    }
}
