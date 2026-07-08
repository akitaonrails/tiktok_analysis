package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Her, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C446350Her extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C446350Her(View view) {
        super(2);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        ((C1826520xdC) this.LL.findViewById(R.id.ujy)).setSelectedAt(num.intValue());
        return Unit.LIZ;
    }
}
