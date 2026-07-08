package X;

import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.food.PoiDetailFoodHeaderAssem;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS57S1300000_18;
import kotlin.jvm.internal.AwS61S0010000_18;

/* JADX INFO: renamed from: X.0gvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184600gvq extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PoiDetailFoodHeaderAssem LL;
    public final /* synthetic */ PoiListApi.PoiDetailResponse LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1185410gx9 LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1184600gvq(PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem, PoiListApi.PoiDetailResponse poiDetailResponse, boolean z, C1185410gx9 c1185410gx9, String str) {
        super(0);
        this.LL = poiDetailFoodHeaderAssem;
        this.LLILLJJLI = poiDetailResponse;
        this.LLILLL = z;
        this.LLILZ = c1185410gx9;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PoiDetailFoodHeaderAssem poiDetailFoodHeaderAssem = this.LL;
        poiDetailFoodHeaderAssem.vq(poiDetailFoodHeaderAssem.LLJJI, this.LLILLJJLI, "no_rating", new AwS61S0010000_18(this.LLILLL, 5), new AwS57S1300000_18(this.LLILZ, this.LL, this.LLILZIL, this.LLILLJJLI, 1));
        return Unit.LIZ;
    }
}
