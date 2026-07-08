package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1823150xXl extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ C1822930xXP LL;
    public final /* synthetic */ C1822910xXN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1823150xXl(C1822930xXP c1822930xXP, C1822910xXN c1822910xXN) {
        super(2);
        this.LL = c1822930xXP;
        this.LLILLJJLI = c1822910xXN;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        InterfaceC1822900xXM interfaceC1822900xXM = this.LL.LLILZLL;
        if (interfaceC1822900xXM != null) {
            this.LLILLJJLI.LLIZ.invoke(interfaceC1822900xXM);
        }
        return Unit.LIZ;
    }
}
