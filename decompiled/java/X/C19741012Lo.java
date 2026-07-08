package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.other.LiveEnableCropSurfaceExp;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19741012Lo {
    public static boolean LIZ(boolean z) {
        IHostPad iHostPad;
        if (!z || Build.VERSION.SDK_INT < 30 || !LiveEnableCropSurfaceExp.isEnable() || (iHostPad = (IHostPad) C1161920gLG.LIZJ(IHostPad.class)) == null || iHostPad.isPad()) {
            return false;
        }
        return true;
    }

    public static Rect LIZJ(int i, View view, SurfaceView surfaceView) throws Throwable {
        int bottom;
        int width;
        int height;
        int left;
        Integer numValueOf;
        boolean z;
        int top;
        Integer numValueOf2;
        int i2;
        int i3;
        Resources resources;
        Configuration configuration;
        Rect rect = new Rect();
        int right = surfaceView.getRight();
        if (view != null) {
            bottom = view.getBottom();
        } else {
            bottom = surfaceView.getBottom();
        }
        if (view != null) {
            width = view.getWidth();
            height = view.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        int width2 = surfaceView.getWidth();
        int height2 = surfaceView.getHeight();
        if (i != 2) {
            if (i == 3 && width != 0 && height != 0 && width2 != 0 && height2 != 0 && height2 > height) {
                int i4 = (height2 - height) / 2;
                top = surfaceView.getTop() + i4;
                left = 0;
                bottom = height2 - i4;
                z = true;
            }
            z = false;
            top = 0;
            left = 0;
        } else if (width != 0 && height != 0 && width2 != 0 && height2 != 0 && width2 > width) {
            int i5 = (width2 - width) / 2;
            left = surfaceView.getLeft() + i5;
            right = width2 - i5;
            if (surfaceView.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) surfaceView.getLayoutParams();
                int i6 = layoutParams.gravity;
                if ((i6 & 3) == 3 && (i3 = layoutParams.leftMargin) != 0) {
                    left -= i3;
                    right -= i3;
                }
                if ((i6 & 5) == 5 && (i2 = layoutParams.rightMargin) != 0) {
                    left += i2;
                    right += i2;
                }
            }
            Integer numValueOf3 = Integer.valueOf(surfaceView.getLeft());
            if (view != null) {
                numValueOf = Integer.valueOf(view.getLeft());
            } else {
                numValueOf = null;
            }
            if (!Intrinsics.LJFF(numValueOf3, numValueOf)) {
                Integer numValueOf4 = Integer.valueOf(surfaceView.getRight());
                if (view != null) {
                    numValueOf2 = Integer.valueOf(view.getRight());
                } else {
                    numValueOf2 = null;
                }
                if (!Intrinsics.LJFF(numValueOf4, numValueOf2)) {
                    top = 0;
                    z = true;
                }
            }
            z = false;
            top = 0;
        } else {
            z = false;
            top = 0;
            left = 0;
        }
        Context context = surfaceView.getContext();
        if ((context != null && (resources = context.getResources()) != null && (configuration = resources.getConfiguration()) != null && configuration.orientation == 2) || !z) {
            return null;
        }
        if (C1A7I.LLJJ == null) {
            Method method = SurfaceView.class.getMethod("setEnableSurfaceClipping", Boolean.TYPE);
            C1A7I.LLJJ = method;
            if (method != null) {
                method.setAccessible(true);
            }
        }
        Method method2 = C1A7I.LLJJ;
        if (method2 != null) {
            C2204961BRm.a0(method2, surfaceView, new Object[]{Boolean.TRUE}, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJBq+yNSO0EcJMno6ADRYoryGYRrkuQQUOn4OQ==", null));
        }
        C20441214yg.LIZIZ("test_lzk_dual_device_surfaceRenderView", "left: " + left + ", top: " + top + " - right: " + right + ", bottom: " + bottom);
        rect.set(left, top, right, bottom);
        return rect;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Rect LIZIZ(android.graphics.Rect r15, int r16, android.view.View r17, X.C1A7I r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19741012Lo.LIZIZ(android.graphics.Rect, int, android.view.View, X.1A7I):android.graphics.Rect");
    }
}
