package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.019K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C019K extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C019K(View view) {
        super(2);
        this.LL = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            ((Boolean) c291001Au2.LIZ).booleanValue();
            C786410Ut5.LJLLLLLL(8, this.LL);
        }
        return Unit.LIZ;
    }
}
