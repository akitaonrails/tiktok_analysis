package X;

/* JADX INFO: renamed from: X.18WE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18WE {
    public static final C18WF LIZ(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            if (i <= i3 && i2 <= i4) {
                return new C18WF(i, i2);
            }
            float f = i2;
            float f2 = i;
            int i5 = (int) ((f / f2) * i3);
            int i6 = (int) ((f2 / f) * i4);
            if (i5 <= i4) {
                return new C18WF(i3, i5);
            }
            return new C18WF(i6, i4);
        }
        return new C18WF(0, 0);
    }
}
