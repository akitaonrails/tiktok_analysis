package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0DK0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mention.quickmention.QuickMentionFrameLayout$onBind$2$1$1", f = "QuickMentionFrameLayout.kt", l = {}, m = "invokeSuspend")
public final class C0DK0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0DK0(InterfaceC1364105Vn<? super C0DK0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0DK0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickMentionFrameLayout@9223.onBind$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0DK7.LIZ().LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickMentionFrameLayout@9223.onBind$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0DK0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
