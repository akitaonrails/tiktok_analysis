package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ck3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023530ck3 extends C09AY implements Function1<C1196804mE, Integer> {
    public final /* synthetic */ AbstractC1023470cjx LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1023530ck3(AbstractC1023470cjx abstractC1023470cjx) {
        super(1);
        this.LL = abstractC1023470cjx;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(C1196804mE c1196804mE) {
        CommonAdData commonAdData = this.LL.getCommonAdData(c1196804mE);
        if (commonAdData != null) {
            return Integer.valueOf(commonAdData.getSystemOrigin());
        }
        return null;
    }
}
