package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XXO, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XXO extends C09AY implements Function1<C1397510mTF, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XXO(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397510mTF c1397510mTF) {
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = this.LL;
        int i = this.LLILLJJLI;
        c0xwj.getClass();
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_from", str);
        c0xgr.LIZLLL("enter_method", "popup");
        c0xgr.LIZ(i, "show_index");
        C20684815ws.LJIILLIIL("save_login_info_show", c0xgr.LIZ);
        return Unit.LIZ;
    }
}
