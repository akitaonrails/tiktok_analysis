package X;

import android.widget.FrameLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.management.assem.SubManagementLoadingAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.06L1, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06L1 extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ SubManagementLoadingAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06L1(SubManagementLoadingAssem subManagementLoadingAssem) {
        super(2);
        this.LL = subManagementLoadingAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            Boolean boolValueOf = Boolean.valueOf(((Boolean) c291001Au2.LIZ).booleanValue());
            SubManagementLoadingAssem subManagementLoadingAssem = this.LL;
            boolValueOf.booleanValue();
            FrameLayout frameLayout = subManagementLoadingAssem.LLJJIII;
            if (frameLayout != null) {
                C786410Ut5.LJJJJIZL(frameLayout);
            }
            FrameLayout frameLayout2 = subManagementLoadingAssem.LLJJIII;
            if (frameLayout2 != null) {
                C786410Ut5.LJZ(8, frameLayout2);
            }
        }
        return Unit.LIZ;
    }
}
