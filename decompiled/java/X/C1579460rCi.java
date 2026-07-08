package X;

import java.util.List;

/* JADX INFO: renamed from: X.0rCi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579460rCi implements InterfaceC1579720rD8 {
    public final int LIZ;
    public final EnumC1579420rCe LIZIZ;
    public final List<C1579490rCl> LIZJ;

    @Override // X.InterfaceC1579720rD8
    public final int getCardIndex() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1579720rD8
    public final EnumC1579420rCe getCardType() {
        return this.LIZIZ;
    }

    public C1579460rCi(int i, EnumC1579420rCe enumC1579420rCe, List<C1579490rCl> list) {
        this.LIZ = i;
        this.LIZIZ = enumC1579420rCe;
        this.LIZJ = list;
    }
}
