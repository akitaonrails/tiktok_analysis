package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import u4.q0;

/* JADX INFO: renamed from: X.0inF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1256150inF {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(View view) {
        Integer numValueOf;
        int iIntValue;
        int iIntValue2;
        if (!view.isAttachedToWindow()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Context context = view.getContext();
        Integer numValueOf2 = null;
        if (context != null) {
            numValueOf = Integer.valueOf(C497820Jfg.LIZ(context));
        } else {
            numValueOf = null;
        }
        Context context2 = view.getContext();
        if (context2 != null) {
            numValueOf2 = Integer.valueOf(C497820Jfg.LIZIZ(context2));
        }
        int i = rect.top;
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        if (i >= iIntValue || rect.bottom <= 0 || rect.left <= 0) {
            return false;
        }
        int i2 = rect.right;
        if (numValueOf2 != null) {
            iIntValue2 = numValueOf2.intValue();
        } else {
            iIntValue2 = 0;
        }
        if (i2 >= iIntValue2) {
            return false;
        }
        return true;
    }

    public static void LIZ(View view, C1256160inG c1256160inG) {
        if (view == null || c1256160inG == null) {
            return;
        }
        view.setContentDescription(c1256160inG.LIZ);
        q0.LJIJ(view, new C1266340j3g(c1256160inG, 3));
    }
}
