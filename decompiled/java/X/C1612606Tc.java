package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Tc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.ui.v2.I18nMyProfileFragment$observeStoryHighlightForceRefresh$1", f = "I18nMyProfileFragment.kt", l = {642}, m = "invokeSuspend")
public final class C1612606Tc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ I18nMyProfileFragment LLILLJJLI;
    public final /* synthetic */ IStoryHighlightsMyDataManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612606Tc(IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager, I18nMyProfileFragment i18nMyProfileFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i18nMyProfileFragment;
        this.LLILLL = iStoryHighlightsMyDataManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1612606Tc(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nMyProfileFragment@e77a.observeStoryHighlightForceRefresh$1");
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
            I18nMyProfileFragment i18nMyProfileFragment = this.LLILLJJLI;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C1612506Tb c1612506Tb = new C1612506Tb(this.LLILLL, i18nMyProfileFragment, null);
            this.LL = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(i18nMyProfileFragment, state, c1612506Tb, this) == objLJFF) {
                C1C7U.LIZIZ("I18nMyProfileFragment@e77a.observeStoryHighlightForceRefresh$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nMyProfileFragment@e77a.observeStoryHighlightForceRefresh$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
