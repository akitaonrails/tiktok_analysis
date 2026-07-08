package X;

import X.InterfaceC1330960kju;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0kjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1330930kjr<T extends InterfaceC1330960kju> implements InterfaceC1330960kju {
    public final C1330000kiM LIZ;
    public final T LIZIZ;

    @Override // X.InterfaceC1330960kju
    public final boolean LIZ() {
        T t = this.LIZIZ;
        if (t != null) {
            return t.LIZ();
        }
        return false;
    }

    @Override // X.InterfaceC1330960kju
    public final int LJFF() {
        T t = this.LIZIZ;
        if (t == null) {
            return -1;
        }
        return t.LJFF();
    }

    @Override // X.InterfaceC1330960kju
    public final int LJII() {
        T t = this.LIZIZ;
        if (t == null) {
            return -1;
        }
        return t.LJII();
    }

    @Override // X.InterfaceC1330960kju
    public final void clear() {
        T t = this.LIZIZ;
        if (t != null) {
            t.clear();
        }
    }

    @Override // X.InterfaceC1330470kj7
    public final int getFrameCount() {
        T t = this.LIZIZ;
        if (t == null) {
            return 0;
        }
        return t.getFrameCount();
    }

    @Override // X.InterfaceC1330470kj7
    public int getLoopCount() {
        T t = this.LIZIZ;
        if (t == null) {
            return 0;
        }
        return t.getLoopCount();
    }

    @Override // X.InterfaceC1330960kju
    public final C1330000kiM getImageFormat() {
        return this.LIZ;
    }

    public C1330930kjr(T t) {
        this.LIZIZ = t;
    }

    @Override // X.InterfaceC1330960kju
    public final void LIZJ(int i) {
        T t = this.LIZIZ;
        if (t != null) {
            t.LIZJ(i);
        }
    }

    @Override // X.InterfaceC1330960kju
    public final void LIZLLL(ColorFilter colorFilter) {
        T t = this.LIZIZ;
        if (t != null) {
            t.LIZLLL(colorFilter);
        }
    }

    @Override // X.InterfaceC1330470kj7
    public int LJ(int i) {
        T t = this.LIZIZ;
        if (t == null) {
            return 0;
        }
        return t.LJ(i);
    }

    @Override // X.InterfaceC1330960kju
    public final void LJIIIIZZ(Rect rect) {
        T t = this.LIZIZ;
        if (t != null) {
            t.LJIIIIZZ(rect);
        }
    }

    @Override // X.InterfaceC1330960kju
    public final boolean LJIIIZ(int i) {
        T t = this.LIZIZ;
        if (t != null) {
            return t.LJIIIZ(i);
        }
        return false;
    }

    public C1330930kjr(C1329630khl c1329630khl, C1330000kiM c1330000kiM) {
        this.LIZIZ = c1329630khl;
        this.LIZ = c1330000kiM;
    }

    @Override // X.InterfaceC1330960kju
    public boolean LIZIZ(int i, Canvas canvas, Drawable drawable) {
        T t = this.LIZIZ;
        if (t != null && t.LIZIZ(i, canvas, drawable)) {
            return true;
        }
        return false;
    }
}
