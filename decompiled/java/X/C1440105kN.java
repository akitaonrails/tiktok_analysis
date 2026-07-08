package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.DetailBackToSpaceAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05kN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1440105kN extends C09AY implements Function2<UIAssem, C291001Au<? extends Boolean>, Unit> {
    public final /* synthetic */ DetailBackToSpaceAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1440105kN(DetailBackToSpaceAssem detailBackToSpaceAssem) {
        super(2);
        this.LL = detailBackToSpaceAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Boolean> c291001Au) {
        C291001Au<? extends Boolean> c291001Au2 = c291001Au;
        if (c291001Au2 != null) {
            boolean zBooleanValue = ((Boolean) c291001Au2.LIZ).booleanValue();
            DetailBackToSpaceAssem detailBackToSpaceAssem = this.LL;
            if (zBooleanValue) {
                detailBackToSpaceAssem.ip();
            }
        }
        return Unit.LIZ;
    }
}
