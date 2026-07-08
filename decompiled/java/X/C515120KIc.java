package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.TopNavigationBarAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0KIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C515120KIc extends C09AY implements Function2<UIAssem, C514600KGc, Unit> {
    public final /* synthetic */ TopNavigationBarAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C515120KIc(TopNavigationBarAssem topNavigationBarAssem) {
        super(2);
        this.LL = topNavigationBarAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C514600KGc c514600KGc) {
        ViewGroup viewGroup;
        C514600KGc c514600KGc2 = c514600KGc;
        if (c514600KGc2 != null && c514600KGc2.LIZIZ() && (viewGroup = this.LL.LLJJIJI) != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        return Unit.LIZ;
    }
}
