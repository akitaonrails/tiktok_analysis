package androidx.compose.ui;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1681060tqa;
import X.C20052513d5;
import X.InterfaceC20036213aS;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class CompositionLocalMapInjectionElement extends AbstractC1685820tyG<C1681060tqa> {
    public final InterfaceC20036213aS LIZIZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1681060tqa(this.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public CompositionLocalMapInjectionElement(InterfaceC20036213aS interfaceC20036213aS) {
        this.LIZIZ = interfaceC20036213aS;
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1681060tqa c1681060tqa = (C1681060tqa) abstractC20055413dY;
        InterfaceC20036213aS interfaceC20036213aS = this.LIZIZ;
        c1681060tqa.LLJJ = interfaceC20036213aS;
        C20052513d5.LJFF(c1681060tqa).LJFF(interfaceC20036213aS);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof CompositionLocalMapInjectionElement) && Intrinsics.LJFF(((CompositionLocalMapInjectionElement) obj).LIZIZ, this.LIZIZ)) {
            return true;
        }
        return false;
    }
}
