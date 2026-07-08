package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.card.lynx.MixSparkCard;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883840z7e extends C09AY implements Function1<SparkContext, Unit> {
    public final /* synthetic */ MixSparkCard LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883840z7e(MixSparkCard mixSparkCard) {
        super(1);
        this.LL = mixSparkCard;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        final MixSparkCard mixSparkCard = this.LL;
        sparkContext2.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0zOK
            @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
            public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                C1537910q7h c1537910q7h;
                if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                    c1537910q7h.LJJIFFI = true;
                    c1537910q7h.LJJI = false;
                    MixSparkCard mixSparkCard2 = mixSparkCard;
                    mixSparkCard2.getClass();
                    c1537910q7h.LJIJJLI(C1067320dsg.LIZIZ(mixSparkCard2.LJJJJZI()));
                }
            }
        });
        sparkContext2.LJJJJZI(this.LL.LLJLILLLLZIIL);
        sparkContext2.LJJJJJ(this.LL.LLJJJIL);
        return Unit.LIZ;
    }
}
