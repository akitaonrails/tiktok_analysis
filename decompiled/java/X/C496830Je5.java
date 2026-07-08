package X;

import com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell;

/* JADX INFO: renamed from: X.0Je5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.profile.MultiGuestOperationCell", f = "MultiGuestOperationCell.kt", l = {241}, m = "onRequestDataLegacy")
public final class C496830Je5 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MultiGuestOperationCell LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496830Je5(MultiGuestOperationCell multiGuestOperationCell, InterfaceC1364105Vn<? super C496830Je5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = multiGuestOperationCell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiGuestOperationCell@3d05.onRequestDataLegacy$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLJJLI.LJIILJJIL(null, this);
        C1C7U.LIZIZ("MultiGuestOperationCell@3d05.onRequestDataLegacy$1");
        return objLJIILJJIL;
    }
}
