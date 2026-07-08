package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15aP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.FeedLynxPreloader$prepareOnMainThread$loadCallback$1$onLoadFailed$1", f = "FeedLynxPreloader.kt", l = {}, m = "invokeSuspend")
public final class C20545515aP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C20545515aP(InterfaceC1364105Vn<? super C20545515aP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20545515aP(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedLynxPreloader@b814.prepareOnMainThread$loadCallback$1$onLoadFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20544915aJ.LIZ.getClass();
        C20544915aJ.LIZ("lynx_load_failed");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxPreloader@b814.prepareOnMainThread$loadCallback$1$onLoadFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C20545515aP(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
