package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003560cDq extends AbstractViewOnClickListenerC1003880cEM {
    public final /* synthetic */ Function1<View, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1003560cDq(Function1 function1) {
        super(1000L);
        this.LLILZIL = function1;
    }

    @Override // X.AbstractViewOnClickListenerC1003880cEM
    public final void LIZ(View view) {
        this.LLILZIL.invoke(view);
    }
}
