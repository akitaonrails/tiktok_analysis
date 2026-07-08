package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.186y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212318186y extends AbstractViewOnClickListenerC19509711Up {
    public final /* synthetic */ C212304186k LLILLL;

    public C212318186y(C212304186k c212304186k) {
        this.LLILLL = c212304186k;
    }

    @Override // X.AbstractViewOnClickListenerC19509711Up
    public final void LIZ(View view) {
        if (view != null) {
            boolean zIsEnabled = this.LLILLL.LLLFF.isEnabled();
            Function1<? super Boolean, Unit> function1 = this.LLILLL.LLLIIII;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(zIsEnabled));
            }
        }
    }
}
