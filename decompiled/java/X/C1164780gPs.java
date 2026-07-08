package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.poi.osp.PoiOrderSubmitViewModel;
import com.ss.android.ugc.aweme.poi.osp.repo.model.OrderAttribute;
import com.ss.android.ugc.aweme.poi.osp.repo.model.SkuData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0gPs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164780gPs extends C09AY implements Function1<C1164500gPQ, Unit> {
    public final /* synthetic */ PoiOrderSubmitViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<SkuData> LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ OrderAttribute LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1164780gPs(PoiOrderSubmitViewModel poiOrderSubmitViewModel, String str, List<SkuData> list, String str2, OrderAttribute orderAttribute, String str3, String str4, String str5) {
        super(1);
        this.LL = poiOrderSubmitViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = list;
        this.LLILZ = str2;
        this.LLILZIL = orderAttribute;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = str5;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1164500gPQ c1164500gPQ) {
        C1164500gPQ c1164500gPQ2 = c1164500gPQ;
        EnumC336190DFx enumC336190DFx = c1164500gPQ2.LIZ;
        if (enumC336190DFx == EnumC336190DFx.SUCCESS) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LL), null, null, new C1172860gcu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, c1164500gPQ2, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, null), 3);
        } else if (enumC336190DFx != EnumC336190DFx.EXCEPTION_ERROR && enumC336190DFx != EnumC336190DFx.PAYMENT_ERROR) {
            this.LL.setState(AFwS256S0000000_18.get$arr$(542));
        } else {
            this.LL.setState(new AwS597S0100000_18(c1164500gPQ2, 435));
        }
        return Unit.LIZ;
    }
}
