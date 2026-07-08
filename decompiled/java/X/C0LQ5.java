package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LQ5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQ5 extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LQ5(String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        String strValueOf = String.valueOf(2131845692);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("rule_id", this.LL);
        c2344009Gk.LJIIIIZZ("push_label", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("anchor_id", this.LLILLL);
        c2344009Gk.LJIIIIZZ("room_id", this.LLILZ);
        C20684815ws.LJIILLIIL(strValueOf, c2344009Gk.LIZ);
        c1397660mTU.LIZ().LIZIZ(null);
        return Unit.LIZ;
    }
}
