package X;

import com.bytedance.android.livesdk.api.revenue.strategy.channel.TaskErrorEvent;
import com.bytedance.android.livesdk.guide.model.TaskActionResponse;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2$tryPreClaimReward$1$1", f = "TaskManagerV2.kt", l = {187}, m = "invokeSuspend")
public final class C1134280fcg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1134410fct LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ InterfaceC1134290fch LLILZLL;
    public final /* synthetic */ C1134410fct LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134280fcg(int i, long j, InterfaceC1134290fch interfaceC1134290fch, C1134410fct c1134410fct, InterfaceC1364105Vn<? super C1134280fcg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = i;
        this.LLILZIL = j;
        this.LLILZLL = interfaceC1134290fch;
        this.LLIZ = c1134410fct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1134280fcg c1134280fcg = new C1134280fcg(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1134280fcg.LLILLL = obj;
        return c1134280fcg;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1134290fch interfaceC1134290fch;
        C1134410fct c1134410fct;
        Object objLIZIZ;
        C1C7U.LIZ("TaskManagerV2@3e9c.tryPreClaimReward$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c1134410fct = this.LL;
                    interfaceC1134290fch = (InterfaceC1134290fch) this.LLILLL;
                    C155000ia.LIZIZ(obj);
                    objLIZIZ = ((C189200o6) obj).m10unboximpl();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                int i2 = this.LLILZ;
                long j = this.LLILZIL;
                interfaceC1134290fch = this.LLILZLL;
                c1134410fct = this.LLIZ;
                Long lLJFF = C2286608xc.LJFF(j);
                this.LLILLL = interfaceC1134290fch;
                this.LL = c1134410fct;
                this.LLILLJJLI = 1;
                objLIZIZ = C1219670hqP.LIZIZ("backpack_gift_prereward_action", i2, "", lLJFF, 2, null, null, null, null, null, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("TaskManagerV2@3e9c.tryPreClaimReward$1$1");
                    return objLJFF;
                }
            }
            if (C189200o6.m8isSuccessimpl(objLIZIZ) && ((TaskActionResponse.Data) objLIZIZ) != null) {
                interfaceC1134290fch.LIZ();
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(objLIZIZ);
            if (thM5exceptionOrNullimpl != null) {
                C20441214yg.LJFF("IncentiveDebug", "pre-claim exchange failed", thM5exceptionOrNullimpl);
                DataChannelGlobal.LLILZ.FQ2(TaskErrorEvent.class, new C1134260fce(c1134410fct, 1));
                interfaceC1134290fch.LIZIZ(true);
            }
            C189200o6.m2constructorimpl(C189200o6.m1boximpl(objLIZIZ));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskManagerV2@3e9c.tryPreClaimReward$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
