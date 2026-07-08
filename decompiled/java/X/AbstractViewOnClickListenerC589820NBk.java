package X;

import Y.ARunnableS109S0100000_9;
import android.os.Handler;
import android.view.View;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractViewOnClickListenerC589820NBk implements View.OnClickListener {
    public final long LL = 400;
    public boolean LLILLJJLI = true;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(648));

    public abstract void LIZ(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            C786410Ut5.LJLIIL(this.LL, (Handler) this.LLILLL.getValue(), new ARunnableS109S0100000_9(this, 233));
            LIZ(view);
        }
    }
}
