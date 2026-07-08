package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarCreationStatusService;
import com.ss.android.ugc.ur.socialavatar.ISocialAvatarService;
import com.ss.android.ugc.ur.socialavatar.SocialAvatarAISelfCompatibilityConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$onResume$5", f = "I18nMyProfileFragment.kt", l = {1219}, m = "invokeSuspend")
public final class C1647006ce extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ I18nMyProfileFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1647006ce(I18nMyProfileFragment i18nMyProfileFragment, InterfaceC1364105Vn<? super C1647006ce> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i18nMyProfileFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1647006ce(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("I18nMyProfileFragment@e77a.onResume$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            I18nMyProfileFragment i18nMyProfileFragment = this.LLILLJJLI;
            String strKS = i18nMyProfileFragment.kS();
            this.LL = 1;
            objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C1612706Td(i18nMyProfileFragment, strKS, null));
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("I18nMyProfileFragment@e77a.onResume$5");
                return objLJFF;
            }
        }
        Integer num = (Integer) objLJI;
        if (num != null && num.intValue() == 2) {
            int i2 = C2187451AjH.LIZ;
            Context context = this.LLILLJJLI.getContext();
            if (context != null) {
                I18nMyProfileFragment i18nMyProfileFragment2 = this.LLILLJJLI;
                C437560HDu c437560HDu = (C437560HDu) ((ISocialAvatarCreationStatusService) ServiceManager.get().getService(ISocialAvatarCreationStatusService.class)).LIZ(i18nMyProfileFragment2.kS()).getValue();
                if (!SocialAvatarAISelfCompatibilityConfig.LIZ() || !c437560HDu.LJI) {
                    ((ISocialAvatarService) i18nMyProfileFragment2.LLLILZLLLI.getValue()).LJIILLIIL(new C0HHA(context, "profile_pop_up", "personal_homepage", null, null, 0, false, false, null, false, null, 4088), EnumC437540HDs.SUCCESSFUL, null);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nMyProfileFragment@e77a.onResume$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
