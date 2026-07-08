package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: X.13jd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20093113jd {
    public final Object LIZ;

    public C20093113jd(Object obj) {
        this.LIZ = obj;
    }

    public static C20093113jd LIZ(int i, int i2) {
        return new C20093113jd(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false));
    }

    public static C20093113jd LIZIZ(int i, int i2, int i3, boolean z) {
        return new C20093113jd(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }
}
