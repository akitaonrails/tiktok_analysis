package X;

import Y.AObserverS79S0400000_14;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Xkf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857630Xkf extends C09AY implements Function2<C425550GmP, TuxSheet, Unit> {
    public final /* synthetic */ InterfaceC856160XiI LL;
    public final /* synthetic */ AbstractC857240Xk2<?> LLILLJJLI;
    public final /* synthetic */ C857640Xkg LLILLL;
    public final /* synthetic */ C118300cf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C857630Xkf(C857220Xk0 c857220Xk0, AbstractC857240Xk2 abstractC857240Xk2, C857640Xkg c857640Xkg, C118300cf c118300cf) {
        super(2);
        this.LL = c857220Xk0;
        this.LLILLJJLI = abstractC857240Xk2;
        this.LLILLL = c857640Xkg;
        this.LLILZ = c118300cf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C425550GmP c425550GmP, TuxSheet tuxSheet) {
        this.LL.LIZIZ(this.LLILLJJLI);
        C857640Xkg c857640Xkg = this.LLILLL;
        c857640Xkg.LJI.observe(c857640Xkg.LJIIJJI, new AObserverS79S0400000_14(this.LLILZ, tuxSheet, this.LL, this.LLILLJJLI, 3));
        return Unit.LIZ;
    }
}
