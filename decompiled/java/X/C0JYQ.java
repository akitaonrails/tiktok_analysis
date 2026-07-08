package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.sub.GetSubOnlyLiveInfoResponse;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: renamed from: X.0JYQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vm.SubOnlyLiveSettingVM$fetchVipChoice$1", f = "SubOnlyLiveSettingVM.kt", l = {53, 81}, m = "invokeSuspend")
public final class C0JYQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SubOnlyLiveSettingVM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYQ(SubOnlyLiveSettingVM subOnlyLiveSettingVM, InterfaceC1364105Vn<? super C0JYQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = subOnlyLiveSettingVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0JYQ c0jyq = new C0JYQ(this.LLILLL, interfaceC1364105Vn);
        c0jyq.LLILLJJLI = obj;
        return c0jyq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        GetSubOnlyLiveInfoResponse getSubOnlyLiveInfoResponse;
        GetSubOnlyLiveInfoResponse.Data data;
        VIPSubOnlyLiveSettingInfo vIPSubOnlyLiveSettingInfo;
        VIPSubOnlyLiveSettingInfo.Category next;
        boolean z;
        VIPSubOnlyLiveSettingInfo.Category next2;
        boolean z2;
        Object objLLLIIIL = obj;
        C1C7U.LIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c098200Yq = this.LLILLJJLI;
                    C155000ia.LIZIZ(objLLLIIIL);
                    C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLLLIIIL);
        } else {
            C155000ia.LIZIZ(objLLLIIIL);
            InterfaceC493810JYd interfaceC493810JYd = (InterfaceC493810JYd) this.LLILLL.LL.getValue().getOperator();
            this.LL = 1;
            objLLLIIIL = interfaceC493810JYd.LLLIIIL(this);
            if (objLLLIIIL == objLJFF) {
                C1C7U.LIZIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1");
                return objLJFF;
            }
        }
        c098200Yq = (GetSubOnlyLiveInfoResponse) objLLLIIIL;
        C189200o6.m2constructorimpl(c098200Yq);
        SubOnlyLiveSettingVM subOnlyLiveSettingVM = this.LLILLL;
        if (C189200o6.m8isSuccessimpl(c098200Yq) && (getSubOnlyLiveInfoResponse = (GetSubOnlyLiveInfoResponse) c098200Yq) != null && (data = getSubOnlyLiveInfoResponse.data) != null && (vIPSubOnlyLiveSettingInfo = data.vipSolSettingInfo) != null) {
            Map<String, String> mapLIZ = C0KPJ.df.LIZ();
            if (mapLIZ == null) {
                mapLIZ = new HashMap<>();
            }
            C493830JYf c493830JYfLIZ = C0JYR.LIZ(mapLIZ);
            C013C c013c = new C013C();
            int i2 = c493830JYfLIZ.LIZIZ;
            if (i2 != 0) {
                if (i2 == 1) {
                    Iterator<VIPSubOnlyLiveSettingInfo.Category> it2 = vIPSubOnlyLiveSettingInfo.monthCategoryList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (next2.lowerBound == c493830JYfLIZ.LJ) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    if (next2 != null) {
                        c013c.element = true;
                    }
                }
            } else {
                Iterator<VIPSubOnlyLiveSettingInfo.Category> it3 = vIPSubOnlyLiveSettingInfo.planCategoryList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (next.lowerBound == c493830JYfLIZ.LJFF) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if (next != null) {
                    c013c.element = true;
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0JYP c0jyp = new C0JYP(c493830JYfLIZ, c013c, vIPSubOnlyLiveSettingInfo, subOnlyLiveSettingVM, getSubOnlyLiveInfoResponse, null);
            this.LLILLJJLI = c098200Yq;
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0jyp) == objLJFF) {
                C1C7U.LIZIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1");
                return objLJFF;
            }
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SubOnlyLiveSettingVM@cde9.fetchVipChoice$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
