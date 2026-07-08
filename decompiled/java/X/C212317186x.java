package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.186x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212317186x extends AbstractViewOnClickListenerC19509711Up {
    public final /* synthetic */ C212305186l LLILLL;

    public C212317186x(C212305186l c212305186l) {
        this.LLILLL = c212305186l;
    }

    @Override // X.AbstractViewOnClickListenerC19509711Up
    public final void LIZ(View view) {
        if (view != null) {
            boolean zIsEnabled = this.LLILLL.getCustomBidBtn().isEnabled();
            Function1<? super Boolean, Unit> function1 = this.LLILLL.LLLIIIIL;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zIsEnabled));
            }
        }
    }
}
