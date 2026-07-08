package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01Y0, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.NoticeboardController$attach$2", f = "NoticeboardController.kt", l = {}, m = "invokeSuspend")
public final class C01Y0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C01Y0(InterfaceC1364105Vn<? super C01Y0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01Y0(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeboardController@d169.attach$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C953760avW.LIZIZ.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoticeboardController@d169.attach$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01Y0(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
