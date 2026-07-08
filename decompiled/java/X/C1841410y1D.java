package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0y1D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1841410y1D extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ DialogC1841380y1A LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841410y1D(DialogC1841380y1A dialogC1841380y1A) {
        super(1);
        this.LL = dialogC1841380y1A;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        DialogC1841380y1A dialogC1841380y1A = this.LL;
        dialogC1841380y1A.LLJIJIL = EnumC1815680xLi.GENERAL;
        dialogC1841380y1A.LJL();
        return Unit.LIZ;
    }
}
