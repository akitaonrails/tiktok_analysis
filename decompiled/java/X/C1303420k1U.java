package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0k1U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1303420k1U extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Boolean, String, Unit> LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1303420k1U(int i, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(0);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invoke(Integer.valueOf(this.LLILLJJLI), Boolean.FALSE, "wheel_click_icon");
        return Unit.LIZ;
    }
}
