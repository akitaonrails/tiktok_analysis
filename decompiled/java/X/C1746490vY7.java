package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.DeliveryInstructionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.SaveData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS12S0410000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.AwS76S1000000_26;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vY7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel$saveAddressReal$2", f = "DeliveryInstructionViewModel.kt", l = {254}, m = "invokeSuspend")
public final class C1746490vY7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Address LLILLJJLI;
    public final /* synthetic */ DeliveryInstructionViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1746490vY7(Address address, DeliveryInstructionViewModel deliveryInstructionViewModel, InterfaceC1364105Vn<? super C1746490vY7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = address;
        this.LLILLL = deliveryInstructionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1746490vY7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SaveData saveData;
        boolean z;
        boolean z2;
        List<Error> list;
        List<Error> list2;
        Error next;
        String str;
        Object objLJFF = obj;
        C1C7U.LIZ("DeliveryInstructionViewModel@d852.saveAddressReal$2");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        boolean z3 = true;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJFF);
            } else {
                C155000ia.LIZIZ(objLJFF);
                C980703sT c980703sT = AddressApi.LIZ;
                Address address = this.LLILLJJLI;
                Integer numLJ = C2286608xc.LJ(3);
                this.LL = 1;
                EnumC962003pS enumC962003pS = EnumC962003pS.DEFAULT;
                c980703sT.getClass();
                objLJFF = C980703sT.LJFF(address, 2, true, numLJ, null, enumC962003pS, this);
                if (objLJFF == objLJFF2) {
                    C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.saveAddressReal$2");
                    return objLJFF2;
                }
            }
            Response response = (Response) objLJFF;
            this.LLILLL.getClass();
            saveData = (SaveData) response.data;
            if (response.isCodeOK() && saveData != null) {
                z = false;
            } else {
                z = true;
            }
            DeliveryInstructionViewModel deliveryInstructionViewModel = this.LLILLL;
            if (z) {
                z2 = true;
            } else {
                z2 = false;
            }
            deliveryInstructionViewModel.setState(new AwS12S0410000_26(deliveryInstructionViewModel, (DeliveryInstructionViewModel) z2, (boolean) saveData, (SaveData) response, (Response<SaveData>) this.LLILLJJLI, (Address) 5));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LLILLL.setState(AFwS268S0000000_26.get$arr$(769));
        }
        if (z) {
            this.LLILLL.setState(AFwS268S0000000_26.get$arr$(768));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.saveAddressReal$2");
            return unit;
        }
        String str2 = null;
        if (saveData != null) {
            list = saveData.errors;
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            z3 = false;
        }
        if (z3) {
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            if (saveData == null || (str = saveData.id) == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            iEventCenterLIZ.LIZ("ec_address_change", C1741890vQh.LJIIIIZZ(new AddressPageStarter.AddressEvent(str, 1, null, null, null, null)));
            DeliveryInstructionViewModel deliveryInstructionViewModel2 = this.LLILLL;
            DeliveryInstructionInfo deliveryInstructionInfo = this.LLILLJJLI.deliveryInstructionInfo;
            deliveryInstructionViewModel2.getClass();
            deliveryInstructionViewModel2.setState(new AwS605S0100000_26(deliveryInstructionInfo, 913));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.saveAddressReal$2");
            return unit2;
        }
        if (saveData != null && (list2 = saveData.errors) != null) {
            Iterator<Error> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.key, "delivery_instruction")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Error error = next;
            if (error != null) {
                str2 = error.error;
            }
        }
        if (C703302op.LIZ(str2)) {
            this.LLILLL.setState(new AwS76S1000000_26(str2, 50));
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DeliveryInstructionViewModel@d852.saveAddressReal$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
