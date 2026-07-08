package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.15aO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.protection.timelock.FeedLynxPreloader$prepareOnMainThread$loadCallback$1$onLoadFinish$1", f = "FeedLynxPreloader.kt", l = {}, m = "invokeSuspend")
public final class C20545415aO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20545415aO(String str, InterfaceC1364105Vn<? super C20545415aO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20545415aO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedLynxPreloader@b814.prepareOnMainThread$loadCallback$1$onLoadFinish$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C20544915aJ.LIZJ == EnumC20545715aR.LLILLJJLI && Intrinsics.LJFF(C20544915aJ.LJFF, this.LL)) {
            C20544915aJ c20544915aJ = C20544915aJ.LIZ;
            EnumC20545715aR enumC20545715aR = EnumC20545715aR.LLILLL;
            c20544915aJ.getClass();
            C20544915aJ.LIZJ(enumC20545715aR, "load_success");
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("FeedLynxPreloader@b814.prepareOnMainThread$loadCallback$1$onLoadFinish$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FeedLynxPreloader@b814.prepareOnMainThread$loadCallback$1$onLoadFinish$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
