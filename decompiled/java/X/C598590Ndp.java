package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ndp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.content.sea.communication.jsb.SeaContentRegisterMethodIDL$handle$1$1", f = "SeaContentRegisterMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C598590Ndp extends C09AX implements Function2<InterfaceC598890NeJ, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC634840OvC LLILLJJLI;
    public final /* synthetic */ InterfaceC600440Ngo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C598590Ndp(InterfaceC634840OvC interfaceC634840OvC, InterfaceC600440Ngo interfaceC600440Ngo, InterfaceC1364105Vn<? super C598590Ndp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC634840OvC;
        this.LLILLL = interfaceC600440Ngo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C598590Ndp c598590Ndp = new C598590Ndp(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c598590Ndp.LL = obj;
        return c598590Ndp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaContentRegisterMethodIDL@def9.handle$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.sendEvent(this.LLILLL.getName(), ((InterfaceC598890NeJ) this.LL).LJLIIIL());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaContentRegisterMethodIDL@def9.handle$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC598890NeJ interfaceC598890NeJ, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC598890NeJ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
