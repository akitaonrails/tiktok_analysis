package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0M2d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewOnClickListenerC561930M2d implements View.OnClickListener {
    public long LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LL > this.LLILLJJLI) {
            this.LL = jCurrentTimeMillis;
            this.LLILLL.invoke();
        }
    }

    public ViewOnClickListenerC561930M2d(long j, Function0<Unit> function0) {
        this.LLILLJJLI = j;
        this.LLILLL = function0;
    }
}
