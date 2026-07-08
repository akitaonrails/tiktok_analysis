package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19673911yD extends AbstractViewOnClickListenerC19509711Up {
    public final /* synthetic */ Function1<View, Unit> LLILLL;

    public C19673911yD(Function1 function1) {
        this.LLILLL = function1;
    }

    @Override // X.AbstractViewOnClickListenerC19509711Up
    public final void LIZ(View view) {
        if (view != null) {
            this.LLILLL.invoke(view);
        }
    }
}
