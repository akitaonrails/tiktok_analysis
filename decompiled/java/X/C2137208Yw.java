package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Yw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.csi.profile.repo.SearchCSIProfileBannerRepoV3$handleDraftSaved$2", f = "SearchCSIProfileBannerRepoV3.kt", l = {}, m = "invokeSuspend")
public final class C2137208Yw extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2137208Yw(InterfaceC1364105Vn<? super C2137208Yw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2137208Yw(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCSIProfileBannerRepoV3@3eb2.handleDraftSaved$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchCSIProfileBannerRepoV3@3eb2.handleDraftSaved$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2137208Yw(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
