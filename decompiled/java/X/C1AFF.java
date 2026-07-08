package X;

import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AFF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFF {
    public final ViewGroup LIZ;
    public final C1AX4 LIZIZ;
    public final FrameLayout LIZJ;
    public final Layout LIZLLL;
    public final Pair<Integer, Integer> LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Rect LJII;
    public final Pair<Integer, Integer> LJIIIIZZ;
    public final int LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AFF)) {
            return false;
        }
        C1AFF c1aff = (C1AFF) obj;
        return Intrinsics.LJFF(this.LIZ, c1aff.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1aff.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1aff.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1aff.LIZLLL) && Intrinsics.LJFF(this.LJ, c1aff.LJ) && this.LJFF == c1aff.LJFF && this.LJI == c1aff.LJI && Intrinsics.LJFF(this.LJII, c1aff.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1aff.LJIIIIZZ) && this.LJIIIZ == c1aff.LJIIIZ;
    }

    public C1AFF(ViewGroup viewGroup, C2180891AWx c2180891AWx, FrameLayout frameLayout, Layout layout, Pair pair, boolean z, boolean z2, Rect rect, Pair pair2, int i) {
        this.LIZ = viewGroup;
        this.LIZIZ = c2180891AWx;
        this.LIZJ = frameLayout;
        this.LIZLLL = layout;
        this.LJ = pair;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = rect;
        this.LJIIIIZZ = pair2;
        this.LJIIIZ = i;
    }
}
