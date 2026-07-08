package X;

import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0JvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507520JvK extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ View LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507520JvK(View view) {
        super(2);
        this.LL = view;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue >= 0) {
            C500260Jjc.LJJLIIIJJIZ(new C507550JvN(iIntValue, this.LL));
        }
        return Unit.LIZ;
    }
}
