package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rdR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.repo.FollowingFeedSkylightRepo$fetchSkylightDataInternally$storyDataItems$1", f = "FollowingFeedSkylightRepo.kt", l = {}, m = "invokeSuspend")
public final class C1596030rdR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ>, Object> {
    public C1596030rdR(InterfaceC1364105Vn<? super C1596030rdR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1596030rdR(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowingFeedSkylightRepo@df9b.fetchSkylightDataInternally$storyDataItems$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1595320rcI enumC1595320rcI = EnumC1595320rcI.COMPLETE;
        Boolean.valueOf(false);
        C1596020rdQ c1596020rdQ = new C1596020rdQ(null, enumC1595320rcI, null, 12);
        C1C7U.LIZIZ("FollowingFeedSkylightRepo@df9b.fetchSkylightDataInternally$storyDataItems$1");
        return c1596020rdQ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1596020rdQ> interfaceC1364105Vn) {
        return new C1596030rdR(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
