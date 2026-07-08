package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0IYt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC468490IYt<T> extends RecyclerView.ViewHolder {
    public boolean LL;
    public final C11NJ LLILLJJLI;

    public abstract void I5(int i, Object obj);

    public boolean L5() {
        return this instanceof C468460IYq;
    }

    public void onViewAttachedToWindow() {
        this.LL = true;
    }

    public void onViewDetachedFromWindow() {
        this.LL = false;
    }

    public AbstractC468490IYt(View view) {
        super(view);
        this.LLILLJJLI = new C11NJ();
    }

    public final void N5(InterfaceC420801kM interfaceC420801kM) {
        this.LLILLJJLI.LIZ(interfaceC420801kM);
    }
}
