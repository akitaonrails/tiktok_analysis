package X;

import com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleViewModel;

/* JADX INFO: renamed from: X.0r3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.feed.seriescenter.assme.opt.MiniDramaCenterNewStyleViewModel", f = "MiniDramaCenterNewStyleViewModel.kt", l = {151}, m = "requestDataWithPagination")
public final class C1573570r3D extends AbstractC23140094w {
    public boolean LL;
    public C259800zU LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ MiniDramaCenterNewStyleViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1573570r3D(MiniDramaCenterNewStyleViewModel miniDramaCenterNewStyleViewModel, InterfaceC1364105Vn<? super C1573570r3D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = miniDramaCenterNewStyleViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniDramaCenterNewStyleViewModel@c438.requestDataWithPagination$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILZ.zQ2(null, false, this);
        C1C7U.LIZIZ("MiniDramaCenterNewStyleViewModel@c438.requestDataWithPagination$1");
        return objZQ2;
    }
}
