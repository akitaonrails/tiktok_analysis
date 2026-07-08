package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;

/* JADX INFO: renamed from: X.0Nt4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM", f = "OfflineModeListVM.kt", l = {194, 196}, m = "tryBuildUgFirstPage")
public final class C608040Nt4 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Aweme LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ OfflineModeListVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C608040Nt4(OfflineModeListVM offlineModeListVM, InterfaceC1364105Vn<? super C608040Nt4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = offlineModeListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeListVM@46f2.tryBuildUgFirstPage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objGQ2 = this.LLILZIL.GQ2(this);
        C1C7U.LIZIZ("OfflineModeListVM@46f2.tryBuildUgFirstPage$1");
        return objGQ2;
    }
}
