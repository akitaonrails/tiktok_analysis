package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CV1, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipfeed.components.single.PlayerViewComponent$onRenderFirstFrame$1$1", f = "PlayerViewComponent.kt", l = {}, m = "invokeSuspend")
public final class C0CV1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19389810tU LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CV1(C19389810tU c19389810tU, String str, InterfaceC1364105Vn<? super C0CV1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19389810tU;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CV1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayerViewComponent@ca10.onRenderFirstFrame$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJJJ.storeString("last_session_record", this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerViewComponent@ca10.onRenderFirstFrame$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
