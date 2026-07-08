package X;

import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;

/* JADX INFO: renamed from: X.0Je6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell", f = "CoHostOperationCell.kt", l = {223}, m = "onRequestDataLegacy")
public final class C496840Je6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CoHostOperationCell LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496840Je6(CoHostOperationCell coHostOperationCell, InterfaceC1364105Vn<? super C496840Je6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = coHostOperationCell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CoHostOperationCell@1f42.onRequestDataLegacy$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLJJLI.LJIILJJIL(null, this);
        C1C7U.LIZIZ("CoHostOperationCell@1f42.onRequestDataLegacy$1");
        return objLJIILJJIL;
    }
}
