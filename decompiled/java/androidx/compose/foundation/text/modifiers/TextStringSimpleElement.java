package androidx.compose.foundation.text.modifiers;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1692760u9S;
import X.C1693430uAX;
import X.C786410Ut5;
import X.InterfaceC1691620u7c;
import X.InterfaceC594710NUf;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class TextStringSimpleElement extends AbstractC1685820tyG<C1692760u9S> {
    public final String LIZIZ;
    public final C1693430uAX LIZJ;
    public final InterfaceC594710NUf LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final int LJI;
    public final int LJII;
    public final InterfaceC1691620u7c LJIIIIZZ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1692760u9S(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI) * 31) + this.LJII) * 31;
        InterfaceC1691620u7c interfaceC1691620u7c = this.LJIIIIZZ;
        return iHashCode + (interfaceC1691620u7c != null ? interfaceC1691620u7c.hashCode() : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    @Override // X.AbstractC1685820tyG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.AbstractC20055413dY r12) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.LJIJJ(X.13dY):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        if (Intrinsics.LJFF(this.LJIIIIZZ, textStringSimpleElement.LJIIIIZZ) && Intrinsics.LJFF(this.LIZIZ, textStringSimpleElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, textStringSimpleElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, textStringSimpleElement.LIZLLL) && this.LJ == textStringSimpleElement.LJ && this.LJFF == textStringSimpleElement.LJFF && this.LJI == textStringSimpleElement.LJI && this.LJII == textStringSimpleElement.LJII) {
            return true;
        }
        return false;
    }

    public TextStringSimpleElement(String str, C1693430uAX c1693430uAX, InterfaceC594710NUf interfaceC594710NUf, int i, boolean z, int i2, int i3, InterfaceC1691620u7c interfaceC1691620u7c) {
        this.LIZIZ = str;
        this.LIZJ = c1693430uAX;
        this.LIZLLL = interfaceC594710NUf;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = i2;
        this.LJII = i3;
        this.LJIIIIZZ = interfaceC1691620u7c;
    }
}
