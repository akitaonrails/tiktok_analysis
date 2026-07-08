package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS4S0011000_2;
import kotlin.jvm.internal.AwS57S0210000_2;

/* JADX INFO: renamed from: X.062W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C062W extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ PoiDetailContentHeaderBaseAssemV3 LL;
    public final /* synthetic */ PoiShopBookingInfo LLILLJJLI;
    public final /* synthetic */ C1186970gzf LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C062W(PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3, PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, boolean z, int i) {
        super(1);
        this.LL = poiDetailContentHeaderBaseAssemV3;
        this.LLILLJJLI = poiShopBookingInfo;
        this.LLILLL = c1186970gzf;
        this.LLILZ = z;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        assembler2.EQ2(this.LL, new AwS57S0210000_2(this.LLILLJJLI, this.LLILLL, this.LLILZ, 2));
        assembler2.RQ2(this.LL, new AwS4S0011000_2(this.LLILZ, this.LLILZIL, 0));
        return Unit.LIZ;
    }
}
