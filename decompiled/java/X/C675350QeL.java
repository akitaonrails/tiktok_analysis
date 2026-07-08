package X;

import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.vm.VideoVerticalViewModel;

/* JADX INFO: renamed from: X.0QeL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.result.vertical.video.vm.VideoVerticalViewModel", f = "VideoVerticalViewModel.kt", l = {119}, m = "sendRequest")
public final class C675350QeL extends AbstractC23140094w {
    public C675050Qdr LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ VideoVerticalViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675350QeL(VideoVerticalViewModel videoVerticalViewModel, InterfaceC1364105Vn<? super C675350QeL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = videoVerticalViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoVerticalViewModel@3606.sendRequest$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILZ.BQ2(null, this);
        C1C7U.LIZIZ("VideoVerticalViewModel@3606.sendRequest$1");
        return objBQ2;
    }
}
