package X;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.03mw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C946403mw {
    public final int LIZ;
    public final Drawable LIZIZ;
    public final C419910GdJ LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final Object LJI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C946403mw() {
        int i = 0;
        this(i, i, i, 127);
    }

    public /* synthetic */ C946403mw(int i, int i2, int i3, int i4) {
        this((i4 & 1) != 0 ? 8 : i, null, null, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, null, null);
    }

    public static C946403mw LIZ(C946403mw c946403mw, int i, String str, int i2) {
        Drawable drawable;
        C419910GdJ c419910GdJ;
        int i3;
        String str2 = str;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i4 = c946403mw.LIZ;
        }
        Object obj = null;
        if ((i2 & 2) != 0) {
            drawable = c946403mw.LIZIZ;
        } else {
            drawable = null;
        }
        if ((i2 & 4) != 0) {
            c419910GdJ = c946403mw.LIZJ;
        } else {
            c419910GdJ = null;
        }
        int i5 = 0;
        if ((i2 & 8) != 0) {
            i3 = c946403mw.LIZLLL;
        } else {
            i3 = 0;
        }
        if ((i2 & 16) != 0) {
            i5 = c946403mw.LJ;
        }
        if ((i2 & 32) != 0) {
            str2 = c946403mw.LJFF;
        }
        if ((i2 & 64) != 0) {
            obj = c946403mw.LJI;
        }
        c946403mw.getClass();
        return new C946403mw(i4, drawable, c419910GdJ, i3, i5, str2, obj);
    }

    public C946403mw(int i, Drawable drawable, C419910GdJ c419910GdJ, int i2, int i3, String str, Object obj) {
        this.LIZ = i;
        this.LIZIZ = drawable;
        this.LIZJ = c419910GdJ;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = str;
        this.LJI = obj;
    }
}
