package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19aU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21565219aU extends ViewOutlineProvider {
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

    public C21565219aU() {
        this(null, 31);
    }

    public /* synthetic */ C21565219aU(Float f, int i) {
        this((i & 1) != 0 ? null : f, null, null, null, null);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        float fFloatValue;
        int width = view.getWidth();
        int height = view.getHeight();
        Float f = this.LIZ;
        if (f != null) {
            outline.setRoundRect(0, 0, width, height, f.floatValue());
            return;
        }
        Float f2 = this.LIZIZ;
        if (f2 == null && (f2 = this.LIZJ) == null && (f2 = this.LIZLLL) == null && (f2 = this.LJ) == null) {
            fFloatValue = 0.0f;
        } else {
            fFloatValue = f2.floatValue();
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

    public C21565219aU(Float f, Float f2, Float f3, Float f4, Float f5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f5;
        if (f2 != null && Intrinsics.LJ(f2, f3)) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        if (f3 != null && Intrinsics.LJ(f3, f5)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJI = z2;
        if (f4 != null && Intrinsics.LJ(f4, f5)) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LJII = z3;
        if (f2 != null && Intrinsics.LJ(f2, f4)) {
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
        if (f3 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.LJIIJ = z6;
        if (f5 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.LJIIJJI = z7;
        this.LJIIL = f4 != null;
    }
}
