package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.common.api.TikTokImApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.ies.im.core.bridge.init.helper.ImInhouseHelper$reportLogin$1", f = "ImInhouseHelper.kt", l = {23}, m = "invokeSuspend")
public final class C1309405Am extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1309405Am(InterfaceC1364105Vn<? super C1309405Am> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309405Am(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImInhouseHelper@136a.reportLogin$1");
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
                obj = ((TikTokImApi) C1477105qL.LIZLLL.getValue()).reportInhouseLogin(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ImInhouseHelper@136a.reportLogin$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((BaseResponse) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImInhouseHelper@136a.reportLogin$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1309405Am(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
