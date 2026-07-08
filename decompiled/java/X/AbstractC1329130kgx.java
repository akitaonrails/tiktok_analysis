package X;

import android.util.SparseIntArray;

/* JADX INFO: renamed from: X.0kgx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1329130kgx extends AbstractC1330070kiT<InterfaceC1329110kgv> {
    public final int[] LLJI;

    @Override // X.AbstractC1330070kiT
    public final int LJIIJ(int i) {
        return i;
    }

    @Override // X.AbstractC1330070kiT
    public final void LJFF(InterfaceC1329110kgv interfaceC1329110kgv) {
        InterfaceC1329110kgv interfaceC1329110kgv2 = interfaceC1329110kgv;
        interfaceC1329110kgv2.getClass();
        interfaceC1329110kgv2.close();
    }

    @Override // X.AbstractC1330070kiT
    public final int LJIIIIZZ(int i) {
        if (i > 0) {
            for (int i2 : this.LLJI) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new C0VFX(Integer.valueOf(i));
    }

    @Override // X.AbstractC1330070kiT
    public final int LJIIIZ(InterfaceC1329110kgv interfaceC1329110kgv) {
        InterfaceC1329110kgv interfaceC1329110kgv2 = interfaceC1329110kgv;
        interfaceC1329110kgv2.getClass();
        return interfaceC1329110kgv2.getSize();
    }

    @Override // X.AbstractC1330070kiT
    public final boolean LJIILIIL(InterfaceC1329110kgv interfaceC1329110kgv) {
        interfaceC1329110kgv.getClass();
        return !r2.isClosed();
    }

    public AbstractC1329130kgx(InterfaceC1328250kfX interfaceC1328250kfX, C1329300khE c1329300khE, C1330500kjA c1330500kjA) {
        super(interfaceC1328250kfX, c1329300khE, c1330500kjA);
        SparseIntArray sparseIntArray = c1329300khE.LIZJ;
        this.LLJI = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.LLJI;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                this.LLILLJJLI.LIZ(this);
                this.LLJ.LIZJ();
                return;
            }
        }
    }
}
