package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852070yIP extends C10GR {
    public final C19EG LL;
    public final Function1<C20656615sK, Unit> LLILLJJLI;
    public final int LLILLL = 8004;
    public final EnumC1202290hON LLILZ = EnumC1202290hON.CONTAINER;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.AbstractC20656215sG
    public final EnumC1202290hON getPopupType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1852070yIP(C19EG c19eg, Function1<? super C20656615sK, Unit> function1) {
        this.LL = c19eg;
        this.LLILLJJLI = function1;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        this.LLILLJJLI.invoke(c20656615sK);
    }
}
