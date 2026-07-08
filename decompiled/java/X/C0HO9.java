package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel;

/* JADX INFO: renamed from: X.0HO9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseViewModel", f = "MixStudioBaseViewModel.kt", l = {238}, m = "navigateByStatus")
public final class C0HO9 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MixStudioBaseViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HO9(MixStudioBaseViewModel mixStudioBaseViewModel, InterfaceC1364105Vn<? super C0HO9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioBaseViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioBaseViewModel@9c39.navigateByStatus$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLJJLI.yQ2(null, 0, false, this);
        C1C7U.LIZIZ("MixStudioBaseViewModel@9c39.navigateByStatus$1");
        return objYQ2;
    }
}
