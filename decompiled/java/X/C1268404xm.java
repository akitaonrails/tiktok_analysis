package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.04xm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1268404xm extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ Function2<View, String, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1268404xm(Function2<? super View, ? super String, Unit> function2) {
        super(2);
        this.LL = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        this.LL.invoke(view, str);
        return Unit.LIZ;
    }
}
