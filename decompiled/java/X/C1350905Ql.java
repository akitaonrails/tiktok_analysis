package X;

import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment$showSocialAvatarFloatingNotice$1", f = "I18nUserProfileFragment.kt", l = {1971, 1973}, m = "invokeSuspend")
public final class C1350905Ql extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ I18nUserProfileFragment LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1350905Ql(C19EG c19eg, I18nUserProfileFragment i18nUserProfileFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i18nUserProfileFragment;
        this.LLILLL = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1350905Ql(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String curUserId = C0XQ7.LJFF().getCurUserId();
            if (curUserId == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1");
                return unit2;
            }
            ISocialAvatarCreationStatusService iSocialAvatarCreationStatusService = (ISocialAvatarCreationStatusService) this.LLILLJJLI.LLLLIL.getValue();
            this.LL = 1;
            obj = iSocialAvatarCreationStatusService.LIZIZ(curUserId, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1");
                return objLJFF;
            }
        }
        Integer num = (Integer) obj;
        if (num != null && num.intValue() == 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C0HZI c0hzi = new C0HZI(this.LLILLL, this.LLILLJJLI, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c0hzi) == objLJFF) {
                C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.showSocialAvatarFloatingNotice$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
