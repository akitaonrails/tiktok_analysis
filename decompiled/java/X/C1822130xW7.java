package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1822130xW7 extends C09AY implements Function2<View, C1391990mKL, Unit> {
    public final /* synthetic */ Function0<Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822130xW7(C1822150xW9 c1822150xW9) {
        super(2);
        this.LL = c1822150xW9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, C1391990mKL c1391990mKL) {
        Function0<Unit> function0 = this.LL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
