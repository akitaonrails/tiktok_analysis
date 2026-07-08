package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel;

/* JADX INFO: renamed from: X.0xHe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingViewModel", f = "AutoPostLivingViewModel.kt", l = {186}, m = "deleteAutoPostItem")
public final class C1813160xHe extends AbstractC23140094w {
    public C1808830xAf LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AutoPostLivingViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813160xHe(AutoPostLivingViewModel autoPostLivingViewModel, InterfaceC1364105Vn<? super C1813160xHe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = autoPostLivingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoPostLivingViewModel@933.deleteAutoPostItem$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(null, this);
        C1C7U.LIZIZ("AutoPostLivingViewModel@933.deleteAutoPostItem$1");
        return objBQ2;
    }
}
