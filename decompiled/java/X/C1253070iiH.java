package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS598S0100000_19;
import njp.a;

/* JADX INFO: renamed from: X.0iiH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$setAweme$1", f = "I18nMyProfileFragment.kt", l = {}, m = "invokeSuspend")
public final class C1253070iiH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ I18nMyProfileFragment LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1253070iiH(I18nMyProfileFragment i18nMyProfileFragment, Aweme aweme, InterfaceC1364105Vn<? super C1253070iiH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i18nMyProfileFragment;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1253070iiH(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nMyProfileFragment@e77a.setAweme$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.iS().SQ2(new AwS598S0100000_19(this.LLILLJJLI, 10), false);
        this.LL.LLLFF.LIZJ = this.LLILLJJLI;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nMyProfileFragment@e77a.setAweme$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
