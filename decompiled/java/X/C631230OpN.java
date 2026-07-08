package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631230OpN {
    public static final void LIZ(View view) {
        if (view != null && view.getVisibility() != 8) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    public static final void LIZJ(View view) {
        if (view != null && view.getVisibility() != 0) {
            C786410Ut5.LJLLLLLL(0, view);
        }
    }

    public static void LIZIZ(View view, final Float f) {
        final Float f2 = null;
        if (view != null) {
            view.setOutlineProvider(new ViewOutlineProvider(f, f2, f2, f2, f2) { // from class: X.0OpO
                public final Float LIZ;
                public final Float LIZIZ;
                public final Float LIZJ;
                public final Float LIZLLL;
                public final Float LJ;
                public final boolean LJFF;
                public final boolean LJI;
                public final boolean LJII;
                public final boolean LJIIIIZZ;
                public final boolean LJIIIZ;
                public final boolean LJIIJ;
                public final boolean LJIIJJI;
                public final boolean LJIIL;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view2, Outline outline) {
                    float fFloatValue;
                    int width = view2.getWidth();
                    int height = view2.getHeight();
                    Float f3 = this.LIZ;
                    if (f3 != null) {
                        outline.setRoundRect(0, 0, width, height, f3.floatValue());
                        return;
                    }
                    Float f4 = this.LIZIZ;
                    if (f4 == null && (f4 = this.LIZJ) == null && (f4 = this.LIZLLL) == null && (f4 = this.LJ) == null) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = f4.floatValue();
                    }
                    if (this.LJFF) {
                        outline.setRoundRect(0, 0, width, height + ((int) fFloatValue), fFloatValue);
                        return;
                    }
                    if (this.LJII) {
                        outline.setRoundRect(0, -((int) fFloatValue), width, height, fFloatValue);
                        return;
                    }
                    if (this.LJIIIIZZ) {
                        outline.setRoundRect(0, 0, width + ((int) fFloatValue), height, fFloatValue);
                        return;
                    }
                    if (this.LJI) {
                        outline.setRoundRect(-((int) fFloatValue), 0, width, height, fFloatValue);
                        return;
                    }
                    if (this.LJIIIZ) {
                        int i = (int) fFloatValue;
                        outline.setRoundRect(0, 0, width + i, height + i, fFloatValue);
                        return;
                    }
                    if (this.LJIIL) {
                        int i2 = (int) fFloatValue;
                        outline.setRoundRect(0, -i2, width + i2, height, fFloatValue);
                    } else if (this.LJIIJ) {
                        int i3 = (int) fFloatValue;
                        outline.setRoundRect(-i3, 0, width, height + i3, fFloatValue);
                    } else {
                        if (!this.LJIIJJI) {
                            return;
                        }
                        int i4 = -((int) fFloatValue);
                        outline.setRoundRect(i4, i4, width, height, fFloatValue);
                    }
                }

                {
                    boolean z;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    this.LIZ = f;
                    this.LIZIZ = f2;
                    this.LIZJ = f2;
                    this.LIZLLL = f2;
                    this.LJ = f2;
                    if (f2 != null && Intrinsics.LJ(f2, f2)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJFF = z;
                    if (f2 != null && Intrinsics.LJ(f2, f2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LJI = z2;
                    if (f2 != null && Intrinsics.LJ(f2, f2)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.LJII = z3;
                    if (f2 != null && Intrinsics.LJ(f2, f2)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.LJIIIIZZ = z4;
                    if (f2 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.LJIIIZ = z5;
                    if (f2 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.LJIIJ = z6;
                    if (f2 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.LJIIJJI = z7;
                    this.LJIIL = f2 != null;
                }
            });
            view.setClipToOutline(true);
        }
    }
}
