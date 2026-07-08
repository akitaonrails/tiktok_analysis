package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarServiceImpl$enterSocialAvatarFlow$1$2", f = "SocialAvatarServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C437390HDd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialAvatarServiceImpl LL;
    public final /* synthetic */ C0HHC LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C437390HDd(SocialAvatarServiceImpl socialAvatarServiceImpl, C0HHC c0hhc, Function0<Unit> function0, InterfaceC1364105Vn<? super C437390HDd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialAvatarServiceImpl;
        this.LLILLJJLI = c0hhc;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C437390HDd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarServiceImpl@45de.enterSocialAvatarFlow$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SocialAvatarServiceImpl socialAvatarServiceImpl = this.LL;
        C0HHC c0hhc = this.LLILLJJLI;
        Function0<Unit> function0 = this.LLILLL;
        socialAvatarServiceImpl.getClass();
        SocialAvatarServiceImpl.LJIJI(c0hhc, function0);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarServiceImpl@45de.enterSocialAvatarFlow$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
