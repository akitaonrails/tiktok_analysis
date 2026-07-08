package X;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.slot.IIconSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01nG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$showTip$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {482}, m = "invokeSuspend")
public final class C438801nG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C438801nG(C180M c180m, InterfaceC1364105Vn<? super C438801nG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C438801nG(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C180M c180m;
        IIconSlot.SlotViewModel slotViewModel;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.showTip$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(800L, this) == objLJFF) {
                C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.showTip$1");
                return objLJFF;
            }
        }
        if (C438901nH.LIZ.getBoolean("need_show_ec_tip_in_living_room", true) && (slotViewModel = (c180m = this.LLILLJJLI).LLILZIL) != null) {
            slotViewModel.LLJLIL = 15000L;
            MutableLiveData<String> mutableLiveData = slotViewModel.LLJJ;
            if (mutableLiveData != null) {
                mutableLiveData.setValue(c180m.LLILZ.getResources().getString(2131822034));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.showTip$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
