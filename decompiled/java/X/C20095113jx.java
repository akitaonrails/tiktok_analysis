package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* JADX INFO: renamed from: X.13jx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20095113jx {
    public static View.AccessibilityDelegate LIZ(View view) {
        return view.getAccessibilityDelegate();
    }

    public static ContentCaptureSession LIZIZ(View view) {
        return view.getContentCaptureSession();
    }

    public static List<Rect> LIZJ(View view) {
        return view.getSystemGestureExclusionRects();
    }

    public static void LJ(View view, C20095213jy c20095213jy) {
        view.setContentCaptureSession(null);
    }

    public static void LJFF(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }

    public static void LIZLLL(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }
}
