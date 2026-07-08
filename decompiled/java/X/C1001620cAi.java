package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.beauty.manager.CkBeautyDataGlobalFetcherDelegate$preFetchBeauty$1", f = "CkBeautyDataGlobalFetcherDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1001620cAi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1001620cAi(InterfaceC1364105Vn<? super C1001620cAi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001620cAi(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CkBeautyDataGlobalFetcherDelegate@3cef.preFetchBeauty$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C993500bxc.LIZIZ = new Pair<>(EnumC992780bwS.FETCHING, null);
        C993500bxc.LIZIZ = new Pair<>(EnumC992780bwS.FETCH_SUCCESS, new C19731412Hw("").LJIJ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CkBeautyDataGlobalFetcherDelegate@3cef.preFetchBeauty$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1001620cAi(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
