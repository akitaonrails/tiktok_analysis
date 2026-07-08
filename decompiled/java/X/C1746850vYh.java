package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailState;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0vYh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1746850vYh extends C09AY implements Function1<AddressMapDetailState, AddressMapDetailState> {
    public final /* synthetic */ double LL;
    public final /* synthetic */ double LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746850vYh(double d, double d2) {
        super(1);
        this.LL = d;
        this.LLILLJJLI = d2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AddressMapDetailState invoke(AddressMapDetailState addressMapDetailState) {
        AddressMapDetailState addressMapDetailState2 = addressMapDetailState;
        return addressMapDetailState2.copy(addressMapDetailState2.pageState, new C1747430vZd(new C1177960gl8(this.LL, this.LLILLJJLI), false), addressMapDetailState2.inputItemVOList, addressMapDetailState2.isReturnFromAssociate, addressMapDetailState2.saveLoadingStatus);
    }
}
