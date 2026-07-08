package X;

import com.bytedance.touchpoint.api.config.IIncentiveManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S1110000_28;

/* JADX INFO: renamed from: X.0zOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894430zOj extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SpecActServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1894430zOj(SpecActServiceImpl specActServiceImpl) {
        super(0);
        this.LL = specActServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IIncentiveManager iIncentiveManager = (IIncentiveManager) PluggableExtentionKt.pluggableSpi$default(IIncentiveManager.class, false, false, false, 14, null);
        if (iIncentiveManager != null) {
            iIncentiveManager.LIZJ(1);
        }
        SpecActServiceImpl specActServiceImpl = this.LL;
        specActServiceImpl.LIZJ = true;
        specActServiceImpl.LJJJJI();
        String value = EnumC1893950zNx.FEED_READY.getValue();
        C1893940zNw value2 = C1893940zNw.LJI.getValue();
        value2.getClass();
        C01U6.LIZJ(new AwS23S1110000_28(value2, false, value, 0));
        return Unit.LIZ;
    }
}
