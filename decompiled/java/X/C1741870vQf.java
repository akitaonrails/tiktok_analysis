package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vQf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.shoppingbag.ECAudienceShopBagIconWidget$checkAudiencePermission$2", f = "ECAudienceShopBagIconWidget.kt", l = {1612}, m = "invokeSuspend")
public final class C1741870vQf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C21212117zj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741870vQf(C21212117zj c21212117zj, InterfaceC1364105Vn<? super C1741870vQf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c21212117zj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741870vQf(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String idStr;
        Object obj2;
        boolean zBooleanValue;
        MutableLiveData<Boolean> mutableLiveData;
        Boolean bool;
        C1C7U.LIZ("ECAudienceShopBagIconWidget@216e.checkAudiencePermission$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LL;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Room room = this.LLILLL.LLJILJIL;
            String string = null;
            if (room != null) {
                idStr = room.getIdStr();
            } else {
                idStr = null;
            }
            Room room2 = this.LLILLL.LLJILJIL;
            if (room2 != null) {
                string = C2286608xc.LJFF(room2.getOwnerUserId()).toString();
            }
            if (idStr != null && string != null) {
                this.LL = idStr;
                this.LLILLJJLI = 1;
                Object objLIZ = C212345187z.LIZ(idStr, string, this);
                obj2 = idStr;
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.checkAudiencePermission$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.checkAudiencePermission$2");
            return unit;
        }
        C21212117zj c21212117zj = this.LLILLL;
        C212344187y c212344187y = C212343187x.LIZ.get((String) obj2);
        if (c212344187y != null && (bool = c212344187y.LIZ) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        IIconSlot.SlotViewModel slotViewModel = c21212117zj.LLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLJJJJ) != null) {
            mutableLiveData.setValue(Boolean.valueOf(zBooleanValue));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECAudienceShopBagIconWidget@216e.checkAudiencePermission$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
