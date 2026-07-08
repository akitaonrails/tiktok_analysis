package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.feed.platform.cell.interact.biz.BizBottomAreaComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RGj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693030RGj extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ BizBottomAreaComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C693030RGj(BizBottomAreaComponent bizBottomAreaComponent) {
        super(1);
        this.LL = bizBottomAreaComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        String str;
        Assembler assembler2 = assembler;
        BizBottomAreaComponent bizBottomAreaComponent = this.LL;
        assembler2.MQ2(bizBottomAreaComponent, new C693040RGk(bizBottomAreaComponent));
        if (C265620Ab2.LIZ()) {
            BizBottomAreaComponent bizBottomAreaComponent2 = this.LL;
            assembler2.LQ2(bizBottomAreaComponent2, new C0RBU(bizBottomAreaComponent2));
        }
        BaseFeedPageParams baseFeedPageParams = this.LL.jm().LJ;
        if (baseFeedPageParams != null) {
            str = baseFeedPageParams.eventType;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "personal_homepage") && C0RGX.LIZ(null, false, 3)) {
            IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
            BizBottomAreaComponent bizBottomAreaComponent3 = this.LL;
            assembler2.LQ2(bizBottomAreaComponent3, new AwS377S0200000_11(bizBottomAreaComponent3, iPoiService, 74));
        }
        return Unit.LIZ;
    }
}
