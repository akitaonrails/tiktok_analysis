package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JB7, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JB7 extends C09AY implements Function2<UIAssem, AbstractC1623806Xk<? extends Boolean>, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JB7(View view) {
        super(2);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, AbstractC1623806Xk<? extends Boolean> abstractC1623806Xk) {
        if (abstractC1623806Xk instanceof C491001vg) {
            C500260Jjc.LLFFF(this.LL);
        } else {
            C500260Jjc.LJIILIIL(this.LL);
        }
        return Unit.LIZ;
    }
}
