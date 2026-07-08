package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.GuestSettingApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingUtil$autoUpdateSettingWhenLinked$1", f = "MultiGuestLiveSettingUtil.kt", l = {60}, m = "invokeSuspend")
public final class C313301Jj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DataChannel LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313301Jj(DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C313301Jj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dataChannel;
        this.LLILLL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313301Jj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C480460Ism.LIZ().getClass();
                GuestSettingApi guestSettingApi = (GuestSettingApi) C480460Ism.LIZLLL(GuestSettingApi.class);
                this.LL = 1;
                obj = guestSettingApi.getState(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1");
                    return objLJFF;
                }
            }
            c098200Yq = (C926820aE4) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C188600o0.LIZ((C926820aE4) c098200Yq, null, new C020W(lifecycleOwner, dataChannel, 89), null);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LJFF("MultiGuestV3GuestPresenter", "auto updatte guest setting failed", thM5exceptionOrNullimpl);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
