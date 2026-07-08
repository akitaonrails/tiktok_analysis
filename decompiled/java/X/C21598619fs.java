package X;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: renamed from: X.19fs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21598619fs {
    public final AccessibilityRecord LIZ;

    public static C21598619fs LIZ() {
        return new C21598619fs(AccessibilityRecord.obtain());
    }

    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.LIZ;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    public C21598619fs(Object obj) {
        this.LIZ = (AccessibilityRecord) obj;
    }

    public final void LIZIZ(int i) {
        this.LIZ.setFromIndex(i);
    }

    public final void LIZJ(int i) {
        this.LIZ.setItemCount(i);
    }

    public final void LIZLLL(boolean z) {
        this.LIZ.setScrollable(z);
    }

    public final void LJ(int i) {
        this.LIZ.setToIndex(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21598619fs)) {
            return false;
        }
        C21598619fs c21598619fs = (C21598619fs) obj;
        AccessibilityRecord accessibilityRecord = this.LIZ;
        if (accessibilityRecord == null) {
            if (c21598619fs.LIZ == null) {
                return true;
            }
            return false;
        }
        return accessibilityRecord.equals(c21598619fs.LIZ);
    }
}
