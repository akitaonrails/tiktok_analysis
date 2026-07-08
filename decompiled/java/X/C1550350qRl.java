package X;

import java.util.Stack;

/* JADX INFO: renamed from: X.0qRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1550350qRl {
    public final Object[] LIZ;

    public C1550350qRl(int i) {
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.LIZ = objArr;
    }

    public final void LIZ(int i, String str) {
        Object[] objArr = this.LIZ;
        Object obj = objArr[i];
        if (obj instanceof Stack) {
            ((Stack) obj).push(str);
            return;
        }
        if (obj instanceof String) {
            Stack stack = new Stack();
            stack.push(obj);
            stack.push(str);
            objArr[i] = stack;
            return;
        }
        objArr[i] = str;
    }
}
