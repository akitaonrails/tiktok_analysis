package X;

import android.view.View;
import com.ss.android.ugc.aweme.spi.TabSwitchMetricService;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0iiG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$updateUserData$1", f = "I18nMyProfileFragment.kt", l = {}, m = "invokeSuspend")
public final class C1253060iiG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ I18nMyProfileFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ProfileUser LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253060iiG(I18nMyProfileFragment i18nMyProfileFragment, String str, ProfileUser profileUser, InterfaceC1364105Vn<? super C1253060iiG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i18nMyProfileFragment;
        this.LLILLJJLI = str;
        this.LLILLL = profileUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1253060iiG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nMyProfileFragment@e77a.updateUserData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        I18nMyProfileFragment i18nMyProfileFragment = this.LL;
        View view = i18nMyProfileFragment.LLJZ;
        if (view != null) {
            String str = this.LLILLJJLI;
            i18nMyProfileFragment.uS(str, this.LLILLL, view);
            if (Intrinsics.LJFF(str, "self_api_refresh")) {
                TabSwitchMetricService.LIZ.getClass();
                TabSwitchMetricService tabSwitchMetricServiceLIZ = C1204000hR8.LIZ();
                if (tabSwitchMetricServiceLIZ != null) {
                    tabSwitchMetricServiceLIZ.LJIIJ("USER", EnumC1593290rZ1.VIEW);
                }
            }
            if (!i18nMyProfileFragment.LLLIIL && Intrinsics.LJFF(str, "self_api_refresh")) {
                int i = C2187451AjH.LIZ;
                C1720106oR.LJI("I18nMyProfileFragment", "isRequest set has refreshed");
                i18nMyProfileFragment.LLLIIIL = true;
                i18nMyProfileFragment.LLLIIL = true;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nMyProfileFragment@e77a.updateUserData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
