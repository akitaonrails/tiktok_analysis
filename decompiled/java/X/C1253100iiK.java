package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.viewmodel.ProfileViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS283S0000000_35;
import njp.a;

/* JADX INFO: renamed from: X.0iiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nUserProfileFragment$onViewCreated$stateFlowCollector$1", f = "I18nUserProfileFragment.kt", l = {}, m = "invokeSuspend")
public final class C1253100iiK extends C09AX implements Function2<Set<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ I18nUserProfileFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253100iiK(I18nUserProfileFragment i18nUserProfileFragment, InterfaceC1364105Vn<? super C1253100iiK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i18nUserProfileFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1253100iiK c1253100iiK = new C1253100iiK(this.LLILLJJLI, interfaceC1364105Vn);
        c1253100iiK.LL = obj;
        return c1253100iiK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String secUid;
        C1C7U.LIZ("I18nUserProfileFragment@1bc5.onViewCreated$stateFlowCollector$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Set set = (Set) this.LL;
        User user = this.LLILLJJLI.LLJI;
        if (user != null && (secUid = user.getSecUid()) != null) {
            I18nUserProfileFragment i18nUserProfileFragment = this.LLILLJJLI;
            if (set.contains(secUid)) {
                ProfileViewModel profileViewModel = i18nUserProfileFragment.LLJILJILJ;
                profileViewModel.getClass();
                profileViewModel.setState(AFwS283S0000000_35.get$arr$(197));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nUserProfileFragment@1bc5.onViewCreated$stateFlowCollector$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Set<? extends String> set, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(set, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
