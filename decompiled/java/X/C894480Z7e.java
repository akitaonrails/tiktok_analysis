package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmRiskyKeywordsViewModel;
import com.ss.android.ugc.aweme.im.service.risky.IDMRiskyKeywordsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.dmrisky.DmRiskyKeywordsViewModel$getKeywords$1", f = "DmRiskyKeywordsViewModel.kt", l = {116}, m = "invokeSuspend")
public final class C894480Z7e extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DmRiskyKeywordsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C894480Z7e(DmRiskyKeywordsViewModel dmRiskyKeywordsViewModel, InterfaceC1364105Vn<? super C894480Z7e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dmRiskyKeywordsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C894480Z7e(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        EnumC894560Z7m enumC894560Z7m;
        C1C7U.LIZ("DmRiskyKeywordsViewModel@f9d5.getKeywords$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        C894500Z7g c894500Z7g = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                IDMRiskyKeywordsService iDMRiskyKeywordsService = (IDMRiskyKeywordsService) this.LLILLJJLI.LLILZLL.getValue();
                this.LL = 1;
                obj = iDMRiskyKeywordsService.LIZIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DmRiskyKeywordsViewModel@f9d5.getKeywords$1");
                    return objLJFF;
                }
            }
            list = (List) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = null;
        }
        if (list != null) {
            DmRiskyKeywordsViewModel dmRiskyKeywordsViewModel = this.LLILLJJLI;
            boolean z = dmRiskyKeywordsViewModel.LLILLL;
            dmRiskyKeywordsViewModel.LLILZ = true;
            if (!z) {
                dmRiskyKeywordsViewModel.LL.setValue(new C894500Z7g(list));
            } else {
                Object value = dmRiskyKeywordsViewModel.LL.getValue();
                if (value instanceof C894500Z7g) {
                    c894500Z7g = (C894500Z7g) value;
                }
                if (c894500Z7g == null || (list2 = c894500Z7g.LIZ) == null) {
                    list2 = C13BV.INSTANCE;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!list.contains(obj2)) {
                        arrayList.add(obj2);
                    }
                }
                dmRiskyKeywordsViewModel.LL.setValue(new C894500Z7g(C13LP.LJLIL(list, arrayList)));
            }
            if (z && (enumC894560Z7m = dmRiskyKeywordsViewModel.LLILZIL) != null) {
                dmRiskyKeywordsViewModel.yQ2(enumC894560Z7m);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmRiskyKeywordsViewModel@f9d5.getKeywords$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
