package X;

import com.bytedance.android.livesdk.profile.cell.HeaderCell;

/* JADX INFO: renamed from: X.0Jde, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.profile.cell.HeaderCell", f = "HeaderCell.kt", l = {255}, m = "onRequestDataLegacy")
public final class C496560Jde extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ HeaderCell LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C496560Jde(HeaderCell headerCell, InterfaceC1364105Vn<? super C496560Jde> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = headerCell;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HeaderCell@5d5c.onRequestDataLegacy$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILLJJLI.LJIILJJIL(null, this);
        C1C7U.LIZIZ("HeaderCell@5d5c.onRequestDataLegacy$1");
        return objLJIILJJIL;
    }
}
