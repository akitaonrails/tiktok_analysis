package X;

import android.text.TextPaint;
import android.view.View;
import com.bytedance.android.livesdk.api.revenue.strategy.IRevenueStrategyService;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fsC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1143900fsC extends AbstractC426530Gnz {
    public long LL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LL > 300) {
            IRevenueStrategyService iRevenueStrategyService = C1126800fQc.LIZ;
            C1270404y6 c1270404y6LIZJ = iRevenueStrategyService.u21().LIZJ();
            if (Intrinsics.LJFF(c1270404y6LIZJ.LIZ, "United States") || Intrinsics.LJFF(c1270404y6LIZJ.LIZ, "Canada")) {
                this.LL = jCurrentTimeMillis;
                iRevenueStrategyService.u21().LJI(view.getContext(), new AwS383S0200000_17(this, view, 73));
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(false);
    }
}
