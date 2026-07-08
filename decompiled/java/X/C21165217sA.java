package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.audience.sea.api.SeaRoomApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.17sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.common.room.EcommerceRoomStatusProvider$onEnterRoom$1$1", f = "EcommerceRoomStatusProvider.kt", l = {193}, m = "invokeSuspend")
public final class C21165217sA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Room LLILLJJLI;
    public final /* synthetic */ C21186517vb LLILLL;
    public final /* synthetic */ Fragment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21165217sA(Room room, C21186517vb c21186517vb, Fragment fragment, InterfaceC1364105Vn<? super C21165217sA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = room;
        this.LLILLL = c21186517vb;
        this.LLILZ = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21165217sA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcommerceRoomStatusProvider@51c7.onEnterRoom$1$1");
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
            C21164817s6 c21164817s6 = SeaRoomApi.LIZ;
            String idStr = this.LLILLJJLI.getIdStr();
            String strValueOf = String.valueOf(this.LLILLJJLI.getOwnerUserId());
            this.LL = 1;
            obj = c21164817s6.LIZ(idStr, strValueOf, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EcommerceRoomStatusProvider@51c7.onEnterRoom$1$1");
                return objLJFF;
            }
        }
        SeaRoomApi.GetLiveRoomCommonInfoResponse getLiveRoomCommonInfoResponse = (SeaRoomApi.GetLiveRoomCommonInfoResponse) obj;
        if (!Intrinsics.LJFF(this.LLILLJJLI.getIdStr(), this.LLILLL.LIZLLL)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EcommerceRoomStatusProvider@51c7.onEnterRoom$1$1");
            return unit;
        }
        if (getLiveRoomCommonInfoResponse != null) {
            this.LLILLL.LIZJ(getLiveRoomCommonInfoResponse.toastInfo, this.LLILZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EcommerceRoomStatusProvider@51c7.onEnterRoom$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
