package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.cache.data.AddressCacheModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03rw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C977403rw extends C09AY implements Function1<LaneParams, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AddressCacheModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C977403rw(int i, AddressCacheModel addressCacheModel, String str, String str2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = addressCacheModel;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LaneParams laneParams) {
        String str;
        AddressCacheModel addressCacheModel;
        LaneParams laneParams2 = laneParams;
        laneParams2.plusAssign("has_cache", Integer.valueOf(this.LL));
        String str2 = this.LLILLJJLI;
        String str3 = "";
        if (str2 == null && ((addressCacheModel = this.LLILLL) == null || (str2 = addressCacheModel.LIZ) == null)) {
            str2 = "";
        }
        laneParams2.plusAssign("cache_invalid_reason", str2);
        laneParams2.plusAssign("page_name", "shipping_info");
        String str4 = this.LLILZ;
        if (str4 == null) {
            AddressCacheModel addressCacheModel2 = this.LLILLL;
            if (addressCacheModel2 != null && (str = addressCacheModel2.LIZIZ) != null) {
                str3 = str;
            }
        } else {
            str3 = str4;
        }
        laneParams2.plusAssign("previous_page", str3);
        return Unit.LIZ;
    }
}
