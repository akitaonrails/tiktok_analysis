package X;

import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: X.13jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20092913jb {
    public final Object LIZ;

    public C20092913jb(Object obj) {
        this.LIZ = obj;
    }

    public static C20092913jb LIZIZ(int i, int i2, boolean z) {
        return new C20092913jb(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, z));
    }

    public static C20092913jb LIZ(int i, int i2, int i3, int i4, boolean z) {
        return new C20092913jb(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
