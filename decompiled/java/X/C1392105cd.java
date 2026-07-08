package X;

import com.ss.android.ugc.profile.business.ur.utils.SocialAvatarUserInfoCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.utils.SocialAvatarCache$notifyResult$1", f = "SocialAvatarCache.kt", l = {}, m = "invokeSuspend")
public final class C1392105cd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarUserInfoCache LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1392105cd(SocialAvatarUserInfoCache socialAvatarUserInfoCache, InterfaceC1364105Vn<? super C1392105cd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarUserInfoCache;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1392105cd(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarCache@6895.notifyResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("got profile/self result, data: ");
        sbLIZ.append(this.LL);
        C2188811AlT.LIZIZ(sbLIZ);
        C442910HYj.LIZIZ = true;
        C442910HYj.LIZ.setValue(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarCache@6895.notifyResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
