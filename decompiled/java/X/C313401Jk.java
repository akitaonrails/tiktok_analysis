package X;

import com.bytedance.android.live.liveinteract.multilive.model.GetGuestSettingResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.MultiGuestLiveSettingUtil$autoUpdateSettingWhenLinked$1$2$1$1", f = "MultiGuestLiveSettingUtil.kt", l = {71}, m = "invokeSuspend")
public final class C313401Jk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GetGuestSettingResponse.ResponseData LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C313401Jk(GetGuestSettingResponse.ResponseData responseData, InterfaceC1364105Vn<? super C313401Jk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = responseData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C313401Jk(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1$2$1$1");
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
                this.LL = 1;
                obj = C01EU.LIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1$2$1$1");
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
        GetGuestSettingResponse.ResponseData responseData = this.LLILLJJLI;
        if (C189200o6.m8isSuccessimpl(c098200Yq) && responseData.distributionStatus == 0) {
            C473410IhP.LIZJ(new Runnable() { // from class: X.01Jl
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1$2$1$1$2$1");
                    try {
                        C766270U4b.LIZLLL(2131852861);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1$2$1$1$2$1");
                }
            }, 2000L);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestLiveSettingUtil@4b7c.autoUpdateSettingWhenLinked$1$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
