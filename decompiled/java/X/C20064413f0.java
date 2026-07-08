package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: X.13f0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20064413f0 {
    public static final View LIZJ(AbstractC20055413dY abstractC20055413dY) {
        View interopView;
        C20084713iH c20084713iH = C20052513d5.LJFF(abstractC20055413dY.LL).LLJJ;
        if (c20084713iH != null && (interopView = c20084713iH.getInteropView()) != null) {
            return interopView;
        }
        "Could not fetch interop view".toString();
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final boolean LIZ(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect LIZIZ(InterfaceC20060313eL interfaceC20060313eL, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C1683130ttv c1683130ttvLJIJ = interfaceC20060313eL.LJIJ();
        if (c1683130ttvLJIJ == null) {
            return null;
        }
        int i = (int) c1683130ttvLJIJ.LIZ;
        int i2 = iArr[0];
        int i3 = iArr2[0];
        int i4 = (int) c1683130ttvLJIJ.LIZIZ;
        int i5 = iArr[1];
        int i6 = iArr2[1];
        return new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) c1683130ttvLJIJ.LIZJ) + i2) - i3, (((int) c1683130ttvLJIJ.LIZLLL) + i5) - i6);
    }
}
