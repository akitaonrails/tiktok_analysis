package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.api.UsRoomApi;
import com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.17s9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.us.lifecycle.UsEcommerceRoomLifecycleObserver$onEnterRoom$1$1", f = "UsEcommerceRoomLifecycleObserver.kt", l = {243}, m = "invokeSuspend")
public final class C21165117s9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ UsEcommerceRoomLifecycleObserver LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21165117s9(Room room, UsEcommerceRoomLifecycleObserver usEcommerceRoomLifecycleObserver, Fragment fragment, InterfaceC1364105Vn<? super C21165117s9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = room;
        this.LLILLL = usEcommerceRoomLifecycleObserver;
        this.LLILZ = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21165117s9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UsEcommerceRoomLifecycleObserver@6929.onEnterRoom$1$1");
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
            C21165017s8 c21165017s8 = UsRoomApi.LIZ;
            String idStr = this.LLILLJJLI.getIdStr();
            String strValueOf = String.valueOf(this.LLILLJJLI.getOwnerUserId());
            this.LL = 1;
            obj = c21165017s8.LIZ(idStr, strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UsEcommerceRoomLifecycleObserver@6929.onEnterRoom$1$1");
                return objLJFF;
            }
        }
        UsRoomApi.GetLiveRoomCommonInfoResponse getLiveRoomCommonInfoResponse = (UsRoomApi.GetLiveRoomCommonInfoResponse) obj;
        if (!Intrinsics.LJFF(this.LLILLJJLI.getIdStr(), this.LLILLL.LIZLLL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("UsEcommerceRoomLifecycleObserver@6929.onEnterRoom$1$1");
            return unit;
        }
        if (getLiveRoomCommonInfoResponse != null) {
            this.LLILLL.LJ(getLiveRoomCommonInfoResponse.toastInfo, this.LLILZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UsEcommerceRoomLifecycleObserver@6929.onEnterRoom$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
