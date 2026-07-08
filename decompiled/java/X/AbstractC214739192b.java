package X;

import X.C127M;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.192b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC214739192b<ACC extends C127M> extends AbstractC1738640vLS {
    public final C127K LL;

    public abstract int I5();

    public final ACC L5() {
        return (ACC) this.LL.getAccessory();
    }

    public AbstractC214739192b(View view) {
        super(view);
        C127K c127k = (C127K) view.findViewById(I5());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, view.getContext());
        if (numLIZJ != null) {
            c127k.setIconEnableColor(numLIZJ.intValue());
        }
        this.LL = c127k;
    }
}
