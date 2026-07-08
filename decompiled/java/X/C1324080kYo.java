package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0kYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324080kYo {
    public static boolean LIZIZ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 < i3 || rect.bottom <= i3) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i4 = rect.left;
                int i5 = rect2.left;
                if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if ((i6 > i7 || rect.top >= i7) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i8 = rect.right;
        int i9 = rect2.right;
        if ((i8 > i9 || rect.left >= i9) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    public static int LIZLLL(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int LJ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r10.bottom <= r12.top) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
    
        r2 = LIZLLL(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
    
        if (r9 == 33) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        if (r9 == 66) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r9 != 130) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        r1 = r12.bottom;
        r0 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r2 >= java.lang.Math.max(1, r1 - r0)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        r1 = r12.right;
        r0 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r1 = r10.top;
        r0 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r10.top >= r12.bottom) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r1 = LIZIZ(r9, r10, r11)
            boolean r0 = LIZIZ(r9, r10, r12)
            r8 = 0
            if (r0 != 0) goto L69
            if (r1 == 0) goto L69
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7 = 130(0x82, float:1.82E-43)
            r5 = 33
            r4 = 66
            r0 = 17
            r3 = 1
            if (r9 == r0) goto L61
            if (r9 == r5) goto L47
            if (r9 == r4) goto L5a
            if (r9 != r7) goto L54
            int r1 = r10.bottom
            int r0 = r12.top
            if (r1 > r0) goto L68
        L26:
            int r2 = LIZLLL(r9, r10, r11)
            if (r9 == r5) goto L42
            if (r9 == r4) goto L3d
            if (r9 != r7) goto L4e
            int r1 = r12.bottom
            int r0 = r10.bottom
        L34:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r3, r1)
            if (r2 >= r0) goto L3c
            r8 = 1
        L3c:
            return r8
        L3d:
            int r1 = r12.right
            int r0 = r10.right
            goto L34
        L42:
            int r1 = r10.top
            int r0 = r12.top
            goto L34
        L47:
            int r1 = r10.top
            int r0 = r12.bottom
            if (r1 < r0) goto L68
            goto L26
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L54:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L5a:
            int r1 = r10.right
            int r0 = r12.left
            if (r1 > r0) goto L68
            return r3
        L61:
            int r1 = r10.left
            int r0 = r12.right
            if (r1 < r0) goto L68
            return r3
        L68:
            return r3
        L69:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1324080kYo.LIZ(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }
}
