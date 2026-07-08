package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushShowDelegate$showNotification$1$1", f = "IMInnerPushShowDelegate.kt", l = {}, m = "invokeSuspend")
public final class C315150CWz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0Z2O LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315150CWz(C0Z2O c0z2o, boolean z, InterfaceC1364105Vn<? super C315150CWz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0z2o;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315150CWz(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInnerPushShowDelegate@a92c.showNotification$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJFF(0L, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInnerPushShowDelegate@a92c.showNotification$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
