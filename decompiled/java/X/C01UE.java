package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01UE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.feed.comment.TakoGuideFrameLayout$onBind$2$1$1", f = "TakoGuideFrameLayout.kt", l = {}, m = "invokeSuspend")
public final class C01UE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01UE(InterfaceC1364105Vn<? super C01UE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01UE(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoGuideFrameLayout@eb1a.onBind$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoGuideFrameLayout@eb1a.onBind$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01UE(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
