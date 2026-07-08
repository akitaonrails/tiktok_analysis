package X;

import X.AbstractC849240XTe;
import X.C0XT7;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0XT6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public abstract class C0XT6<T extends C0XT7<K>, K extends AbstractC849240XTe> extends C0XH7<T> {
    @Override // X.C0XH7
    public final String LIZIZ(C0XGA c0xga) {
        T t;
        C0XT7 c0xt7 = (C0XT7) c0xga;
        if (c0xt7 != null && (t = c0xt7.LJIIIZ) != 0) {
            return t.LIZLLL;
        }
        return null;
    }

    @Override // X.C0XH7
    public final boolean LIZJ(C0XGA c0xga) {
        T t;
        int i;
        C0XT7 c0xt7 = (C0XT7) c0xga;
        if (c0xt7 != null && (t = c0xt7.LJIIIZ) != 0 && (i = t.LIZ) > 1100 && i < 1199) {
            return true;
        }
        return false;
    }

    @Override // X.C0XH7
    public final boolean LIZLLL(C0XGA c0xga) {
        T t;
        C0XT7 c0xt7 = (C0XT7) c0xga;
        if (c0xt7 != null && (t = c0xt7.LJIIIZ) != 0) {
            int i = t.LIZ;
            if ((i == 1101 || i == 1102 || i == 1103) && !TextUtils.isEmpty(t.LIZLLL)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
