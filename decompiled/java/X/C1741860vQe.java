package X;

import android.util.LruCache;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onSlotCreated$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {343}, m = "invokeSuspend")
public final class C1741860vQe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180M LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1741860vQe(C180M c180m, String str, InterfaceC1364105Vn<? super C1741860vQe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180m;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1741860vQe(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        Boolean bool;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.onSlotCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean zBooleanValue = false;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IIconSlot.SlotViewModel slotViewModel = this.LLILLJJLI.LLILZIL;
            if (slotViewModel != null && (mutableLiveData = slotViewModel.LLJJJJ) != null) {
                mutableLiveData.setValue(false);
            }
            String str = this.LLILLL;
            if (str != null) {
                this.LL = 1;
                if (C212345187z.LIZ(str, null, this) == objLJFF) {
                    C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onSlotCreated$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onSlotCreated$1");
            return unit;
        }
        IIconSlot.SlotViewModel slotViewModel2 = this.LLILLJJLI.LLILZIL;
        if (slotViewModel2 != null && (mutableLiveData2 = slotViewModel2.LLJJJJ) != null) {
            LruCache<String, C212344187y> lruCache = C212343187x.LIZ;
            C212344187y c212344187y = C212343187x.LIZ.get(this.LLILLL);
            if (c212344187y != null && (bool = c212344187y.LIZ) != null) {
                zBooleanValue = bool.booleanValue();
            }
            mutableLiveData2.setValue(Boolean.valueOf(zBooleanValue));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.onSlotCreated$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
