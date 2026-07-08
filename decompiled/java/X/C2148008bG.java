package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08bG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.vm.UnsubscribeChannelSettingViewModel$updateSubscribe$1", f = "UnsubscribeChannelSettingViewModel.kt", l = {122, 133, 139, 146}, m = "invokeSuspend")
public final class C2148008bG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC2148408bK LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2148008bG(int i, Integer num, boolean z, InterfaceC2148408bK interfaceC2148408bK, InterfaceC1364105Vn<? super C2148008bG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = num;
        this.LLILZ = z;
        this.LLILZIL = interfaceC2148408bK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2148008bG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C2148308bJ c2148308bJ = new C2148308bJ(this.LLILZIL, null);
            this.LL = 4;
            if (C23250099c.LJI(this, abstractC2238408pq, c2148308bJ) == objLJFF) {
                C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C2147908bF c2147908bF = new C2147908bF(this.LLILLJJLI, this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c2147908bF);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
                return objLJFF;
            }
        }
        BaseResponse baseResponse = (BaseResponse) objLJI;
        if (baseResponse != null && baseResponse.status_code == 0) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C2148108bH c2148108bH = new C2148108bH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c2148108bH) == objLJFF) {
                C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
                return objLJFF;
            }
        } else {
            C1DFH c1dfh3 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
            C2148208bI c2148208bI = new C2148208bI(this.LLILZIL, null);
            this.LL = 3;
            if (C23250099c.LJI(this, abstractC2238408pq3, c2148208bI) == objLJFF) {
                C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UnsubscribeChannelSettingViewModel@c014.updateSubscribe$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
