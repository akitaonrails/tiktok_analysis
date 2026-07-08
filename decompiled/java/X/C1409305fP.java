package X;

import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import njp.a;

/* JADX INFO: renamed from: X.05fP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM$tryRequestCache$2$1", f = "StoryHighlightsMyProfileVM.kt", l = {}, m = "invokeSuspend")
public final class C1409305fP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StoryHighlightsMyProfileVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1409305fP(StoryHighlightsMyProfileVM storyHighlightsMyProfileVM, InterfaceC1364105Vn<? super C1409305fP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = storyHighlightsMyProfileVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1409305fP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setState(AFwS229S0000000_2.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryHighlightsMyProfileVM@d17b.tryRequestCache$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
