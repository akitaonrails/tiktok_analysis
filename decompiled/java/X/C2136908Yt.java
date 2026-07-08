package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Yt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionLifecycleService$1", f = "LightInteractionLifecycleService.kt", l = {}, m = "invokeSuspend")
public final class C2136908Yt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2136908Yt(InterfaceC1364105Vn<? super C2136908Yt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2136908Yt(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionLifecycleService@30eb.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C603760NmA c603760NmA = C603760NmA.LL;
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c603760NmA.LJIIIZ(curUserId);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LightInteractionLifecycleService@30eb.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2136908Yt(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
