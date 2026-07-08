package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.FeedLynxPreloader$transitionTo$3", f = "FeedLynxPreloader.kt", l = {188}, m = "invokeSuspend")
public final class C20545215aM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C20545215aM(InterfaceC1364105Vn<? super C20545215aM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20545215aM(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedLynxPreloader@b814.transitionTo$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(120000L, this) == objLJFF) {
                C1C7U.LIZIZ("FeedLynxPreloader@b814.transitionTo$3");
                return objLJFF;
            }
        }
        if (C20544915aJ.LIZJ == EnumC20545715aR.LLILLL) {
            C20544915aJ.LIZ.getClass();
            C20544915aJ.LIZIZ();
            C20544915aJ.LIZJ(EnumC20545715aR.LL, "unconsumed_timeout");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxPreloader@b814.transitionTo$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C20545215aM(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
