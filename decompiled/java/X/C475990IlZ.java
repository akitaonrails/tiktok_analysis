package X;

import com.bytedance.android.livesdk.programmedlive.ui.CastersWidget;

/* JADX INFO: renamed from: X.0IlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.programmedlive.ui.CastersWidget", f = "CastersWidget.kt", l = {244}, m = "updateCastersList")
public final class C475990IlZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CastersWidget LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475990IlZ(CastersWidget castersWidget, InterfaceC1364105Vn<? super C475990IlZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = castersWidget;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CastersWidget@cbe4.updateCastersList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objX1 = this.LLILLJJLI.x1(this);
        C1C7U.LIZIZ("CastersWidget@cbe4.updateCastersList$1");
        return objX1;
    }
}
