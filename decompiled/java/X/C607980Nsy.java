package X;

import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;

/* JADX INFO: renamed from: X.0Nsy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM", f = "OfflineModeListVM.kt", l = {359}, m = "applyHeadStashIfNeeded")
public final class C607980Nsy extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ OfflineModeListVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607980Nsy(OfflineModeListVM offlineModeListVM, InterfaceC1364105Vn<? super C607980Nsy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = offlineModeListVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineModeListVM@46f2.applyHeadStashIfNeeded$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(this);
        C1C7U.LIZIZ("OfflineModeListVM@46f2.applyHeadStashIfNeeded$1");
        return objBQ2;
    }
}
