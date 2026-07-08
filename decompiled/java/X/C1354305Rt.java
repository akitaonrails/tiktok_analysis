package X;

import com.bytedance.android.live.walletnew.RechargeDialogNew;

/* JADX INFO: renamed from: X.05Rt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.walletnew.RechargeDialogNew", f = "RechargeDialogNew.kt", l = {462}, m = "startCollectingLoadingDialogEvents")
public final class C1354305Rt extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RechargeDialogNew LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354305Rt(RechargeDialogNew rechargeDialogNew, InterfaceC1364105Vn<? super C1354305Rt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = rechargeDialogNew;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RechargeDialogNew@383d.startCollectingLoadingDialogEvents$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objFS = this.LLILLJJLI.FS(this);
        C1C7U.LIZIZ("RechargeDialogNew@383d.startCollectingLoadingDialogEvents$1");
        return objFS;
    }
}
