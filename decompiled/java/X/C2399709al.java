package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09al, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.mix.viewmodel.StoreMixViewModel$preloadResource$1$1$1", f = "StoreMixViewModel.kt", l = {247}, m = "invokeSuspend")
public final class C2399709al extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ n LLILLL;
    public final /* synthetic */ StoreMixViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2399709al(String str, n nVar, StoreMixViewModel storeMixViewModel, InterfaceC1364105Vn<? super C2399709al> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = nVar;
        this.LLILZ = storeMixViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2399709al(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoreMixViewModel@2837.preloadResource$1$1$1");
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
                if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                    C1C7U.LIZIZ("StoreMixViewModel@2837.preloadResource$1$1$1");
                    return objLJFF;
                }
            }
            if (Intrinsics.LJFF(this.LLILLJJLI, "/api/shop/v1/home_tab/info/prefetch")) {
                h hVarLJJIIZI = ((n) C1280004ze.LIZJ().LJII(C2399609ak.LIZJ(this.LLILLL.LJJIJ("data"), "decoration_schema"), n.class)).LJJIIZI("materials");
                if (hVarLJJIIZI != null) {
                    StoreMixViewModel storeMixViewModel = this.LLILZ;
                    Iterator<k> it2 = hVarLJJIIZI.iterator();
                    while (it2.hasNext()) {
                        storeMixViewModel.LLILZLL.LIZIZ(C2399609ak.LIZJ(it2.next().LJIILIIL().LJJIJ("meta_info"), "lynx_url"));
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1161850gL9.LIZLLL(C2097908Jt.LIZJ(new Pair("tab_id", C2286608xc.LJ(-888))));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreMixViewModel@2837.preloadResource$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
