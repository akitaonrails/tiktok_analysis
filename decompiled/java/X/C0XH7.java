package X;

import X.C0XGA;

/* JADX INFO: renamed from: X.0XH7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XH7<T extends C0XGA> extends AbstractC846040XGw<T> {
    public String LIZIZ(T t) {
        return null;
    }

    public boolean LIZJ(T t) {
        return false;
    }

    public boolean LIZLLL(T t) {
        return false;
    }

    public abstract void LJ(T t, int i);

    public void LJFF(C0XGA c0xga) {
    }

    public abstract void LJI(T t);

    @Override // X.AbstractC846040XGw
    public final void LIZ(T t) {
        if (t.LIZIZ) {
            LJI(t);
            return;
        }
        if (LIZJ(t)) {
            if (LIZLLL(t)) {
                LIZIZ(t);
                LJFF(t);
                return;
            } else {
                LJ(t, t.LIZLLL);
                return;
            }
        }
        LJ(t, t.LIZLLL);
    }
}
