package X;

import android.graphics.Point;

/* JADX INFO: renamed from: X.0H50, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H50<T> {
    public final /* synthetic */ float LIZ;
    public final /* synthetic */ int[] LIZIZ;
    public final /* synthetic */ float LIZJ;

    public C0H50(float f, float f2, int[] iArr) {
        this.LIZ = f;
        this.LIZIZ = iArr;
        this.LIZJ = f2;
    }

    public final Object LIZ() {
        int i = (int) this.LIZ;
        int[] iArr = this.LIZIZ;
        return new Point(i + iArr[0], ((int) this.LIZJ) + iArr[1]);
    }
}
