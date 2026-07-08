package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11EV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11EV<ITEM> extends RecyclerView.ViewHolder {
    public final C01GW LL;
    public ITEM LLILLJJLI;
    public int LLILLL;

    public void I5() {
    }

    public abstract void L5(int i, Object obj);

    public void P5() {
    }

    public C11EV(View view) {
        super(view);
        this.LL = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(434));
        this.itemView.addOnAttachStateChangeListener(new C12YF(this, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void N5(List list, int i, Object obj) {
        this.LLILLL = i;
        this.LLILLJJLI = obj;
        L5(i, obj);
    }
}
