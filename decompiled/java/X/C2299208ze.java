package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.framework.playground.EPActivityResultHandler$changeVideoCanvasBg$2$1", f = "EPActivityResultHandler.kt", l = {}, m = "invokeSuspend")
public final class C2299208ze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C0E5K LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2299208ze(String str, C0E5K c0e5k, Intent intent, InterfaceC1364105Vn<? super C2299208ze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c0e5k;
        this.LLILLL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2299208ze(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPActivityResultHandler@f79c.changeVideoCanvasBg$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0E5K.LIZJ(this.LLILLJJLI, this.LLILLL, this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPActivityResultHandler@f79c.changeVideoCanvasBg$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
