package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Xbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852080Xbi extends C09AY implements Function1<C1397660mTU, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C852080Xbi(String str, int i, Function0<Unit> function0) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397660mTU c1397660mTU) {
        C0XWJ c0xwj = C0XWJ.LIZ;
        String str = this.LL;
        int i = this.LLILLJJLI;
        c0xwj.getClass();
        C0XWJ.LJIILL(i, str, false);
        this.LLILLL.invoke();
        C849850XVn.LIZIZ.LIZJ().LJIJI("91", "oneclicklogin_promptmodal_notnow_cta", false);
        return Unit.LIZ;
    }
}
