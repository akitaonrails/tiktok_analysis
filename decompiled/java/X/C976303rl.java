package X;

import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.list.IAddressListViewModel$saveAddress$1$1", f = "IAddressListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C976303rl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Response<SaveData> LL;
    public final /* synthetic */ SaveData LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C976303rl(Response<SaveData> response, SaveData saveData, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C976303rl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = response;
        this.LLILLJJLI = saveData;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C976303rl(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SaveData saveData;
        C1C7U.LIZ("IAddressListViewModel@9425.saveAddress$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.isCodeOK() && (saveData = this.LLILLJJLI) != null) {
            List<Error> list = saveData.errors;
            if (list != null && !list.isEmpty()) {
                this.LLILLL.invoke(false);
            } else {
                this.LLILLL.invoke(true);
                IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
                String str = this.LLILLJJLI.id;
                if (str == null) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                iEventCenterLIZ.LIZ("ec_address_change", C1741890vQh.LJIIIIZZ(new AddressPageStarter.AddressEvent(str, 1, null, null, null, null)));
            }
        } else {
            this.LLILLL.invoke(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IAddressListViewModel@9425.saveAddress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
