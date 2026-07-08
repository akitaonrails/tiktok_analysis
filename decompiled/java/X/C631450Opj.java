package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Opj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631450Opj {
    public static void LIZ(View view, Float f, Float f2, Float f3, Float f4, Float f5, int i) {
        final Float f6 = f4;
        final Float f7 = f3;
        final Float f8 = f2;
        final Float f9 = f;
        final Float f10 = null;
        if ((i & 1) != 0) {
            f9 = null;
        }
        if ((i & 2) != 0) {
            f8 = null;
        }
        if ((i & 4) != 0) {
            f7 = null;
        }
        if ((i & 8) != 0) {
            f6 = null;
        }
        if ((i & 16) == 0) {
            f10 = f5;
        }
        if (view != null) {
            view.setOutlineProvider(new ViewOutlineProvider(f9, f8, f7, f6, f10) { // from class: X.0Opi
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
                    Float f11 = this.LIZ;
                    if (f11 != null) {
                        outline.setRoundRect(0, 0, width, height, f11.floatValue());
                        return;
                    }
                    Float f12 = this.LIZIZ;
                    if (f12 == null && (f12 = this.LIZJ) == null && (f12 = this.LIZLLL) == null && (f12 = this.LJ) == null) {
                        fFloatValue = 0.0f;
                    } else {
                        fFloatValue = f12.floatValue();
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
                        int i2 = (int) fFloatValue;
                        outline.setRoundRect(0, 0, width + i2, height + i2, fFloatValue);
                        return;
                    }
                    if (this.LJIIL) {
                        int i3 = (int) fFloatValue;
                        outline.setRoundRect(0, -i3, width + i3, height, fFloatValue);
                    } else if (this.LJIIJ) {
                        int i4 = (int) fFloatValue;
                        outline.setRoundRect(-i4, 0, width, height + i4, fFloatValue);
                    } else {
                        if (!this.LJIIJJI) {
                            return;
                        }
                        int i5 = -((int) fFloatValue);
                        outline.setRoundRect(i5, i5, width, height, fFloatValue);
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
                    this.LIZ = f9;
                    this.LIZIZ = f8;
                    this.LIZJ = f7;
                    this.LIZLLL = f6;
                    this.LJ = f10;
                    if (f8 != null && Intrinsics.LJ(f8, f7)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LJFF = z;
                    if (f7 != null && Intrinsics.LJ(f7, f10)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.LJI = z2;
                    if (f6 != null && Intrinsics.LJ(f6, f10)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.LJII = z3;
                    if (f8 != null && Intrinsics.LJ(f8, f6)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.LJIIIIZZ = z4;
                    if (f8 != null) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    this.LJIIIZ = z5;
                    if (f7 != null) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    this.LJIIJ = z6;
                    if (f10 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    this.LJIIJJI = z7;
                    this.LJIIL = f6 != null;
                }
            });
            view.setClipToOutline(true);
        }
    }
}
