package X;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0x5W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1805640x5W {
    public final ViewGroup LIZ;
    public View LIZIZ;

    public abstract EnumC1568540qv6 LIZ();

    public abstract int LIZIZ();

    public abstract void LIZLLL(AbstractC1568580qvA abstractC1568580qvA);

    public abstract void LJ();

    public abstract void LJFF();

    public void LIZJ() {
        this.LIZIZ = C786410Ut5.Td(C786410Ut5.ne(this.LIZ.getContext()), LIZIZ(), this.LIZ, false);
    }

    public AbstractC1805640x5W(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }
}
