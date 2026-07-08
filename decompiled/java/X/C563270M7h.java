package X;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.liveevent.anchor.LiveEventCtaAnchorProvider$provideCustomEvents$2$1$invoke$2", f = "LiveEventCtaAnchorProvider.kt", l = {}, m = "invokeSuspend")
public final class C563270M7h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<C704830Rkn> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563270M7h(WeakReference<C704830Rkn> weakReference, InterfaceC1364105Vn<? super C563270M7h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563270M7h(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        C704830Rkn c704830Rkn;
        Function0<C690870R8b> function0;
        C690870R8b c690870R8bInvoke;
        C19EG c19egLIZ;
        C1C7U.LIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WeakReference<C704830Rkn> weakReference = this.LL;
        if (weakReference != null && (c704830Rkn = weakReference.get()) != null && (function0 = c704830Rkn.LIZ) != null && (c690870R8bInvoke = function0.invoke()) != null && (c19egLIZ = C0O0B.LIZ(c690870R8bInvoke)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIIZ(2131851059);
            c1389890mGx.LJIIJJI();
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("LiveEventCtaAnchorProvider@97c4.provideCustomEvents$2$1$invoke$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
