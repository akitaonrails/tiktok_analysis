package X;

import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HZI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment$showSocialAvatarFloatingNotice$1$1", f = "I18nUserProfileFragment.kt", l = {}, m = "invokeSuspend")
public final class C0HZI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ I18nUserProfileFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HZI(C19EG c19eg, I18nUserProfileFragment i18nUserProfileFragment, InterfaceC1364105Vn<? super C0HZI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = i18nUserProfileFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HZI(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0HZH.LIZ(C0HZH.LIZ, C0HZJ.LIZ(this.LL), this.LL, null, new C0HZD(true, 6), 4);
        this.LLILLJJLI.LLLLLLJ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
