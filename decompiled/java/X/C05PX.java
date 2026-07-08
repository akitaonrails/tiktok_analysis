package X;

import com.ss.android.ugc.aweme.feed.features.SessionUnconsumptionItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.features.UnconsumedVideoRecorderV2$store$1", f = "UnconsumedVideoRecorderV2.kt", l = {343}, m = "invokeSuspend")
public final class C05PX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<SessionUnconsumptionItem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PX(List<SessionUnconsumptionItem> list, InterfaceC1364105Vn<? super C05PX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05PX c05px = new C05PX(this.LLILLL, interfaceC1364105Vn);
        c05px.LLILLJJLI = obj;
        return c05px;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("UnconsumedVideoRecorderV2@bd31.store$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.store$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            C1347505Pd c1347505Pd = C1347505Pd.LIZ;
            List<SessionUnconsumptionItem> list = this.LLILLL;
            c1347505Pd.getClass();
            C1347505Pd.LJFF(list);
            C1347505Pd.LJIIIZ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UnconsumedVideoRecorderV2@bd31.store$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
