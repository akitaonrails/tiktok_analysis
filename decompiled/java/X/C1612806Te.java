package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$loginOrLogoutListener$2$1$1", f = "I18nMyProfileFragment.kt", l = {427}, m = "invokeSuspend")
public final class C1612806Te extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ User LLILLJJLI;
    public final /* synthetic */ I18nMyProfileFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612806Te(User user, I18nMyProfileFragment i18nMyProfileFragment, InterfaceC1364105Vn<? super C1612806Te> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = user;
        this.LLILLL = i18nMyProfileFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1612806Te(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strKS;
        C1C7U.LIZ("I18nMyProfileFragment@e77a.loginOrLogoutListener$2$1$1");
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
            User user = this.LLILLJJLI;
            if (user == null || (strKS = user.getUid()) == null) {
                strKS = this.LLILLL.kS();
            }
            I18nMyProfileFragment i18nMyProfileFragment = this.LLILLL;
            this.LL = 1;
            i18nMyProfileFragment.getClass();
            if (C23250099c.LJI(this, C0PEM.LIZJ, new C1612706Td(i18nMyProfileFragment, strKS, null)) == objLJFF) {
                C1C7U.LIZIZ("I18nMyProfileFragment@e77a.loginOrLogoutListener$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nMyProfileFragment@e77a.loginOrLogoutListener$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
