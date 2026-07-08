package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryBigImageStylePanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812540xGe extends C09AY implements Function2<C1812850xH9, ViewGroup, Unit> {
    public final /* synthetic */ AiSummaryBigImageStylePanelDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1812540xGe(AiSummaryBigImageStylePanelDialog aiSummaryBigImageStylePanelDialog) {
        super(2);
        this.LL = aiSummaryBigImageStylePanelDialog;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1812850xH9 c1812850xH9, ViewGroup viewGroup) {
        boolean z;
        C1812850xH9 c1812850xH92 = c1812850xH9;
        ViewGroup viewGroup2 = viewGroup;
        AiSummaryViewModel aiSummaryViewModelUS = this.LL.uS();
        if (C497700JfU.LIZ.LIZ() == EnumC768840UDy.BROADCAST) {
            z = true;
        } else {
            z = false;
        }
        aiSummaryViewModelUS.vQ2(new C1812480xGY(c1812850xH92, viewGroup2, z));
        return Unit.LIZ;
    }
}
