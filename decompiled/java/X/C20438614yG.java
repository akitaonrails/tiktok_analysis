package X;

import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14yG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videoadaption.adaptionstrategy.AbstractAdaptionStrategy$processHandlersInBackground$1$2", f = "AbstractAdaptionStrategy.kt", l = {}, m = "invokeSuspend")
public final class C20438614yG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC20438714yH LL;
    public final /* synthetic */ VideoAdaptionResult LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20438614yG(InterfaceC20438714yH interfaceC20438714yH, VideoAdaptionResult videoAdaptionResult, InterfaceC1364105Vn<? super C20438614yG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC20438714yH;
        this.LLILLJJLI = videoAdaptionResult;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20438614yG(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbstractAdaptionStrategy@7458.processHandlersInBackground$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbstractAdaptionStrategy@7458.processHandlersInBackground$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
