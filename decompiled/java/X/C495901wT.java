package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.unifiedauth.intelligent.PushServerIntelligentPopupHelper$onServerIntelligentResult$callbackFired$1", f = "PushServerIntelligentPopupHelper.kt", l = {}, m = "invokeSuspend")
public final class C495901wT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Function2<Boolean, Boolean, Unit> LLILLJJLI;
    public final /* synthetic */ Boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C495901wT(Function2<? super Boolean, ? super Boolean, Unit> function2, Boolean bool, boolean z, InterfaceC1364105Vn<? super C495901wT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function2;
        this.LLILLL = bool;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C495901wT c495901wT = new C495901wT(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c495901wT.LL = obj;
        return c495901wT;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean zBooleanValue;
        C1C7U.LIZ("PushServerIntelligentPopupHelper@92aa.onServerIntelligentResult$callbackFired$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            Function2<Boolean, Boolean, Unit> function2 = this.LLILLJJLI;
            Boolean bool = this.LLILLL;
            z = true;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = true;
            }
            function2.invoke(Boolean.valueOf(zBooleanValue), Boolean.valueOf(!this.LLILZ));
        } else {
            C211000rc.LIZIZ("ServerIntelligentHelper", "Coroutine cancelled before callback");
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("PushServerIntelligentPopupHelper@92aa.onServerIntelligentResult$callbackFired$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
