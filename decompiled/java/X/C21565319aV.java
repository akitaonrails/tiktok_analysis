package X;

import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19aV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21565319aV {
    public static final void LIZ(View view, Float f, Float f2, Float f3, Float f4, Float f5) {
        if (view != null) {
            view.setOutlineProvider(new C21565219aU(f, f2, f3, f4, f5));
            view.setClipToOutline(true);
        }
    }

    public static final void LIZJ(View view, Float f, Float f2, Float f3, Float f4, Float f5) {
        C21565219aU c21565219aU;
        if (view == null) {
            return;
        }
        ViewOutlineProvider outlineProvider = view.getOutlineProvider();
        if ((outlineProvider instanceof C21565219aU) && (c21565219aU = (C21565219aU) outlineProvider) != null && Intrinsics.LJ(c21565219aU.LIZ, f) && Intrinsics.LJ(c21565219aU.LIZIZ, f2) && Intrinsics.LJ(c21565219aU.LIZJ, f3) && Intrinsics.LJ(c21565219aU.LIZLLL, f4) && Intrinsics.LJ(c21565219aU.LJ, f5)) {
            return;
        }
        LIZ(view, f, f2, f3, f4, f5);
    }

    public static /* synthetic */ void LIZIZ(View view, Float f, Float f2, Float f3, Float f4, Float f5, int i) {
        if ((i & 1) != 0) {
            f = null;
        }
        if ((i & 2) != 0) {
            f2 = null;
        }
        if ((i & 4) != 0) {
            f3 = null;
        }
        if ((i & 8) != 0) {
            f4 = null;
        }
        if ((i & 16) != 0) {
            f5 = null;
        }
        LIZ(view, f, f2, f3, f4, f5);
    }
}
