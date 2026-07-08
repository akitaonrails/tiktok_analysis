package X;

import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Cs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryViewModel$deleteHistorySingle$1", f = "AdWebHistoryViewModel.kt", l = {219, 223}, m = "invokeSuspend")
public final class C1315205Cs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AdWebHistoryViewModel LLILLJJLI;
    public final /* synthetic */ List<Long> LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1315205Cs(AdWebHistoryViewModel adWebHistoryViewModel, List<Long> list, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1315205Cs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adWebHistoryViewModel;
        this.LLILLL = list;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1315205Cs(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("AdWebHistoryViewModel@3f6f.deleteHistorySingle$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistorySingle$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1315305Ct c1315305Ct = new C1315305Ct(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C099A.LIZJ(10000L, c1315305Ct, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistorySingle$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1315105Cr c1315105Cr = new C1315105Cr(null, this.LLILZ, zBooleanValue);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1315105Cr) == objLJFF) {
            C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistorySingle$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistorySingle$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
