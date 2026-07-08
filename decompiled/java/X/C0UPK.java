package X;

import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UPK, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.CreateInfoCache$requestCreateInfoFromTools$1$1", f = "CreateInfoCache.kt", l = {}, m = "invokeSuspend")
public final class C0UPK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0UPO LL;
    public final /* synthetic */ RoomCreateInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UPK(C0UPO c0upo, RoomCreateInfo roomCreateInfo, InterfaceC1364105Vn<? super C0UPK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0upo;
        this.LLILLJJLI = roomCreateInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UPK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateInfoCache@cc22.requestCreateInfoFromTools$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0UPO c0upo = this.LL;
        if (c0upo != null) {
            RoomCreateInfo roomCreateInfo = this.LLILLJJLI;
            C0UPN c0upn = ((C783970Up9) c0upo).LIZ;
            if (c0upn != null) {
                c0upn.onSuccess(Integer.valueOf(roomCreateInfo.mIsFirstBroadcastFlag));
            }
        }
        InterfaceC1106030et7.A7.LJFF(C2286608xc.LJ(this.LLILLJJLI.effectActiveLevel));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateInfoCache@cc22.requestCreateInfoFromTools$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
