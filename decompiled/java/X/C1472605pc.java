package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.internalshare.api.model.InternalShareExpHitResponse;
import com.ss.android.ugc.aweme.internalshare.impl.data.api.InternalShareApi;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05pc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.manager.InternalShareExpHitManager$fetchExpHitForUsers$1", f = "InternalShareExpHitManager.kt", l = {82}, m = "invokeSuspend")
public final class C1472605pc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1472605pc(List<String> list, List<String> list2, InterfaceC1364105Vn<? super C1472605pc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1472605pc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InternalShareExpHitManager@8732.fetchExpHitForUsers$1");
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
                String strLJIILL = C1277504zF.LIZJ.LJIILL(this.LLILLJJLI);
                String string = this.LLILLL.toString();
                InternalShareApi.LIZ.getClass();
                InternalShareApi value = C1473705pn.LIZIZ.getValue();
                this.LL = 1;
                obj = value.checkExpHit(strLJIILL, string, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("InternalShareExpHitManager@8732.fetchExpHitForUsers$1");
                    return objLJFF;
                }
            }
            InternalShareExpHitResponse internalShareExpHitResponse = (InternalShareExpHitResponse) obj;
            internalShareExpHitResponse.checkValid();
            Map<String, Map<String, Boolean>> map = C1277504zF.LIZ;
            C1277504zF.LIZIZ(internalShareExpHitResponse.hitInfo);
            Map<String, String> map2 = internalShareExpHitResponse.hitInfo;
            if (map2 != null) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1472805pe(map2, null), 3);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InternalShareExpHitManager@8732.fetchExpHitForUsers$1");
        return unit;
    }
}
