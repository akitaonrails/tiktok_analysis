package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.10ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19390410ta {
    public final int LL;
    public View LLILLJJLI;
    public C194451115t LLILLL;
    public Resources LLILZ;
    public Context LLILZIL;

    public AbstractC19390410ta() {
        this(-1);
    }

    public abstract View LJI(Context context);

    public void LJIIIZ() {
    }

    public void LJIIJ() {
    }

    public void LJIIJJI() {
    }

    public void LJIIL() {
    }

    public void LJIILIIL() {
    }

    public void LJIILJJIL(View view) {
    }

    public final LifecycleOwner LJIIIIZZ() {
        C194451115t c194451115t = this.LLILLL;
        if (c194451115t != null) {
            return c194451115t;
        }
        throw new IllegalStateException("should be called after onCreate or before onDestroy");
    }

    public AbstractC19390410ta(int i) {
        this.LL = i;
    }

    public final int LJII(int i) {
        Context context = this.LLILZIL;
        if (context == null) {
            context = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -16777216;
    }
}
