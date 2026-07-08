package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel;

/* JADX INFO: renamed from: X.0xHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel", f = "AutoPostLivingViewModel.kt", l = {48, 49, 57, 61, 107}, m = "processIntent")
public final class C1813170xHf extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AutoPostLivingViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813170xHf(AutoPostLivingViewModel autoPostLivingViewModel, InterfaceC1364105Vn<? super C1813170xHf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = autoPostLivingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AutoPostLivingViewModel@933.processIntent$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLJJLI.yQ2(null, this);
        C1C7U.LIZIZ("AutoPostLivingViewModel@933.processIntent$1");
        return objYQ2;
    }
}
