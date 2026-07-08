package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.SmartCoverExtractor$executeOnMainThread$1$1", f = "SmartCoverExtractor.kt", l = {}, m = "invokeSuspend")
public final class C01XJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<Object>, Object> {
    public final /* synthetic */ Function0<Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XJ(Function0<Object> function0, InterfaceC1364105Vn<? super C01XJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01XJ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartCoverExtractor@7b55.executeOnMainThread$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object objInvoke = this.LL.invoke();
        C1C7U.LIZIZ("SmartCoverExtractor@7b55.executeOnMainThread$1$1");
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
