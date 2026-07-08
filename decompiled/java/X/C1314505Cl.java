package X;

import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryViewModel$deleteHistoryAll$1", f = "AdWebHistoryViewModel.kt", l = {235, 240}, m = "invokeSuspend")
public final class C1314505Cl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AdWebHistoryViewModel LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1314505Cl(AdWebHistoryViewModel adWebHistoryViewModel, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C1314505Cl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = adWebHistoryViewModel;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1314505Cl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1314605Cm c1314605Cm = new C1314605Cm(this.LLILLJJLI, null);
            this.LL = 1;
            obj = C099A.LIZJ(10000L, c1314605Cm, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1");
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
        C1314405Ck c1314405Ck = new C1314405Ck(null, this.LLILLL, zBooleanValue);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1314405Ck) == objLJFF) {
            C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.deleteHistoryAll$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
