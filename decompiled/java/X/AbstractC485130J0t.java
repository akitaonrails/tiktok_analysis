package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0J0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC485130J0t<T> extends AbstractC470910IdN<Integer, T> {
    @Override // X.AbstractC470910IdN
    public final boolean LIZLLL() {
        return false;
    }

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public final void LJI(int i, int i2, int i3, Executor executor, AbstractC485160J0w<T> abstractC485160J0w) {
        C485150J0v c485150J0v = new C485150J0v(this, i, i2, executor, abstractC485160J0w);
        if (i3 == 0) {
            List listEmptyList = Collections.emptyList();
            if (!c485150J0v.LIZ.LIZ()) {
                c485150J0v.LIZ.LIZIZ(new C0J10<>(listEmptyList, c485150J0v.LIZIZ));
                return;
            }
            return;
        }
        LJIIIIZZ();
    }
}
